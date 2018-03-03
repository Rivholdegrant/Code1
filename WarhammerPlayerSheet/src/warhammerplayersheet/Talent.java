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
class Talent implements Serializable{
    private String name;    
    private String description;
    private Skill[] impactsSkills;
    private Stats impactsStats;
    
    public Talent(String name, String description, Skill[] impactsSkills, Stats impactsStats)
    {
        this.name=name;
        this.description=description;
        this.impactsSkills=impactsSkills;
        this.impactsStats=impactsStats;                
    }     
    String getDescription()
    {   
        return description;
    }  
    Skill[] getSkills()
    {
        return impactsSkills;
    }
    Stats getStats()
    {
        return impactsStats;
    }
    public String toString()
    {
        return name;
    }
}
