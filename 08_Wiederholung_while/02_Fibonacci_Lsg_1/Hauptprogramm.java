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
    
    int a = 0;
    int b = 1;
    int c = 1;
    
    while (c < obergrenze)
    {
      System.out.print(c + "; ");
      c = a + b;
      a = b;
      b = c;
    }
    
    System.out.println("...");
  }
}
