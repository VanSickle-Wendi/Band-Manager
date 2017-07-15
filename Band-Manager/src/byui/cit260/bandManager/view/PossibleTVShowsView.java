/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.model.TVShows;
import java.util.ArrayList;

/**
 *
 * @author Wendi
 */
public class PossibleTVShowsView extends InteractiveView {  

    public PossibleTVShowsView() {
        super("\n"
                + "\n-------------------------------------------------"
                + "\n|  Here is a list of possible TV Shows          |"
                + "\n-------------------------------------------------");
        
        ArrayList<TVShows> shows = new ArrayList<>();
        
        shows.add(new TVShows(" The Monkees"));
        shows.add(new TVShows(" American Bandstand"));
        shows.add(new TVShows(" Lawrence Welk"));
        shows.add(new TVShows(" The Ed Sullivan Show"));


        // Display array here
        for (TVShows s : shows) {

            this.console.println(s.getTvShowName());
        }
    }

    @Override
    public void display() {
        doAction(null);
    }

    @Override
    public boolean doAction(String value) {
        // prompt user for TV Show name
        String issueName = getInput("What tv show will the band appear on?");

        this.console.println("\n" + issueName + "! That's great!"
                + "\n"
                + "\n Don't look at the camera or you'll look stupid. "
                + "\n");

        return false;

    }    
}
