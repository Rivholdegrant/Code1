package algorytmy2;

public class CzescWspolna {


    public static void main(String[] args) {
        String tekst1 = "ABAABBAAABBBAABAABBABABAABABAABAAA";
        String tekst2 = "AAABAABBABABAABAABBABABAABAABBABAB";
        String sub;
        
        do
        {
            sub="";
            sub = wspolna(tekst1, tekst2);
            
            tekst1=tekst1.replace(sub, " "); //placeholdery 
            tekst2=tekst2.replace(sub, "_");
        }
        while(sub!="" && sub!=" ");     
    }
    public static String wspolna(String tekst1, String tekst2)
    {
        int dl1 = tekst1.length();
        int dl2 = tekst2.length();
        
        int maksimum = 0;
        int pozycja_w1 = -1;
        int pozycja_w2 = -1;
        
        for (int i = 0; i < dl1 - maksimum; i++)
        {

            for (int k = dl2 - 1; k >= 0; k--)
            {
                int licznik = 0;
                int limit = Math.min(dl2, (dl1 -i + k) );  // okresla ile maksymalnie znakow mozemy sprawdzic w zaleznosci od przesuniecia, mozna zastapic instrukcja IF [if( (i+j-k) >= dl2) break;] wewnatrz kolejnej petli
                for (int j = k; j < limit; j++)
                {
                    if (tekst1.charAt(i+j-k) == tekst2.charAt(j))
                    {                        
                        licznik++;
                       
                        if (maksimum < licznik) 
                        {
                            maksimum = licznik;
                            pozycja_w1 = i + j - k - maksimum + 1;
                            pozycja_w2 = j - maksimum + 1;
                        }
                    }
                    else licznik = 0;
                }
            }
        }
        if(maksimum<=1)
        {
            return "";
        }
        
        System.out.println("Pozycja w tekst1: " + pozycja_w1 + ", pozycja w tekst2: " + pozycja_w2 + ", dlugosc: " + maksimum);
        

                        
        System.out.println(tekst1.substring(0, pozycja_w1) + "\u001B[31m" 
                + tekst1.substring(pozycja_w1, maksimum + pozycja_w1) + "\u001B[0m" + tekst1.substring(maksimum + pozycja_w1) );
        System.out.println(tekst2.substring(0, pozycja_w2) + "\u001B[31m" 
                + tekst2.substring(pozycja_w2, maksimum + pozycja_w2) + "\u001B[0m" + tekst2.substring(maksimum + pozycja_w2) );
        
        return tekst1.substring(pozycja_w1, maksimum + pozycja_w1);
    }
    
}
