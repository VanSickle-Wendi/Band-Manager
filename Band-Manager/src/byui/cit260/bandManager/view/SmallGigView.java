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
 * @author Crazian
 */
public class SmallGigView extends InteractiveView {

    private Game game;

    public SmallGigView() {
        super("\n"
                + "\n-------------------------------------------------"
                + "\n|You didnt't do so hot at the special appearence|"
                + "\n-------------------------------------------------"
                + "\n You recall setting this gig up, you struggle    "
                + "\n to recall the name of this establishment.       "
                + "\n-------------------------------------------------");
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
        // prompt user the small gig
        String smallGigName = getInput("What is the name if this smallish estsablishment again?");

        this.console.println("\n The " + smallGigName + " announces your band."
                + "\n Everyone is in their places,and              "
                + "\n you feel as confident as you should be.      ");

        //PerformanceControl smallgig = new PerformanceControl();        
        smallgGigResult();

        return true;
    }

    //TODO Move function to PerformanceControl when it's created
    public void smallgGigResult() {

        this.console.println("*** smallGig function called ***");
    }
}
