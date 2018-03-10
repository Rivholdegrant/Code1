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
class Skill implements Serializable, Comparable{
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
    void show()
    {
        String message = 
                String.format("%-6s %s %n","Nazwa:", name) + 
                String.format("%-6s %s %n","Typ:", getType()) +
                String.format("%-6s %s %n","Cecha:", stat) +
                String.format("%-6s %s","Opis:", description);            
        JTextPane jt = new JTextPane();
        jt.setText(message);            
        jt.setPreferredSize(new Dimension(140, 220));        
        jt.setOpaque(true);
        jt.setFont(new Font(Font.MONOSPACED, Font.PLAIN, 14));
        jt.setEditable(false);
        jt.setBackground(null);
        jt.setAutoscrolls(true);
            
        JOptionPane.showMessageDialog(null, jt, "Umiejętność", JOptionPane.PLAIN_MESSAGE);
    }
    @Override
    public int compareTo(Object o) {
        return name.compareToIgnoreCase(o.toString());         
    }
}
