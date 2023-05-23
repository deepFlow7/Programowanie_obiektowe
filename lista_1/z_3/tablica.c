#include <stdio.h>
#include <stdlib.h>
#include <stdbool.h>
#include "tablica.h"

void wypisz_typ(typ a)
{
    printf("%d",a);
}
int max(int a,int b)
{
    if(a>b)
        return a;
    return b;
}
Tablica *nowa_tablica()
{
    Tablica *t=malloc(sizeof(Tablica));
    if (t==NULL)
    {
        printf("Memory not allocated.\n");
        exit(1);
    }
    t->rozmiar=0;
    return t;
}
void dodaj_pierwszy(Tablica *t, int pozycja, typ nowy_element)
{
    typ *p=malloc(sizeof(typ));
    if (p==NULL)
        printf("Memory not allocated.\n");
    else
    {
        *p=nowy_element;
        t->tab=p;
        t->pierwszy_indeks=pozycja;
        t->rozmiar++;
    }
}
bool powieksz(Tablica *t, int pozycja)
{
    int dodatkowe_elementy=(max(t->pierwszy_indeks-pozycja,0)+max(pozycja-(t->pierwszy_indeks+t->rozmiar-1),0));

    int nowy_rozmiar=t->rozmiar+dodatkowe_elementy;
    typ *p;
    p=realloc(t->tab,nowy_rozmiar*sizeof(typ));
    if (p==NULL)
    {
        printf("Memory not allocated.\n");
        return 0;
    }
    t->tab=p;
    return 1;
}
void wypelnij(Tablica *t, int pozycja, typ nowy_element)
{
    int przed_pierwszym=max(t->pierwszy_indeks-pozycja,0);
    int ostatni_indeks=t->pierwszy_indeks+t->rozmiar-1;
    int za_ostatnim=max(pozycja-ostatni_indeks,0);

    for(int i=1; i<=t->rozmiar; i++)
        t->tab[(t->rozmiar-i)+przed_pierwszym]=t->tab[t->rozmiar-i];

    for(int i=1; i<=przed_pierwszym; i++)
        t->tab[i-1]=domyslna;

    for(int i=1; i<=za_ostatnim; i++)
        t->tab[przed_pierwszym+t->rozmiar+i-1]=domyslna;

    if(pozycja<t->pierwszy_indeks)
        t->pierwszy_indeks=pozycja;
    t->rozmiar+=przed_pierwszym+za_ostatnim;
    t->tab[pozycja-t->pierwszy_indeks]=nowy_element;
}
void dodaj(Tablica *t, int pozycja, typ nowy_element)
{
    if(t->rozmiar==0)
        dodaj_pierwszy(t,pozycja,nowy_element);
    else
    {
        int ostatni_indeks=t->pierwszy_indeks+t->rozmiar-1;
        if(pozycja>=t->pierwszy_indeks && pozycja<=ostatni_indeks)
            t->tab[pozycja-t->pierwszy_indeks]=nowy_element;
        else if(powieksz(t,pozycja)==1)
            wypelnij(t,pozycja,nowy_element);
    }
}
typ indeks(Tablica *t, int pozycja)
{
    if(pozycja<t->pierwszy_indeks || pozycja>t->pierwszy_indeks+t->rozmiar-1)
    {
        printf("Nieprawidlowy indeks (zwracana wartosc domyslna)\n");
        return domyslna;
    }
    else
        return t->tab[pozycja-t->pierwszy_indeks];
}
void show(Tablica *t)
{
    printf("Tablica :\n");
    for(int i=1; i<=t->rozmiar; i++)
    {
        printf("[%d] : ",t->pierwszy_indeks+i-1);
        wypisz_typ(t->tab[i-1]);
        if(i!=t->rozmiar)
            printf(", ");
    }
    putchar('\n');
    putchar('\n');
}
