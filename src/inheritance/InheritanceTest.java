package inheritance;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class InheritanceTest {

    public static void main(String[] args) {

        Parent p = new Child();

        p.smoke(); // 타입은 Parent이지만 콘텐츠는 Child이기 때문에 Child가 프린트된다.

        List<String> a = new ArrayList<>();


    }
}
