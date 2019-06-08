package ro.mirodone;


import java.util.Random;


public class PasswordValidator {

    public  boolean validate(String password) {
        return password.matches("((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%]).{8,20})");

    }

     private boolean symbol(String password) {
        return password.matches(".*[@#$%].*");

    }

     private boolean uppcase(String password) {
        return password.matches(".*[A-Z].*");

    }

     private boolean lowerCase(String password) {
        return password.matches(".*[a-z].*");

    }

     private boolean digit(String password) {
        return password.matches(".*\\d.*");

    }

    public  boolean validate2(String pass) {
        boolean flag = true;

        if (pass.length() < 8) {
            System.out.println("Password must more than 8");
            flag = false;
        } else if (!digit(pass)) {
            System.out.println("Password must contains digit");
            flag = false;
        } else if (!symbol(pass)) {
            System.out.println("Password must contains symbol");
            flag = false;
        } else if (!uppcase(pass)) {
            System.out.println("Password must contains Upper case");
            flag = false;
        } else if (!lowerCase(pass)) {
            System.out.println("Password must contains Lower case");
            flag = false;
        }

        return flag;
    }

    public  String randomString(int len) {
        Random rnd = new Random();
        String AB = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz@#$%&";
        StringBuilder sb = new StringBuilder(len);
        for (int i = 0; i < len; i++)
            sb.append(AB.charAt(rnd.nextInt(AB.length())));
        return sb.toString();
    }



}
