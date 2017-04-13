package wordcounter.service;

import java.util.List;

/**
 * Created by danawacomputer on 2017-04-13.
 */
public class WordCountServiceImpl implements WordCountService {
    public int getWordCount(List<String> list) {

        int cnt = 0;

        for (String e : list) {
            if (!e.equals("")) {
                cnt++;
            }
        }
        return cnt;
    }
}

