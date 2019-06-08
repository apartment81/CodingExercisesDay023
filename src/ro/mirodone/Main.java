package ro.mirodone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PasswordValidator2 passwordValidator = new PasswordValidator2();

        Scanner scan = new Scanner(System.in);

        System.out.print(" Type your Password :");
        String password = scan.nextLine();

        // code stops in either cases
/*        if(passwordValidator.validate(password)){
            System.out.println("Password accepted!");
        }else {
            System.out.println("Do not meet criteria, try again!");
        }*/

        // code runs until the password meets required criteria
        while (!passwordValidator.validate(password)) {
            System.out.println("Do not meet criteria, try again!");
            System.out.print(" Type your Password :");
            password = scan.nextLine();
        }
        System.out.println("Password accepted!");
    }
}
