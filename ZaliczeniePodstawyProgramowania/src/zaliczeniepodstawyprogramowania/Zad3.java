/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaliczeniepodstawyprogramowania;

import java.util.HashSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Rivs
 * @param <T>
 */
public class Zad3<T> {    
        
    HashSet<T> s1;
    HashSet<T> s2;
    
    Zad3(HashSet<T> s1, HashSet<T> s2)
    {   
        this.s1=s1;
        this.s2=s2;
        System.out.println(s1);  
        System.out.println(s2); 
        JOptionPane.showMessageDialog(null, "Your set#1\n"+ s1, "Set", JOptionPane.PLAIN_MESSAGE);  
        JOptionPane.showMessageDialog(null, "Your set#2\n"+ s2, "Set", JOptionPane.PLAIN_MESSAGE);  
        
    }
    HashSet<T> product()
    {        
        T[] tempTab = (T[])s1.toArray();
        HashSet<T> tempSet = new HashSet<>();
        for(int i = 0 ; i<tempTab.length ; i++)
        {
            if(s2.contains(tempTab[i]))
            {
                tempSet.add(tempTab[i]);
            }
        }
        JOptionPane.showMessageDialog(null, "Product:\n"+ tempSet, "Set", JOptionPane.PLAIN_MESSAGE);  
        System.out.println("\nProduct:");
        System.out.println(tempSet);
        
        return tempSet;
    }
    HashSet<T> sumNoRep()
    {
        HashSet<T> tempSet = new HashSet<>();
        tempSet.addAll(s1);
        tempSet.addAll(s2);
        
        JOptionPane.showMessageDialog(null, "Sum without doubling:\n"+ tempSet, "Set", JOptionPane.PLAIN_MESSAGE);  
        System.out.println("\nSum without doubling:");
        System.out.println(tempSet);
        
        return tempSet;
    }
    HashSet<T> difference()
    {
        HashSet<T> tempSet = s1;
        tempSet.removeAll(s2);        
        
        JOptionPane.showMessageDialog(null, "Difference:\n"+ tempSet, "Set", JOptionPane.PLAIN_MESSAGE);  
        System.out.println("\nDifference:");
        System.out.println(tempSet);
        
        return tempSet;
    }
}
