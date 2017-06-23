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
public class Vehicle implements Serializable {

    VehicleType type;
    String description;
    double price;
    double performancePoints;

    // Constructor
    public Vehicle(VehicleType typeOf, String descriptionOf, double priceOf,
            double performPoints) {
        
        type = typeOf;
        description = descriptionOf;
        price = priceOf;
        performancePoints = performPoints;

    }

    public VehicleType getType() {
        return type;
    }

    public void setType(VehicleType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPerformancePoints() {
        return performancePoints;
    }

    public void setPerformancePoints(double performancePoints) {
        this.performancePoints = performancePoints;
    }
  }

