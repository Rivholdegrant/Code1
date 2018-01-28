/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warhammerplayersheet;

/**
 *
 * @author Rivs
 */
public class Profession {
    private String name;
    private String description;
    private Stats stats;    
    private Skill[] skills;
    private Talent[] talents;
    private Equipment[] equipment;
    private Profession[] entries;
    private Profession[] exits;
    
    public Profession(String name, String description, Stats stats, Skill[] skills, Talent[] talents, Equipment[] equipment, Profession[] entries, Profession[] exits)
    {
        name        = this.name;     
        description = this.description;
        stats       = this.stats;
        skills      = this.skills;
        talents     = this.talents;
        equipment   = this.equipment;
        entries     = this.entries;
        exits       = this.exits;
    }
    public Profession(String name)
    {
        name        = this.name; 
    }
    //setters
    void setDescription(String description)
    {
        description = this.description;               
    }
    void setStats(Stats stats)
    {
        stats       = this.stats;
    }
    void setSkills(Skill[] skills)
    {
        skills      = this.skills;
    }
    void setTalents(Talent[] talents)
    {
        talents     = this.talents;
    }
    void setEquipment(Equipment[] equipment)
    {
        equipment   = this.equipment;
    }
    void setEntries(Profession[] entries)
    {
        entries     = this.entries;
    }
    void setExits(Profession[] exits)
    {
        exits     = this.exits;
    }
    //getters
    String getName()
    {
        return name;
    }
    String getDescription()
    {
        return description;
    }
    Stats getStats()
    {
        return stats;
    }
    Skill[] getSkills()
    {
        return skills;
    }
    Talent[] getTalents()
    {
        return talents;
    }
    Equipment[] getEquipment()
    {
        return equipment;
    }
    Profession[] getEntries()
    {
        return entries;
    }
    Profession[] getExits()
    {
        return exits;
    }
           
}
