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
public class Instrument implements Serializable {

    InstrumentType type;
    String description;
    double price;
    double performancePoints;
    String level;

    // Constructor
    public Instrument(InstrumentType typeOf, String descriptionOf, double priceOf,
            double performPoints, String levelOf) {
        
        type = typeOf;
        description = descriptionOf;
        price = priceOf;
        performancePoints = performPoints;
        level = levelOf;

    }

    public InstrumentType getType() {
        return type;
    }

    public void setType(InstrumentType type) {
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

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    
    
}