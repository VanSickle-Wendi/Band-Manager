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
public class BandMember implements Serializable {

    private String bandPosition;
    private String musicianName;
    private String issueDescription;
    private double skillLevel;
    private double instrumentQuality;
    private double issueCost;

    public BandMember() {
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

    public String getIssueDescription() {
        return issueDescription;
    }

    public void setIssueDescription(String issueDescription) {
        this.issueDescription = issueDescription;
    }

    public double getSkillLevel() {
        return skillLevel;
    }

    public void setSkillLevel(double skillLevel) {
        this.skillLevel = skillLevel;
    }

    public double getInstrumentQuality() {
        return instrumentQuality;
    }

    public void setInstrumentQuality(double instrumentQuality) {
        this.instrumentQuality = instrumentQuality;
    }

    public double getIssueCost() {
        return issueCost;
    }

    public void setIssueCost(double issueCost) {
        this.issueCost = issueCost;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.bandPosition);
        hash = 83 * hash + Objects.hashCode(this.musicianName);
        hash = 83 * hash + Objects.hashCode(this.issueDescription);
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.skillLevel) ^ (Double.doubleToLongBits(this.skillLevel) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.instrumentQuality) ^ (Double.doubleToLongBits(this.instrumentQuality) >>> 32));
        hash = 83 * hash + (int) (Double.doubleToLongBits(this.issueCost) ^ (Double.doubleToLongBits(this.issueCost) >>> 32));
        return hash;
    }

    @Override
    public String toString() {
        return "BandMember{" + "bandPosition=" + bandPosition + ", musicianName=" + musicianName + ", issueDescription=" + issueDescription + ", skillLevel=" + skillLevel + ", instrumentQuality=" + instrumentQuality + ", issueCost=" + issueCost + '}';
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
        final BandMember other = (BandMember) obj;
        if (Double.doubleToLongBits(this.skillLevel) != Double.doubleToLongBits(other.skillLevel)) {
            return false;
        }
        if (Double.doubleToLongBits(this.instrumentQuality) != Double.doubleToLongBits(other.instrumentQuality)) {
            return false;
        }
        if (Double.doubleToLongBits(this.issueCost) != Double.doubleToLongBits(other.issueCost)) {
            return false;
        }
        if (!Objects.equals(this.bandPosition, other.bandPosition)) {
            return false;
        }
        if (!Objects.equals(this.musicianName, other.musicianName)) {
            return false;
        }
        if (!Objects.equals(this.issueDescription, other.issueDescription)) {
            return false;
        }
        return true;
    }

}
