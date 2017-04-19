package datetime;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 * Created by danawacomputer on 2017-04-19.
 */
public class DateTimeFormattingDemo {
    public static void main(String[] args) {

        LocalDate today = LocalDate.now(); //날짜
        LocalTime now = LocalTime.now(); //시간

        LocalDateTime todayAndNow = LocalDateTime.now(); //날짜+시간

        String formatted =
                DateTimeFormatter.ofPattern("yyyy.MM.dd HH:mm")
                        .format(todayAndNow); //포맷팅

        System.out.println(formatted);

    }
}
