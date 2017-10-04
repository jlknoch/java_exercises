/**
Einführung in Funktionen
@author Matthias Ebert
@version 2.0
*/

public class Hauptprogramm
{
  // Die Funktion bekommt einen PARAMETER, in diesem Fall die Nummer des Spielers.
  public static void begruesseSpieler(int spieler_nummer)
  {
    System.out.println();
    System.out.println("Guten Tag, Spieler " + spieler_nummer + "!");
    System.out.println("Schön, dass du mitspielst.");
    String name_spieler1 = Input.readString("Bitte gib deinen Namen ein: ");
  }
    
  
  // Funktion main().
  // Diese Funktion wird bei der Ausführung des Java-Programms automatisch aufgerufen.
  public static void main(String[] args)
  {
    System.out.println("Möge das völlig sinnfreie Spiel beginnen.");
    System.out.println("Es ist ein Spiel für drei Personen.");
    
    String name_spieler1 = "Unbekannt";
    String name_spieler2 = "Unbekannt";
    String name_spieler3 = "Unbekannt";
    
    // Nachfolgend werden die Spieler begrüßt und deren Namen erfragt.
    // Dazu wird die oben definierte Funktion dreimal in Folge aufgerufen,
    // diesmal aber mit verschiedenen Werten für den Parameter spieler_nummer.

    begruesseSpieler(1);
    begruesseSpieler(2);
    begruesseSpieler(3);

    // Damit ist das erste Problem aus Version 1.0 gelöst.
    // Das zweite Problem besteht aber immer noch.
    
    System.out.println();
    System.out.println(name_spieler1 + ", " + name_spieler2 + " und " + name_spieler3 + 
                       " spielen also mit.");
    
    System.out.println();
    System.out.println("Game over.");
  }
}