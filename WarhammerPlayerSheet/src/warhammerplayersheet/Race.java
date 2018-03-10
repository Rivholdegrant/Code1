/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warhammerplayersheet;

import java.io.Serializable;

/**
 *
 * @author Rivs
 */
public class Race implements Serializable{    
    private final Stats czlowiek    = new Stats(20, 20, 20, 20, 20, 20, 20, 20, 1, 0, 0, 0, 4, 0, 0, 0) ;
    private final Stats elf         = new Stats(20, 30, 20, 20, 30, 20, 20, 20, 1, 0, 0, 0, 5, 0, 0, 0) ;
    private final Stats krasnolud   = new Stats(30, 20, 20, 30, 10, 20, 20, 10, 1, 0, 0, 0, 3, 0, 0, 0) ;
    private final Stats niziolek    = new Stats(10, 30, 10, 10, 30, 20, 20, 30, 1, 0, 0, 0, 4, 0, 0, 0) ;
        
    public Race()
    {
        System.out.println("Wczytano rasy");        
    }
    
    Stats getCzlowiek()
    {
        return czlowiek;
    }
    Stats getElf()
    {
        return elf;
    }
    Stats getKrasnolud()
    {
        return krasnolud;
    }
    Stats getNiziolek()
    {
        return niziolek;
    }
    String[] getList()
    {
        return new String[]{"Człowiek", "Elf", "Krasnolud", "Niziołek"} ;
    }
    public String toString()
    {
        return "Człowiek"+" "+"Elf"+" "+"Krasnolud"+" "+"Niziołek";
    }
}
