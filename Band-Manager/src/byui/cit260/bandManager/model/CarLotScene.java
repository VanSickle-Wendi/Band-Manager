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
public class CarLotScene extends Scene implements Serializable {
    
    private Vehicle[] levelOneVehicle; //Capitilazation? 
    private Vehicle[] levelTwoVehicle;
    private Vehicle[] levelThreeVehicle;
    private Vehicle[] levelFourVehicle;

    
    public CarLotScene() {
        
        setSceneDescription("Welcome to the Car Lot.");        

        levelOneVehicle = new Vehicle[3];
        levelOneVehicle[0] = new Vehicle(VehicleType.LevelOneVehicle, "Volkswagen Bus", 5000.00, 30);
        levelOneVehicle[1] = new Vehicle(VehicleType.LevelOneVehicle, "Conversion Van", 5000.00, 30);
        levelOneVehicle[2] = new Vehicle(VehicleType.LevelOneVehicle, "Mini Van", 5000.00, 30);
        
        levelTwoVehicle = new Vehicle[3];
        levelTwoVehicle[0] = new Vehicle(VehicleType.LevelTwoVehicle, "Dodge Grand Caravan", 30000.00, 80);
        levelTwoVehicle[1] = new Vehicle(VehicleType.LevelTwoVehicle, "Chevrolet Express", 30000.00, 80);
        levelTwoVehicle[2] = new Vehicle(VehicleType.LevelTwoVehicle, "Ford Transit Connect", 30000.00, 80);

        levelThreeVehicle = new Vehicle[3];
        levelThreeVehicle[0] = new Vehicle(VehicleType.LevelThreeVehicle, "Tour Bus", 60000.00, 160);
        levelThreeVehicle[1] = new Vehicle(VehicleType.LevelThreeVehicle, "Hummer Limo", 60000.00, 160);
        levelThreeVehicle[2] = new Vehicle(VehicleType.LevelThreeVehicle, "Party Bus", 60000.00, 160);
        
        levelFourVehicle = new Vehicle[3];
        levelFourVehicle[0] = new Vehicle(VehicleType.LevelFourVehicle, "Skyjet	", 100000.00, 320);
        levelFourVehicle[1] = new Vehicle(VehicleType.LevelFourVehicle, "VistaJet", 100000.00, 320);
        levelFourVehicle[2] = new Vehicle(VehicleType.LevelFourVehicle, "Royal Jet", 100000.00, 320);
    }
    
    
    
    
    public Vehicle[] getLevelOneVehicle() {
        return levelOneVehicle;
    }

    public void setLevelOneVehicle(Vehicle[] levelOneVehicle) {
        this.levelOneVehicle = levelOneVehicle;
    }
    
    public Vehicle[] getLevelTwoVehicle() {
        return levelTwoVehicle;
    }

    public void setLevelTwoVehicle(Vehicle[] levelTwoVehicle) {
        this.levelTwoVehicle = levelTwoVehicle;
    }
    
    public Vehicle[] getLevelThreeVehicle() {
        return levelThreeVehicle;
    }

    public void setLevelThreeVehicle(Vehicle[] levelThreeVehicle) {
        this.levelThreeVehicle = levelThreeVehicle;
    }
    
    public Vehicle[] getLevelFourVehicle() {
        return levelFourVehicle;
    }

    public void setLevelFourVehicle(Vehicle[] levelFourVehicle) {
        this.levelFourVehicle = levelFourVehicle;
    }
    
}
        


