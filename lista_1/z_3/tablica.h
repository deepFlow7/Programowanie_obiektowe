typedef int typ;
#define domyslna 0;

typedef struct tablica
{
    typ *tab;
    int rozmiar;
    int pierwszy_indeks;
} Tablica;

void wypisz_typ(typ a);
Tablica *nowa_tablica();
void dodaj(Tablica *t, int pozycja, typ nowy_element);
typ indeks(Tablica *t, int pozycja);
void show(Tablica *t);
