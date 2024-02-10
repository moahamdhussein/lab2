package com.example.lab2;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class ScreenTwo extends Fragment {


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_screen_two, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        UserBojo userBojo = ScreenTwoArgs.fromBundle(getArguments()).getUserInfo();
        TextView textView = view.findViewById(R.id.user_info);
        textView.setText("Hello " + userBojo.getUserName() + " you are a greate \n"+userBojo.getGender()+" because you prefer " +" langauages like  " +userBojo.getLanguage() );

    }
}