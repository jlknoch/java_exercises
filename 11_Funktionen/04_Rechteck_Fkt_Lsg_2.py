# Zweck:   Übung zu Funktionen
# Autor:   M. Ebert
# Datum:   29.04.2014
# Version: 2.0



# Arbeitsauftrag:
#
# Verbessern Sie den Quelltext, indem Sie eine geeignete Funktion einführen.
# Denken Sie an die Dokumentation.



# schreibe_zeile()
#
# Schreibt eine Zeile als Teil eines Rahmens auf die Konsole.
#
# Parameter:
# breite         int   Gesamtanzahl der Symbole in der Zeile
# symbol_rand    str   Symbol am Rand der Zeile (sollte nur 1 Zeichen sein!)
# symbol_mitte   str   Symbol in der Mitte der Zeile (nur 1 Zeichen!)
#
# Rückgabewert:
# keiner

def schreibe_zeile(breite, symbol_rand, symbol_mitte):
  print(symbol_rand, end="")
  for x in range(0, breite - 2):
    print(symbol_mitte, end="")
  print(symbol_rand)



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
    schreibe_zeile(breite, "*", "*")
    
    # Zweite bis vorletzte Zeile
    for y in range(0, hoehe - 2):
      schreibe_zeile(breite, "*", " ")

    # Letzte Zeile
    schreibe_zeile(breite, "*", "*")
