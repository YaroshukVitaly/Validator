package by.yaroshuk;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {

    public static boolean checkPhoneNum (String phoneNum){
        Pattern pattern = Pattern.compile("^((\\+?375)([0-9]){9})$");
        Matcher matcher = pattern.matcher(phoneNum);
        if (matcher. matches()){
            System.out.println("is correct");
            return true;
        } else{
            System.out.println("is incorrect");
            return false;
        }
    }
    public static boolean checkEmail (String email){
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9]{1,}"+"((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*"+"@"
                +"[a-zA-Z0-9]{1,}"+"((\\.|\\_|-{0,1})[a-zA-Z0-9]{1,})*"+"\\.[a-zA-Z]{2,}$");
        Matcher matcher = pattern.matcher(email);
        if (matcher. matches()){
            System.out.println("is correct");
            return true;
        } else{
            System.out.println("is incorrect");
            return false;
        }
    }
    public static boolean checkName (String name){
        Pattern pattern = Pattern.compile("^[А-Яа-я]{4,16}$");
        Matcher matcher = pattern.matcher(name);
        if (matcher. matches()){
            System.out.println("is correct");
            return true;
        } else{
            System.out.println("is incorrect");
            return false;
        }
    }
    public static boolean checkPassword (String password){
        Pattern pattern = Pattern.compile("(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9@#$%]).{8,16}$");
        Matcher matcher = pattern.matcher(password);
        if (matcher. matches()){
            System.out.println("is correct");
            return true;
        } else{
            System.out.println("is incorrect");
            return false;
        }
    }
    public static boolean checkNumPassport (String numPassport){
        Pattern pattern = Pattern.compile("^[0-9]{1,7}$");
        Matcher matcher = pattern.matcher(numPassport);
        if (matcher. matches()){
            System.out.println("is correct");
            return true;
        } else{
            System.out.println("is incorrect");
            return false;
        }
    }
    public static boolean checkWhoGetPasport (String whoGetPasport){
        Pattern pattern = Pattern.compile("^[А-яа-я\\s]{1,60}$");
        Matcher matcher = pattern.matcher(whoGetPasport);
        if (matcher. matches()){
            System.out.println("is correct");
            return true;
        } else{
            System.out.println("is incorrect");
            return false;
        }
    }
    public static boolean checkWhoGetDriveDoc (String whoGetDriveDoc){
        Pattern pattern = Pattern.compile("^[А-яа-я\\s]{1,60}$");
        Matcher matcher = pattern.matcher(whoGetDriveDoc);
        if (matcher. matches()){
            System.out.println("is correct");
            return true;
        } else{
            System.out.println("is incorrect");
            return false;
        }
    }
    public static boolean checkBirthPlace (String birthPlace){
        Pattern pattern = Pattern.compile("^[А-яа-я\\s]{1,60}$");
        Matcher matcher = pattern.matcher(birthPlace);
        if (matcher. matches()){
            System.out.println("is correct");
            return true;
        } else{
            System.out.println("is incorrect");
            return false;
        }
    }
}
