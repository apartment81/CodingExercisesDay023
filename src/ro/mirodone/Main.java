package ro.mirodone;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        PasswordValidator passwordValidator = new PasswordValidator();


        Scanner scan = new Scanner(System.in);

        System.out.print("1. Generatae password 2. Test Password :");
        int option = scan.nextInt();

        switch (option) {
            case 1:
                String pass = "";
                System.out.print("Length of password >8 : ");
                int len = scan.nextInt();
                int count = 0;
                while (true) {
                    if (len < 8)
                        break;

                    pass = passwordValidator.randomString(len);
                    if (passwordValidator.validate(pass)) {
                        break;
                    } else {
                        System.out.println("Retrying..");
                        count++;
                    }
                }

                System.out.print("Password generated = " + pass);
                break;
            case 2:
                System.out.print("Password : ");
                String password = scan.next();
                if (passwordValidator.validate2(password)) {
                    System.out.println("Pass");
                }
                break;
            default:
                break;
        }


    }
}
