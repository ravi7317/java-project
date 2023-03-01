public class Team2 {
    private String name;
    private int points;
    private int wins;
    private int losses;
    private int draws;
    private int goalsFor;
    private int goalsAgainst;
    
    public Team2(String name) {
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
    
    public void addWin(int goalsFor, int goalsAgainst) {
    this.points += 3;
    this.wins += 1;
    this.goalsFor += goalsFor;
    this.goalsAgainst += goalsAgainst;
    }
    
    public void addLoss(int goalsFor, int goalsAgainst) {
    this.losses += 1;
    this.goalsFor += goalsFor;
    this.goalsAgainst += goalsAgainst;
    }
    
    public void addDraw(int goalsFor, int goalsAgainst) {
    this.points += 1;
    this.draws += 1;
    this.goalsFor += goalsFor;
    this.goalsAgainst += goalsAgainst;
    }
    
    public int getGoalDifference() {
    return goalsFor - goalsAgainst;
    }
    
    @Override
    public String toString() {
    return String.format("%-20s %3d %3d %3d %3d %3d %3d %3d", name, points, wins, losses, draws, goalsFor, goalsAgainst, getGoalDifference());
    }
   }
