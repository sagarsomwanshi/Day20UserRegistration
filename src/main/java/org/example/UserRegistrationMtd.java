package org.example;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistrationMtd {

    String nameInput;

    public UserRegistrationMtd(String nameInput) {
        this.nameInput = nameInput;
    }

    public UserRegistrationMtd() {
    }

    public String Name(){
        try {
            if (Pattern.matches("^[A-Z][a-z]{2,}$", nameInput)) {
                return nameInput;
            }
            else{
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.FIRST_NAME,"Please Enter Valid Name");
            }
        }catch(UserRegistrationException e){
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.FIRST_NAME,"Please Enter Valid Name");
            }

    }
    public String lastName(String lastnameInput){
        try {
            if (Pattern.matches("^[A-Z][a-z]{2,}$", lastnameInput)) {
                return lastnameInput;
            }else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.FIRST_NAME,"Please Enter Valid Last Name");
            }
        }catch(UserRegistrationException e){
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.FIRST_NAME,"Please Enter Valid Last Name");
        }
    }
    public String email(String emailInput){
        try{if(Pattern.matches("^([\\w]+[_+.-]?[\\w]+)@([a-zA-Z0-9]+).([a-zA-Z]+[.]?[a-zA-Z]{2,})$",emailInput)) {
            return emailInput;
        }
        }catch (UserRegistrationException e){
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMAIL,"Please Enter Valid Email ID");
        }
            return null;
    }
    public String phone(String phone){

        try {
            if(Pattern.matches("^\\+[0-9]{2}[0-9]{10}$",phone)){
                return phone;
            }else{
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.PHONE_NUMBER,"Please Enter Phone Number");
            }
        }catch (UserRegistrationException e){
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.PHONE_NUMBER,"Please Enter Phone Number");
        }
    }
    public String password(String password){
        try {
            if(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*+=_-])(?=\\S+$).{8,}$",password)){
                return password;
            }
            else{
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.PASSWORD,"Please Enter Valid Password");
            }
        }catch (UserRegistrationException e){
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.PASSWORD,"Please Enter Valid Password");
        }
    }
}
