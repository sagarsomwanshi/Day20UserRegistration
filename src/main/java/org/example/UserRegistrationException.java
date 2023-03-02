package org.example;

public class UserRegistrationException extends RuntimeException{
    enum ExceptionType{FIRST_NAME,LAST_NAME,EMAIL,PHONE_NUMBER,PASSWORD}
    ExceptionType Type;

    public UserRegistrationException(ExceptionType type, String message) {
        super(message);
        this.Type = type;
    }
}