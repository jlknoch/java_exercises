/**
 Primzahltest
 @author Matthias Ebert
 @version 1.0
*/


public class Hauptprogramm
{
  public static void main(String[] args)
  {
    int limit = Input.readInt("Obergrenze: ");
    
    for (int i = 2; i <= limit; i = i + 1)
    {
      boolean anzeigen = true;
      
      for (int j = 2; j <= i / 2; j = j + 1)
      {
        if (i % j == 0)
        {
          anzeigen = false;
        }
      }
      
      if (anzeigen)
      {
        System.out.println(i);
      }
    }
  }
}