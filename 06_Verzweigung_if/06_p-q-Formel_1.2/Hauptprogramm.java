/**
L�st quadratische Gleichung x^2 + p * x + q = 0
@author Matthias Ebert
@version 1.2
*/

public class Hauptprogramm
{
  public static void main(String[] args)
  {
    System.out.println("Dieses Programm l�st eine quadratische Gleichung");
    System.out.println("der Form x^2 + p * x + q = 0.");
    
    // Einlesen der Koeffizienten
    double p = Input.readDouble("p = ");
    double q = Input.readDouble("q = ");
    
    // Berechnen von Hilfswert und Diskriminante
    double p_halbe = 0.5 * p;
    double d = p_halbe * p_halbe - q;
    
    // Ist die Diskriminante negativ?
    if (d < 0)
    {
      System.out.println("Die Gleichung hat keine reellen L�sungen.");
    }
    else
    {
      if (d == 0)
      {
        // Berechnen der einen L�sung
        double x = -p_halbe;
        
        // Anzeigen der L�sung
        System.out.println("x1 = x2 = " + x);
      }
      else
      {
        // Berechnen der L�sungen
        double x1 = -p_halbe + Math.sqrt(d);
        double x2 = -p_halbe - Math.sqrt(d);
    
        // Anzeigen der L�sungen
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
      }
    }
  }
}