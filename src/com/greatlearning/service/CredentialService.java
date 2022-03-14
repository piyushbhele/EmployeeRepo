package com.greatlearning.service;

import com.greatlearning.model.Employee;

import java.util.Random;

public class CredentialService {

    public String generateEmailAddress(String firstName, String lastName, String department){
        return firstName+lastName+"@"+department+".abc.com";
    }


    public char [] generatePassword(){

        String capitalLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "1234567890";
        String specialChar = "!@#$%^&*()_+-=/?><>>.";

        String ranPass = capitalLetter + smallLetters + numbers + specialChar;

        Random random = new Random();

        char [] password = new char[8];

        for ( int i = 0; i < 8; i++){

            password[i] = ranPass.charAt(random.nextInt(ranPass.length()));
        }
        return password;
    }

    public void showCredentials(Employee employee, String email, char [] generatedPassword){
        System.out.println("Dear "+employee.getFirstName()+" your credentials are :");
        System.out.println("Email : "+email);
        System.out.println("Password : "+generatedPassword);
    }


}
