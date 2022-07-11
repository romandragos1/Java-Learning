package VectoriListe;

import java.util.Arrays;

public class VectoriExercitii1 {

    public static void main(String[] args) {

//        1. Sa se declare un array de strings care sa contina numele a 10 persoane; Sa se afiseze la consola
//        elementul 3 si 7 pe acelasi rand despartite de spatiu, de 3 ori;

        String[] vectorNume = new String[10];
        vectorNume[0] = "Bogdan";
        vectorNume[1] = "Laurentiu";
        vectorNume[2] = "Alexandru";
        vectorNume[3] = "Florina";
        vectorNume[4] = "Ramona";
        vectorNume[5] = "Gloria";
        vectorNume[6] = "Dragos";
        vectorNume[7] = "Sorina";
        vectorNume[8] = "Robert";
        vectorNume[9] = "Anastasia";

        for (int i = 0; i < 3; i++) {
            System.out.print(vectorNume[2] + " " + vectorNume[6] + " ");
        }

//        2. Sa se declare un array numit fruits cu dimensiunea de 6; Sa se adauge fructele in array folosind indexul;

        String[] fruits = new String[6];
        fruits[0] = "Mere";
        fruits[1] = "Pere";
        fruits[2] = "Banane";
        fruits[3] = "Prune";
        fruits[4] = "Ananas";
        fruits[5] = "Struguri";

        for (String fruct : fruits) {
            System.out.println(fruct);
        }

//        3. Sa se declare un array cu 12 numere; Afisati array-ul la consola pe acelasi rand si pe randuri diferite;

        int[] numar = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11};

        for (int index = 0; index < numar.length; index++) {
            System.out.print(numar[index] + " ");

        }
        for (int num : numar) {
            System.out.println(num);
        }

//        4. Sa se delcare un array de string cu 8 spatii libere; Umpleti array-ul cu valori; Sortati alfabetic array-ul;
//        Afisati valorile la consola;

        String[] valori = new String[8];
        valori[0] = "Vaza";
        valori[1] = "Cutie";
        valori[2] = "Hartie";
        valori[3] = "Carte";
        valori[4] = "Rama";
        valori[5] = "Statuie";
        valori[6] = "Sticla";
        valori[7] = "Pahar";

        Arrays.sort(valori);

        for (String val : valori) {
            System.out.println(val);
        }

//        5. Sa se delcare un array de float cu 6 spatii libere; Umnpleti array-ul cu valori;
//        Afisati suma elementelor din acesta;

        float[] numereFloat = new float[6];
        Arrays.fill(numereFloat, 5f);

        int suma = 0;
        for (float numar1 : numereFloat) {
            System.out.println(numar1);
            suma += numar1;
        }
        System.out.println("Suma tuturor numerelor din vector este egala cu " + suma);
    }
}
