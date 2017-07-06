/*
  * To change this license header, choose License Headers in Project Properties.
  * To change this template file, choose Tools | Templates
  * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.AuditionControl;
import byui.cit260.bandManager.control.PerformanceControl;
import java.util.Scanner;

/**
 *
 * @author Etienne
 */
public class RadioInterview extends InteractiveView {

    public RadioInterview() {
        this.displayBanner();
    }

    private void displayBanner() {
        this.console.println("\n"
                + "\n-------------------------------------------------"
                + "\n| Welcome to your Radio Interview       |"
                + "\n-----------------------------------------"
                + "\n The Band is ready now to record         "
                + "\n the interview                           "
        );
    }

    @Override
    public void display() {
        doAction(null);
    }

    @Override
    public boolean doAction(String value) {
        String radioShow = getInput("What is the name of the radio show?");

        this.console.println("\n You had a great interview on " + radioShow
                + "\n! Let's see how you did."
                + "\n");

        //PerformanceControl radio = new PerformanceControl();
        radioInterviewResult();

        return true;
    }

    //TODO Move function to PerformanceControl when it's created 
    public void radioInterviewResult() {

        this.console.println("*** radioInterviewResult function called ***");
    }

}
