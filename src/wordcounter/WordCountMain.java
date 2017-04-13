package wordcounter;

import wordcounter.service.WordCountService;
import wordcounter.service.WordCountServiceImpl;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


/**
 * Created by danawacomputer on 2017-04-13.
 */
public class WordCountMain {
    public static void main(String[] args) {

        List<String> wordList = new ArrayList();
        // ★★★ splitted words 담을 리스트 만들기 ★★★

        try {
            BufferedReader br =
                    new BufferedReader(new FileReader("src\\closer.txt"));
            // "BufferedReader는 FileReader의 helper로, FileReader를 한 번 wrapping해서 사용하기 편하게 만든다."

            String line = " ";
            while ((line = br.readLine()) != null) {

                String[] splitted = line.split(" ");
                for (String e : splitted) {
                    System.out.println(e);
                    wordList.add(e);
                    // ★★★ 리스트에 splitted words(=e) 담기 ★★★
                }
            }
        } catch (FileNotFoundException fne) {
            System.out.println("파일 이름이 잘못되었거나 없어요.");

        } catch (IOException ie) {
            System.out.println("파일을 실제로 IO하다가 에러가 발생했어요.");
        }

        WordCountService service = new WordCountServiceImpl();
        int count = service.getWordCount(wordList);
        System.out.printf("총 단어의 개수는 %d개 입니다.", count);
    }
}
