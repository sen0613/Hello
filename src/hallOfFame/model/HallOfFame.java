package hallOfFame.model; //hallOfFame 패키지 하위의 model 패키지 안에 있다는 뜻

/**
 * Created by danawacomputer on 2017-04-11.
 * 1. HallOfFame 객체를 PlayerAverage로 변환하여 'playerId'와 'ballots, needed, votes 세 개의 평균'을 객체에 저장하기
 */
public class HallOfFame {
    private String playerID;
    private int ballots;
    private int needed;
    private int votes;


    public HallOfFame(String playerID, int yearid, String votedBy,
                      int ballots, int needed, int votes, String inducted,
                      String category, String needed_note) {
        this.playerID = playerID;
        this.ballots = ballots;
        this.needed = needed;
        this.votes = votes;
    }

    public HallOfFame(String kim, int i, int i1, int i2){}

    public HallOfFame() {

    }

    public String getPlayerID() {return playerID;}
    public void setPlayerID(String playerID) {this.playerID = playerID;}


    public int getBallots() {return ballots;}
    public void setBallots(int ballots) {this.ballots = ballots;}

    public int getNeeded() {return needed;}
    public void setNeeded(int needed) {this.needed = needed;}

    public int getVotes() {return votes;}
    public void setVotes(int votes) {this.votes = votes;}

}
