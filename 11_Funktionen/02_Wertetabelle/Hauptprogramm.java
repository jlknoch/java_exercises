/**
Anzeigen einer Wertetabelle für eine (mathematische) Funktion
@author Matthias Ebert
@version 1.0
*/


public class Hauptprogramm
{
  /** 
  Berechnet den Funktionswert von f mit f(x) = x^2 - 2 x + 1.
  @param x Argument der Funktion f
  @return Funktionswert der Funktion f
  */
  public static double f(double x)
  {
    return x * x - 2 * x + 1;
  }
    
  
  /**
  Hauptprogramm
  @param args Liste der Parameter, die beim Programmaufruf angegeben werden
  */
  public static void main(String[] args)
  {
    double start = Input.readDouble("Startwert    = ");
    double stop  = Input.readDouble("Endwert      = ");
    double step  = Input.readDouble("Schrittweite = ");
      
    System.out.println();
    System.out.println("   x    |     y   ");
    System.out.println("--------+---------");
    
    for (double x = start; x <= stop; x += step)
    {
      double y = f(x);
      
      System.out.format("%6.2f  |  %6.2f\n", x, y);
    }
  }
}