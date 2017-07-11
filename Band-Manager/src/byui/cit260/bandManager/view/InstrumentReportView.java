/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import band.manager.BandManager;
import byui.cit260.bandManager.control.EquipmentControl;
import java.text.DecimalFormat;

/**
 *
 * @author shaza
 */
public class InstrumentReportView extends InteractiveView {

    public InstrumentReportView() {

        super("\n"
                + "\n-------------------------------------------------"
                + "\n|  Print Report                                 |"
                + "\n-------------------------------------------------"
                + "\n  Print List of Instruments                      "
                + "\n                                                 "
                + "\n-------------------------------------------------"
        );
    }

    @Override
    public void display() {
        doAction(null);
    }

    @Override
    public boolean doAction(String value) {

        // prompt for and get the name of the file to save the game in     
        this.console.println("\n\nEnter the file path for file where report"
                + " is to be saved");
        String filePath = this.getInput();

        try {
            // save the report to the specified file
            EquipmentControl.saveReport(BandManager.getCurrentGame(), filePath);
        } catch (Exception e) {
            ErrorView.display("ReportView", e.getMessage());
        }

        return true;

    }
}
