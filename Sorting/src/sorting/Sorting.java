/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting;

import java.awt.BorderLayout;

/**
 *
 * @author star_destroyer
 */
public class Sorting {

    public static void main(String[] args) 
    {
        Algorythms play = new Algorythms();
        int listSize=10;        
        //time counter
        /*
        long timeStart, timeStop;        
        timeStart=System.currentTimeMillis();
        timeStop=System.currentTimeMillis()-timeStart;        
        */
        
        //randomList
        System.out.println("Random list:");
        int[] list = play.createRandomList(listSize, -5, 5);
        testAll(list);
        
        //sortedList
        System.out.println("Sorted list:");
        int[] sortedList = play.createSortedList(listSize, 0);
        testAll(sortedList);
        
        //reversedList
        System.out.println("Reversed list:");
        int[] reversedList = play.createReversedList(listSize, 0);
        testAll(reversedList);
        
        //printList(play.moveList(list, 2));
        
    }
    static String printList(int[] list)
    {
        long timeStart, timeStop;
        timeStart=System.currentTimeMillis();        
        String temp="";
        for(int i=0 ; i<list.length ; i++)
        {
            temp+="["+list[i]+"]"+" ";
        }
        timeStop=System.currentTimeMillis()-timeStart;
        temp = "Time: "+timeStop+" | "+temp + isSorted(list);
        System.out.println(temp);
        return temp; 
    }    
    static void testAll(int[] list)
    {
        Algorythms play = new Algorythms();
        System.out.print("List to sort \t");
        printList(list); 
        System.out.print("Bubblesort \t");
        printList(play.bubbleSort(list.clone()));
        System.out.print("Bubblesort rev \t");
        printList(play.bubbleSortRev(list.clone()));
        System.out.print("Insertsort \t");
        printList(play.insertSort(list.clone()));
        System.out.print("Selectionsort \t");
        printList(play.selectionSort(list.clone()));
        System.out.print("Quicksort \t");        
        printList(play.quickSort(list.clone()));
        System.out.print("Heapsort \t");        
        printList(play.heapSort(list.clone()));
        System.out.print("Countingsort \t");        
        printList(play.countingSort(list.clone()));
        System.out.print("Mergesort \t");        
        printList(play.mergeSort(list.clone()));
        System.out.println("");
    }
    static String isSorted(int[] list)
    {
        for(int i = 0 ; i<list.length-1 ; i++)
        {
            if(list[i]>list[i+1])
            {
                return "\tnot sorted";
            }
        }
        return "\tsorted";
    }
}
