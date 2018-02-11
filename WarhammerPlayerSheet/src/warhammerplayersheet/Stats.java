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
    String getWWdesc()
    {
        return "Walka wręcz";
    }
    
    int getUS()
    {
        return stats[1];
    }
    void setUS(int val)
    {
        stats[1]=val;
    }
    String getUSdesc()
    {
        return "Umiejętności strzeleckie";
    }
    
    int getK()
    {
        return stats[2];
    }
    void setK(int val)
    {
        stats[2]=val;
    }
    String getKdesc()
    {
        return "Krzepa";
    }
    
    int getODP()
    {
        return stats[3];
    }
    void setODP(int val)
    {
        stats[3]=val;
    }
    String getODPdesc()
    {
        return "Odporność";
    }
    
    int getZR()
    {
        return stats[4];
    }
    void setZR(int val)
    {
        stats[4]=val;
    }
    String getZRdesc()
    {
        return "Zręczność";
    }
    
    int getINT()
    {
        return stats[5];
    }
    void setINT(int val)
    {
        stats[5]=val;
    }
    String getINTdesc()
    {
        return "Inteligencja";
    }
    
    int getSW()
    {
        return stats[6];
    }
    void setSW(int val)
    {
        stats[6]=val;
    }
    String getSWdesc()
    {
        return "Siła woli";
    }
    
    int getOGD()
    {
        return stats[7];
    }
    void setOGD(int val)
    {
        stats[7]=val;
    }
    String getOGDdesc()
    {
        return "Ogłada";
    }
    
    int getA()
    {
        return stats[8];
    }
    void setA(int val)
    {
        stats[8]=val;
    }
    String getAdesc()
    {
        return "Ataki";
    }
        
    int getZYW()
    {
        return stats[9];
    }
    void setZYW(int val)
    {
        stats[9]=val;
    }
    String getZYWdesc()
    {
        return "Żywotność";
    }
    
    int getS()
    {
        return stats[10];
    }
    void setS(int val)
    {
        stats[10]=val;
    }
    String getSdesc()
    {
        return "Szybkość";
    }
    
    int getWT()
    {
        return stats[11];
    }
    void setWT(int val)
    {
        stats[11]=val;
    }
    String getWTdesc()
    {
        return "Wytrzymałość";
    }
    
    int getSZ()
    {
        return stats[12];
    }
    void setSZ(int val)
    {
        stats[12]=val;
    }
    String getSZdesc()
    {
        return "Szybkość";
    }
    
    int getMAG()
    {
        return stats[13];
    }
    void setMAG(int val)
    {
        stats[13]=val;
    }
    String getMAGdesc()
    {
        return "Magia";
    }
    
    int getPO()
    {
        return stats[14];
    }
    void setPO(int val)
    {
        stats[14]=val;
    }
    String getPOdesc()
    {
        return "Punkty obłędu";
    }
    
    int getPP()
    {
        return stats[15];
    }
    void setPP(int val)
    {
        stats[15]=val;
    }
    String getPPdesc()
    {
        return "Punkty przeznaczenia";
    }
    
}
    


