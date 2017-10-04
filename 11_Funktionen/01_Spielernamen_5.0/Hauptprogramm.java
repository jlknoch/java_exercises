/**
Einf�hrung in Funktionen
@author Matthias Ebert
@version 5.0
*/


// In dieser Version gibt es keine inhaltliche �nderung mehr.
// Es wird aber gezeigt, wie Funktionen dokumentiert werden sollten.


public class Hauptprogramm
{
  /** 
  Begr��t einen Spieler und erfragt seinen Namen.
  @param begruessung Text, der bei der Begr��ung des Spielers verwendet wird.
  @param spieler_nummer Nummer des Spielers
  @return eingelesener Name des Spielers
  */
  public static String begruesseSpieler(String begruessung, int spieler_nummer)
  {
    System.out.println();
    System.out.println(begruessung + ", Spieler " + spieler_nummer + "!");
    System.out.println("Sch�n, dass du mitspielst.");
    String name = Input.readString("Bitte gib deinen Namen ein: ");
    
    return name;
  }
    
  
  /**
  Hauptprogramm
  @param args Liste der Parameter, die beim Programmaufruf angegeben werden
  */
  public static void main(String[] args)
  {
    System.out.println("M�ge das v�llig sinnfreie Spiel beginnen.");
    System.out.println("Es ist ein Spiel f�r drei Personen.");
    
    // Nachfolgend werden die Spieler begr��t und deren Namen erfragt.

    String name_spieler1 = begruesseSpieler("Hallo", 1);
    String name_spieler2 = begruesseSpieler("Guten Tag", 2);
    String name_spieler3 = begruesseSpieler("Bonjour", 3);
    
    System.out.println();
    System.out.println(name_spieler1 + ", " + name_spieler2 + " und " + name_spieler3 + 
                       " spielen also mit.");
    
    System.out.println();
    System.out.println("Game over.");
  }
}