# Zweck:   Übung zu Funktionen
# Autor:   M. Ebert
# Datum:   29.04.2014
# Version: 0.9



# Arbeitsauftrag:
#
# Verbessern Sie den Quelltext, indem Sie eine geeignete Funktion einführen.
# Denken Sie an die Dokumentation.



# schreibe_zeile()
#
# Schreibt eine Zeile aus Sternen auf die Konsole.
#
# Parameter:
# breite   int   Anzahl der Sterne in der Zeile
#
# Rückgabewert:
# keiner

def schreibe_zeile(breite):
  for x in range(0, breite):
    print("*", end="")
  print()
  


# Hauptprogramm

print("Dieses Programm zeichnet ein Rechteck.")
print("Bitte geben Sie die Breite und die Höhe ein.")

breite = int(input("Breite = "))
hoehe  = int(input("Höhe   = "))

if breite < 2:
  print("Die Breite muss mindestens 2 sein.")
else:
  if hoehe < 2:
    print("Die Höhe muss mindestens 2 sein.")
  else:
    
    # Erste Zeile
    schreibe_zeile(breite)
    
    # Zweite bis vorletzte Zeile
    for y in range(0, hoehe - 2):
      print("*", end="")
      for x in range(0, breite - 2):
        print(" ", end="")
      print("*")

    # Letzte Zeile
    schreibe_zeile(breite)
