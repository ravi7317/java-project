public class Team {
    private String name;
    private int points;
    private int wins;
    private int losses;
    private int draws;
    private int goalsFor;
    private int goalsAgainst;
    
    public Team(String name) {
    this.name = name;
    this.points = 0;
    this.wins = 0;
    this.losses = 0;
    this.draws = 0;
    this.goalsFor = 0;
    this.goalsAgainst = 0;
    }
    
    public String getName() {
    return name;
    }
    
    public int getPoints() {
    return points;
    }
    
    public int getWins() {
    return wins;
    }
    
    public int getLosses() {
    return losses;
    }
    
    public int getDraws() {
    return draws;
    }
    
    public int getGoalsFor() {
    return goalsFor;
    }
    
    public int getGoalsAgainst() {
    return goalsAgainst;
    }
}