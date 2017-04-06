/**
 * Created by danawacomputer on 2017-04-04.
 */
public class CelsiusToFahrenheit {

    public static void main(String[] args) {

        int celsiusTemperature = 19;

        //double fahrenheitTemperature = (celsiusTemperature * 1.8) + 32;

        System.out.println("화씨온도는? " + fahTemp(celsiusTemperature) + "˚F 입니다.");
    }

    public static double fahTemp(int celsiusTemperature) {
        //return (celsiusTemperature * 1.8) + 32;

        double fahrenheitTemperature=(celsiusTemperature * 1.8) + 32;
        return fahrenheitTemperature;
    }
}
