/**
Einf�hrung in die Verzweigung ohne Alternative
@author Matthias Ebert
@version 1.0
*/

public class Hauptprogramm
{
  public static void main(String[] args)
  {
    System.out.println("M�ge das Spiel beginnen.");

    // Frage Benutzer nach dem aktuellen Level
    int level = Input.readInt("In welchem Level bist du gerade? ");

    // Wenn die Variable namens "level" den Wert 1 hat, ...
    if (level == 1)
    {
      // ... dann tue Folgendes:
      System.out.println("Du bist immer noch im ersten Level?");
      System.out.println("Dann strenge dich doch etwas mehr an!");
    }
    
    System.out.println("Game over.");
  }
}