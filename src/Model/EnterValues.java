package Model;

import java.util.Scanner;

public class EnterValues {
    public static String enterString()
    {
        Scanner in = new Scanner(System.in);
        String variable = in.nextLine();
        if (!StringChecker.notNull(variable)){
            System.out.println("You entered wrong String (Your String is = "+variable+")");
            System.out.println("\nPlease, enter the correct String (not empty/null) :");
            EnterValues.enterString();

        }return variable;

    }
}
