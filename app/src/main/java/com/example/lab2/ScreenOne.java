package com.example.lab2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class ScreenOne extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_screen_one, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        EditText email = view.findViewById(R.id.et_email);
        EditText password = view.findViewById(R.id.et_password);
        RadioGroup group = view.findViewById(R.id.rg_gender);
        CheckBox java = view.findViewById(R.id.checkBox_java);
        CheckBox c = view.findViewById(R.id.checkBox_c);
        CheckBox cSharp = view.findViewById(R.id.checkBox3);


        Button enter =view.findViewById(R.id.btn_enter);
        enter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                UserBojo user = new UserBojo();
                String gender;
                String name = email.getText().toString();
                String lan=" ";
                if (group.getCheckedRadioButtonId()==R.id.radioMale){
                    gender = "Male";
                }else {
                    gender = "Female";
                }
                if (java.isChecked()){
                    lan +=" Java ";
                }
                if (c.isChecked()){
                    lan +=" C  ";
                }
                if (cSharp.isChecked()){
                    lan+=" C# ";
                }
                user.setGender(gender);
                user.setUserName(name);
                user.setLanguage(lan);

                ScreenOneDirections.ActionScreenOneToScreenTwo action = ScreenOneDirections.actionScreenOneToScreenTwo(user);
                Navigation.findNavController(v).navigate(action);

            }
        });


    }
}