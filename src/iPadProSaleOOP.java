public class iPadProSaleOOP {
    public static void main(String[] args) {

        int regularPriceiPadPro = 999_000;
        double discountRate = 15.0 / 100;

        //출력방법2를 사용할때
        //바로 함수를 출력에 이용하여서 출력해도 됨.
        System.out.println(saleCost(regularPriceiPadPro,discountRate));

    }

    public static int saleCost (int cost, double discountRate){

        int resultPrice = (int)(cost*(1-discountRate));

        //출력방법2
        return resultPrice;
        // 함수가 종료되면서 resultPrice값을 main함수에 반환하겠다는 뜻.
        // return 0을 쓰려면 System.out.println(resultPrice+"원"); 이 있어야지 디버깅을 해야지 출력이 되고
        // return resultPrice; 만 하면 디버깅해도 아무런 값이 출력되지않음.
        // main함수내에서 리턴받은 값을 System.out.println()을 이용하여서 출력하여야 출력이 됨.
    }
}