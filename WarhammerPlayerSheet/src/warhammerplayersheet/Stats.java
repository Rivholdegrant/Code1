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
public class Stats implements Serializable{
       
    private final int[] stats;
     
    public Stats()
    {
        stats = new int[16];        
        stats[0] = 0;
        stats[1] = 0;
        stats[2] = 0;
        stats[3] = 0;
        stats[4] = 0;
        stats[5] = 0;
        stats[6] = 0;
        stats[7] = 0; 
        
        stats[8] = 0;
        stats[9] = 0;
        stats[10] = 0;
        stats[11] = 0;
        stats[12] = 0;
        stats[13] = 0;
        stats[14] = 0;
        stats[15] = 0; 
    }
    public Stats(int ww, int us, int k, int odp, int zr, int in, int sw, int ogd)
    {
        stats = new int[16];
        stats[0] = ww;
        stats[1] = us;
        stats[2] = k;
        stats[3] = odp;
        stats[4] = zr;
        stats[5] = in;
        stats[6] = sw;
        stats[7] = ogd; 
        
        stats[8] = 0;
        stats[9] = 0;
        stats[10] = 0;
        stats[11] = 0;
        stats[12] = 0;
        stats[13] = 0;
        stats[14] = 0;
        stats[15] = 0; 
    }
    public Stats(int ww, int us, int k, int odp, int zr, int in, int sw, int ogd, int a, int zyw, int s, int wt, int sz, int mag, int po, int pp)
    {
        stats = new int[16];
        stats[0] = ww;
        stats[1] = us;
        stats[2] = k;
        stats[3] = odp;
        stats[4] = zr;
        stats[5] = in;
        stats[6] = sw;
        stats[7] = ogd; 
        
        stats[8] = a;
        stats[9] = zyw;
        stats[10] = s;
        stats[11] = wt;
        stats[12] = sz;
        stats[13] = mag;
        stats[14] = po;
        stats[15] = pp; 
    }
    int[] getStats()
    {
        return stats;
    }
    
    int getWW()
    {
        return stats[0];
    }
    void setWW(int val)
    {
        stats[0]=val;
    }  
    int getUS()
    {
        return stats[1];
    }
    void setUS(int val)
    {
        stats[1]=val;
    }
    
    int getK()
    {
        return stats[2];
    }
    void setK(int val)
    {
        stats[2]=val;
    }
    
    int getODP()
    {
        return stats[3];
    }
    void setODP(int val)
    {
        stats[3]=val;
    }
    
    int getZR()
    {
        return stats[4];
    }
    void setZR(int val)
    {
        stats[4]=val;
    }
    
    int getINT()
    {
        return stats[5];
    }
    void setINT(int val)
    {
        stats[5]=val;
    }
    
    int getSW()
    {
        return stats[6];
    }
    void setSW(int val)
    {
        stats[6]=val;
    }
    
    int getOGD()
    {
        return stats[7];
    }
    void setOGD(int val)
    {
        stats[7]=val;
    }
    
    int getA()
    {
        return stats[8];
    }
    void setA(int val)
    {
        stats[8]=val;
    }
       
    int getZYW()
    {
        return stats[9];
    }
    void setZYW(int val)
    {
        stats[9]=val;
    }
    
    int getS()
    {
        return stats[10];
    }
    void setS(int val)
    {
        stats[10]=val;
    }
    
    int getWT()
    {
        return stats[11];
    }
    void setWT(int val)
    {
        stats[11]=val;
    }
    
    int getSZ()
    {
        return stats[12];
    }
    void setSZ(int val)
    {
        stats[12]=val;
    }
    
    int getMAG()
    {
        return stats[13];
    }
    void setMAG(int val)
    {
        stats[13]=val;
    }
        
    int getPO()
    {
        return stats[14];
    }
    void setPO(int val)
    {
        stats[14]=val;
    }
    
    int getPP()
    {
        return stats[15];
    }
    void setPP(int val)
    {
        stats[15]=val;
    }    
    String show()
    {
        int ww  = getWW();
        int us  = getUS();
        int k   = getK();
        int odp = getODP();
        int zr  = getZR();
        int in  = getINT();
        int sw  = getSW();
        int ogd = getOGD();
        int a   = getA();
        int zyw = getZYW();
        int s   = getS();
        int wt  = getWT();
        int sz  = getSZ();
        int mag = getMAG();
        int po  = getPO();
        int pp  = getPP();
        
        String tempStats = "";
        
         
        tempStats+=ww!= 0?String.format("%-3s +%2d ","WW", ww):"";
        tempStats+=us!= 0?String.format("%-3s +%2d ","US", us):"";
        tempStats+=k!=  0?String.format("%-3s +%2d ","K", k):"";
        tempStats+=odp!=0?String.format("%-3s +%2d ","ODP", odp):"";
        tempStats+=zr!= 0?String.format("%-3s +%2d ","ZR", zr):"";
        tempStats+=in!= 0?String.format("%-3s +%2d ","INT", in):"";
        tempStats+=sw!= 0?String.format("%-3s +%2d ","SW", sw):"";
        tempStats+=ogd!=0?String.format("%-3s +%2d %n","OGD", ogd):"\n";
        tempStats+=a!=  0?String.format("%-3s +%2d ","A", a):"";
        tempStats+=zyw!=0?String.format("%-3s +%2d ","ZYW", zyw):"";
        tempStats+=s!=  0?String.format("%-3s +%2d ","A", s):"";
        tempStats+=wt!= 0?String.format("%-3s +%2d ","WT", wt):"";
        tempStats+=sz!= 0?String.format("%-3s +%2d ","SZ", sz):"";
        tempStats+=mag!=0?String.format("%-3s +%2d ","MAG", mag):"";
        tempStats+=po!= 0?String.format("%-3s +%2d ","PO", po):"";
        tempStats+=pp!= 0?String.format("%-3s +%2d ","PP", pp):"";        
                
//        tempStats+=ww!= 0?" WW: +"+ww:"";
//        tempStats+=us!= 0?" US: +"+us:"";
//        tempStats+=k!=  0?" K:  +"+k:"";
//        tempStats+=odp!=0?" ODP:+"+odp:"";
//        tempStats+=zr!= 0?" ZR: +"+zr:"";
//        tempStats+=in!= 0?" INT:+"+in:"";
//        tempStats+=sw!= 0?" SW: +"+sw:"";
//        tempStats+=ogd!=0?" OGD:+"+ogd:"\n";
//        tempStats+=a!=  0?" A:  +"+a:"";
//        tempStats+=zyw!=0?" ŻYW:+"+zyw:"";
//        tempStats+=s!=  0?" S:  +"+s:"";
//        tempStats+=wt!= 0?" WT: +"+wt:"";
//        tempStats+=sz!= 0?" SZ: +"+sz:"";
//        tempStats+=mag!=0?" MAG:+"+mag:"";
//        tempStats+=po!= 0?" PO: +"+po:"";
//        tempStats+=pp!= 0?" PP: +"+pp:"";
        
        return tempStats;
    }
}
    


