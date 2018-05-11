/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaliczeniepodstawyprogramowania;

import javax.swing.JOptionPane;

/**
 *
 * @author Rivs
 */
public class Zad2 {
    Zad2()
    {
        int[] tab = new int[10];
        
        fillRandomly(tab);
        
        displayTab(tab);
        
    }
    void fillRandomly(int[] tab)
    {
        for(int i = 0 ; i<tab.length ; i++)
        {            
            tab[i]=1+(int)(10*Math.random()); //Generates numbers 1<=n<=10
        }
    }
    
    void displayTab(int[] tab)
    {
        String temp="";
        
        for(int i = 0 ; i<tab.length ; i++)
        {            
            temp+=String.format("%3s",tab[i]);
        }
        
        JOptionPane.showMessageDialog(null, "Your tab\n"+ temp, "Tab", JOptionPane.PLAIN_MESSAGE);  
    }
}
