import java.util.Scanner;

/**
 * Created by user on 2017-04-05.
 * 패스워드 생성기
 * 단어를 입력받아 (스캐너이용)
 * $$ + 첫글자는 대문자로 변경 + 글자수의 제곱 + ## 으로 변경하기
 *
 * 입력 : sewon
 * 출력 : $$Sewon25##
 */
public class PasswordGenerator {
    public static void main(String[] args) {

        System.out.println("문자를 입력하고 Enter키를 누르세요. (첫글자는 소문자로 입력하세요.)");
        System.out.print("입력: ");
        Scanner in = new Scanner(System.in);
        String inputData = in.nextLine();

        String groundLiteral1 = "$$"; // 앞에 입력해야 하는 데이터 값
        String groundLiteral2 = "##"; // 뒤에 입력해야 하는 데이터 값
        String firstLiteral = ""; // 첫글자를 저장할 데이터 값
        int countLiteral = 0; // 문자수 카운트한 값을 저장할 변수
        int squareData = 0; // 문자수의 제곱값을 저장할 변수
        String resultPassword = ""; // 최종결과

        firstLiteral = inputData.substring(0,1); // 첫글자 자르기
        firstLiteral = firstLiteral.toUpperCase(); // 첫글자 대문자로 변경
        countLiteral = inputData.length(); // 문자열 카운트
        squareData = countLiteral * countLiteral; // 문자수 제곱한 값

        System.out.print("비밀번호 생성: ");
        System.out.println(groundLiteral1 + firstLiteral + inputData.substring(1) + squareData + groundLiteral2);


    }
}
