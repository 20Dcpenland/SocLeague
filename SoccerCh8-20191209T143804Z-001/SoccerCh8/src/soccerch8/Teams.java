package soccerch8;

public class Teams {
    private String name;
    private int wins=0, losses=0, ties=0, total=0, allowed=0;
    
    public Teams(String name){
        this.name=name;    
    }
    public int getWins() {
        return wins;
    }
    public int getLosses() {
        return losses;
    }
    public int getTies() {
        return ties;
    }
    public int getTotal() {
        return total;
    }
    public int getAllowed() {
        return allowed;
    }
    public void setWins(int wins) {
        this.wins += wins;   
    }
    public void setLosses(int losses) {
        this.losses += losses;
    }
    public void setTies(int ties) {
        this.ties += ties;
    }
    public void setTotal(int total) {
        this.total += total;
    }
    public void setAllowed(int allowed) {
        this.allowed += allowed;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}
