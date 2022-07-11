package InstructiuniDecizionale;

import java.util.Scanner;

public class InstructiuneaIFExercitii1 {

    public static void main(String[] args) {

//        1. Scrie un program sa citeasca 2 numere din consola si sa afiseze daca sunt egale sau nu:

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduceti primul numar:");
        int nr1 = sc1.nextInt();
        System.out.println("Introduceti al doilea numar:");
        int nr2 = sc1.nextInt();
        if (nr1 == nr2) {
            System.out.println("Numerele sunt egale");
        } else {
            System.out.println("Numerele nu sunt egale");
        }

//        2. Scrie un prgram care sa citeasca un numar din consola si sa afiseze daca este par sau impar:

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int nr = sc2.nextInt();
        if (nr % 2 == 0) {
            System.out.println("Numarul este par");
        } else {
            System.out.println("Numarul este impar");
        }

//        3. Scrie un prgram care sa citeasca un numar din consola si sa afiseze daca este pozitiv sau negativ

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Introduceti un numar:");
        int nr3 = sc3.nextInt();
        if (nr > 0) {
            System.out.println("Numarul este pozitiv");
        } else {
            System.out.println("Numarul este negativ");
        }

//        4. Creati o aplicatie care cere 3 numere si il gaseste si afiseaza pe cel mai mic dintre ele

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Introduceti primul numar:");
        int nr4 = sc4.nextInt();
        System.out.println("Introduceti al doilea numar:");
        int nr5 = sc4.nextInt();
        System.out.println("Introduceti al treilea numar:");
        int nr6 = sc4.nextInt();

        int minin = nr4;              // facem un flag
        if (nr5 < minin) {
            minin = nr5;
        } else if (nr6 < minin) {
            minin = nr6;
        }
        System.out.println("Cel mai mic numar este: " + minin);

//        5. Scrieti un program care va cere sa introduceti varsta voastra si varsta ideala de pensionare;
//        Se printeaza unul din mesajele corespunzatoare: "Mai aveti de lucrat inca X ani / Ati iesit deja la pensie";
//        Varstele introduse trebuie sa fie valide;

        Scanner sc5 = new Scanner(System.in);
        System.out.println("Introduceti varsta dumneavoastra: ");
        int varsta = sc5.nextInt();
        System.out.println("Introduceti varsta ideala de pensionare: ");
        int varstaPensionare = sc5.nextInt();

        boolean dateleIntroduseSuntCorecte = true;        // flag pentru a afisa la volori negative "Ai iesit deja la pensie"
        if (varsta < 0 || varstaPensionare < 0) {
            System.out.println("Ai introdus o varsta invalida");
            dateleIntroduseSuntCorecte = false;
        }
        if (varsta > 130 || varstaPensionare > 130) {
            System.out.println("Ai introdus o varsta peste limitele admise");
            dateleIntroduseSuntCorecte = false;
        }

        if (dateleIntroduseSuntCorecte) {
            if (varsta >= varstaPensionare) {
                System.out.println("Ati iesit deja la pensie");
            } else if (varsta < varstaPensionare) {
                System.out.println("Mai aveti de lucrat inca " + (varstaPensionare - varsta) + " ani");
            }
        }
    }
}
