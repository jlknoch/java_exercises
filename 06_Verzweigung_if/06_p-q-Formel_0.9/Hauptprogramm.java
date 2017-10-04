/**
Löst quadratische Gleichung x^2 + p * x + q = 0
@author Matthias Ebert
@version 0.9
*/

public class Hauptprogramm
{
  public static void main(String[] args)
  {
    System.out.println("Dieses Programm löst eine quadratische Gleichung");
    System.out.println("der Form x^2 + p * x + q = 0.");

    // Einlesen der Koeffizienten
    double p = Input.readDouble("p = ");
    double q = Input.readDouble("q = ");
    
    // Berechnen von Hilfswert und Diskriminante
    double p_halbe = 0.5 * p;
    double d = p_halbe * p_halbe - q;
    
    // Berechnen der Lösungen
    // Math.sqrt(x) berechnet die Quadratwurzel aus x
    double x1 = -p_halbe + Math.sqrt(d);
    double x2 = -p_halbe - Math.sqrt(d);
    
    // Anzeigen der Lösungen
    System.out.println("x1 = " + x1);
    System.out.println("x2 = " + x2);
  }
}