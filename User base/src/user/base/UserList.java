/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import static java.nio.file.LinkOption.NOFOLLOW_LINKS;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Rivs
 */
public class UserList {
    private ArrayList<User> list;
    
    UserList()
    {
        list = new ArrayList<>();
    }
    ArrayList<User> getList()
    {
        return list;
    }
    boolean addUser(String name, String surname)
    {       
        return list.add(new User(name, surname, generateId()));        
    }
    boolean addUser(String name, String surname, int joinday, int joinmonth, int joinyear, int contday, int contmonth, int contyear)
    {       
        return list.add(new User(name, surname, generateId(), joinday, joinmonth, joinyear, contday, contmonth, contyear));        
    }
    User getUser(int index)
    {
        return list.get(index);
    }
    private int generateId()
    {        
        return list.isEmpty() ? 1 : list.size()+1;
    }
    void printList(ArrayList<User> list)
    {
        for(User user : list)
        {
            System.out.println(user);
        }        
    }
    void printActiveList(ArrayList<User> list)
    {
        for(User user : list)
        {            
            if(user.isActive())System.out.println(user);            
        }        
    }
    void printInactiveList(ArrayList<User> list)
    {
        for(User user : list)
        {            
            if(!user.isActive())System.out.println(user);            
        }        
    }
    ArrayList<User> sort()
    {
        ArrayList<User> temp = (ArrayList<User>)list.clone();
        Collections.sort(temp);
        return temp;
    }
    //String filePath = System.getProperty("user.dir")+"\\database.dab" ;
    String filePath = "database.dab" ;
    boolean saveBase() throws FileNotFoundException, IOException
    {
        try{            
            FileOutputStream file = new FileOutputStream(filePath);
            ObjectOutputStream temp = new ObjectOutputStream(file);
            temp.writeObject(list);                         
        }catch(Exception e)
        {
            return false;
        }
        return true;
    }
    boolean loadFile() throws FileNotFoundException, IOException
    {
        try{ 
            FileInputStream file = new FileInputStream(filePath);
            ObjectInputStream temp = new ObjectInputStream(file);            
            list = (ArrayList<User>) temp.readObject();
        }catch(Exception e)
        {
            return false;
        }
        return true;
    }
}
