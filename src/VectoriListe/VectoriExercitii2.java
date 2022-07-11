package VectoriListe;

import java.util.Arrays;
import java.util.Scanner;

public class VectoriExercitii2 {

    public static void main(String[] args) {

//        1. Sa se declare un array de int care sa contina 10 numere; Sa se afiseze la consola:
//         a. Suma tuturor numerelor pare;
//         b. Media aritmetica a numerelor pozitive;

        int[] numere = {4, 8, 25, 457, 3, 99, -102, -2, 74, 1};

        int sumaNumerePare = 0;
        int sumaNumerePozitive = 0;
        int numerPozitiveCount = 0;

        for (int numar : numere) {
            if (numar % 2 == 0) {
                sumaNumerePare += numar;
            }
            if (numar >= 0) {
                sumaNumerePozitive += numar;
                numerPozitiveCount++;
            }
        }
        System.out.println("Suma tuturor numerelor pare este egala cu " + sumaNumerePare);
        System.out.println("Media aritmetica a numerelor pozitive este egala cu " + (sumaNumerePozitive / numerPozitiveCount));

//        2. Sa se delcare un array numit masini cu dimensiunea 6; Sa se adauge masinile in array folosind indexul;
//         Sortati array-ul dupa care printati ultimele 2 elemente;

        String[] masini = new String[6];
        masini[0] = "Ford Puma";
        masini[1] = "Renault Megane";
        masini[2] = "Volkswagen Golf";
        masini[3] = "Dacia Spring";
        masini[4] = "Peugeot 208";
        masini[5] = "Skoda Rapid";

        Arrays.sort(masini);
        System.out.println(masini[masini.length - 1]);
        System.out.println(masini[masini.length - 2]);

//        3. Sa se citeasca de la user un numar int n; Sa se declare un array de tip double cu dimensiunea n si sa se
//         initializeze cu n valori; Sa se sorteze array-ul folosind una din metodele clasei array; Sa se declare
//         un al doilea array cu dimensiunea n;
//         Sa se copieze toate elementele deja sortate din primul array in al doilea; Sa se afiseze elementele din
//         al doilea array la consola, folosind ciclul foreach;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduceti dimensiunea array-ului:");
        int dimensiune = sc.nextInt();

        double[] numereDouble = new double[dimensiune];
        double numar = 20.4;
        for (int i = 0; i < dimensiune; i++) {
            numereDouble[i] = numar;
            numar += 20;
        }
        Arrays.sort(numereDouble);

        double[] vectorNou = new double[dimensiune];
        for (int i = 0; i < dimensiune; i++) {
            vectorNou[i] = numereDouble[i];
        }

        for (double numarDouble : vectorNou) {
            System.out.println(numarDouble);
        }

//        4. Sa se copieze toate masinile din array-ul de la exercitiul nr 2 in alt array nou (masiniCopy), folosind
//         numai un ciclu for; Printati vectorul la consola;

        String[] masiniCopy = new String[masini.length];
        for (int i = 0; i < masini.length; i++) {
            masiniCopy[i] = masini[i];
        }
        System.out.println(Arrays.toString(masiniCopy));

//        5. Sa se copieze toate masinile din array-ul de la exercitiul nr 2 in alt array nou (masiniCopy), folosind
//         numai un ciclu while; Printati vectorul la consola;

        String[] masiniCopy1 = new String[masini.length];
        int index = 0;
        while (index < masini.length) {
            masiniCopy1[index] = masini[index];
            index++;
        }
        System.out.println(Arrays.toString(masiniCopy1));

//        6. Sa se calculeze media aritmetica a tuturor elementelor impare ale unui array cu 12 valori de tip double

        double[] numereDouble1 = {34.5, 23.6, 76.5, 34.5, 56.7, 2.5, 9.88, 44.5, 100.5, 10.0, 12.3, 24.0};
        double suma = 0.0;
        int numereImpare = 0;

        for (double numar1 : numereDouble1) {
            if (numar1 % 2 != 0) {
                suma += numar1;
                numereImpare++;
            }
        }
        System.out.println("Media aritmetica a elementelor impare este egala cu " + (suma / numereImpare));
    }
}
