package com.example.lab2;

import android.os.Parcel;
import android.os.Parcelable;

public class UserBojo implements Parcelable {
   private String userName;
   private String password;
   private String gender;
   private String language;

   public UserBojo() {

   }

   protected UserBojo(Parcel in) {
      userName = in.readString();
      password = in.readString();
      gender = in.readString();
      language = in.readString();
   }

   public static final Creator<UserBojo> CREATOR = new Creator<UserBojo>() {
      @Override
      public UserBojo createFromParcel(Parcel in) {
         return new UserBojo(in);
      }

      @Override
      public UserBojo[] newArray(int size) {
         return new UserBojo[size];
      }
   };

   public String getUserName() {
      return userName;
   }

   public void setUserName(String userName) {
      this.userName = userName;
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      this.password = password;
   }

   public String getGender() {
      return gender;
   }

   public void setGender(String gender) {
      this.gender = gender;
   }

   public String getLanguage() {
      return language;
   }

   public void setLanguage(String language) {
      this.language = language;
   }

   @Override
   public String toString() {
      return "UserBojo{" +
              "userName='" + userName + '\'' +
              ", password='" + password + '\'' +
              ", gender='" + gender + '\'' +
              ", language='" + language + '\'' +
              '}';
   }

   @Override
   public int describeContents() {
      return 0;
   }

   @Override
   public void writeToParcel(Parcel dest, int flags) {
      dest.writeString(userName);
      dest.writeString(password);
      dest.writeString(gender);
      dest.writeString(language);
   }
}
