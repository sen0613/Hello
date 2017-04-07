/**
 * Created by danawacomputer on 2017-04-07.
 * 클래스 따로 만들기
 */
public class PasswordGeneratorService {

    public String makePassword(
            String targetStr, String prefix, String postfix) {

        if (targetStr.length() >= 8) {
            //8자리 이상일때 postfix를 안 붙인다.
            postfix = "";
        }


        int squareOfCharLength =
                targetStr.length() * targetStr.length();

        targetStr =
                targetStr.substring(0, 1).toUpperCase() + targetStr.substring(1);

        String passwordGenerator =
                prefix + targetStr + squareOfCharLength + postfix;

        return passwordGenerator;
    }
}
