/**
 * Created by danawacomputer on 2017-04-04.
 */
public class IPadPro {
    public static void main(String[] args) {

        int regularPriceForiPadPro = 999000;
        double dcRate = 0.15;


        System.out.println(getDiscountediPad(regularPriceForiPadPro, dcRate));
        //리턴받은 값을 println메소드를 이용하여서 바로 출력

        int resultPrice2 = getDiscountediPad(regularPriceForiPadPro, dcRate);
        //getDiscountediPad 메소드를 호출해서 return 받은 resultPrice값을 resultPrice2에 대입하여
        System.out.println(resultPrice2);
        //출력


    }


    public static int getDiscountediPad(int price, double dcRate) {
        int resultPrice =
                (int)(price * (1 - dcRate));

        //System.out.println(resultPrice+"원");
        //return 0;

        return resultPrice;
    }



}