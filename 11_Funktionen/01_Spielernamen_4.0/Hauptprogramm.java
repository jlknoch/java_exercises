/**
Einführung in Funktionen
@author Matthias Ebert
@version 4.0
*/

public class Hauptprogramm
{
  // Funktionen können nur einen Rückgabewert, aber beliebig viele Parameter haben.
  // Wir führen nun einen weiteren Parameter für die Begrüßung ein, um diese variieren zu können.
  public static String begruesseSpieler(String begruessung, int spieler_nummer)
  {
    System.out.println();
    System.out.println(begruessung + ", Spieler " + spieler_nummer + "!");
    System.out.println("Schön, dass du mitspielst.");
    String name = Input.readString("Bitte gib deinen Namen ein: ");
    
    return name;
  }
    
  
  // Funktion main().
  // Diese Funktion wird bei der Ausführung des Java-Programms automatisch aufgerufen.
  public static void main(String[] args)
  {
    System.out.println("Möge das völlig sinnfreie Spiel beginnen.");
    System.out.println("Es ist ein Spiel für drei Personen.");
    
    // Nachfolgend werden die Spieler begrüßt und deren Namen erfragt.
    // In dieser Version ist es möglich, den Begrüßungstext zu variieren.

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