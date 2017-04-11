package inheritance;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class Child extends Parent {
    private String hobby;

    public void smoke() {
        System.out.println("아들이 담배를 피웁니다.");
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {this.hobby = hobby;}
}
