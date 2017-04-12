package exceptions;

import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-12.
 * while문/break문 이용해서 잘못된 숫자를 입력하면 다시 입력하도록 프로그램 짜기
 */
public class ExceptionTest {

    public static void main(String[] args) {

        while (true) {
            System.out.println("숫자를 입력해주세요. ");
            Scanner in = new Scanner(System.in);
            String userInput = in.nextLine();

            try {
                int converted = Integer.parseInt(userInput);
                System.out.printf("당신이 입력한 숫자는 %d입니다.", converted);
                break;
            } catch (NumberFormatException e) {
                System.out.println("잘못된 숫자를 입력하셨습니다. 다시 시도해주세요.");
            }
        }

    }
}