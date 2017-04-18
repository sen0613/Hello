package datetime;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

/**
 * Created by danawacomputer on 2017-04-18.
 */
public class PeriodTest {
    public static void main(String[] args) {

        LocalDate impeachedDay = LocalDate.of(2017, 3, 10);
        LocalDate today = LocalDate.of(2017, 4, 18);

        Period period = Period.between(impeachedDay, today);
        System.out.println(period); // 기간 0년 1월 8일

        long months = period.get(ChronoUnit.MONTHS);
        System.out.println(months+"개월");// 월단위만 출력


        long days = period.get(ChronoUnit.DAYS);
        System.out.println(days+"일");// 일단위만 출력

        System.out.printf("%d개월 %d일\n", months, days);


        LocalDate nextWednesday = today.with(TemporalAdjusters.next(DayOfWeek.WEDNESDAY));
        System.out.println(nextWednesday);

        LocalDate theDay = today.with(new DayAfterTomorrow());
        System.out.println(theDay);

        LocalDate theDayMartOff = today.with(new TheDayMartOff());
        System.out.println(theDayMartOff);
    }
}
