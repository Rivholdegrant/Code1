/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warhammerplayersheet;

import java.io.Serializable;

/**
 *
 * @author Rivs
 */
public class Player implements Serializable, Comparable{
    //Basic info
    private String name;
    private String race;
    private Profession profession;
    private Profession[] previousProfession;
    
    //Description
    //Not needed crap - let's make it later
    
    //statistics
    private Stats base;
    private Stats fromRace;
    private Stats possibleUpgrade;
    private Stats takenUpgrade;
    private Stats fromTalents;
    private Stats additional;
    private Stats total;
    
    public Player(String name, String race)
    {
        this.name = name;
        this.race = race;
        //all race objects need to be created before in app and referenced to constructor from drop-down list in appwindow
    }
    public Player(String name, String race, Profession profession, Stats base, Stats fromRace, Stats possibleUpgrade)
    {
        this.name = name;
        this.race = race;
        this.profession=profession;
        
        this.base=base;
        this.fromRace=fromRace;
        this.possibleUpgrade=possibleUpgrade;
    }
    @Override
    public int compareTo(Object o) {
        return name.compareToIgnoreCase(o.toString());         
    }
    
}
