/**
Einführung in die Verzweigung mit switch 
@author Matthias Ebert
@version 1.0
*/


public class Hauptprogramm
{
  public static void main(String[] args)
  {
    int note = Input.readInt("Notenpunkte (0 bis 15): ");
    String note_als_text = "";
    
    switch (note)
    {
      case 15:
      case 14:
      case 13:
        note_als_text = "Sehr gut";
        break;
        
      case 12:
      case 11:
      case 10:
        note_als_text = "Gut";
        break;
        
      case 9:
      case 8:
      case 7:
        note_als_text = "Befriedigend";
        break;
        
      case 6:
      case 5:
      case 4:
        note_als_text = "Ausreichend";
        break;
        
      case 3:
      case 2:
      case 1:
        note_als_text = "Mangelhaft";
        break;
        
      case 0:
        note_als_text = "Ungenügend";
        break;
        
      default:
        System.out.print("Fehler: Ungültige Note");
    }
    
    System.out.println(note_als_text);
  }
}