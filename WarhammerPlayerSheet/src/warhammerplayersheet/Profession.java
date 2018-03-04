/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warhammerplayersheet;

import java.awt.Dimension;
import java.awt.Font;
import java.io.Serializable;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;

/**
 *
 * @author Rivs
 */
public class Profession implements Serializable{
    private String name;
    private String description;
    private Stats stats;    
    private Skill[] skills;
    private Talent[] talents;
    private Equipment[] equipment;
    private Profession[] entries;
    private Profession[] exits;
    private boolean advanced;
    
    public Profession(String name, String description, Stats stats, Skill[] skills, Talent[] talents, Equipment[] equipment, Profession[] entries, Profession[] exits, boolean advanced)
    {
        this.name        = name;     
        this.description = description;
        this.stats       = stats;
        this.skills      = skills;
        this.talents     = talents;
        this.equipment   = equipment;
        this.entries     = entries;
        this.exits       = exits;
        this.advanced    = advanced;
    }
    public Profession(String name)
    {
        this.name        = name; 
    }
    //setters
    void setDescription(String description)
    {
        this.description = description;               
    }
    void setStats(Stats stats)
    {
        this.stats       = stats;
    }
    void setSkills(Skill[] skills)
    {
        this.skills      = skills;
    }
    void setTalents(Talent[] talents)
    {
        this.talents     = talents;
    }
    void setEquipment(Equipment[] equipment)
    {
        this.equipment   = equipment;
    }
    void setEntries(Profession[] entries)
    {
        this.entries     = entries;
    }
    void setExits(Profession[] exits)
    {
        this.exits     = exits;
    }
    void setAdvanced(boolean advanced)
    {
        this.advanced=advanced;
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
    boolean isAdvanced()
    {
        return advanced;
    }
    String advanced()
    {
        return advanced?"Zaawansowana":"Podstawowa";
    }
    String listToString(Object[] list)
    {
        String temp = "";
        for(int i=0 ; i<list.length ; i++)
        {
            temp+=list[i].toString();            
            temp+=i < list.length-1?", ":" ";
        }
        return temp;
    }
    void show()
    {
        String message = 
                String.format("%-6s %s %n","Nazwa:", name) + 
                String.format("%-6s %s %n","Typ:", advanced) +
                String.format("%-6s %s %n","Opis:", description) +
                String.format("%-6s %n %s %n","Rozwinięcia:", stats.show()) +
                String.format("%-6s %n %s %n","Umiejętności:", listToString(skills)) +
                String.format("%-6s %n %s %n","Zdolności:", listToString(talents)) +
                String.format("%-6s %s %n","Profesje wejścia:", listToString(entries))+
                String.format("%-6s %s %n","Profesje wyjścia:", listToString(exits));
                ;            
        JTextPane jt = new JTextPane();
        jt.setText(message);            
        jt.setPreferredSize(new Dimension(540, 320));
        jt.setOpaque(true);
        jt.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 14));
        jt.setEditable(false);
        jt.setBackground(null);
        jt.setAutoscrolls(true);
            
        JOptionPane.showMessageDialog(null, jt, "Profesja", JOptionPane.PLAIN_MESSAGE);
    }
    @Override
    public String toString()
    {
        return name;
    }
           
}
