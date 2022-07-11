package Variabile;

public class VariabileExercitii {

    public static void main(String[] args) {

//        1. Sa declare o variabila de tip char cu valoarea *

        char steluta = '*';

//        2. Sa delcare o variabila de tip ..?.. cu valoarea 3.14;
        double nrDouble = 3.14;
        float nrFloat = 3.14f;

//        3. Sa declare o variabila de tip boolean cu o valoare la alegere:
        boolean booleanulMeu = false;

//        4. Printati variabilele atat pe acelasi rand, cat si pe randuri diferite;
        System.out.print(steluta);
        System.out.print(nrDouble);
        System.out.print(nrFloat);
        System.out.print(booleanulMeu);

        System.out.println();

        System.out.println(steluta);
        System.out.println(nrDouble);
        System.out.println(nrFloat);
        System.out.println(booleanulMeu);

//        5. Sa se declare 2 variabile: num1 si num2. Sa se afiseze la consola suma, diferenta, inmultirea si impartirea lor;
        int nr1 = 10;
        int nr2 = 3;
        System.out.println(nr1 + nr2);
        System.out.println(nr1 - nr2);
        System.out.println(nr1 * nr2);
        System.out.println(nr1 / nr2);
    }
}
