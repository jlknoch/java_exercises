/**
Berechnung des Maximums zweier/dreier Zahlen
@author Matthias Ebert
@version 0.9
*/


// AUFGABEN

// 1) Implementieren Sie die Funktion berechneMaximum().
//    Passen Sie die Return-Anweisung in geeigneter Weise an.

// 2) Erweitern Sie die Funktion main() so, dass das Maximum dreier Zahlen bestimmt wird.
//    Verwenden Sie dabei ausschließlich die unveränderte Funktion berechneMaximum().


public class Hauptprogramm
{
  /** 
  Berechnet das Maximum zweier Zahlen.
  @param x erste Zahl
  @param y zweite Zahl
  @return Maximum von x und y
  */
  public static double berechneMaximum(double x, double y)
  {
       if (x > y) {
           return x;  
        }
        else {
           return y;
        }
  }
    
  
  /**
  Hauptprogramm
  @param args Liste der Parameter, die beim Programmaufruf angegeben werden
  */
  public static void main(String[] args)
  {
    double a = Input.readInt("a = ");
    double b = Input.readInt("b = ");
    double c = Input.readInt("c = ");
    
    double m = berechneMaximum(a, b);
    double n = berechneMaximum(a, c);
    double o = berechneMaximum(m, n);
    
    System.out.println();
    System.out.format("Das Maximum von %f , %f  und %f ist %f.\n", a, b, c, m);
  }
}