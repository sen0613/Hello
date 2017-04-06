/**
 * Created by danawacomputer on 2017-04-04.
 */
public class FahrenheitToCelsius {

    public static double celTemp(double b){
        double a = (b - 32) / 1.8;
        return a;
    }

    public static void main(String[] args) {

        double fahrenheitTemperature = 66.2;
        System.out.println("섭씨온도는? " + celTemp(fahrenheitTemperature) + "˚C 입니다.");



    }


}
