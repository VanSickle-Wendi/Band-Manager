/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

import byui.cit260.bandManager.exceptions.EquipmentControlException;
import byui.cit260.bandManager.model.Game;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

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
    
    public double calcPurchaseVehicle(double vehiclePrice, double bankAccount) throws EquipmentControlException{
       if (vehiclePrice != 5000 && vehiclePrice != 30000 && vehiclePrice != 50000 && vehiclePrice !=100000) {
        
           throw new EquipmentControlException("Vehicle prices must be either "
                   + " 5000, 30000, 50000, or 100000. Try again.");  
           
       }
        double newAccountBalance = bankAccount - vehiclePrice;
        return newAccountBalance;
    }
    
    public int vehicleAssets(int level) throws EquipmentControlException {
        
        int pick1 = 0;
        int pick2 = 1;
        int pick3 = 2;
        
        switch (level) {
            case 1:
                return pick1;
            case 2:
                return pick2;
            case 3:
                return pick3;
            default:
                throw new EquipmentControlException("Please type a 1, 2, or 3");
        }
    }
    
  public int asset(int level) throws EquipmentControlException {

        int pick1 = 0;
        int pick2 = 1;
        int pick3 = 2;
        int pick4 = 3;

        switch (level) {
            case 1:
                return pick1;
            case 2:
                return pick2;
            case 3:
                return pick3;
            case 4:
                return pick4;
            default:
                throw new EquipmentControlException("Please type a 1, 2, 3, or 4");
        }
    }    

    public static void saveReport(Game game, String filePath)
            throws EquipmentControlException {

        try (FileOutputStream fops = new FileOutputStream(filePath)) {
            ObjectOutputStream output = new ObjectOutputStream(fops);

            output.writeObject(game); // write the game object out to file
        } catch (Exception e) {
            throw new EquipmentControlException(e);
        }
    }
}    


