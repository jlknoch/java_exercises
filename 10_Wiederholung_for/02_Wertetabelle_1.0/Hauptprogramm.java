/**
Wertetabelle für f mit f(x) = x^2
@author Matthias Ebert
@version 1.0
*/


public class Hauptprogramm
{
  public static void main(String[] args)
  {
    System.out.println("Wertetabelle für f mit f(x) = x^2");
    
    for (double x = 0.0; x <= 6.0; x = x + 0.5)
    {
      double y = x * x;
      System.out.println("x = " + x + ", y = " + y);
    }
  }
}