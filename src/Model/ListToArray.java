package Model;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ListToArray {


    public static void printById(int id) throws IOException {
        ArrayList<String> tempName = FileReader.readFromTxt(Filepath.getNamePath());
        ArrayList<String> tempSurname = FileReader.readFromTxt(Filepath.getSurnamePath());
        ArrayList<String> tempMiddlename = FileReader.readFromTxt(Filepath.getMiddlenamePath());
        ArrayList<String> tempid = FileReader.readFromTxt(Filepath.getStudentID());
        ArrayList<String> tempCurse = FileReader.readFromTxt(Filepath.getCursePath());
        ArrayList<String> tempCountry = FileReader.readFromTxt(Filepath.getCountryPath());
        ArrayList<String> tempSex = FileReader.readFromTxt(Filepath.getSexPath());
        ArrayList<String> tempMark = FileReader.readFromTxt(Filepath.getAvgmarkPath());

        System.out.println("----------------------------------------------------------------------------------"+
                "\n ID = "+id+
                "\t Name : "+tempName.get(id) +
                "\t Surname : "+tempSurname.get(id)+
                "\t Middlename : "+tempMiddlename.get(id)+
                "\n Student id : "+tempid.get(id)+
                "\t Course : "+tempCurse.get(id)+
                "\t Country : "+tempCountry.get(id)+
                "\t Sex : "+tempSex.get(id)+
                "\t Average Mark : "+tempMark.get(id));

    }

    public static void printAll() throws IOException {
        ArrayList<String> tempName = FileReader.readFromTxt(Filepath.getNamePath());
        for (int i = 0; i < tempName.size(); i++) {
            printById(i);
        }
        System.out.println("\n\n\n\n");
    }

}
