package datetime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

/**
 * Created by danawacomputer on 2017-04-18.
 */
public class AnniversaryCalc {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now();
        System.out.println(today);

        LocalDate fiftythDay = today.plus(49, ChronoUnit.DAYS);
        System.out.println(fiftythDay);

        LocalDate hundredthDay = today.plus(99, ChronoUnit.DAYS);
        System.out.println(hundredthDay);

        LocalDate twohundredthDay = today.plus(199, ChronoUnit.DAYS);
        System.out.println(twohundredthDay);

        LocalDate fivehundredthDay = today.plus(499, ChronoUnit.DAYS);
        System.out.println(fivehundredthDay);

        LocalDate thousandthDay = today.plus(999, ChronoUnit.DAYS);
        System.out.println(thousandthDay);


        LocalDate baseDate = LocalDate.of(2017, 4, 3);

        LocalDate fiftyth = baseDate.plusDays(49);
        LocalDate hundredth = baseDate.plusDays(99);
        LocalDate twohundredth = baseDate.plusDays(199);
        LocalDate fivehundredth = baseDate.plusDays(499);
        LocalDate thousandth = baseDate.plusDays(999);

        System.out.println(fiftyth);
        System.out.println(hundredth);
        System.out.println(twohundredth);
        System.out.println(fivehundredth);
        System.out.println(thousandth);

        System.out.println("Epoch Day로부터 지금까지는 며칠일까?");
        long l = baseDate.toEpochDay();
        System.out.println(l + "일");

        System.out.println("첫수업일로부터 50일 후 날짜의 3년 전으로부터 3개월 후인 날짜는 언제일까?");
        LocalDate bb = baseDate.plusDays(49).minusYears(3).plusMonths(3);
        System.out.println(bb);

        // 시간을 비교하는 문법
        if (fiftyth.compareTo(hundredth) > 0) {
            System.out.println("fiftyth가 hundredth보다 더 큽니다.");
        } else {
            System.out.println("hundredth가 fiftyth보다 더 큽니다.");
        }

        if (fiftythDay.isAfter(hundredthDay)) {
            System.out.println("fiftythDay가 hundredthDay보다 더 나중입니다.");
        } else {
            System.out.println("hundredthDay가 fiftythDay보다 더 나중입니다.");
        }
    }
}