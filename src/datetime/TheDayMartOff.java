package datetime;

import sun.util.resources.cldr.lag.LocaleNames_lag;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.*;

/**
 * Created by danawacomputer on 2017-04-18.
 */
public class TheDayMartOff implements TemporalAdjuster {
    @Override
    public Temporal adjustInto(Temporal input) {
//        //1. 계산을 위한 기준 날짜
//        LocalDate theDay = LocalDate.from(temporal);
//
//        //2. 기준날짜의 달의 첫째날을 구한다.
//        LocalDate theFirstDayOfMonth =
//                theDay.with(TemporalAdjusters.firstDayOfMonth());
//
//        //3. 두번째주 일요일
//        LocalDate secondSunday =
//                theFirstDayOfMonth.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY))
//                        .with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
//        // 4. 넷째주 일요일
//        LocalDate fourthSunday =
//                secondSunday.with(TemporalAdjusters.next(DayOfWeek.SUNDAY))
//                        .with(TemporalAdjusters.next(DayOfWeek.SUNDAY));
//
//        //5. 기준일이 둘째주 일요일 이전이면 둘째주 일요일을 리턴하고 아니면 넷째주 일요일을 리턴한다.
//        if(theDay.isBefore(secondSunday)) {
//            return secondSunday;
//        } else {
//            return fourthSunday;
//        }

        //LocalDate date = LocalDate.of(2017, 4, 24); //기준일
        LocalDate date = LocalDate.from(input);

        LocalDate secondSunday = date.with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
        //둘 째주 쉬는 날
        LocalDate fourthSunday = date.with(TemporalAdjusters.dayOfWeekInMonth(4, DayOfWeek.SUNDAY));
        //넷 째주 쉬는 날

        Period pe1 = Period.between(date, secondSunday);
        // 둘 째주 쉬는날과 기준일을 비교하여서 날짜가 지났으면 if(pe.getDays()>=0)를 만족하지 못하면 else로 가서 비교
        // 만족한다면 if (pe.getDays() >= 0)을 출력


        if (pe1.getDays() >= 0) {
            System.out.println(secondSunday);
            System.out.println(fourthSunday);
        } else {
            Period pe2 = Period.between(date, fourthSunday);
            if (pe2.getDays() >= 0) {
                System.out.println(fourthSunday);
            } else {
                LocalDate nextMonthSecondSunday = date.plusMonths(1)
                        .with(TemporalAdjusters.dayOfWeekInMonth(2, DayOfWeek.SUNDAY));
                System.out.println(nextMonthSecondSunday);
            }
        }

        return null;
    }

    public static void main(String[] args) {

        //LocalDate today = LocalDate.now();
        LocalDate today = LocalDate.of(2017,4,25);
        // today 변수엔 기준일 입력

        LocalDate closedDay = today.with(new TheDayMartOff());
        // new TheDayMartOff() 이 메소드를 이용하기 위해서 객체를 생성한다는 의미미
       // today(변수값)을 넣어서 TheDayMartOff 기능을 이용한다는 의미

    }

}
