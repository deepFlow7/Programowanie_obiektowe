#include <stdio.h>
#include <math.h>
#include <stdlib.h>
#include <limits.h>
#include "ulamki.h"

int nwd(int a, int b)
{
    a=abs(a);
    b=abs(b);
    if(a>b)
    {
        int pom=a;
        a=b;
        b=pom;
    }
    if(a==0) return b;
    return nwd(b%a,a);
}
Ulamek *nowy_ulamek(int num, int denom)
{
    if(denom==0)
    {
        printf("Mianownik nie moze byc rowny 0/n");
        exit(1);
    }
    if(denom<0)
    {
        denom*=-1;
        num*=-1;
    }
    Ulamek *u=malloc(sizeof(Ulamek));
    int nwd_1=nwd(num,denom);
    u->licznik=num/nwd_1;
    u->mianownik=denom/nwd_1;
    return u;
}
void show_ulamek(Ulamek *u)
{
    printf("%d/%d\n",u->licznik,u->mianownik);
}
Ulamek *dodaj_1(Ulamek x,Ulamek y)
{
    int nowy_licznik,nowy_mianownik;
    int nwd_1=nwd(x.mianownik,y.mianownik);
    nowy_licznik=x.licznik*(y.mianownik/nwd_1)+y.licznik*(x.mianownik/nwd_1);
    nowy_mianownik=x.mianownik/nwd_1*y.mianownik;
    return nowy_ulamek(nowy_licznik,nowy_mianownik);
}
Ulamek *odejmij_1(Ulamek x,Ulamek y)
{
    return dodaj_1(x,*nowy_ulamek(y.licznik,-y.mianownik));
}
Ulamek *mnozenie_1(Ulamek x,Ulamek y)
{
    int nowy_licznik,nowy_mianownik;
    int nwd1=nwd(x.mianownik,y.licznik);
    int nwd2=nwd(y.mianownik,x.licznik);
    nowy_licznik=(x.licznik/nwd2)*(y.licznik/nwd1);
    nowy_mianownik=(x.mianownik/nwd1)*(y.mianownik/nwd2);
    return nowy_ulamek(nowy_licznik,nowy_mianownik);
}
Ulamek *dzielenie_1(Ulamek x,Ulamek y)
{
    if(y.licznik==0)
    {
        printf("Niedozwolone dzielenie przez 0/n");
        exit(1);
    }
    return mnozenie_1(x,*nowy_ulamek(y.mianownik,y.licznik));
}
void dodaj_2(Ulamek *x,Ulamek *y)
{
    int nwd_1=nwd(x->mianownik,y->mianownik);
    y->licznik=x->licznik*(y->mianownik/nwd_1)+y->licznik*(x->mianownik/nwd_1);
    y->mianownik=x->mianownik/nwd_1*y->mianownik;
}
void odejmij_2(Ulamek *x,Ulamek *y)
{
    y->licznik*=-1;
    dodaj_2(x,y);
}
void mnozenie_2(Ulamek *x,Ulamek *y)
{
    int nwd_1=nwd(x->mianownik,y->licznik);
    int nwd_2=nwd(y->mianownik,x->licznik);
    y->licznik=(x->licznik/nwd_2)*(y->licznik/nwd_1);
    y->mianownik=(x->mianownik/nwd_1)*(y->mianownik/nwd_2);
}
void dzielenie_2(Ulamek *x,Ulamek *y)
{
    if(y->licznik==0)
    {
        printf("Niedozwolone dzielenie przez 0/n");
        exit(1);
    }
    int pom=y->licznik;
    y->licznik=y->mianownik;
    y->mianownik=pom;
    if(y->mianownik<0)
    {
    y->licznik*=-1;
    y->mianownik*=-1;
    }
    mnozenie_2(x,y);
}
