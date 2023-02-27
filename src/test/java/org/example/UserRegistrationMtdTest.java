package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class UserRegistrationMtdTest {
    @Test
    void checkFirstName(){
        UserRegistrationMtd firstName = new UserRegistrationMtd();
        assertEquals("Sagar", firstName.Name("Sagar"));
    }
    @Test
    void checkLastName(){
        UserRegistrationMtd lastName = new UserRegistrationMtd();
        assertEquals("Somwanshi", lastName.Name("Somwanshi"));
    }
    @Test
    void checkEmail(){
        UserRegistrationMtd email = new UserRegistrationMtd();
        assertEquals("sagarraje34@gmail.com", email.email("sagarraje34@gmail.com"));
    }
    @Test
    void checkPhone(){
        UserRegistrationMtd phone = new UserRegistrationMtd();
        assertEquals("+918483820145", phone.phone("+918483820145"));
    }
    @Test
    void checkPassword(){
        UserRegistrationMtd password = new UserRegistrationMtd();
        assertEquals("Sagar@1234", password.password("Sagar@1234"));
    }


}