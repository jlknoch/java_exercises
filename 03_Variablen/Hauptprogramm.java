/**
Einf¸hrung in den Gebrauch von Variablen
@author Matthias Ebert
@version 1.0
*/

public class Hauptprogramm
{
  public static void main(String[] args)
  {
    // Hier wird eine Variable mit dem Namen a definiert.
    // Sie hat den Datentyp int (integer number, ganze Zahl).
    // Sie bekommt anfangs den Wert 5 zugewiesen (Initialisierung).
    int a = 5;
    
    // Der Wert der Variablen wird angezeigt.
    System.out.println(a);
    
    // Die Variable bekommt einen neuen Wert zugewiesen.
    // In Java steht das Gleichheitszeichen f¸r eine Zuweisung.
    // Dabei erh‰lt die Variable auf der linken Seite den Wert des
    // Ausdrucks auf der rechten Seite. Der Wert, der vorher in der
    // Variablen a gespeichert war, geht dabei "verloren".
    a = 7;
    
    // Und hier gleich noch eine Zuweisung.
    // Daf¸r muss der Wert des Ausdrucks auf der rechten Seite zun‰chst 
    // berechnet werden.
    a = 4 * 5 - 6 / 2 + 1;
    
    // Der aktuelle Wert von a wird wieder angezeigt.
    System.out.println(a);
    
    // AUFGABE 1
    // Was passiert bei der folgenden Zuweisung?
    a = a - 1;
    
    // Der aktuelle Wert von a wird wieder angezeigt.
    System.out.println(a);
    
    // Der Wert welcher bei der vorherigen Rechenfunktion ausgrechnet wurde
    // wird mit 1 subtrahiert.
    
    // Hier werden zwei weitere Variablen definiert und initialisiert.
    // Der Name einer Variablen muss immer mit einem Buchstaben beginnen.
    // Er kann aber auch Ziffern und Unterstriche enthalten.
    // Andere Sonderzeichen sind grˆﬂtenteils nicht erlaubt.
    // Umlaute sollten beim Programmieren immer vermieden werden.
    // Groﬂ- und Kleinschreibung werden unterschieden.
    // Bis auf Weiteres sollten Variablennamen nur Kleinbuchstaben enthalten.
    int anzahl_personen = 30;
    int anzahl_gruppen = 10;
    int gruppen_groesse = anzahl_personen / anzahl_gruppen;
    
    // Der Wert der Variablen gruppen_groesse wird angezeigt.
    System.out.println(gruppen_groesse);
    
    // AUFGABE 2
    // Welche Bedeutung kˆnnten die folgenden Datentypen haben?
    double x = 34.234;
    String vorname = "Matthias";
    boolean b1 = x > 30;
    boolean b2 = vorname == "Ebert";
    
    // String enth‰lt mehr Werte als z.B. boolean oder double -> Groﬂ geschrieben
    // und nicht in rot
    
    // Anzeigen der Werte von x, vorname, b1 und b2
    System.out.println(x);
    System.out.println(vorname);
    System.out.println(b1);
    System.out.println(b2);
  }
}