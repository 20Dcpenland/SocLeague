
package soccerch8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;


public class Game {
        
        ArrayList<Game> arrayGs = new ArrayList<>();
        Schedual test = new Schedual();
        Random x = new Random();
        Teams[] teams = new Teams[4];

        
        private double temp = 0,highesttemp=0,temptotal = 0;
        private int Games = 0, days = 0,colddays = 0;
        
        private int game = 0;
        private int maxgoals=0;
        private int r1=0,r2=0;
        
        private String away = "";
        private String home = "";
        private int aw=0;
        private int hm=0;
        
        public Game(Teams[] x){
            this.teams=x;
        }
    public Game (Teams[] x, double temp, int Games){
        this.teams = x;
        this.temp = temp;
        this.game=Games;
    }
    
    public void start(){
        
        while (colddays<3){
            this.temp = Double.parseDouble(JOptionPane.showInputDialog(" Enter Temp "));
           
            if(temp>highesttemp){
                highesttemp=temp;
            }
            if(temp<=32){
                colddays++; days++;
                temptotal+=temp;
            JOptionPane.showMessageDialog(null, "The temperature was too cold to play", "Too Cold", JOptionPane.PLAIN_MESSAGE, null);
            }else{
                colddays=0; days++;
                temptotal+=temp; 
                maxgoals=(int) Math.round(temp/10);
                
                for (int i = 0; i < teams.length; i++) {
            int change = i + x.nextInt(teams.length - i);
            swap(teams, i, change);
             }
                
                 Games++;  
                 arrayGs.add(new Game(teams, temp, Games));
                 arrayGs.get(Games-1).play(maxgoals, Games);
                

                 Games++;  
                 arrayGs.add(new Game(teams, temp, Games));
                 arrayGs.get(Games-1).play(maxgoals, Games);
              
                
            }   
            
        }   
        test.Print( temptotal, days, highesttemp, arrayGs, teams);
        
    }   
    
        public void play(int maxgoals, int Games){
          aw=(score(maxgoals));
          hm=(score(maxgoals));
            
            playTeams(teams, Games);
           
            
            
        }
        public void playTeams(Teams[] teams, int Games){
      if(Games%2!=0){
        teams[0].setTotal(aw);
        teams[1].setTotal(hm);
        setHome(teams[1].getName()); 
        setAway(teams[0].getName()); 
        
        if(aw>hm){
        teams[0].setWins(1);
        teams[1].setLosses(1);
        }else if(aw<hm){
        teams[1].setWins(1);    
        teams[0].setLosses(1);
        }else{
        teams[0].setTies(1);
        teams[1].setTies(1);
        }
        
        teams[0].setAllowed(getHm());
        teams[1].setAllowed(getAw());
     }else if(Games%2==0){
        setHome(teams[3].getName()); 
        setAway(teams[2].getName()); 
         teams[2].setTotal(aw);
        teams[3].setTotal(hm);
        
        if(aw>hm){
        teams[2].setWins(1);
        teams[3].setLosses(1);
        }else if(aw<hm){
        teams[3].setWins(1);    
        teams[2].setLosses(1);
        }else{
        teams[2].setTies(1);
        teams[3].setTies(1);
        }
        
        teams[2].setAllowed(getHm());
        teams[3].setAllowed(getAw());
     }
    }
        
    public int score(int maxgoals){
    int score = x.nextInt(maxgoals);
    return score;
    }
    
    void swap(Teams[] a, int i, int change) {
        Teams helper = a[i];
        a[i] = a[change];
        a[change] = helper;
    }
    
    
    
    

    public double getTemp() {
        return temp;
    }

    public int getGame() {
        return game;
    }

    public String getAway() {
        return away;
    }

    public String getHome() {
        return home;
    }

    public void setAway(String away) {
        this.away = away;
    }

    public void setHome(String home) {
        this.home = home;
    }

    public int getAw() {
        return aw;
    }

    public int getHm() {
        return hm;
    }

    
    
    
}