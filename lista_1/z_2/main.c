#include <stdio.h>
#include <math.h>
#include "ulamki.h"

void testy_1()
{
    Ulamek x=*nowy_ulamek(5,6);
    Ulamek y=*nowy_ulamek(9,11);

    printf("x : ");
    show_ulamek(&x);
    printf("y : ");
    show_ulamek(&y);

    dodaj_1(x,x);
    putchar('l');
    printf("x + y : ");
    show_ulamek(dodaj_1(x,y));

    printf("x - y : ");
    show_ulamek(odejmij_1(x,y));

    printf("x * y : ");
    show_ulamek(mnozenie_1(x,y));

    printf("x / y : ");
    show_ulamek(dzielenie_1(x,y));
}
void testy_2()
{
    Ulamek *x=nowy_ulamek(222,5);
    Ulamek *y=nowy_ulamek(-1,8);

    printf("x : ");
    show_ulamek(x);
    printf("y : ");
    show_ulamek(y);

    printf("x + y : ");
    dodaj_2(x,y);
    show_ulamek(y);

    y=nowy_ulamek(-1,8);
    printf("x - y : ");
    odejmij_2(x,y);
    show_ulamek(y);

    y=nowy_ulamek(-1,8);
    printf("x * y : ");
    mnozenie_2(x,y);
    show_ulamek(y);

    y=nowy_ulamek(-1,8);
    printf("x / y : ");
    dzielenie_2(x,y);
    show_ulamek(y);
}
int main()
{
    testy_1();
    putchar('\n');
    putchar('\n');
    testy_2();
    return 0;
}
