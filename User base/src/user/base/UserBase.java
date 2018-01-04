/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.base;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author Rivs
 */
public class UserBase {

    /**
     * @param args the command line arguments
     */
	public static Scanner scan = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        UserList list = new UserList();
//        
//        list.addUser("Andrzej", "Strzelba");
//        list.getUser(0).setJoinDate(12, 9, 2017);
//        list.getUser(0).setContractDate(12, 9, 2018);
//        list.getUser(0).assignSite("Wrocław");
//        
//        list.addUser("Domino", "Jachaś", 24,12,2015,24,12,2019);
//        list.addUser("Sebastian", "Strzalkowski", 31,2,2016,31,2,2020);
//        list.getList().get(list.getList().size()-1).assignSite("Kraków") ;
//        list.getUser(1).deactivate();
//        
//        list.printList(list.getList());
//        System.out.println();
//        list.printActiveList(list.getList());
//        System.out.println();
//                
//        list.addUser("Tomuś", "Robaczek", 22,9,2017,22,9,2018);
//        list.getList().get(list.getList().size()-1).assignSite("Kraków") ;
//        
//        list.printList(list.getList());
//        System.out.println();
//        list.printActiveList(list.getList());
//        System.out.println();
//        list.printInactiveList(list.getList());
//        System.out.println();
//        
//        System.out.println("Let's sort list by surname");
//        list.printList(list.sort());  
//              
//        list.saveBase();
//        
        
        //menu
        int menuitem = 0;        
        do
        {
        	System.out.println(printMenu());
        	
        	System.out.println("What do you want to do?");
        	menuitem = scan.nextInt();
        	switch(menuitem)
        	{
        	case 1: addUser(list) ; break;
        	case 2: activateUser(list); break;
        	case 3: ; break;
        	case 4: ShowUser(list) ; break;
        	case 5: list.printList(); break;
        	case 6: ; break;
        	case 7: ; break;
        	case 8: save(list); break;
        	case 9: load(list); break;
        	case 0: System.out.println("Bye bye :)"); break;
        	}
        }
        while(menuitem!=0);
        
//        
//        list.printList(list.getList());
//        System.out.println(list.loadFile());
//        list.printList(list.getList());
        
    }
    private static String printMenu()
    {
    	return "\r\n"
    			+ "1. Add user\r\n"
    			+ "2. Activate/deactivate\r\n"
    			+ "3. \r\n"
    			+ "4. Show user\r\n"
    			+ "5. Show list (all)\r\n"
    			+ "6. \r\n"
    			+ "7. \r\n"
    			+ "8. Save\r\n"
    			+ "9. Load\r\n"
    			+ "0. Exit\r\n";
    }
    private static boolean addUser(UserList list)
    {
    	try
    	{    	
    	String name, surname, temp, extended;
    	int joinday, joinmonth, joinyear, contday, contmonth, contyear;
    	
    	System.out.println("Enter name: ");
    	name = scan.next();
    	System.out.println("Enter surname: ");
    	surname = scan.next();
    	
    	while(true)
    	{
	    	System.out.println("Add dates? y/n ");
	    	extended = scan.next();
	    	   	
	    	    	
	    	if(extended.equals("n"))
	    	{
	    		list.addUser(name, surname);
	    	}
	    	else if(extended.equals("y"))
	    	{
	    		System.out.println("Enter start date (dd/mm/yyyy): ");
	        	temp = scan.next();
	        	String[] tlist = temp.split("/");
	        	joinday = Integer.parseInt(tlist[0]);
	        	joinmonth = Integer.parseInt(tlist[1]);
	        	joinyear = Integer.parseInt(tlist[2]);
	        	System.out.println("Enter end of contract date (dd/mm/yyyy): ");
	        	temp = scan.next();
	        	tlist = temp.split("/");
	        	contday = Integer.parseInt(tlist[0]);
	        	contmonth = Integer.parseInt(tlist[1]);
	        	contyear = Integer.parseInt(tlist[2]);
	    		list.addUser(name, surname, joinday, joinmonth, joinyear, contday, contmonth, contyear);
	    	}
	    	else
	    	{
	    		System.out.println("Wrong answer! Again");
	    		continue;
	    	}
	    	break;
    	}
    	}catch(Exception e)
    	{
    		System.out.println("Something went not yes. Try again");
    		return false;
    	}
    	return true;
    }
    private static boolean ShowUser(UserList list)
    {
    	
    	System.out.println("Which one?");
    	int index = scan.nextInt();
    	list.printUser(index);
    	return true;    
    }
    private static boolean activateUser(UserList list)
    {
    	String answer;
    	
    	System.out.println("Which one?");
    	int index = scan.nextInt();
    	list.printUser(index);
    	
    	while(true)
    	{
    		System.out.println("Do you want to change status to: "+ (!list.getUser(index-1).isActive() ? "active" : "inactive") + "(y/n)");
    		answer=scan.next();
    	if(answer.equals("n"))
    	{
    		System.out.println("Leaving as it was");
    	}
    	else if(answer.equals("y"))
    	{    
    		if(list.getUser(index-1).isActive())
			{
			list.getUser(index-1).deactivate();
			}
    		else
    		{
    			list.getUser(index-1).activate();
    		}
    		System.out.println("User is now "+(list.getUser(index-1).isActive() ? "active" : "inactive") );
    	}
    	else
    	{
    		System.out.println("Wrong answer! Again");
    		continue;
    	}break;
    	}
    	return true;
    }
    private static void save(UserList list) throws FileNotFoundException, IOException
    {    	
    	if(list.saveBase())
		{
    		System.out.println("Done");
		}
    	else
    	{
    		System.out.println("Oh shit, not good ;<");
    	}
    }
    private static void load(UserList list) throws FileNotFoundException, IOException
    {
    	if(list.loadFile())
		{
    		System.out.println("Done");
		}
    	else
    	{
    		System.out.println("Oh shit, not good ;<");
    	}
    }
    
}
