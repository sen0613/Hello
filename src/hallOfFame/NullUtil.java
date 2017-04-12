package hallOfFame;

/**
 * Created by danawacomputer on 2017-04-12.
 */
public class NullUtil {
    public static int parseIn(String s) {

//        if (s == null || s.equals("")) {
//            return 0;
//        } else {
//            return Integer.parseInt(s);
//
//        }

        int res = (s == null || s.equals("")) ? 0 : Integer.parseInt(s);
        return res;
    }
}
