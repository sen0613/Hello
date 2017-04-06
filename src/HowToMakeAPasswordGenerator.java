import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class HowToMakeAPasswordGenerator {
    public static void main(String[] args) {

        // input from keyboard
        Scanner in = new Scanner(System.in);

        System.out.println("단어 하나를 입력하세요: ");
        String targetStr = in.nextLine();

        // second. processing
        String postfix = "##";
        String prefix = "$$";
        int squareOfCharLength =
                targetStr.length() * targetStr.length();

        if (targetStr.length() >= 8) {
            // 8자리 이상일 때 postfix를 안 붙인다.
            postfix = "";
            String passwordGenerated =
                    prefix + targetStr + squareOfCharLength + postfix;

            // the last.. output the result

        }


        targetStr =
                    targetStr.substring(0, 1).toUpperCase()
                            + targetStr.substring(1);

        String passwordGenerated =
                prefix + targetStr + squareOfCharLength + postfix;

        // the last.. output the result

        System.out.println(passwordGenerated);


    }
}
