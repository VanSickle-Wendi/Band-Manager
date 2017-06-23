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
public enum VehicleType {
    LevelOneVehicle,
    LevelTwoVehicle,
    LevelThreeVehicle,
    LevelFourVehicle;
    
    VehicleType(){
        
    }
    
     public static VehicleType getLevelOneVehicle() {
            return LevelOneVehicle;
        }

        public static VehicleType getLevelTwoVehicle() {
            return LevelTwoVehicle;
        }

        public static VehicleType getLevelThreeVehicle() {
            return LevelThreeVehicle;
        }

        public static VehicleType getLevelFourVehicle() {
            return LevelFourVehicle;
        }

        
}
