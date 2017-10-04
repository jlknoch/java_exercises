/**
Beispiel f¸r das Einlesen von Werten von der Konsole
@author Matthias Ebert
@version 1.0
*/

public class Hauptprogramm
{
  public static void main(String[] args)
  {
    String name = "";
    int alter = 0;
    double groesse = 0;
    
    name = Input.readString("Wie heiﬂt du?                 ");
    alter = Input.readInt("Wie alt bist du? (in Jahren)  ");
    groesse = Input.readDouble("Wie groﬂ bist du? (in Meter)  ");
    
    System.out.println();
    System.out.println("Hallo " + name + "!");
    System.out.print("Du bist also " + alter + " Jahre alt ");
    System.out.println("und " + groesse + " Meter groﬂ.");
  }
}