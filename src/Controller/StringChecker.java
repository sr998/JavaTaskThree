package Controller;

public class StringChecker {

    public static boolean notNull(String s){
        if (s == null || s.isEmpty()){
           return false;

        }
        return true;
    }
}
