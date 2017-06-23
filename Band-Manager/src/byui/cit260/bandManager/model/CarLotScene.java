/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.model;

import java.io.Serializable;

/**
 *
 * @author Crazian
 */
public class CarLotScene implements Serializable {
    
    
    public CarLotScene() {
        
    Vehicle[] LevelOneVehicle = new Vehicle[3];
    
    LevelOneVehicle[0] = new Vehicle (VehicleType.LevelOneVehicle, "Volkswagen Bus", 5000.00, 30);
    LevelOneVehicle[1] = new Vehicle(VehicleType.LevelOneVehicle, "Conversion Van", 5000.00, 30);
    LevelOneVehicle[2] = new Vehicle(VehicleType.LevelOneVehicle, "Mini Van", 5000.00, 30);
        
    }
    
}
