package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

class UserRegistrationMtdTest {
    @Test
    void checkFirstName()throws UserRegistrationException{
        UserRegistrationMtd firstName = new UserRegistrationMtd();
        assertEquals("Sagar", firstName.firstName.lamdaUserRegistration("Sagar"));
    }
    @Test
    void checkLastName()throws UserRegistrationException{
        UserRegistrationMtd lastName = new UserRegistrationMtd();
        assertEquals("Somwanshi", lastName.lastName.lamdaUserRegistration("Somwanshi"));
    }
    @Test
    void checkEmail()throws UserRegistrationException{
        UserRegistrationMtd email = new UserRegistrationMtd();
        assertEquals("sagarraje34@gmail.com", email.email.lamdaUserRegistration("sagarraje34@gmail.com"));
    }
    @Test
    void checkPhone()throws UserRegistrationException{
        UserRegistrationMtd phone = new UserRegistrationMtd();
        assertEquals("+918483820145", phone.phone.lamdaUserRegistration("+918483820145"));
    }
    @Test
    void checkPassword()throws UserRegistrationException{
        UserRegistrationMtd password = new UserRegistrationMtd();
        assertEquals("Sagar@1234", password.password.lamdaUserRegistration("Sagar@1234"));
    }
}