/**
 Einführung in die do-while-Schleife
 @author Matthias Ebert
 @version 1.0
*/


import java.util.Random;


public class Hauptprogramm
{
  public static void main(String[] args)
  {
    Random generator = new Random();
    int zu_erratende_zahl = generator.nextInt(999) + 1;
    
    System.out.println("Ich habe mir eine Zahl zwischen 1 und 1000 ausgedacht.");
    System.out.println("Deine Aufgabe ist es, die Zahl zu erraten.");
    
    int geratene_zahl = 0;
    
    do
    {
      geratene_zahl = Input.readInt("Dein Tipp? ");
      
      if (geratene_zahl < zu_erratende_zahl)
      {
        System.out.println("Diese Zahl ist zu klein.");
      }
      else if (geratene_zahl > zu_erratende_zahl)
      {
        System.out.println("Diese Zahl ist zu groß.");
      }
    }
    while (geratene_zahl != zu_erratende_zahl);
    
    System.out.println("Glückwunsch. Du hast die Zahl erraten.");
    System.out.println("Es war mir eine Ehre, mit Dir zu spielen.");
    System.out.println("Bis zum nächsten Mal.");
  }
}