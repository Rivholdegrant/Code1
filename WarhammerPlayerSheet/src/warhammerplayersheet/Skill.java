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
class Skill implements Serializable{
    private String name;
    private String stat;
    private String description;
    private boolean advanced;
    
    public Skill(String name, String stat, String description, boolean advanced)
    {
        this.name=name;
        this.stat=stat;
        this.description=description;
        this.advanced=advanced;
    }    
    public String getStat()
    {
        return stat;
    }
    public String getDescription()
    {
        return description;
    }
    public String getType()
    {
        return advanced?"Zaawansowana":"Podstawowa";
    }
    public boolean isAdvanced()
    {
        return advanced;
    }
    @Override
    public String toString()
    {
        return name;
    }   
}
