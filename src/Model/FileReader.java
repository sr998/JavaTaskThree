package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader {

    public static ArrayList<String> readFromTxt(String filepath) throws IOException {
        String localDir = System.getProperty("user.dir");
        File log = new File(localDir+filepath);
        Scanner s = new Scanner(log);
        ArrayList<String> list = new ArrayList<String>();
        while (s.hasNextLine()){
            list.add(s.nextLine());
        }
        s.close();
        return list;
    }
}
