import java.io.*;
import java.util.*;

public class toggle_optica_doc {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(toggleCase(str));
        scn.close();
    }

    public static String toggleCase(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch >= 'a' && ch <= 'z') {
                /*
                 * typecasting cuz when arithmetic operations are done on string/char then
                 * string/char is converted into Integer
                 */
                char UpperCase = (char) (ch - 'a' + 'A');
                sb.append(UpperCase);

            } else if (ch >= 'A' && ch <= 'Z') {

                char LowerCase = (char) (ch - 'A' + 'a');
                sb.append(LowerCase);

            }
        }
        return sb.toString();
    }

}

/*
 * Input-> pepCODinG
 * Output-> PEPcodINg
 */