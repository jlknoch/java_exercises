/**
Einführung in Funktionen
@author Matthias Ebert
@version 3.0
*/

public class Hauptprogramm
{
  // Die Funktion bekommt einen RÜCKGABEWERT, der an die aufrufende Stelle "übermittelt" wird.
  // Der DATENTYP des Rückgabewertes wird vor dem Namen der Funktion angegeben.
  // Die Angabe void (in den bisherigen Versionen) bedeutet, dass die Funktion keinen Wert
  // an die aufrufende Stelle zurückgibt.
  public static String begruesseSpieler(int spieler_nummer)
  {
    System.out.println();
    System.out.println("Guten Tag, Spieler " + spieler_nummer + "!");
    System.out.println("Schön, dass du mitspielst.");
    String name = Input.readString("Bitte gib deinen Namen ein: ");
    
    // Durch die RETURN-ANWEISUNG wird der angegebene Wert an die aufrufende Stelle "übermittelt".
    // Dabei springt das Programm aus der Funktion heraus, das heißt, dass Befehle, die danach
    // folgen, nicht mehr ausgeführt werden.
    // Theoretisch kann es auch mehrere Return-Anweisungen innerhalb einer Funktion (z.B. innerhalb
    // verschiedener if-else-Zweige) geben. Das wird aber schnell unübersichtlich. Es ist gilt
    // als guter Stil, in der Regel nur eine Return-Anweisung ganz am Ende der Funktion zu verwenden.
    return name;
  }
    
  
  // Funktion main().
  // Diese Funktion wird bei der Ausführung des Java-Programms automatisch aufgerufen.
  public static void main(String[] args)
  {
    System.out.println("Möge das völlig sinnfreie Spiel beginnen.");
    System.out.println("Es ist ein Spiel für drei Personen.");

    // Nachfolgend werden die Spieler begrüßt und deren Namen erfragt.
    // Der Rückgabewert der Funktion wird jeweils einer Variablen zugewiesen.
    
    String name_spieler1 = begruesseSpieler(1);
    String name_spieler2 = begruesseSpieler(2);
    String name_spieler3 = begruesseSpieler(3);

    // Nun gehen die innerhalb der Funktion eingelesenen Werte nicht mehr "verloren", 
    // sondern können in der Funktion main() weiter verwendet werden.
    
    System.out.println();
    System.out.println(name_spieler1 + ", " + name_spieler2 + " und " + name_spieler3 + 
                       " spielen also mit.");
    
    System.out.println();
    System.out.println("Game over.");
  }
}