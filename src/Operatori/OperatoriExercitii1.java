package Operatori;

public class OperatoriExercitii1 {

    public static void main(String[] args) {

//        1. Sa se declare 2 variabile: num1 si num2; Initializa-ti-le si printati-le;

        int num1 = 100;
        int num2 = 30;
        System.out.printf("Primul numar este %d, iar al doilea numar este %d", num1, num2);
        System.out.println();

//        2. Declarati 4 variabile: suma, diferenta, produsul si impartirea in care sa stocati operatiile primului
//        numar raportat la al doilea; Printati rezultatele;

        int suma = num1 + num2;
        int diferenta = num1 - num2;
        int produs = num1 * num2;
        int cat = num1 / num2;

        System.out.println("Suma este " + suma);
        System.out.println("Diferenta este " + diferenta);
        System.out.println("Produsul este " + produs);
        System.out.println("Impartirea este " + cat);

//        3. Declarati 4 variabile: suma, diferenta, produsul si impartirea in care sa stocati operatiile celui
//        de-al doilea raportat la primul; Printati rezultatele;

        int suma2 = num2 + num1;
        int diferenta2 = num2 - num1;
        int produs2 = num2 * num1;
        int cat2 = num2 / num1;

        System.out.printf("Suma este %d, diferenta %d, inmultirea %d si produsul %d", suma2, diferenta2, produs2, cat2);

//        4. Declarati o variabila num3. Adunati noua variabila tuturor rezultatelor anterioare, si afisati pentru fiecare mesajul
//        "Dupa ce am adaugat num3 sumei/diferentei... , am obtinut rezultatul ";

        int num3 = 50;
        suma = suma + num3;
        diferenta = diferenta + num3;
        produs = produs + num3;
        cat = cat + num3;

        System.out.println();
        System.out.printf("Dupa ce am adaugat %d sumei mele rezultatul a devenit %d \n", num3, suma);
        System.out.printf("Dupa ce am scazut %d diferentei mele rezultatul a devenit %d \n", num3, diferenta);
        System.out.printf("Dupa ce am inmultit %d produsului meu rezultatul a devenit %d \n", num3, produs);
        System.out.printf("Dupa ce am impartit %d catului mele rezultatul a devenit %d \n", num3, cat);

//        5. Declarati o variabila de tip int la alegere si printati la consola tabla de inmultire a acelui numar:

        int numar = 63;
        System.out.println(numar + " x 1 = " + numar * 1);
        System.out.println(numar + " x 2 = " + numar * 2);
        System.out.println(numar + " x 3 = " + numar * 3);
        System.out.println(numar + " x 4 = " + numar * 4);
        System.out.println(numar + " x 5 = " + numar * 5);
        System.out.println(numar + " x 6 = " + numar * 6);
        System.out.println(numar + " x 7 = " + numar * 7);
        System.out.println(numar + " x 8 = " + numar * 8);
        System.out.println(numar + " x 9 = " + numar * 9);
        System.out.println();

//        6. Stocati intr-o variabila restul impartirii numarului 100 la 27 si printati un text de forma:
//        "Restul impartitii lui 100 la 27 este egal cu X";

        int num4 = 100;
        int num5 = 27;
        System.out.println(num4 % num5);
        System.out.printf("Restul impartitii lui 100 la 27 este egal cu %d", num4 % num5);

//        7. Declarati si initiati 2 variabile de tip int;
//        Declarati urmatoarele variabile de tip boolean: primulMaiMare, alDoileaMaiMare, numereEgale;
//        Initializati valorile de tip boolean pe baza celor doua numere;

        int numar1 = 88;
        int numar2 = 67;
        boolean primulMaiMare = numar1 > numar2;
        boolean alDoileaMaiMare = numar2 > numar1;
        boolean numereEgale = numar1 == numar2;
        System.out.println();
        System.out.println("Primul este mai mare " + primulMaiMare);
        System.out.println("Al doilea este mai mare " + alDoileaMaiMare);
        System.out.println("Sunt egale " + numereEgale);


//        8. Declarati o variabila de tip int si initializati-o; Printati la consola urmatorul text:
//        "Vom incrementa numarul numarulMeu cu 1 in 3 moduri diferite";
//        Incrementati numarul vostru cu 1 in 3 moduri diferite;
//        Printati un text de forma "Dupa ce am adunat 1 in 3 moduri diferite, numarul nostru este egal cu valoareRezultata";

        int numarulMeu = 10;
        System.out.println("Vom incrementa numarul numarulMeu cu 1 in 3 moduri diferite");
        numarulMeu = numarulMeu + 1;
        numarulMeu++;
        numarulMeu += 1;
        System.out.println("Dupa ce am adunat 1 in 3 moduri diferite, numarul nostru este egal cu " + numarulMeu);


//        9. Declarati si initializati 2 variabile de tip int; Intializati prima variabila cu o valoare pozitiva,
//        a doua cu o valoare negativa; Declarati 3 variabile de tip boolean: sumaMaiMareDecatZero,
//        diferentaMaiMicaSauEgalaDecatZero si produsulMaiMareDecat100 si initializati-le folosindu-va de cele doua numere;

        int n1 = 30;
        int n2 = -20;
        boolean sumaMaiMareDecatZero = (n1 + n2) > 0;
        boolean diferentaMaiMicaSauEgalaDecatZero = (n1 - n2) <= 0;
        boolean produsulMaiMareDecat100 = n1 * n2 > 100;
        System.out.println("Suma celor doua numere este mai mare decat zero " + sumaMaiMareDecatZero);
        System.out.println("Diferenta celor doua numere este mai mica sau egala decat zero " + diferentaMaiMicaSauEgalaDecatZero);
        System.out.println("Produsul celor doua numere este mai mare decat 100 " + produsulMaiMareDecat100);


//        10. Decalrati 4 variabile de tip double si initializati-le; Afisati la consola doua texte sub forma:
//        Media aritmetica a numerelor v1, v2 si v3 este egala cu rezultat;
//        Media aritmetica a numerelor v1, v2 si v4 este egala cu rezultat;
//        Media aritmetica a numerelor v2, v3 si v4 este egala cu rezultat;

        double v1 = 10.7;
        double v2 = 13.4;
        double v3 = 2.2;
        double v4 = 999.1;

        double sum123 = v1 + v2 + v3;
        double sum124 = v1 + v2 + v4;
        double sum234 = v2 + v3 + v4;

        System.out.println("Media aritmetica a numerelor v1, v2 si v3 este egala cu " + (sum123 / 3));
        System.out.println("Media aritmetica a numerelor v1, v2 si v4 este egala cu " + (sum124 / 3));
        System.out.println("Media aritmetica a numerelor v2, v3 si v4 este egala cu " + (sum234 / 3));
    }
}
