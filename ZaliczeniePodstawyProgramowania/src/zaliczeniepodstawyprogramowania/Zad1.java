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
public class Zad1 {    
    Zad1()
    {        
        int[][] tab;
        
        tab = new int   [Integer.parseInt(JOptionPane.showInputDialog(null, "Enter tab height", "Tab creation #1", JOptionPane.QUESTION_MESSAGE))]
                        [Integer.parseInt(JOptionPane.showInputDialog(null, "Enter tab width", "Tab creation #2", JOptionPane.QUESTION_MESSAGE))];
        JOptionPane.showMessageDialog(null, "You have created tab\n" + tab.length +" high \n" + tab[0].length +" wide", "Tab created", JOptionPane.INFORMATION_MESSAGE);    
        
        fillTheTab(tab);
        
        displayMatrix(tab);
        
        int tempPos = Integer.parseInt(JOptionPane.showInputDialog(null, "Which row you want to count? [1-"+tab.length+"]", "Tab counting", JOptionPane.QUESTION_MESSAGE));
        int tempResult = countRow(tab[tempPos-1]);
        
        JOptionPane.showMessageDialog(null, "Sum of elements in " + tempPos + ". row is: " + tempResult, "Row counted", JOptionPane.INFORMATION_MESSAGE);  
        
    }
    int countRow(int[] tab)
    {
        int sum=0;
        
        for(int i = 0 ; i<tab.length ; i++)
        {
            sum+=tab[i];
        }
        
        return sum;
    }
    void fillTheTab(int[][] tab)
    {
        for(int i = 0 ; i<tab.length ; i++)
        {
            for(int j = 0 ; j<tab[i].length ; j++)
            {
                tab[i][j] = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter element at index ["+i+"]["+j+"]", "Fill the tab", JOptionPane.QUESTION_MESSAGE));
            }            
        }
        JOptionPane.showMessageDialog(null, "Thank you", "Tab filled", JOptionPane.INFORMATION_MESSAGE); 
    }
    void displayMatrix(int[][] tab)
    {
        String temp="";
        
        for(int i = 0 ; i<tab.length ; i++)
        {
            for(int j = 0 ; j<tab[i].length ; j++)
            {
                temp+=String.format("%3s",tab[i][j]);
            }
            temp+="\n";
        }
        
        JOptionPane.showMessageDialog(null, "Your tab\n"+ temp, "Tab", JOptionPane.PLAIN_MESSAGE);  
    }
}
