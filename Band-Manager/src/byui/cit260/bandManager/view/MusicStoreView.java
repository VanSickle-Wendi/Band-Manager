/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.BankingControl;
import byui.cit260.bandManager.control.EquipmentControl;
import java.text.DecimalFormat;

/**
 *
 * @author shaza
 */
public class MusicStoreView extends InteractiveView {

    public MusicStoreView() {

        super("\n"
                + "\n-------------------------------------------------"
                + "\n|  You are at the Music Store                   |"
                + "\n-------------------------------------------------"
                + "\n  If you haven't decided on an instrument to     "
                + "\n  purchase, please view the instrument lists.    "
                + "\n-------------------------------------------------"
        );
    }

    @Override
    public void display() {
        doAction(null);
    }

    @Override
    public boolean doAction(String value) {
        //Format 
        DecimalFormat df = new DecimalFormat("#.00");         
        // prompt user for inputs, change the user input from String to double
        double instrumentPrice = Double.parseDouble(getInput("How much does the instrument "
                + "you would like to purchase cost?"));
        double bankAccount = Double.parseDouble(getInput("How much is in your bank account?"));        

        // new instance of EquipmentControl class
        EquipmentControl purchase = new EquipmentControl();

        double bankBalanceAfterPurchase = purchase.calcPurchaseInstrument(instrumentPrice, bankAccount);
        System.out.println("\nAfter your purchase, you have $" + df.format(bankBalanceAfterPurchase) + " left "
                + "in your bank account.");

        return true;

    }

}
