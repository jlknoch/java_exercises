/**
[Ergänzen Sie hier eine Beschreibung.]
@author Matthias Ebert
@version 1.0
*/

public class Hauptprogramm
{
  public static void main(String[] args)
  {
    int a = Input.readInt("a = ");
    int b = Input.readInt("b = ");
    
    while (a != b)
    {
      if (a < b)
      {
        b = b - a;
      }
      else
      {
        a = a - b;
      }
    }
    
    System.out.println("Ergebnis = " + a);
  }
}
