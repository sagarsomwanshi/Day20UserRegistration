package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationMtd {
    public String Name(String nameInput){

        if(Pattern.matches("^[A-Z][a-z]{2,}$",nameInput)){
            return nameInput;
        }else{
            System.out.println("Please Enter Valid Name");
            Name(nameInput);
            return null;
        }
    }
    public String email(String emailInput){

        if(Pattern.matches("^([\\w]+[_+.-]?[\\w]+)@([a-zA-Z0-9]+).([a-zA-Z]+[.]?[a-zA-Z]{2,})$",emailInput)){
            return emailInput;
        }else{
            System.out.println("Please Enter Valid Email ID");
            email(emailInput);
            return null;
        }
    }
    public String phone(String phone){

        if(Pattern.matches("^\\+[0-9]{2}[0-9]{10}$",phone)){
            return phone;
        }else{
            System.out.println("Please Enter Valid Phone Number");
            phone(phone);
            return null;
        }
    }
    public String password(String password){

        if(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*+=_-])(?=\\S+$).{8,}$",password)){
            return password;
        }else{
            System.out.println("Please Enter Valid Password");
            password(password);
            return null;
        }
    }
}
