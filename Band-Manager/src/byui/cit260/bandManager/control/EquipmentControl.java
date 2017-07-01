/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

import byui.cit260.bandManager.exceptions.EquipmentControlException;

/**
 *
 * @author Crazian
 */
public class EquipmentControl {
    
    public double calcPurchaseInstrument(double instrumentPrice, double bankAccount) throws EquipmentControlException {

        if (instrumentPrice != 400 && instrumentPrice != 900 && instrumentPrice != 1600 && instrumentPrice != 2000) {
            //return -999;
           throw new EquipmentControlException("Instrument prices must be either "
                   + " 400, 900, 1600, or 2000. Try again.");            
        }
        
        if (instrumentPrice > bankAccount) {
            //return -999;
           throw new EquipmentControlException("Sorry! You do not have enough money "
                   + "in your bank account.");            
        }        

        double newAccountBalance = bankAccount - instrumentPrice;
        return newAccountBalance;
       
    }

}
