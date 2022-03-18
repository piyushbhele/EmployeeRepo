package com.greatlearning.service;

import com.greatlearning.model.Employee;

import java.util.Random;

public class CredentialService {


    String chars = "abcdefghijklmnopqrstuvwxyz";
    String CHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String NUM = "1234567890";
    String SPEC = "@#$%^&+=";
    Random rnd = new Random();


    public String getTwoValue(String src) {

        int index1 = (int) (rnd.nextFloat() * src.length()),
                index2 = (int) (rnd.nextFloat() * src.length());
        return "" + src.charAt(index1) + src.charAt(index2);
    }

    public String generatePassword() {
        return getTwoValue(chars) + getTwoValue(CHARS) + getTwoValue(NUM) + getTwoValue(SPEC);
    }


    public void showCredentials(Employee employee, String email, String generatedPassword) {
        System.out.println("Dear " + employee.getFirstName() + " your credentials are :");
        System.out.println("Email : " + email);
        System.out.println("Password : " + generatedPassword);
    }

    public String generateEmailAddress(String firstName, String lastName, String department) {
        return firstName + lastName + "@" + department + ".abc.com";
    }


}
