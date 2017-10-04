/**
Umwandeln von Notenpunkten in eine Zeugnisnote
@author Matthias Ebert
@version 2.0
*/

public class Hauptprogramm
{
  public static void main(String[] args)
  {
    // Einlesen der Einzelnoten
    System.out.println("Bitte geben Sie die erzielten Notenpunkte ein.");
    int note_klausur_1 = Input.readInt("Ergebnis der ersten Klausur:  ");
    int note_klausur_2 = Input.readInt("Ergebnis der zweiten Klausur: ");
    int note_muendlich = Input.readInt("Mündliche Leistung:           ");

    // Berechnen der Endnote
    double note_schriftlich = 0.5 * (note_klausur_1 + note_klausur_2);
    double endnote_dezimal = 0.75 * note_schriftlich + 0.25 * note_muendlich;
  int endnote_gerundet = (int) Math.round(endnote_dezimal);
    
    // Unwandeln der Notenpunkte in den zugehörigen Text
    String endnote_als_text = "";
    if (endnote_gerundet > 15)
    {
      endnote_als_text = "Fehler!";
    }
    else if (endnote_gerundet >= 13)
    {
      endnote_als_text = "sehr gut";
    }
    else if (endnote_gerundet >= 10)
    {
      endnote_als_text = "gut";
    }
    else if (endnote_gerundet >= 7)
    {
      endnote_als_text = "befriedigend";
    }
    else if (endnote_gerundet >= 4)
    {
      endnote_als_text = "ausreichend";
    }
    else if (endnote_gerundet >= 1)
    {
      endnote_als_text = "mangelhaft";
    }
    else if (endnote_gerundet == 0)
    {
      endnote_als_text = "ungenügend";
    }
    else // notenpunkte < 0
    {
      endnote_als_text = "Fehler!";
    }
    
    // Anzeigen der Endnote
    System.out.print("Endnote: ");
    System.out.print(endnote_gerundet + " NP | ");
    System.out.println(endnote_als_text);
  }
}