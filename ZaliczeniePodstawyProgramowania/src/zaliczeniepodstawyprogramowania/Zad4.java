/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zaliczeniepodstawyprogramowania;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author Rivs
 */
public class Zad4 {
    Double[] tabA, tabB;
    
    Zad4()
    {
        tabA = new Double[Integer.parseInt(JOptionPane.showInputDialog(null, "Enter tab lenght", "Create the tab", JOptionPane.QUESTION_MESSAGE))];
        tabB = new Double[tabA.length];
        fillTab();
        fillValues();
        printTab(tabA, tabB);        
    }
    int factorial(int i)
    {
        return i>1?i*factorial(i-1):1;
    }
    void fillTab()
    {
        for(int i = 0 ; i<tabA.length ; i++)
        {
            tabA[i]= new Random().nextDouble()*360+1;
//            tabA[i]=90.;
        }
        for(int i = 0 ; i<tabA.length ; i++)
        {
            System.out.println(tabA[i]);
        }
    }
    double sin(double x)
    {
        double temp=x;
        int i = 3;
        int sign = 0;
        while(Math.pow(Math.abs(x), i)/factorial(i)>0.0001)
        {
//            System.out.println(x + " " + i);
//            System.out.println(Math.pow(-1, sign));
//            System.out.println(Math.pow(x, i));
//            System.out.println(factorial(i));
//            System.out.println(Math.pow(x, i)/factorial(i));
//            System.out.println();
            
            temp-=((Math.pow(-1, sign)*(Math.pow(x, i)/factorial(i))));
            
            sign++;
            i+=2;
        }        
        return temp;
    }
    void fillValues()
    {
        for(int i = 0 ; i<tabA.length ; i++)
        {
            tabB[i]=sin(degreesToRadians(tabA[i]));
        }
    }
    void printTab(Double[] tab, Double[] tab2)
    {
        String temp = "";
        for(int i = 0 ; i<tabA.length ; i++)
        {
            temp+=String.format("%.5f Value: %.5f\n",tab[i], tab2[i]);
        }
        JOptionPane.showMessageDialog(null, "Your tab\n"+ temp, "Tab", JOptionPane.PLAIN_MESSAGE);  
    }
    double degreesToRadians(double degrees)
    {
        if(degrees>=360) degreesToRadians(degrees-360);
        return degrees>180? (180-degrees)*Math.PI/180:degrees*Math.PI/180;        
    }
}
