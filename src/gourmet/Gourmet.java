package gourmet;

/**
 * Created by danawacomputer on 2017-04-07.
 * 필드 - 생성자 -
 */
public class Gourmet {

    private String title;
    private String mainMenu;
    private int score;
    // 멤버변수 private으로 묶기 => 내부에서만 접근 가능, 외부에서는 접근 불가능
    // 외부에서도 접근 가능하도록 하려면 메소드를 만듦

    public Gourmet() {System.out.println("생성자 진짜 호출되나요?");}


    public Gourmet(String title, String mainMenu, int score) {
        this.title = title;
        this.mainMenu = mainMenu;
        this.score = score;
    }

    public String getTitle() {return title;}            // getter, accessor
    public void setTitle(String t) {this.title = t;}    // setter, mutator


    public int getScore() {return score;}
    public void setScore(int s) {this.score = s;}


    public String getMainMenu() {return mainMenu;}
    public void setMainMenu(String m) {this.mainMenu = m;}

}
