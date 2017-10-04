import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 @author Matthias Ebert
 @version 1.0
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
  
  /** Liest Breite und Höhe eines Rechtsecks von der Konsole ein und
      zeichnet ein ausgefülltes Rechteck aus Sternen in dieser Größe.
      @param args not used */
  public static void main(String[] args)
  {
    // Einlesen der Breite des Rechtecks von der Konsole
    System.out.print("Geben Sie die Breite des Rechtecks ein: ");
    int breite = readInt();
      
    // Einlesen der Höhe des Rechtecks von der Konsole
    System.out.print("Geben Sie die Höhe des Rechtecks ein: ");
    int hoehe = readInt();

    System.out.println();

    // Zeichnen des ausgefüllten Rechtecks aus Sternen
    for (int zeile = 1; zeile <= hoehe; zeile++)
    {
      for (int spalte = 1; spalte <= breite; spalte++)
      {
        System.out.print('*');
      }
      
      System.out.println();
    }
  }
}