/**
Einf�hrung in Funktionen
@author Matthias Ebert
@version 4.0
*/

public class Hauptprogramm
{
  // Funktionen k�nnen nur einen R�ckgabewert, aber beliebig viele Parameter haben.
  // Wir f�hren nun einen weiteren Parameter f�r die Begr��ung ein, um diese variieren zu k�nnen.
  public static String begruesseSpieler(String begruessung, int spieler_nummer)
  {
    System.out.println();
    System.out.println(begruessung + ", Spieler " + spieler_nummer + "!");
    System.out.println("Sch�n, dass du mitspielst.");
    String name = Input.readString("Bitte gib deinen Namen ein: ");
    
    return name;
  }
    
  
  // Funktion main().
  // Diese Funktion wird bei der Ausf�hrung des Java-Programms automatisch aufgerufen.
  public static void main(String[] args)
  {
    System.out.println("M�ge das v�llig sinnfreie Spiel beginnen.");
    System.out.println("Es ist ein Spiel f�r drei Personen.");
    
    // Nachfolgend werden die Spieler begr��t und deren Namen erfragt.
    // In dieser Version ist es m�glich, den Begr��ungstext zu variieren.

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