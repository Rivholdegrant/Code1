/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user.base;

/**
 *
 * @author Rivs
 */
public class UserBase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        UserList list = new UserList();
        
        list.addUser("Andrzej", "Strzelba");
        list.getUser(0).setJoinDate(12, 9, 2017);
        list.getUser(0).setContractDate(12, 9, 2018);
        list.getUser(0).assignSite("Wrocław");
        
        list.addUser("Domino", "Jachaś", 24,12,2015,24,12,2019);
        list.addUser("Sebastian", "Strzalkowski", 31,2,2016,31,2,2020);
        list.getList().get(list.getList().size()-1).assignSite("Kraków") ;
        list.getUser(1).deactivate();
        
        list.printList(list.getList());
        System.out.println();
        list.printActiveList(list.getList());
        System.out.println();
                
        list.addUser("Tomuś", "Robaczek", 22,9,2017,22,9,2018);
        list.getList().get(list.getList().size()-1).assignSite("Kraków") ;
        
        list.printList(list.getList());
        System.out.println();
        list.printActiveList(list.getList());
        System.out.println();
        list.printInactiveList(list.getList());
        System.out.println();
        
        System.out.println("Let's sort list by surname");
        list.printList(list.sort());        
    }
    
}
