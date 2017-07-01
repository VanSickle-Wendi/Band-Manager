/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

/**
 *
 * @author Crazian
 */
public class EquipmentControl {
    
    public double calcPurchaseInstrument(double instrumentPrice, double bankAccount) {

        if (instrumentPrice != 400 && instrumentPrice != 900 && instrumentPrice != 1600 && instrumentPrice != 2000) {
            return -999;
        }
        
        if (instrumentPrice > bankAccount) {
            return -999;
        }        

        double newAccountBalance = bankAccount - instrumentPrice;
        return newAccountBalance;
       
    }

}
