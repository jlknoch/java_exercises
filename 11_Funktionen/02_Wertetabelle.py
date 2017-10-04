# Zweck:   Wertetabelle für eine (mathematische) Funktion
# Autor:   M. Ebert
# Datum:   31.03.2014
# Version: 1.0



# f()
#
# Berechnet das Doppelte der übergebenen Zahl und gibt es zurück.
#
# Parameter:
# x   float   Zahl, für die das Doppelte berechnet werden soll
#
# Rückgabewert:
# float   Doppeltes von x

def f(x):
  y = 2 * x
  return y



# Hauptprogramm

print("x | y")
print("-----")

for x in range (0, 11):
  print(x, "|", f(x))
