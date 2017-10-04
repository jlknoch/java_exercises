/**
Umwandeln von Notenpunkten in eine Zeugnisnote
@author Matthias Ebert
@version 1.1
*/

public class Hauptprogramm
{
  public static void main(String[] args)
  {
    // Einlesen der Anzahl der Notenpunkte
    int notenpunkte = Input.readInt("Anzahl der Notenpunkte: ");

    // Unwandeln der Notenpunkte in den zugehörigen Text
    String note_als_text = "";
    if (notenpunkte > 15)
    {
      note_als_text = "Fehler!";
    }
    else if (notenpunkte >= 13)
    {
      note_als_text = "sehr gut";
    }
    else if (notenpunkte >= 10)
    {
      note_als_text = "gut";
    }
    else if (notenpunkte >= 7)
    {
      note_als_text = "befriedigend";
    }
    else if (notenpunkte >= 4)
    {
      note_als_text = "ausreichend";
    }
    else if (notenpunkte >= 1)
    {
      note_als_text = "mangelhaft";
    }
    else if (notenpunkte == 0)
    {
      note_als_text = "ungenügend";
    }
    else // notenpunkte < 0
    {
      note_als_text = "Fehler!";
    }
    
    // Anzeigen der Note als Text
    System.out.println("Note: " + note_als_text);
  }
}