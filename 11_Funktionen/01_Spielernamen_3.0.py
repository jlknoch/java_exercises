# Zweck:   Einführung in Funktionen 
# Autor:   M. Ebert
# Datum:   31.03.2014
# Version: 3.0



# begruesse_spieler()
#
# Begrüßt einen Mitspieler und liest seinen Namen ein.
#
# Parameter:
# spieler_nr   int   Nummer des Spielers
#
# Rückgabewert:
# str   Name der Spielers

def begruesse_spieler(spieler_nr):
  print("Guten Tag, Spieler ", spieler_nr, "!", sep="")
  print("Schön, dass du auch mitspielst.")
  name = input("Bitte gib deinen Namen ein: ")
  return name



# Hauptprogramm

name1 = begruesse_spieler(1)
name2 = begruesse_spieler(2)
name3 = begruesse_spieler(3)

print(name1, ", ", name2, " und ", name3, " spielen also mit.", sep="")
