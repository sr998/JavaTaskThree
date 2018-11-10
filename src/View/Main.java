package View;

import Model.AddToDb;
import Model.EnterValues;
import Model.ListToArray;


import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> pupil = new ArrayList<>();

        System.out.println("Enter pupil name");
        String pupilName=EnterValues.enterString();

        AddToDb.addString(pupil,pupilName);
        ListToArray.print(pupil);
        int index = AddToDb.searchString(pupil,pupilName);
        System.out.println("Index = "+index);
       String result= AddToDb.getStringById(pupil,0);
        System.out.println("String found by index ="+0+" ------> "+result);
        int result2 = AddToDb.searchString(pupil,"Georg");
        System.out.println("Index of Georg = "+result2);
    }
}
