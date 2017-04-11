package hallOfFame;

/**
 * Created by danawacomputer on 2017-04-11.
 *  * 1. HallOfFame 객체를 PlayerAverage로 변환하여 'playerId'와 'ballots, needed, votes 세 개의 평균'을 객체에 저장하기
 */
public class PlayerAverage {

    private String playerId;
    private int average;

    public PlayerAverage(String playerId, int average) {
        this.playerId = playerId;
        this.average = average;
    }

    public PlayerAverage(){}

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    @Override
    public String toString() {
        return "PlayerAverage{" +
                "playerId='" + playerId + '\'' +
                ", average=" + average +
                '}';
    }
}
