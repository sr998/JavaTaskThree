package Model.Misc;

public class Filepath {
    private static String namePath = "\\src\\Db\\name.txt";
    private static String surnamePath = "\\src\\Db\\surname.txt";
    private static String middlenamePath = "\\src\\Db\\middlename.txt";
    private static String studentID = "\\src\\Db\\studentid.txt";
    private static String cursePath = "\\src\\Db\\curse.txt";
    private static String countryPath = "\\src\\Db\\country.txt";
    private static String sexPath = "\\src\\Db\\sex.txt";
    private static String avgmarkPath = "\\src\\Db\\avgmark.txt";



    public static String getNamePath() {
        return namePath;
    }
    public static String getSurnamePath() {
        return surnamePath;
    }

    public static String getMiddlenamePath() {
        return middlenamePath;
    }

    public static String getStudentID() {
        return studentID;
    }

    public static String getCursePath() {
        return cursePath;
    }

    public static String getCountryPath() {
        return countryPath;
    }

    public static String getSexPath() {
        return sexPath;
    }

    public static String getAvgmarkPath() {
        return avgmarkPath;
    }
}
