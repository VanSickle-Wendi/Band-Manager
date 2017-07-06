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
public class MovieCameoView extends InteractiveView {

    private Game game;

    public MovieCameoView() {
        super("\n"
                + "\n---------------------------------------------------"
                + "\n|  Welcome to your Movie Cameo!                   |"
                + "\n---------------------------------------------------"
                + "\n   The band is finally hitting the big screen!     "
                + "\n   Is this the first of many flicks? Make sure     "
                + "\n   they play in a beach scene. It worked for Elvis."
                + "\n---------------------------------------------------");
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
        String movieSpot = getInput("What is the name of the Movie?");

        this.console.println("\n" + movieSpot + " hit the theaters today! "
                + "\n If the movie is a success, the band could"
                + "\n be super stars over night!               "
                + "\n Let's read the reviews.                  "
                + "\n");

        //PerformanceControl movie = new PerformanceControl();        
        movieResults();

        return true;
    }

    // TODO Move function to PerformanceControl when it's created
    public void movieResults() {
        this.console.println("*** movieResult function called ***");
    }
}
