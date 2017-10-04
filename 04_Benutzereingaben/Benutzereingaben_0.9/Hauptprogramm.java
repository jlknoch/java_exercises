/**
Beispiel für das Einlesen von Werten von der Konsole
@author Matthias Ebert
@version 0.9
*/

public class Hauptprogramm
{
  public static void main(String[] args)
  {
    Input.readString("Wie heißt du?                 ");
    Input.readInt("Wie alt bist du? (in Jahren)  ");
    Input.readDouble("Wie groß bist du? (in Meter)  ");
  }
}