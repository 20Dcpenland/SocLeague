/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soccerch8;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author MaconRM180
 */
public class Schedual {
                Teams red = new Teams("Red");
                Teams blue = new Teams("Blue");
                Teams green = new Teams("Green");
                Teams yellow = new Teams("Yellow");
                
            Teams[] teams = {red,blue,green,yellow};
            
           void startProject() {
               Game game = new Game(teams);
               game.start();
    }
    
     void Print(double temptotal, int days, double highesttemp, ArrayList<Game> arrayGs, Teams[] teams){
         
     
JOptionPane.showMessageDialog(null, "Wins: "+teams[0].getWins()+"\nLosses: "+teams[0].getLosses()+"\nTies: "+teams[0].getTies()
        +"\nScore Total: "+teams[0].getTotal()+" \nPoints Allowed: "+teams[0].getAllowed(), teams[0].getName() , JOptionPane.PLAIN_MESSAGE, null);
JOptionPane.showMessageDialog(null, "Wins: "+teams[1].getWins()+" \nLosses: "+teams[1].getLosses()+" \nTies: "+teams[1].getTies()
        +"\nScore Total: "+teams[1].getTotal()+" \nPoints Allowed: "+teams[1].getAllowed(), teams[1].getName() , JOptionPane.PLAIN_MESSAGE, null);
JOptionPane.showMessageDialog(null, "Wins: "+teams[2].getWins()+" \nLosses: "+teams[2].getLosses()+" \nTies: "+teams[2].getTies()
        +"\nScore Total: "+teams[2].getTotal()+" \nPoints Allowed: "+teams[2].getAllowed(), teams[2].getName() , JOptionPane.PLAIN_MESSAGE, null);
JOptionPane.showMessageDialog(null, "Wins: "+teams[3].getWins()+" \nLosses: "+teams[3].getLosses()+" \nTies: "+teams[3].getTies()
        +"\nScore Total: "+teams[3].getTotal()+" \nPoints Allowed: "+teams[3].getAllowed(), teams[3].getName() , JOptionPane.PLAIN_MESSAGE, null);


       for(Game i : arrayGs){
JOptionPane.showMessageDialog(null, "Game: "+i.getGame()+"\t"+
           " Temperature: "+i.getTemp()+"\n"+"Away Team: " +i.getAway()+", "+i.getAw()+"\n"+
                   " Home Team: "+i.getHome()+", "+i.getHm(), "Games", JOptionPane.PLAIN_MESSAGE, null);

           
       }
JOptionPane.showMessageDialog(null, "Average temperature: "+temptotal/days+" \nHighest temperature: "+highesttemp, "Weather Stats", JOptionPane.PLAIN_MESSAGE, null);

    }

    

    }
        
        
    
    
    

