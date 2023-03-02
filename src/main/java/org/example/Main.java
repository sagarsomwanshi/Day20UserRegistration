package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Main m = new Main();
        System.out.println("Welcome to the User Registration");
        UserRegistrationMtd obj = new UserRegistrationMtd();


        Scanner sc =  new Scanner(System.in);
        System.out.println("\nEnter First Name (1st character should be Capital & Should have at least 3 characters)");
        String firstName  = sc.nextLine();
        UserRegistrationMtd obj1 = new UserRegistrationMtd(firstName);
        System.out.println("\nEnter last Name (1st character should be Capital & Should have at least 3 characters)");
        String lastName = sc.nextLine();
        System.out.println("\nEnter Email Id : ");
        String email  = sc.nextLine();
        System.out.println("\nEnter Phone Number (Starts with +country code)");
        String phone  = sc.nextLine();
        System.out.println("\nEnter Password (should be minimum 8 characters, should contain at least 1 capital letter, number & special character )");
        String password  = sc.nextLine();

        System.out.println("User Info : "+
                "\nName : "+obj1.Name() +" " +obj.lastName(lastName)+
                "\nEmail : "+obj.email(email)+
                "\nPhone : "+obj.phone(phone)+
                "\nPassword : "+obj.password(password));
//        System.out.println("Name"+obj1.Name());
    }
}