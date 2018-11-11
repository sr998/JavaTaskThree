package Model;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Dialog {

    public static void altoTxt(String filePath, List<String> list) throws IOException {
        list = FileReader.readFromTxt(filePath);
        String nameStr = EnterValues.enterString();
        AddToDb.addString(list,nameStr);
        EnterValues.addToTxt(list,filePath);
    }

    public static void addStudent() throws IOException {

        ArrayList<String> name = new ArrayList<>();
        System.out.println("Input Student's name :");
        altoTxt(Filepath.getNamePath(),name);

        ArrayList<String> surname = new ArrayList<>();
        System.out.println("Input Student's surname :");
        altoTxt(Filepath.getSurnamePath(),surname);

        ArrayList<String> middlename = new ArrayList<>();
        System.out.println("Input Student's middle name :");
        altoTxt(Filepath.getMiddlenamePath(),middlename);

        ArrayList<String> studentid = new ArrayList<>();
        System.out.println("Input Student's ID :");
        altoTxt(Filepath.getStudentID(),studentid);

        ArrayList<String> curse = new ArrayList<>();
        System.out.println("Input Student's curse :");
        altoTxt(Filepath.getCursePath(),curse);

        ArrayList<String> country = new ArrayList<>();
        System.out.println("Input Student's country :");
        altoTxt(Filepath.getCountryPath(),country);

        ArrayList<String> sex = new ArrayList<>();
        System.out.println("Input Student's sex (male/female) :");
        altoTxt(Filepath.getSexPath(),sex);

        ArrayList<String> marks = new ArrayList<>();
        System.out.println("Input Student's average mark :");
        altoTxt(Filepath.getAvgmarkPath(),marks);
    }

    public static void Menu() throws IOException {

        while (true) {
            System.out.println("Select option :\n *add* - Add new student to Database" +
                    "\n *printall* - Get all students" +
                    "\n *searchmarks* - Get students with best marks" +
                    "\n *searchforeign* - Get students foreigners with best marks" +
                    "\n *exit* - Exit from program");
            Scanner in = new Scanner(System.in);
            String option = in.nextLine();

            switch (option){
                case "add":{Dialog.addStudent(); break;}
                case "printall":{ListToArray.printAll(); break;}
                case "searchmarks":{SearchMethods.getBestByMark(); break;}
                case "searchforeign":{SearchMethods.foreignersWithGoodMarks(); break;}
                case "exit":{System.exit(0);}
                }
            }
        }
    }

