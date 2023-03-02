package org.example;

import java.util.Scanner;
import java.util.function.Predicate;
import java.util.regex.Pattern;

public class UserRegistrationMtd {


    public UserRegistrationMtd() {
    }


    Lamda firstName = firstnameInput ->{
        try {
            if (Pattern.matches("^[A-Z][a-z]{2,}$", firstnameInput)) {
                return firstnameInput;
            }
            else{
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.FIRST_NAME,"Please Enter Valid Name");
            }
        }catch(UserRegistrationException e){
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.FIRST_NAME,"Please Enter Valid Name");
            }

    };
   Lamda lastName = lastnameInput ->{
        try {
            if (Pattern.matches("^[A-Z][a-z]{2,}$", lastnameInput)) {
                return lastnameInput;
            }else {
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.FIRST_NAME,"Please Enter Valid Last Name");
            }
        }catch(UserRegistrationException e){
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.FIRST_NAME,"Please Enter Valid Last Name");
        }
    };
    Lamda email =  emailInput->{
        try{
            if(Pattern.matches("^([\\w]+[_+.-]?[\\w]+)@([a-zA-Z0-9]+).([a-zA-Z]+[.]?[a-zA-Z]{2,})$",emailInput)) {
            return emailInput;
        } else{
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMAIL,"Please Enter Valid Email ID");
            }
        }catch (UserRegistrationException e){
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.EMAIL,"Please Enter Valid Email ID");
        }
    };
    Lamda phone = phoneInput->{

        try {
            if(Pattern.matches("^\\+[0-9]{2}[0-9]{10}$",phoneInput)){
                return phoneInput;
            }else{
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.PHONE_NUMBER,"Please Enter Phone Number");
            }
        }catch (UserRegistrationException e){
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.PHONE_NUMBER,"Please Enter Phone Number");
        }
    };
    Lamda password = passwordInput->{
        try {
            if(Pattern.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#$%^&*+=_-])(?=\\S+$).{8,}$",passwordInput)){
                return passwordInput;
            }
            else{
                throw new UserRegistrationException(UserRegistrationException.ExceptionType.PASSWORD,"Please Enter Valid Password");
            }
        }catch (UserRegistrationException e){
            throw new UserRegistrationException(UserRegistrationException.ExceptionType.PASSWORD,"Please Enter Valid Password");
        }
    };

}
