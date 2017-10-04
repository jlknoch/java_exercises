/**
Anzeigen der Folge der Fibonacci-Zahlen
@author Matthias Ebert
@version 1.0
*/

public class Hauptprogramm
{
  public static void main(String[] args)
  {
    int obergrenze = Input.readInt("Obergrenze = ");
    
    int a = 1;
    int b = 1;
    
    while (a < obergrenze)
    {
      System.out.print(a + "; ");

      b = a + b;
      a = b - a;
    }
    
    System.out.println("...");
  }
}
