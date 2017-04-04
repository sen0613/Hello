/**
 * Created by danawacomputer on 2017-04-04.
 */
public class IPadPro {
    public static void main(String[] args) {

        int originalPrice = 999000;
        double discountRate = 0.15;

        double discountedPrice = originalPrice * (1 - discountRate);

        System.out.println("iPad Pro 할인가는? " + (int)discountedPrice + "원입니다.");

    }
}