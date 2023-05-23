
typedef struct{
int licznik;
int mianownik;
}Ulamek;

Ulamek *nowy_ulamek(int num, int denom);
void show_ulamek(Ulamek *u);
Ulamek *dodaj_1(Ulamek x,Ulamek y);
Ulamek *odejmij_1(Ulamek x,Ulamek y);
Ulamek *mnozenie_1(Ulamek x,Ulamek y);
Ulamek *dzielenie_1(Ulamek x,Ulamek y);
void dodaj_2(Ulamek *x,Ulamek *y);
void odejmij_2(Ulamek *x,Ulamek *y);
void mnozenie_2(Ulamek *x,Ulamek *y);
void dzielenie_2(Ulamek *x,Ulamek *y);
