package InstructiuniDecizionale;

import java.util.Scanner;
import java.util.ServiceConfigurationError;

public class InstructiuneaIFExercitii3 {

    public static void main(String[] args) {

//        1. Scrieti un program care declara o variabila numarAscuns=999, apoi cere de la consola un numar;
//        Daca numarul introdus este acelasi cu numarul ascuns afoseaza "Ai ghicit";
//        Daca numarul este mai mic afiseaza "Mai mult" daca e mai mare afiseaza "Mai putin";

        int numarAscuns = 999;
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduceti un numar");
        int guess = sc1.nextInt();
        if (guess == numarAscuns) {
            System.out.println("Ai ghicit");
        } else if (guess < numarAscuns) {
            System.out.println("Mai mult");
        } else {
            System.out.println("Mai putin");
        }

//        2. Scrieti un program care cere un an de la consola si calculeaza daca anul respectiv este bisect sau nu;

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduceti anul: ");
        int anulIntrodus = sc2.nextInt();
        if ((anulIntrodus % 400 == 0) || (anulIntrodus % 4 == 0 && anulIntrodus % 100 != 0)) {
            System.out.println("Anul introdus este bisect");
        } else System.out.println("Anul introdus nu este bisect");


//        3. Scrieti un program care va cere varsta si apoi o calculeaza in ani cainesti (x7);
//        Daca depasesti 100 de ani afiseaza "Esti pe aici de un secol" Daca nu "You're a babby";
//        Daca introduci o varsta negativa se va afisa "Ooooh, o sa te nasti peste X ani";

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Introduceti varsta dumneavoastra: ");
        int varstaIntrodusa = sc3.nextInt();
        if (varstaIntrodusa < 0) {
            System.out.println("Ooooh, o sa te nasti peste " + (-varstaIntrodusa) + " ani");
        } else {
            int aniCainesti = varstaIntrodusa * 7;
            if (aniCainesti >= 100) {
                System.out.println("Esti pe aici de un secol");
            } else {
                System.out.println("You're a babby");
            }
        }

//        4. Scrieti un program care intreaba cate beri ai baut, apoi calculatorul iti da sfaturi:
//        Daca ai baut mai putin de 4, mai bea; Daca ai baut mai mult de 4, du-te la culcare;
//        Daca nu ai baut nici una, inseamna ca esti cu masina;

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Cate beri ai baut?");
        int beriBaute = sc4.nextInt();
        if (beriBaute == 0) {
            System.out.println("Esti cu masina");
        } else if (beriBaute <= 4) {
            System.out.println("Mai bea");
        } else if (beriBaute >= 4) {
            System.out.println("Du-te la culcare");
        }

//        5. Scrieti un program care determina gradul studentului;
//        Programul va trebui sa citeasca de la consola 3 nota, va calcula media acestora si apoi va determina si
//        printa gradul studentului:
//        - daca media scorurilor este mai mare sau egala cu 90 studentul are gradul A;
//        - daca media scorurilor este intre 70 si 90 studentul are gradul B;
//        - daca media scorurilor este intre 50 si 70 studentul are gradul C;
//        - daca media scorurilor este sub 50 studentul are gradul F;
//        * Scorurile pot avea valori intre 0 si 100; Daca se introduce altceva sa se afiseze un mesaj de eroare;

        Scanner sc5 = new Scanner(System.in);
        System.out.println("Introduceti prima nota: ");
        int primaNota = sc5.nextInt();
        System.out.println("Introduceti a doua nota: ");
        int aDouaNota = sc5.nextInt();
        System.out.println("Introduceti a treia nota: ");
        int aTreiaNota = sc5.nextInt();
        if (primaNota < 0 || aDouaNota < 0 || aTreiaNota < 0) {
            System.out.println("Nota nu poate fi mai mica decat zero");
        } else if (primaNota > 100 || aDouaNota > 100 || aTreiaNota > 100) {
            System.out.println("Nota nu poate fi mai mare decat 100");
        } else {
            int mediaNotelor = (primaNota + aDouaNota + aTreiaNota) / 3;
            if (mediaNotelor > 90) {
                System.out.println("Studentul are gradul A");
            } else if (mediaNotelor > 70) {
                System.out.println("Studentul are gradul B");
            } else if (mediaNotelor > 50) {
                System.out.println("Studentul are gradul C");
            } else {
                System.out.println("Studentul are gradul F");
            }
        }
    }
}
