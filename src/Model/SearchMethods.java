package Model;

import Model.Misc.Filepath;

import java.io.IOException;
import java.util.ArrayList;

public class SearchMethods {

    public static void getBestByMark() throws IOException {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Best students (avg mark >=4) \n");

        ArrayList<String> tempMark = FileReader.readFromTxt(Filepath.getAvgmarkPath());

        for (int i = 0; i < tempMark.size(); i++) {
            if (Integer.parseInt(tempMark.get(i)) >= 4) {
                PrintData.printById(i);
            }

        }
        System.out.println("\n\n");

    }

    public static void foreignersWithGoodMarks() throws IOException {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.println("Best foreign students (avg mark >=4) \n");
        ArrayList<String> tempMark = FileReader.readFromTxt(Filepath.getAvgmarkPath());
        ArrayList<String> tempCountry = FileReader.readFromTxt(Filepath.getCountryPath());

        for (int i = 0; i < tempMark.size(); i++) {
            if (Integer.parseInt(tempMark.get(i)) >= 4 && !tempCountry.get(i).equals("Ukraine")) {
                PrintData.printById(i);
            }
        }
        System.out.println("\n\n\n\n");
    }
}
