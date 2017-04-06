/**
 * Created by danawacomputer on 2017-04-06.
 */
public class iPadProSaleOOP2 {
    public static void main(String[] args) {

        int regularPriceiPadPro = 999_000;
        double discountRate = 15.0 / 100;

        //double iPadSaleCost = 15 / 100.0;
        //double 값으로 계산을 원한다면, 위의 두 코드로 계산을 하여도 됨.
        // 정수값에 .(온점)으로 실수로 표기를 하여도 됨.


        //출력방법1을 이용할때
        saleCost(regularPriceiPadPro, discountRate);
        // saleCost 함수 호출
        //변수로 지정하여서 값을 저장하여서 출력값 출력
        int resultCost = 0;
        System.out.println(resultCost);
    }

    public static int saleCost (int cost, double discountRate){

        int resultPrice = (int)(cost*(1-discountRate));


       //출력방법1
        System.out.println(resultPrice+"원");
        return 0;
        // return 0으로 하면 함수호출이 끝나도 아무런 값을 반환하지 않는다는 뜻임.



    }
}