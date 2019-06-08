package ro.mirodone;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PasswordValidator2 {

    private Pattern pattern;
    private Matcher matcher;

    private static final String PASSWORD = "((?=.*\\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[^a-zA-Z0-9]).{6,20})";

     PasswordValidator2() {
        pattern = Pattern.compile(PASSWORD);
    }

    public boolean validate (final  String pass){
        matcher = pattern.matcher(pass);
        return matcher.matches();
    }

}
