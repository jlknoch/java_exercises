# Zweck:   Einführung in Funktionen 
# Autor:   M. Ebert
# Datum:   31.03.2014
# Version: 2.0



# begruesse_spieler()
#
# Begrüßt einen Spieler.
#
# Parameter:
# spieler_nr   int   Nummer des Spielers

def begruesse_spieler(spieler_nr):
  print("Guten Tag, Spieler ", spieler_nr, "!", sep="")
  print("Schön, dass du auch mitspielst.")



# Hauptprogramm

begruesse_spieler(1)
name1 = input("Bitte gib deinen Namen ein: ")

begruesse_spieler(2)
name2 = input("Bitte gib deinen Namen ein: ")

begruesse_spieler(3)
name3 = input("Bitte gib deinen Namen ein: ")

print(name1, ", ", name2, " und ", name3, " spielen also mit.", sep="")
