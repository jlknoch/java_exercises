/**
Einf�hrung in Funktionen
@author Matthias Ebert
@version 0.9
*/

public class Hauptprogramm
{
  public static void main(String[] args)
  {
    System.out.println("M�ge das v�llig sinnfreie Spiel beginnen.");
    System.out.println("Es ist ein Spiel f�r drei Personen.");
    
    // Nachfolgend werden die Spieler begr��t und deren Namen erfragt.
    // Jeweils vier Zeilen kommen in fast identischer Form dreimal nacheinander vor.
    // Frage: Wodurch unterscheiden sich die drei "Versionen"? 
    // Antwort: Die drei "Versionen" unterscheiden sich nur hinsichtlich ihrer Ausgabe (Bennenung des Spielers).
    
    System.out.println();
    System.out.println("Guten Tag, Spieler 1!");
    System.out.println("Sch�n, dass du miethspielst.");
    String name_spieler1 = Input.readString("Bitte gib deinen Namen ein: ");

    System.out.println();
    System.out.println("Guten Tag, Spieler 2!");
    System.out.println("Sch�n, dass du miethspielst.");
    String name_spieler2 = Input.readString("Bitte gib deinen Namen ein: ");

    System.out.println();
    System.out.println("Guten Tag, Spieler 3!");
    System.out.println("Sch�n, dass du miethspielst.");
    String name_spieler3 = Input.readString("Bitte gib deinen Namen ein: ");

    // Problem 1:
    // Durch die Copy-Paste-Programmierung wird der Quelltext un�bersichtlich und lang.
    
    // Problem 2:
    // Nehmen wir an, wir wollten einen Tippfehler in einer Zeichenkette korrigieren.
    // Dies m�ssten wir an drei verschiedenen Stellen tun. (Frage: Wo ist der Fehler?)
    // Antwort: Bei der 3. Ausgabe: "miethspielst".

    System.out.println();
    System.out.println(name_spieler1 + ", " + name_spieler2 + " und " + name_spieler3 + 
                       " spielen also mit.");
    
    System.out.println();
    System.out.println("Game over.");
  }
}