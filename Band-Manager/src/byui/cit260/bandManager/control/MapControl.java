/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.bandManager.control;

import byui.cit260.bandManager.model.AppearanceScene;
import byui.cit260.bandManager.model.AuditionScene;
import byui.cit260.bandManager.model.BankScene;
import byui.cit260.bandManager.model.BigGigScene;
import byui.cit260.bandManager.model.CarLotScene;
import byui.cit260.bandManager.model.HotelScene;
import byui.cit260.bandManager.model.Location;
import byui.cit260.bandManager.model.Map;
import byui.cit260.bandManager.model.MusicStoreScene;
import byui.cit260.bandManager.model.SmallGigScene;

/**
 *
 * @author Crazian
 */
public class MapControl {
    
    public static Map createMap() {
        //create the map
        Map map = new Map();
        Location[] locations = new Location[25];
        
        locations[0] = new Location("Bank", 1);
        locations[1] = new Location("Audition Drummer", 2);
        locations[2] = new Location("Audition Singer", 3);
        locations[3] = new Location("Audition Guitar Player", 4);
        locations[4] = new Location("Audition Bass Player", 5);
        locations[5] = new Location("Audition Keyboard Player", 6);
        locations[6] = new Location("Car Lot", 7);
        locations[7] = new Location("Music Store", 8);
        locations[8] = new Location("Level 1 Hotel", 9);
        locations[9] = new Location("Level 2 Hotel", 10);
        locations[10] = new Location("Level 3 Hotel", 11);
        locations[11] = new Location("Level 4 Hotel", 12);
        locations[12] = new Location("Rehearsal", 13);
        locations[13] = new Location("Level 1 Small Gig", 14);
        locations[14] = new Location("Level 1 Big Gig", 15);
        locations[15] = new Location("Radio Interview", 16);
        locations[16] = new Location("Level 2 Small Gig", 17);
        locations[17] = new Location("Level 2 Big Gig", 18);
        locations[18] = new Location("TV Appearance", 19);
        locations[19] = new Location("Level 3 Small Gig", 20);
        locations[20] = new Location("Level 3 Big Gig", 21);
        locations[21] = new Location("Movie Cameo", 22);
        locations[22] = new Location("Level 4 Small Gig", 23);
        locations[23] = new Location("Level 4 Small Gig", 24);
        locations[24] = new Location("Star Party", 25);
        map.setLocations(locations);
               
        assignScenesToLocations(locations);
        
        return map;
    }    
    private static void assignScenesToLocations(Location[] locations) {
        locations[0].setScene(new BankScene());
        locations[1].setScene(new AuditionScene());
        locations[2].setScene(new AuditionScene());
        locations[3].setScene(new AuditionScene());
        locations[4].setScene(new AuditionScene());
        locations[5].setScene(new AuditionScene());
        locations[6].setScene(new CarLotScene());
        locations[7].setScene(new MusicStoreScene());
        locations[8].setScene(new HotelScene());
        locations[9].setScene(new HotelScene());
        locations[10].setScene(new HotelScene());
        locations[11].setScene(new HotelScene());
        locations[12].setScene(new AppearanceScene());
        locations[13].setScene(new SmallGigScene());
        locations[14].setScene(new BigGigScene());
        locations[15].setScene(new AppearanceScene());
        locations[16].setScene(new SmallGigScene());
        locations[17].setScene(new BigGigScene());
        locations[18].setScene(new AppearanceScene());
        locations[19].setScene(new SmallGigScene());
        locations[20].setScene(new BigGigScene());
        locations[21].setScene(new AppearanceScene());
        locations[22].setScene(new SmallGigScene());
        locations[23].setScene(new BigGigScene());
        locations[24].setScene(new AppearanceScene());        
    }
    
    
}
