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
 */
public class ZadanieTrzecie {
    HashSet<String> s1;
    HashSet<String> s2;
    public static void main(String[] args)
    {
        ZadanieTrzecie z3 = new ZadanieTrzecie();
        
        z3.s1= new HashSet<String>();
        z3.s2= new HashSet<String>();
        
        z3.s1.add("Anna");
        z3.s1.add("Hanna");
        z3.s1.add("Wiola");
        z3.s1.add("Martyna");
        z3.s1.add("Luiza");
        z3.s1.add("Anna");
        z3.s1.add("Hanna");
        
        z3.s2.add("Renata");
        z3.s2.add("Hanna");
        z3.s2.add("Sylwia");
        z3.s2.add("Weronika");
        z3.s2.add("Natalia");  
        
        JOptionPane.showMessageDialog(null, "Your set#1\n"+ z3.s1, "Set", JOptionPane.PLAIN_MESSAGE);  
        JOptionPane.showMessageDialog(null, "Your set#2\n"+ z3.s2, "Set", JOptionPane.PLAIN_MESSAGE);
        
        z3.product();
        z3.sumNoRep();
        z3.difference(); 
    }
    HashSet<String> product()
    {        
            Object[] tempTab;
            tempTab = s1.toArray();
            HashSet<String> tempSet = new HashSet<>();
            for(int i = 0 ; i<tempTab.length ; i++)
            {
                    if(s2.contains(tempTab[i]))
                    {
                            tempSet.add(tempTab[i].toString());
                    }
            }
            JOptionPane.showMessageDialog(null, "Product:\n"+ tempSet, "Set", JOptionPane.PLAIN_MESSAGE);  
            System.out.println("\nProduct:");
            System.out.println(tempSet);

            return tempSet;
    }
    HashSet<String> sumNoRep()
    {
            HashSet<String> tempSet = new HashSet<>();
            tempSet.addAll(s1);
            tempSet.addAll(s2);

            JOptionPane.showMessageDialog(null, "Sum without doubling:\n"+ tempSet, "Set", JOptionPane.PLAIN_MESSAGE);  
            System.out.println("\nSum without doubling:");
            System.out.println(tempSet);

            return tempSet;
    }
    HashSet<String> difference()
    {
            HashSet<String> tempSet = s1;
            tempSet.removeAll(s2);        

            JOptionPane.showMessageDialog(null, "Difference:\n"+ tempSet, "Set", JOptionPane.PLAIN_MESSAGE);  
            System.out.println("\nDifference:");
            System.out.println(tempSet);

            return tempSet;
    }
}
