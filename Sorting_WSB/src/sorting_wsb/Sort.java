/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting_wsb;

import java.util.ArrayList;

/**
 *
 * @author Rivs
 */
public class Sort {
    public static ArrayList<Integer> sortArray(ArrayList<Integer> list)
    {
        ArrayList<Integer> sorted = (ArrayList<Integer>)list.clone();
        
        int j,temp; 
        for (int i=1;i<sorted.size();i++) 
        {
            j=i;
            temp=sorted.get(i);
            while (j>0 && sorted.get(j-1)>temp) 
            {
                sorted.set(j,sorted.get(j-1));
                j--;
            }
            sorted.set(j, temp);            
        }        
        return sorted;
    }
    public static ArrayList<Integer> sortArrayDesc(ArrayList<Integer> list)
    {
        ArrayList<Integer> sorted = (ArrayList<Integer>)list.clone();
        
        int j,temp; 
        for (int i=1;i<sorted.size();i++) 
        {
            j=i;
            temp=sorted.get(i);
            while (j>0 && sorted.get(j-1)<temp) 
            {
                sorted.set(j,sorted.get(j-1));
                j--;
            }
            sorted.set(j, temp);            
        }        
        return sorted;
    }
    public static ArrayList<Integer> getEven(ArrayList<Integer> list)
    {
        ArrayList<Integer> even = new ArrayList<Integer>();
        for(int i : list)
        {
            if(i%2==0)
            {
                even.add(i);
            }
        }
        return even;
    }
    public static ArrayList<Integer> getOdd(ArrayList<Integer> list)
    {
        ArrayList<Integer> odd = new ArrayList<Integer>();
        for(int i : list)
        {
            if(i%2!=0)
            {
                odd.add(i);
            }
        }
        return odd;
    }
    public static String compare(ArrayList<Integer> list)
    {
        int lessThan0=0, notLessThan0=0;
        for(int i : list)
        {
            if(i<0)
            {
                lessThan0+=Math.abs(i);
            }
            else
            {
                notLessThan0+=i;
            }                
        }
        String  output = "Absolute sum of numbers <0 = " + lessThan0 + "\n";
                output+= "Sum of numbers >=0 = " + notLessThan0 + "\n";
                
        if(lessThan0>notLessThan0)
        {
            output+= "Absolute sum of negative numbers is greater than sum of positive numbers";
        }
        else if(lessThan0<notLessThan0)
        {
            output+= "Absolute sum of negative numbers is smaller than sum of positive numbers";
        }
        else
        {
            output+= "Absolute sum of negative numbers is equal to sum of positive numbers";
        }
        
        return output;
    }
}
