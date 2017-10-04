/**
Einführung in die Verzweigung mit switch 
@author Matthias Ebert
@version 1.0
*/


public class Hauptprogramm
{
  public static void main(String[] args)
  {
    int note = Input.readInt("Note (1 bis 6): ");
    String note_als_text = "";
    
    switch (note)
    {
      case 1:
        note_als_text = "Sehr gut";
        break;
        
      case 2:
        note_als_text = "Gut";
        break;
        
      case 3:
        note_als_text = "Befriedigend";
        break;
        
      case 4:
        note_als_text = "Ausreichend";
        break;
        
      case 5:
        note_als_text = "Mangelhaft";
        break;
        
      case 6:
        note_als_text = "Ungenügend";
        break;
        
      default:
        System.out.print("Fehler: Ungültige Note");
    }
    
    System.out.println(note_als_text);
  }
}