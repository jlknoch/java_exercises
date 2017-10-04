/**
Überprüfen einer Datumseingabe
@author Matthias Ebert
@version 1.0
*/

public class Hauptprogramm
{
  public static void main(String[] args)
  {
    int day   = Input.readInt("Tag   (tt):   ");
    int month = Input.readInt("Monat (mm):   ");
    int year  = Input.readInt("Jahr  (jjjj): ");
    
    int num_days = 0;
    
    switch (month)
    {
      case  1:
      case  3:
      case  5:
      case  7:
      case  8:
      case 10:
      case 12:
        num_days = 31;
        break;
        
      case  4:
      case  6:
      case  9:
      case 11:
        num_days = 30;
        break;
        
      case 2:
        num_days = 28;
        break;
    }
  
    if (day >= 1 && day <= num_days && 
        month >= 1 &&  month <= 12)
    {
      System.out.println("Gültige Eingabe.");
    }
    else
    {
      System.out.println("Ungültige Eingabe.");
    }
  }
}
