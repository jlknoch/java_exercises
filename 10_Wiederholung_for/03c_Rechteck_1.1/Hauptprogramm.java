import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 @author Matthias Ebert
 @version 1.1
*/
public class Hauptprogramm
{
  /** Reads an integer number from the console.
      @return number entered by the user */
  public static int readInt()
  {
    int number = 0;
    boolean valid_number = false;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
    do
    {
      try
      {
        number = Integer.parseInt(reader.readLine());
        valid_number = true;
      }
      catch (Exception e)
      {
        System.out.println("Bitte gib eine ganze Zahl ein.");
      }
    }
    while (!valid_number);
    
    return number;
  }
  
  /** Zeichnet eine Zeile des Rahmens.
      @param breite Breite der Zeile
      @param zeichen_rand Zeichen am linken und rechten Rand der Zeile
      @param zeichen_mitte Zeichen in der Mitte der Zeile */
  public static void zeichneZeile(int breite, char zeichen_rand, char zeichen_mitte)
  {
    System.out.print(zeichen_rand);
    for (int spalte = 2; spalte <= breite - 1; spalte++)
    {
      System.out.print(zeichen_mitte);
    }
    System.out.println(zeichen_rand);    
  }
  
  /** Liest Breite und Höhe eines Rechtsecks von der Konsole ein und
      zeichnet einen Rahmen aus + - | in dieser Größe.
      @param args not used */
  public static void main(String[] args)
  {
    int breite = 0;
    int hoehe = 0;
    
    // Einlesen der Breite des Rechtecks von der Konsole
    while (breite < 2)
    {
      System.out.print("Geben Sie die Breite des Rechtecks ein: ");
      breite = readInt();
      
      if (breite < 2)
      {
        System.out.println("Die Breite muss mindestens 2 betragen.");
      }
    }
      
    // Einlesen der Höhe des Rechtecks von der Konsole
    while (hoehe < 2)
    {
      System.out.print("Geben Sie die Höhe des Rechtecks ein: ");
      hoehe = readInt();
      
      if (hoehe < 2)
      {
        System.out.println("Die Höhe muss mindestens 2 betragen.");
      }
    }
    
    System.out.println();
    
    // Zeichnen der ersten Zeile
    zeichneZeile(breite, '+', '-');
    
    // Zeichnen der mittleren Zeilen
    for (int zeile = 2; zeile <= hoehe - 1; zeile++)
    {
      zeichneZeile(breite, '|', ' ');
    }

    // Zeichnen der letzten Zeile
    zeichneZeile(breite, '+', '-');
  }
}