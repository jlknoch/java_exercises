/**
Beispiel f�r das Einlesen von Werten von der Konsole
@author Matthias Ebert
@version 0.9
*/

public class Hauptprogramm
{
  public static void main(String[] args)
  {
    Input.readString("Wie hei�t du?                 ");
    Input.readInt("Wie alt bist du? (in Jahren)  ");
    Input.readDouble("Wie gro� bist du? (in Meter)  ");
  }
}