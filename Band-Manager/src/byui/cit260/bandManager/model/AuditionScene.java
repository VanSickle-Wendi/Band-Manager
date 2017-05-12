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
public class AuditionScene implements Serializable {
    
    //class instance variables
    private String bandPosition;
    private String musicianName;
    private double startingSkillLevel;
    private String startingIssue;

    public AuditionScene() {
    }

    public String getBandPosition() {
        return bandPosition;
    }

    public void setBandPosition(String bandPosition) {
        this.bandPosition = bandPosition;
    }

    public String getMusicianName() {
        return musicianName;
    }

    public void setMusicianName(String musicianName) {
        this.musicianName = musicianName;
    }

    public double getStartingSkillLevel() {
        return startingSkillLevel;
    }

    public void setStartingSkillLevel(double startingSkillLevel) {
        this.startingSkillLevel = startingSkillLevel;
    }

    public String getStartingIssue() {
        return startingIssue;
    }

    public void setStartingIssue(String startingIssue) {
        this.startingIssue = startingIssue;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.bandPosition);
        hash = 67 * hash + Objects.hashCode(this.musicianName);
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.startingSkillLevel) ^ (Double.doubleToLongBits(this.startingSkillLevel) >>> 32));
        hash = 67 * hash + Objects.hashCode(this.startingIssue);
        return hash;
    }

    @Override
    public String toString() {
        return "AuditionScene{" + "bandPosition=" + bandPosition + ", musicianName=" + musicianName + ", startingSkillLevel=" + startingSkillLevel + ", startingIssue=" + startingIssue + '}';
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
        final AuditionScene other = (AuditionScene) obj;
        if (Double.doubleToLongBits(this.startingSkillLevel) != Double.doubleToLongBits(other.startingSkillLevel)) {
            return false;
        }
        if (!Objects.equals(this.bandPosition, other.bandPosition)) {
            return false;
        }
        if (!Objects.equals(this.musicianName, other.musicianName)) {
            return false;
        }
        if (!Objects.equals(this.startingIssue, other.startingIssue)) {
            return false;
        }
        return true;
    }
    
}
