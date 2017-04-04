/**
 * Created by danawacomputer on 2017-04-04.
 */
public class ManipulatingTheLetters {
    public static void main(String[] args) {

        String firstChar = "soongon";
        String myStr2 = "ay";

        String sliced = firstChar.substring(1,7); // oongon까지 나타내기
        String sliced2 = firstChar.substring(0,1); // s만 남기기

        String result = sliced + sliced2; // oongon + s
        String result2 = result + myStr2; // oongons + "ay"

        System.out.println(result2); // oongonsay


        String origianl = "soongon.kim";
        System.out.println(origianl.substring(0,origianl.indexOf("."))); // String original에서 .이전글자만 나타내기

    }
}
