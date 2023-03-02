package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
class UserRegistrationMtdTest {
    @Test
    void checkFirstName(){
        UserRegistrationMtd firstName = new UserRegistrationMtd("Sagar");
        assertEquals("Sagar", firstName.Name());
    }
    @Test
    void checkLastName(){
        UserRegistrationMtd lastName = new UserRegistrationMtd("Somwanshi");
        assertEquals("Somwanshi", lastName.Name());
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
    String x =  "sagarraje34@gmail.com";

}