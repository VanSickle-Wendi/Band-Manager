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
public class BigGigView extends InteractiveView {

    private Game game;

    public BigGigView() {
        super("\n"
                + "\n-------------------------------------------------"
                + "\n|Your band killd it at thier special appearence.|"
                + "\n-------------------------------------------------"
                + "\n Right after the appearence your phone rang,     "
                + "\n your band was being asked to play a set at a    "
                + "\n upcoming event. Your band is excited to play    "
                + "\n at a event like this.                           "
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
        // prompt user the Big gig
        String bigGigName = getInput("What is the name if this big event again?");

        this.console.println("\n The " + bigGigName + " announces your band."
                + "\n Everyone is in their places,and              "
                + "\n the cheer that comes is deafening            "
                + "\n you feel as confident as you should be.      ");

        //PerformanceControl biggig = new PerformanceControl();        
        bigGigResult();

        return true;
    }

    //TODO Move function to PerformanceControl when it's created
    public void bigGigResult() {
        this.console.println("*** bigGig function called ***");
    }
}
