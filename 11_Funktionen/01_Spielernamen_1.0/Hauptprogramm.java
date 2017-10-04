/**
Einf�hrung in Funktionen
@author Matthias Ebert
@version 1.0
*/

public class Hauptprogramm
{
  // Der wiederholt auftretende Teil des Quelltextes wird in eine sogenannte Funktion ausgelagert.
  // Diese Funktion wird an dieser Stelle (innerhalb der Klasse Hauptprogramm) DEFINIERT.
  public static void begruesseSpieler()
  {
    System.out.println();
    System.out.println("Guten Tag, Spieler 1!");
    System.out.println("Sch�n, dass du mitspielst.");
    String name_spieler1 = Input.readString("Bitte gib deinen Namen ein: ");
  }
    
  
  // Funktion main().
  // Diese Funktion wird bei der Ausf�hrung des Java-Programms automatisch aufgerufen.
  public static void main(String[] args)
  {
    System.out.println("M�ge das v�llig sinnfreie Spiel beginnen.");
    System.out.println("Es ist ein Spiel f�r drei Personen.");
    
    String name_spieler1 = "Unbekannt";
    String name_spieler2 = "Unbekannt";
    String name_spieler3 = "Unbekannt";
    
    // Nachfolgend werden die Spieler begr��t und deren Namen erfragt.
    // Dazu wird die oben definierte Funktion dreimal in Folge AUFGERUFEN.

    begruesseSpieler();
    begruesseSpieler();
    begruesseSpieler();

    // Der Code im Hauptprogramm ist nun viel k�rzer und �bersichtlicher.
    // Dazu ist es wichtig, den Namen der Funktion geeignet zu w�hlen, damit man anhand
    // dieses Namens eine m�glichst genaue Vorstellung davon bekommt, was die Funktion tut.
    // In der Regel sollte der Name einer Funktion mit einem Verb beginnen.
    
    // Durch unsere L�sung haben wir aber zwei neue Probleme kreiert.
    
    // Problem 1:
    // Alle drei Spieler werden nun mit "Spieler 1" angeredet.
    
    // Problem 2:
    // Die eingelesenen Namen sind im Hauptprogramm nicht mehr zug�nglich.
    // Variablen, die innerhalb einer Funktion definiert werden, sind auch nur dort g�ltig
    // (vgl. auch den G�ltigkeitsbereich zwischen { und } bei Kontrollstrukturen).

    System.out.println();
    System.out.println(name_spieler1 + ", " + name_spieler2 + " und " + name_spieler3 + 
                       " spielen also mit.");
    
    System.out.println();
    System.out.println("Game over.");
  }
}