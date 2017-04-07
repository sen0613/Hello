/**
 * Created by danawacomputer on 2017-04-04.
 */
public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        int celsius = 19;

        CelsiusToFahrenheitService service =
                new CelsiusToFahrenheitService();

        double result = service.toFahrenheit(celsius);


        System.out.println("화씨온도는? " + result + "˚F 입니다.");
    }

}
