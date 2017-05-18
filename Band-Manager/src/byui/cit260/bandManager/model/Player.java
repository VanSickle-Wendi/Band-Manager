/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.model;

import java.io.Serializable;
import java.util.Objects;


/**
 *
 * @author shaza
 */
public class Player implements Serializable{
    
    // class instance variables
    private String managerName;
    private double finalScore;

    public Player() {
    }
       

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public double getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(double finalScore) {
        this.finalScore = finalScore;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + Objects.hashCode(this.managerName);
        hash = 61 * hash + (int) (Double.doubleToLongBits(this.finalScore) ^ (Double.doubleToLongBits(this.finalScore) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "Player{" + "managerName=" + managerName + ", finalScore=" + finalScore + '}';
    }
    

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Player other = (Player) obj;
        if (Double.doubleToLongBits(this.finalScore) != Double.doubleToLongBits(other.finalScore)) {
            return false;
        }
        if (!Objects.equals(this.managerName, other.managerName)) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    
}
