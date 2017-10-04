/**
Einf�hrung in Funktionen
@author Matthias Ebert
@version 3.0
*/

public class Hauptprogramm
{
  // Die Funktion bekommt einen R�CKGABEWERT, der an die aufrufende Stelle "�bermittelt" wird.
  // Der DATENTYP des R�ckgabewertes wird vor dem Namen der Funktion angegeben.
  // Die Angabe void (in den bisherigen Versionen) bedeutet, dass die Funktion keinen Wert
  // an die aufrufende Stelle zur�ckgibt.
  public static String begruesseSpieler(int spieler_nummer)
  {
    System.out.println();
    System.out.println("Guten Tag, Spieler " + spieler_nummer + "!");
    System.out.println("Sch�n, dass du mitspielst.");
    String name = Input.readString("Bitte gib deinen Namen ein: ");
    
    // Durch die RETURN-ANWEISUNG wird der angegebene Wert an die aufrufende Stelle "�bermittelt".
    // Dabei springt das Programm aus der Funktion heraus, das hei�t, dass Befehle, die danach
    // folgen, nicht mehr ausgef�hrt werden.
    // Theoretisch kann es auch mehrere Return-Anweisungen innerhalb einer Funktion (z.B. innerhalb
    // verschiedener if-else-Zweige) geben. Das wird aber schnell un�bersichtlich. Es ist gilt
    // als guter Stil, in der Regel nur eine Return-Anweisung ganz am Ende der Funktion zu verwenden.
    return name;
  }
    
  
  // Funktion main().
  // Diese Funktion wird bei der Ausf�hrung des Java-Programms automatisch aufgerufen.
  public static void main(String[] args)
  {
    System.out.println("M�ge das v�llig sinnfreie Spiel beginnen.");
    System.out.println("Es ist ein Spiel f�r drei Personen.");

    // Nachfolgend werden die Spieler begr��t und deren Namen erfragt.
    // Der R�ckgabewert der Funktion wird jeweils einer Variablen zugewiesen.
    
    String name_spieler1 = begruesseSpieler(1);
    String name_spieler2 = begruesseSpieler(2);
    String name_spieler3 = begruesseSpieler(3);

    // Nun gehen die innerhalb der Funktion eingelesenen Werte nicht mehr "verloren", 
    // sondern k�nnen in der Funktion main() weiter verwendet werden.
    
    System.out.println();
    System.out.println(name_spieler1 + ", " + name_spieler2 + " und " + name_spieler3 + 
                       " spielen also mit.");
    
    System.out.println();
    System.out.println("Game over.");
  }
}