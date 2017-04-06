import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class InterestCalculator {
    public static void main(String[] args) {

        //input
        /*
        원금을 입력하세요: 3000000
        기간을 입력하세요: 48
        이율을 입력하세요: 35.5
         */

        Scanner in = new Scanner(System.in);

        System.out.println("원금을 입력하세요: ");
        int principal = in.nextInt();
        //String principal = in.nextLine();
        //int principalInt = Integer.parseInt(principal);
        //System.out.println(principalInt);


        System.out.println("기간(개월수)을 입력하세요: ");
        int months = in.nextInt();


        System.out.println("이율을 입력하세요: ");
        double interestRate = in.nextDouble();



        //processing
        /*
        이자계산공식: 이자 = 원금 x (이율 / 100) x (개월 / 12)
        기간간
         */


        double interest = principal * (interestRate / 100) * (months / 12);
        double total = interest + principal;


        //output
       /*
        48개월 후 당신은 5000000원을 받을 수 있습니다.
         */
        System.out.println(months + "개월 후 당신은 "
                + total + "원을 받을 수 있습니다.");
        // System.out.printf("%d 개월 후 당신은 %f원을 받을 수 있습니다.", months, total);


    }
}
