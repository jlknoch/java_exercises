/**
Einführung in die Zählschleife
@author Matthias Ebert
@version 1.0
*/


public class Hauptprogramm
{
  public static void main(String[] args)
  {
    System.out.println("Möge das Spiel beginnen.");
    
    int anzahl_runden = 5;
    int runde = 1;
    
    while (runde <= anzahl_runden)
    {
      System.out.println("Du spielst jetzt in Runde " + runde + ".");
      
      runde = runde + 1;
    }
    
    System.out.println("Das Spiel hat leider sein Ende gefunden.");
  }
}