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
        
        locations[0] = new Location("Bank");
        locations[1] = new Location("Audition Drummer");
        locations[2] = new Location("Audition Singer");
        locations[3] = new Location("Audition Guitar Player");
        locations[4] = new Location("Audition Bass Player");
        locations[5] = new Location("Audition Keyboard Player");
        locations[6] = new Location("Car Lot");
        locations[7] = new Location("Music Store");
        locations[8] = new Location("Level 1 Hotel");
        locations[9] = new Location("Level 2 Hotel");
        locations[10] = new Location("Level 3 Hotel");
        locations[11] = new Location("Level 4 Hotel");
        locations[12] = new Location("Rehearsal");
        locations[13] = new Location("Level 1 Small Gig");
        locations[14] = new Location("Level 1 Big Gig");
        locations[15] = new Location("Radio Interview");
        locations[16] = new Location("Level 2 Small Gig");
        locations[17] = new Location("Level 2 Big Gig");
        locations[18] = new Location("TV Appearance");
        locations[19] = new Location("Level 3 Small Gig");
        locations[20] = new Location("Level 3 Big Gig");
        locations[21] = new Location("Movie Cameo");
        locations[22] = new Location("Level 4 Small Gig");
        locations[23] = new Location("Level 4 Small Gig");
        locations[24] = new Location("Star Party");
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
