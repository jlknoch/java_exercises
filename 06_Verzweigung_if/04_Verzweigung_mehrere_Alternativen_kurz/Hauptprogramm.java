/**
Einführung in die Verzweigung mit mehreren Alternativen
@author Matthias Ebert
@version 1.0
*/

public class Hauptprogramm
{
  public static void main(String[] args)
  {
    System.out.println("Möge das Spiel beginnen.");

    // Frage Benutzer nach dem aktuellen Level
    int level = Input.readInt("In welchem Level bist du gerade? ");

    // Wenn die Variable namens "level" den Wert 1 hat, ...
    if (level == 1)
    {
      // ... dann tue Folgendes:
      System.out.println("Du bist immer noch im ersten Level?");
      System.out.println("Dann strenge dich doch etwas mehr an!");
    }
    // Wenn die Variable namens "level" den Wert 2 hat, ...
    else if (level == 2)
    {
      // ... dann tue Folgendes:
      System.out.println("Super, du hast das erste Level geschafft!");
      System.out.println("Weiter so!");
    }
    // Wenn keine der vorigen Bedingungen zutrifft, ...
    else
    {
      // ... dann tue Folgendes:
      System.out.println("Du hast schon zwei Level geschafft?");
      System.out.println("Ich erblasse vor Neid!");
    }
    
    System.out.println("Game over.");
  }
}