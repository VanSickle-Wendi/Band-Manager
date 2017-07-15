/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.model;

import java.io.Serializable;

/**
 *
 * @author Wendi
 */
public class TVShows implements Serializable {

    private String tvShowName;
    private TVShows[] tvShowList;

    public TVShows() {
    }

    public TVShows(String tvShowName) {
        setTvShowName(tvShowName);
    }

    public String getTvShowName() {
        return tvShowName;
    }

    public void setTvShowName(String tvShowName) {
        this.tvShowName = tvShowName;
    }

    public TVShows[] getTvShowList() {
        return tvShowList;
    }

    public void setTvShowList(TVShows[] tvShowList) {
        this.tvShowList = tvShowList;
    }

}
