package Controller;

import java.io.*;
import java.util.List;
import java.util.Scanner;

public class InputController {

    public static String enterString()
    {
        Scanner in = new Scanner(System.in);
        String variable = in.nextLine();
        if (!StringChecker.notNull(variable))
        {
            System.out.println("You entered wrong String (Your String is = "+variable+")");
            System.out.println("\nPlease, enter the correct String (not empty/null) :");
            InputController.enterString();

        }return variable;

    }

    public static void addToTxt(List<String> lines,String filepath) throws IOException {
        String localDir = System.getProperty("user.dir");
        File log = new File(localDir+filepath);

        BufferedWriter bw = null;

        try {
            // APPEND MODE SET HERE
            bw = new BufferedWriter(new FileWriter(log, false));


            for (int i = 0; i < lines.size(); i++) {
                String copy= lines.get(i);
                bw.write(copy);
                bw.newLine();
                bw.flush();
            }

        } catch (IOException ioe) {
            ioe.printStackTrace();
        } finally {                       // always close the file
            if (bw != null) try {
                bw.close();
            } catch (IOException ioe2) {
                // just ignore it
            }
        } // end try/catch/finally

    }

    }



