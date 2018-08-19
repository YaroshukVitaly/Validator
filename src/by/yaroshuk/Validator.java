package by.yaroshuk;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static boolean phoneNum (String phoneNum){
        Pattern pattern = Pattern.compile("^((\\+?375)([0-9]){9})$");
        Matcher matcher = pattern.matcher(phoneNum);
        if (matcher. matches()){
            System.out.println("Phone number is correct");
            return true;
        } else{
            System.out.println("Phone number is incorrect");
            return false;
        }
    }
    public static boolean email (String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{1,}"+"((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*"+"@"
                +"[a-zA-Z0-9]{1,}"+"((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*"+"\\.[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        if (matcher. matches()){
            System.out.println("Email is correct");
            return true;
        } else{
            System.out.println("Email is incorrect");
            return false;
        }
    }
    public static boolean name (String name){
        Pattern pattern = Pattern.compile("^[А-Яа-я]{4,16}$");
        Matcher matcher = pattern.matcher(name);
        if (matcher. matches()){
            System.out.println("Name is correct");
            return true;
        } else{
            System.out.println("Name is incorrect");
            return false;
        }
    }
    public static boolean password (String password){
        Pattern pattern = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9@#$%]).{8,16}$");
        Matcher matcher = pattern.matcher(password);
        if (matcher. matches()){
            System.out.println("Password is correct");
            return true;
        } else{
            System.out.println("Password is incorrect");
            return false;
        }
    }
    public static boolean numPassport (String numPassport){
        Pattern pattern = Pattern.compile("^[0-9]{1,7}$");
        Matcher matcher = pattern.matcher(numPassport);
        if (matcher. matches()){
            System.out.println("NumPassport is correct");
            return true;
        } else{
            System.out.println("NumPassport is incorrect");
            return false;
        }
    }
    public static boolean whoGetPasport (String whoGetPasport){
        Pattern pattern = Pattern.compile("^[А-яа-я\\s]{1,60}$");
        Matcher matcher = pattern.matcher(whoGetPasport);
        if (matcher. matches()){
            System.out.println("WhoGetPasport is correct");
            return true;
        } else{
            System.out.println("WhoGetPasport is incorrect");
            return false;
        }
    }
    public static boolean whoGetDriveDoc (String whoGetDriveDoc){
        Pattern pattern = Pattern.compile("^[А-яа-я\\s]{1,60}$");
        Matcher matcher = pattern.matcher(whoGetDriveDoc);
        if (matcher. matches()){
            System.out.println("WhoGetDriveDoc is correct");
            return true;
        } else{
            System.out.println("WhoGetDriveDoc is incorrect");
            return false;
        }
    }
    public static boolean birthPlace (String birthPlace){
        Pattern pattern = Pattern.compile("^[А-яа-я\\s]{1,60}$");
        Matcher matcher = pattern.matcher(birthPlace);
        if (matcher. matches()){
            System.out.println("BirthPlace is correct");
            return true;
        } else{
            System.out.println("BirthPlace is incorrect");
            return false;
        }
    }
}
