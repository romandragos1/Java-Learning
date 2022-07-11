package InstructiuniDecizionale;

import java.util.Scanner;

public class TernaryIFExercitii2 {

    public static void main(String[] args) {

//        1. Declarati 2 variabile de tip double si initializa-ti-le prin citirea lor de la consola;
//        Daca suma lor este mai mare decat 100, printati un mesaj corespunzator; La fel si daca nu este;

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduceti primul numar:");
        double nr1 = sc1.nextDouble();
        System.out.println("Introduceti al doilea numar:");
        double nr2 = sc1.nextDouble();
        System.out.println(nr1 + nr2 > 100 ? "Suma numerelor este mai mare decat 100" : "Suma numerelor este mai mica decat 100");

//        2. Scrieti un program care cere 3 numere; Daca media lor aritmetica este mai mare decat 50 sa se afiseze mesaj
//        corespunzator; La fel si daca nu este;

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduceti primul numar:");
        int nrr1 = sc2.nextInt();
        System.out.println("Introduceti al doilea numar:");
        int nrr2 = sc2.nextInt();
        System.out.println("Introduceti al treilea numar:");
        int nrr3 = sc2.nextInt();
        int mediaAritmetica = (nrr1 + nrr2 + nrr3) / 3;
        System.out.println(mediaAritmetica > 50 ? "Media aritmetica este mai mare decat 50" : "Media aritmetica este mai mica decat 50");

//        3. Scrieti un program care sa ceara utilizatorului numarul de ore lucrate intr-o zi; Daca utilizatorul a lucrat minim 8 ore
//        se va afisa "Ne vedem maine"; Daca nu "Programul  nu a fost incheiat";

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Introduceti numarul de ore lucrate:");
        int oreLucrate = sc3.nextInt();
        System.out.println(oreLucrate > 8 ? "Ne vedem maine" : "Programul nu a fost incheiat");

//        4. Declarati o variabila de tip boolean amEnergie si initializa-ti-o prin citirea ei de la tastatura;
//        Programul va cere utilizatorului sa introduca luna curenta;
//        Pentru fiecare anotimp se va printa un mesaj corespunzator; Daca utilizatorul are energie,
//        se va printa o activitate specifica anotimpului; Daca nu, va ramane acasa si se va odihni;

        Scanner sc4 = new Scanner(System.in);
        Scanner sc5 = new Scanner(System.in);
        System.out.println("Aveti energie?");
        boolean amEnergie = sc4.nextBoolean();
        System.out.println("Care este luna curenta?");
        String luna = sc5.nextLine();
        switch (luna) {
            case ("decembrie"):
            case ("ianuarie"):
            case ("februarie"):
                System.out.println(amEnergie ? "Ne vom bate cu zapada" : "Stam acasa si ne odihnim");
                break;
            case "martie":
            case "aprilie":
            case "mai":
                System.out.println(amEnergie ? "Mergem la picnic" : "Stam acasa si ne odihnim");
                break;
            case "iunie":
            case "iulie":
            case "august":
                System.out.println(amEnergie ? "Mergem la plaja" : "Stam acasa si ne odihnim");
                break;
            case "septembrie":
            case "octombrie":
            case "noiembrie":
                System.out.println(amEnergie ? "Mergem in padure" : "Stam acasa si ne odihnim");
                break;
            default:
                System.out.println("Nu ai introdus o luna valida");
        }

//        5. Un magazin online are 4 produse: ps5 (pret 2000), xbox (pret 500), pc (pret 2000) si laptop (pret 1500);
//        Utilizatorul are un buget de 1700 lei; Programul va intreba utilizatorul ce anume doreste sa cumpere?
//        Daca are suficienti bani utilizatorul va cumpara cu succes produsul respectiv; Daca nu, se va afisa un raspuns corespunzator;

        int pretPS5 = 2000;
        int pretXbox = 500;
        int pretPc = 2000;
        int pretLaptop = 1500;
        int buget = 1700;
        Scanner sc6 = new Scanner(System.in);
        System.out.println("Ce produs doriti sa cumparati?");
        String produsCumparat = sc6.nextLine();
        switch (produsCumparat) {
            case "ps5":
                System.out.println(pretPS5 > buget ? "Nu ai suficiente fonduri" : "PS5 achizitionat cu succes");
                break;
            case "xbox":
                System.out.println(pretXbox > buget ? "Nu ai suficiente fonduri" : "XBOX achizitionat cu succes");
                break;
            case "pc":
                System.out.println(pretPc > buget ? "Nu ai suficiente fonduri" : "PC achizitionat cu succes");
                break;
            case "laptop":
                System.out.println(pretLaptop > buget ? "Nu ai suficiente fonduri" : "LAPTOP achizitionat cu succes");
                break;
            default:
                System.out.println("Produs invalid");
                break;
        }
    }
}
