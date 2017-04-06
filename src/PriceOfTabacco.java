import java.util.Scanner;

/**
 * Created by danawacomputer on 2017-04-05.
 */
public class PriceOfTabacco {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("담배 종류를 입력하세요:");
        System.out.println("1:디스, 2:말보로");
        int tabacco = in.nextInt();


        System.out.println("나이를 입력하세요:");
        int age = in.nextInt();

        System.out.println("수량을 입력하세요:");
        int quantity = in.nextInt();

        double priceOfDis = 4500;
        double priceOfMalboro = 5200;


        // processing


        if(tabacco == 1) {

            if (age < 19) {
                priceOfDis = (priceOfDis) * 0.8 * quantity;
            }

            else if (age >= 45) {
                priceOfDis = priceOfDis * 1.3 * quantity;
            }

            else {
                priceOfDis = (priceOfDis) * quantity;
            }

            //output1
            System.out.printf("총 가격은 " + priceOfDis + "원입니다.");
        }

        if(tabacco == 2) {

            if (age < 19) {
                priceOfMalboro = priceOfMalboro * 0.8 * quantity;
            }

            else if (age >= 45) {
                priceOfMalboro = priceOfMalboro * 1.3 * quantity;
            }

            else {
                priceOfMalboro = priceOfMalboro * quantity;
            }

            //output2
            System.out.printf("총 가격은 " + priceOfMalboro + " 원입니다.");
        }


    }

        }






