/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.model;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;

/**
 *
 * @author shaza
 */
public class BandNames implements Serializable {
    
    private String namesOfBands;
    private BandNames[] bandNameList;
    
    public BandNames(){
        
    }
    
    public BandNames(String namesOfBands) {
        setNamesOfBands(namesOfBands);
    }    

    public String getNamesOfBands() {
        return namesOfBands;
    }

    public void setNamesOfBands(String namesOfBands) {
        this.namesOfBands = namesOfBands;
    }

    public BandNames[] getBandNameList() {
        return bandNameList;
    }

    public void setBandNameList(BandNames[] bandNameList) {
        this.bandNameList = bandNameList;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.namesOfBands);
        hash = 53 * hash + Arrays.deepHashCode(this.bandNameList);
        return hash;
    }

    @Override
    public String toString() {
        return "BandNames{" + "namesOfBands=" + namesOfBands + ", bandNameList=" + bandNameList + '}';
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
        final BandNames other = (BandNames) obj;
        if (!Objects.equals(this.namesOfBands, other.namesOfBands)) {
            return false;
        }
        if (!Arrays.deepEquals(this.bandNameList, other.bandNameList)) {
            return false;
        }
        return true;
    }
   
   
}
