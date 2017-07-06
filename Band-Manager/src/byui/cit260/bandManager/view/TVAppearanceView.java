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
public class TVAppearanceView extends InteractiveView {
        
    private Game game;

    public TVAppearanceView() {
        super("\n"
                + "\n--------------------------------------------------"
                + "\n|  Welcome to your TV Appearance!                 |"
                + "\n--------------------------------------------------"
                + "\n   This is the bands big chance to be seen by     "
                + "\n   millions. Is everyone ready for their close up?"
                + "\n--------------------------------------------------");
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
        String tvShow = getInput("What show is the band appearing on?");
                
        //this.console
        this.console.println("\n" + tvShow + " will air tonight!"
                          +"\n How well did the band perform?"
                          +"\n Let's find out!"
                          +"\n");
        
        //PerformanceControl tv = new PerformanceControl();        
        
        tvAppearanceResult();

        return true;
    }  
    //TODO Move function to PerformanceControl when it's created
    public void tvAppearanceResult() {
        
        this.console.println("*** tvAppearanceResult function called ***");
    }    
}
