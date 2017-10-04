# Zweck:   Einführung in Funktionen | Maximum-Funktion
# Autor:   M. Ebert
# Datum:   27.06.2016
# Version: 1.0



# Arbeitsauftrag:
#
# a) Implementieren Sie die Funktion berechneMaximum().
#    Ergänzen Sie auch den Kommentar oberhalb ihrer Definition.
#
# b) Testen Sie die Funktion anhand verschiedener Kombinationen zweier Zahlen.
#    Beachten Sie dabei auch mögliche Sonderfälle.
#
# c) Schreiben Sie einen Befehl im Hauptprogramm, der das Maximum der
#    drei Zahlen 7, 17 und 5 bestimmt. Verwenden Sie dabei nur die bereits
#    definierte Funktion mit den zwei Parametern.



# berechneMaximum()
#
# Bestimmt das Maximum von a und b und gibt es zurück.
#
# Parameter:
# a   float   erste Zahl
# b   float   zweite Zahl
#
# Rückgabewert:
# float   Maximum der beiden Zahlen

def berechneMaximum(a, b):

  maxi = a

  if (b > maxi):
    maxi = b

  return maxi



# Hauptprogramm

# Einlesen der Zahlen
x = float(input("x = "))
y = float(input("y = "))

# Rükgabewert der Funktion berechneMaximum() wird der Variablen m zugewiesen.
m = berechneMaximum(x, y)

# Der Wert von m wird anschließend mit print() angezeigt.
print()
print("Das Maximum von ", x, " und ", y, " ist ", m, ".", sep="")

# So geht es auch:
# Der Rückgabewert der Funktion berechneMaximum() wird direkt in der Funktion
# print() verwendet.
print()
print(berechneMaximum(x, y))
