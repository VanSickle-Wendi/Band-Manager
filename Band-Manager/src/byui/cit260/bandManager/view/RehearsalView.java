/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.PerformanceControl;
import byui.cit260.bandManager.model.Band;
import byui.cit260.bandManager.model.BandMember;
import byui.cit260.bandManager.model.Game;
import java.util.Scanner;
/**
 *
 * @author Wendi
 */
public class RehearsalView extends InteractiveView {
        
    private Game game;    

    public RehearsalView() {
        this.displayBanner();
    }
    
    private void displayBanner(){
        System.out.println("\n"
                + "\n-------------------------------------------------"
                + "\n|  Welcome to rehearsal as a full band!          |"
                + "\n-------------------------------------------------"
                + "\n   Before you start practicing, you need to think"
                + "\n   of a name for the band.                       "
                + "\n-------------------------------------------------"
        );    
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
        String bandName = getInput("What is the name of the band?");
                
        System.out.println("\n" + bandName + " is a great name for a band!"
                          +"\n They'd better get busy if they want to be"
                          +"\n ready for their first gig!"
                          +"\n");
        
        PerformanceControl first = new PerformanceControl();        
        
        first.firstRehearsal();

        return true;
    }    
}
