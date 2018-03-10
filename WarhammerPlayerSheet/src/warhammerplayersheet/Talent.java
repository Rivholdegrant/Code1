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
class Talent implements Serializable, Comparable{
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
    void show()
    {
        String tempSkills = "";
            for(int i=0 ; i<impactsSkills.length ; i++)
            {
                tempSkills+=impactsSkills[i];
                tempSkills+=impactsSkills.length-1==i?". ":", ";
            }
            
            String message = 
                    String.format("%-6s %s %n","Nazwa:", name) +                 
                    String.format("%-6s %s %n","Opis:", description) + 
                    String.format("%-6s %s %n","Wpływa na:", tempSkills) +
                    String.format("%-6s %s %n","Statystyki:", impactsStats.show());  
            JTextPane jt = new JTextPane();
            jt.setText(message);            
            jt.setPreferredSize(new Dimension(140, 220));
            jt.setOpaque(true);
            jt.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 14));
            jt.setEditable(false);
            jt.setBackground(null);
            jt.setAutoscrolls(true);

            JOptionPane.showMessageDialog(null, jt, "Zdolność", JOptionPane.PLAIN_MESSAGE);

    }

    @Override
    public int compareTo(Object o) {
        return name.compareToIgnoreCase(o.toString());         
    }
}
