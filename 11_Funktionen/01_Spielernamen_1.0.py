# Zweck:   Einführung in Funktionen 
# Autor:   M. Ebert
# Datum:   31.03.2014
# Version: 1.0



# begruesse_spieler()
#
# Begrüßt einen Spieler.

def begruesse_spieler():
  print("Guten Tag!")
  print("Schön, dass du auch mitspielst.")



# Hauptprogramm

begruesse_spieler()
name1 = input("Bitte gib deinen Namen ein: ")

begruesse_spieler()
name2 = input("Bitte gib deinen Namen ein: ")

begruesse_spieler()
name3 = input("Bitte gib deinen Namen ein: ")

print(name1, ", ", name2, " und ", name3, " spielen also mit.", sep="")
