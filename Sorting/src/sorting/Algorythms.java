/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting;

import java.util.Random;

/**
 *
 * @author star_destroyer
 */
public class Algorythms 
{
    //int[] sortedList = new int[list.length]; 
    //list creation
    int[] createRandomList(int size, int floor, int ceiling)
    {
        int[] list = new int[size];
        
        for(int i = 0 ; i<list.length ; i++)
        {
            list[i]= new Random().nextInt(ceiling+1-floor)+floor;
        }        
        return list;
    }
    int[] createSortedList(int size, int lowest)
    {
        int[] list = new int[size];
        
        for(int i=0 ; i<list.length ;i++)
        {
            list[i]=lowest;
            lowest++;
        }
        return list;
    }
    int[] createReversedList(int size, int lowest)
    {
        int[] list = new int[size];
        
        for(int i=0 ; i<list.length ;i++)
        {
            list[list.length-1-i]=lowest;
            lowest++;
        }
        return list;
    }
    //sorting algorythms
    int[] bubbleSort(int[] list)
    {
        boolean sorted = true;
        
        for(int i=list.length-1 ; i>0 ; i--)
        {
            if(list[i]<list[i-1])
            {
                swichPositions(list, i, i-1);
                i=list.length;
            }
        }
        return list;
    }
    int[] bubbleSortRev(int[] list)
    {        
        boolean sorted = true;
        
        for(int i=0 ; i<list.length ; i++)
        {
            if(i==list.length-1 && !sorted)
            {
                i=0;
                sorted=true;
            }
            else if(i==list.length-1 && sorted) break;            
            if(list[i]>list[i+1])
            {
                swichPositions(list, i, i+1);
                sorted=false;                
            }            
        }
        return list;
    }
    int[] insertSort(int[] list)
    {     
        int j,temp; 
        for (int i=1;i<list.length;i++) 
        {
            j=i;
            temp=list[i];
            while (j>0 && list[j-1]>temp) 
            {
                list[j]=list[j-1];
                j--;
            }
            list[j]=temp;            
        }
        
        return list;
    }
    int[] selectionSort(int[] list)
    {
        int lowPos=0;
        int counter=list.length;
        int temp;
        for(int i=0 ; i<list.length ; i++)
        {
            if(list[lowPos]>list[i]) lowPos=i;            
            if(i==list.length-1)
            {
                temp=list[list.length-counter];
                list[list.length-counter]=list[lowPos];
                list[lowPos]=temp;
                counter--;
                i=list.length-counter-1;
                lowPos=list.length-counter;
            }
            if(counter==0) break;            
        }
        return list;
    }
    int[] quickSort(int[] list)
    {
        quickSort(list, 0, list.length-1);
        return list;
    }
    int[] quickSort(int[] list, int startPos, int endPos)
    {        
        int i=startPos;
        int j=endPos;
        int pivot = list[startPos + (endPos - startPos)/2];
        
        while(i <= j)
        {
            while(list[i]<pivot)
            {
                i++;
            }
            while(list[j]>pivot)
            {
                j--;
            }
            if(i <= j)
            {
                swichPositions(list, i, j);
                i++;
                j--;
            }
        }
        if(startPos < j) list=quickSort(list, startPos, j);
        if(endPos > i) list=quickSort(list, i, endPos);
        
        return list;
    }
    int[] heapSort(int[] list)
    {
        return list;
    }
    int[] countingSort(int[] list)
    {
        return list;
    }
    int[] mergeSort(int[] list)
    {
        return list;
    }
    //utilities
    int[] swichPositions(int[] list, int pos1, int pos2)
    {
        int temp = list[pos1];
        list[pos1]=list[pos2];
        list[pos2]=temp;
        return list;
    }
    int[] insertToList(int[] list, int startingIndex, int toInsert)
    {
        for(int i=list.length-1;i>startingIndex;i--)
        {
            list[i]=list[i-1];
        }
        list[startingIndex]=toInsert;
        return list;
    }
}
