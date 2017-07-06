/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.view;

import byui.cit260.bandManager.control.BankingControl;
import byui.cit260.bandManager.control.EquipmentControl;
import byui.cit260.bandManager.exceptions.EquipmentControlException;
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
        double instrumentPrice = 0;
        double bankAccount = 0;
        int a = 1;
        int b = 1;
        
        //Format bank balance to 2 decimal places 
        DecimalFormat df = new DecimalFormat("#.00");     
        
        // prompt user for instrument price, change the user input from String to double
        do {
        try {
        instrumentPrice = Double.parseDouble(getInput("How much does the instrument "
                + "you would like to purchase cost?"));
            a = 2;
        } catch (NumberFormatException nf) { 
                    //ErrorView.display(this.getClass().getName(),
                    System.out.println("\nYou must enter a valid number.");            
        }
        } while (a == 1);
        
        // prompt user for bank account balance, change the user input from String to double
        do {
        try {        
        bankAccount = Double.parseDouble(getInput("How much is in your bank account?")); 
            b = 2;
        } catch (NumberFormatException nf) { 
                    //ErrorView.display(this.getClass().getName(),
                    System.out.println("\nYou must enter a valid number.");            
        }
        } while (b == 1);

        // new instance of EquipmentControl class
        EquipmentControl purchase = new EquipmentControl();

        try {
        double bankBalanceAfterPurchase = purchase.calcPurchaseInstrument(instrumentPrice, bankAccount);
        //this.console
        System.out.println("\nAfter your purchase, you have $" + df.format(bankBalanceAfterPurchase) + " left "
                + "in your bank account.");
        } catch (EquipmentControlException ece) {
                //ErrorView.display(this.getClass().getName(),
                System.out.println(ece.getMessage());
        }

        return true;

    }

}
