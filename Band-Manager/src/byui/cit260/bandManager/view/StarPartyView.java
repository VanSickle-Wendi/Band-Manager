/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.GameControl;
import byui.cit260.bandManager.control.PerformanceControl;
import byui.cit260.bandManager.model.Band;
import byui.cit260.bandManager.model.BandMember;
import byui.cit260.bandManager.model.Game;
import java.util.Scanner;
/**
 *
 * @author Wendi
 */
public class StarPartyView extends InteractiveView {
        
    private Game game;

    public StarPartyView() {
        super("\n"
                + "\n-----------------------------------------------"
                + "\n|  You've made it to the Star Party!          |"
                + "\n-----------------------------------------------"
                + "\n   All of the band's hard work has paid off!   "
                + "\n   You're surrounded by celebrities who love   "
                + "\n   the band and you just spotted the one person"
                + "\n   you've been dying to talk to.               "
                + "\n-----------------------------------------------");
    }

    public void setGame(Game game) {
        this.game = game;
    }    
    
    @Override
    public void display() {
        doAction(null);
    }

    @Override
    public boolean doAction(String value) {
        // prompt user for band name
        String celebrity = getInput("Who is your favorite celebrity?");
                
        //this.console
        System.out.println("\n" + celebrity + " is walking towards you with an    "
                          +"\n outstretched hand, ready to shake yours. Just as   "
                          +"\n you're about to make contact, Bob, your accountant,"
                          +"\n dives between the two of you and drags you to a    "
                          +"\n corner to hear the big news: Your net worth.       "
                          +"\n This better be good!                               "
                          +"\n");
        
        //GameControl netWorth = new GameControl();        
        
        finalNetWorth();

        return true;
    }  
    // TODO Move function to a Control class once it's created
    public void finalNetWorth() {
        //this.console
        System.out.println("*** finalNetWorth function called ***");
    }
    
}
