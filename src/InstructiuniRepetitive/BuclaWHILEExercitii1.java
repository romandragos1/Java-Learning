package InstructiuniRepetitive;

import java.util.Random;
import java.util.Scanner;

public class BuclaWHILEExercitii1 {

    public static void main(String[] args) {

//        1. Scrieti un program care sa afiseze textul "Voi deveni programator" de 10 ori folosing WHILE:

        String nume = "Voi deveni programator";
        int counter = 0;
        while (counter < 10) {
            System.out.println(nume);
            counter++;
        }

//        2. Scrieti un program care afiseaza primele 5 numere divizibile cu 3:

        int counter1 = 0;
        while (counter1 < 13) {
            if (counter1 % 3 == 0) {
                System.out.println(counter1);
            }
            counter1++;
        }


//        3. Scrieti un program care sa afiseze suma primelor 10 numere naturale folosind WHILE:

        int counter2 = 1;
        int suma = 0;
        while (counter2 <= 10) {
            suma = suma + counter2;
            counter2++;
        }
        System.out.println("Suma primelor 10 numere naturale este " + suma);

//        4. Scrieti un program care citeste 4 numere de la user, apoi le inmulteste folosind WHILE:

        Scanner sc1 = new Scanner(System.in);
        int counter3 = 1;
        int produs = 1;
        while (counter3 <= 4) {
            System.out.println("Introduceti un numar:");
            int numarCitit = sc1.nextInt();
            produs = produs * numarCitit;
            counter3++;
        }
        System.out.println("Produsul numerelor introduse este " + produs);

//        5. Scrieti un program care citeste un numar int n de la user si afiseaza textul "stiu sa folosesc ciclul WHILE"
//        de n ori pe randuri diferite;

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int n = sc2.nextInt();
        int counter4 = 0;
        while (counter4 < n) {
            System.out.println("Stiu sa folosesc ciclul WHILE");
            counter4++;
        }

//        6. Scrieti un program care cere userului in mod repetat un numar int n;
//        Cand userul introduce un numar divizibil cu 15, se va printa suma tuturor numerelor introduse si programul se va termina;

        Scanner sc3 = new Scanner(System.in);
        int suma1 = 0;
        while (true) {
            System.out.println("Introduceti un numar:");
            int numar = sc3.nextInt();
            suma1 = suma1 + numar;
            if (numar % 15 == 0) {
                break;
            }
        }
        System.out.println("Suma numerelor introduse este " + suma1);

//        7. Scrieti un program care cere userului in mod repetat sa introduca numere de la tastatura;
//        Cand userul introduce 0, programul va printa media aritmetica a tuturor numerelor introduse si programul se va termina;

        Scanner sc4 = new Scanner(System.in);
        int suma2 = 0;
        int count = 0;
        while (true) {
            System.out.println("Introduceti un numar:");
            int numar = sc4.nextInt();

            if (numar == 0) {
                break;
            } else {
                suma2 = suma2 + numar;
                count++;
            }
        }
        System.out.println("Media ariitmetica a numerelor introduse este egala cu " + (suma2 / count));

//        8. Declarati o variabila de tip int si initializa-ti-o. Programul va cere in mod repetat userului sa ghiceasc numarul;
//        Daca utilizatorul introduce un numar mai mic, se va printa "Mai adauga";
//        Daca utilizatorul introduce un numar mai mare, se va printa "Mai scade";
//        Daca ghiceste numarul, se va printa "Ai ghicit numarul din X incercari";

        Random generator = new Random();
        int numarAscuns = generator.nextInt(100);
        int incercari = 0;
        Scanner sc5 = new Scanner(System.in);
        while (true) {
            System.out.println("Introduceti un numar:");
            int numar = sc5.nextInt();
            incercari++;
            if (numar < numarAscuns) {
                System.out.println("Mai adauga");
            } else if (numar > numarAscuns) {
                System.out.println("Mai scade");
            } else {
                System.out.println("Felicitari, ai ghicit numarul din " + incercari + " incercari");
                break;
            }
        }
    }
}
