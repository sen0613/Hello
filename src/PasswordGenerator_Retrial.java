
/**
 * Created by danawacomputer on 2017-04-05.
 */
public class PasswordGenerator_Retrial {
    public static void main(String[] args) {


        String prefix = "$$";
        String postfix = "##";

        PasswordGeneratorScanService scanService = new PasswordGeneratorScanService();
        String targetStr = scanService.Scanword ();

        PasswordGeneratorService service = new PasswordGeneratorService();
        String passwordGenerator = service.makePassword(targetStr, prefix, postfix);




        // output the result
        System.out.println(passwordGenerator);


    }

}
