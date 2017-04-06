import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class PasswordGenerator_Retrial {
    public static void main(String[] args) {

        // input from keyboard
        Scanner in = new Scanner(System.in);

        System.out.println("단어 하나를 입력하세요: ");

        String targetStr = in.nextLine();

        // processing
        String prefix = "$$";
        String postfix = "##";

        int squareOfCharLength =
                targetStr.length() * targetStr.length();

        targetStr =
                targetStr.substring(0,1).toUpperCase() + targetStr.substring(1);

        String passwordGenerator =
                prefix + targetStr + squareOfCharLength + postfix;

        // output the result
        System.out.println(passwordGenerator);


    }
}
