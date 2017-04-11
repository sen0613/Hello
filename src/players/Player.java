package players;

/**
 * Created by danawacomputer on 2017-04-11.
 */
public class Player {
    private String yearId;
    private String teamId;
    private String leagueId;
    private String playerId;
    private int salary;

    public Player(){

    }

    public Player(String yearId, String teamId, String leagueId, String playerId, int salary) {
        this.yearId = yearId;
        this.teamId = teamId;
        this.leagueId = leagueId;
        this.playerId = playerId;
        this.salary = salary;
    }

    public String getYearId() {
        return yearId;
    }

    public void setYearId(String yearId) {
        this.yearId = yearId;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public String getLeagueId() {
        return leagueId;
    }

    public void setLeagueId(String leagueId) {
        this.leagueId = leagueId;
    }

    public String getPlayerId() {
        return playerId;
    }

    public void setPlayerId(String playerId) {
        this.playerId = playerId;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Player{" +
                "yearId='" + yearId + '\'' +
                ", teamId='" + teamId + '\'' +
                ", leagueId='" + leagueId + '\'' +
                ", playerId='" + playerId + '\'' +
                ", salary=" + salary +
                '}';
    }
}
