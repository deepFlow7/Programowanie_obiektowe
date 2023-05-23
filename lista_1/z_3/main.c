#include <stdio.h>
#include <stdlib.h>
#include "tablica.h"

void wypisz_z_pozycji(Tablica *t, int poz)
{
    typ z_pozycji=indeks(t,poz);
    printf("Pod indeksem %d znajduje sie ",poz);
    wypisz_typ(z_pozycji);
    putchar('\n');
    putchar('\n');
}

int main()
{
    Tablica *t=nowa_tablica();

    dodaj(t,0,8);
    dodaj(t,3,3);
    dodaj(t,-5,99);

    show(t);

    wypisz_z_pozycji(t,31);
    wypisz_z_pozycji(t,-1);

    return 0;
}
