package com.greatlearning.main;

import com.greatlearning.model.Employee;
import com.greatlearning.service.CredentialService;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Employee employee = new Employee("ajay", "tiwari");
        CredentialService cred = new CredentialService();
        String generatedEmail;
        char[] generatedPassword;

        Scanner sc = new Scanner(System.in);

       int dept;
        do{

        System.out.println("Please enter the department from the following : ");
        System.out.println("1.Technical");
        System.out.println("2.Admin");
        System.out.println("3.Human Resources");
        System.out.println("4.Legal");
        System.out.println("Enter 5 for Exit");


         dept = sc.nextInt();


            switch (dept) {
                case 1:
                    generatedEmail = cred.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "tech");
                    generatedPassword = cred.generatePassword();
                    cred.showCredentials(employee,generatedEmail,generatedPassword);
                    break;

                case 2:
                    generatedEmail = cred.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "admin");
                    generatedPassword = cred.generatePassword();
                    cred.showCredentials(employee,generatedEmail,generatedPassword);
                    break;

                case 3 :
                    generatedEmail = cred.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "hr");
                    generatedPassword = cred.generatePassword();
                    cred.showCredentials(employee,generatedEmail,generatedPassword);
                    break;

                case 4:
                    generatedEmail = cred.generateEmailAddress(employee.getFirstName(), employee.getLastName(), "legal");
                    generatedPassword = cred.generatePassword();
                    cred.showCredentials(employee,generatedEmail,generatedPassword);
                    break;

                case 5 : dept = -1;
                break;
            }
        }while(dept != -1);


    }

}
