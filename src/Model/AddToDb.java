package Model;

import java.util.List;

public class AddToDb {

    public static void addString(List<String> list, String s) {
            list.add(s);

    }


    public static String getStringById(List<String> list, int id) {
        return list.get(id);
    }


    public static int searchString(List<String> list, String s) {
        return  list.indexOf(s);
    }


    public static void removeStringById(List<String> list, int id) {
        list.remove(id);
    }

    public static void removeString(List<String> list, String s) {
        list.remove(s);
    }


    public static void changeStringById(List<String> list, String s, int id) {
        list.set(id,s);
    }


    public static void changeString(List<String> list, String s) {
        int index =list.indexOf(s);
        list.set(index,s);
    }


}
