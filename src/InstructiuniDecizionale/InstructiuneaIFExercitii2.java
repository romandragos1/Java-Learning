package InstructiuniDecizionale;

import java.util.Scanner;

public class InstructiuneaIFExercitii2 {

    public static void main(String[] args) {

//        1. Scrieti un program care va cere sa introduceti varsta voastra. Daca aveti peste 18 ani printati la consola
//        textul "Sunteti major", daca nu "Sunteti minor";

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduceti varsta dumneavoastra: ");
        int varsta = sc1.nextInt();
        if (varsta >= 18) {
            System.out.println("Sunteti major");
        } else {
            System.out.println("Sunteti minor");
        }

//        2. Scrieti un program care determina daca suma a doua numere este sau nu mai mare decat 100 si afiseaza un mesaj:
//        "Suma numerelor este / nu este mai mare decat 100;

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduceti primul numar: ");
        int nr1 = sc2.nextInt();
        System.out.println("Introduceti al doilea numar: ");
        int nr2 = sc2.nextInt();
        if (nr1 + nr2 >= 100) {
            System.out.println("Suma numerelor este mai mare decat 100");
        } else {
            System.out.println("Suma numerelor este mai mica decat 100");
        }

//        3. Scrieti un program care cere utilizatorului culoarea actuala a semaforului. Daca este verde afisati "Treceti",
//        daca este galben "Asteptati", daca este rosu "Stop";

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Introduceti culoareea semaforului: ");
        String culoareSemafor = sc3.nextLine();
        if (culoareSemafor.equalsIgnoreCase("verde")) {
            System.out.println("Treceti");
        } else if (culoareSemafor.equalsIgnoreCase("galben")) {
            System.out.println("Asteptati");
        } else if (culoareSemafor.equalsIgnoreCase("rosu")) {
            System.out.println("Stop");
        } else {
            System.out.println("Nu ai introdus culoarea valida a semaforului");
        }

//        4. Scrieti un program care cere ora actuala, apoi printeaza cate ore au mai ramas pana la miezul noptii;
//        Daca utilizatorul introduce o ora invalida afisati mesaj corespunzator;

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Introduceti ora actuala: ");
        int ora = sc4.nextInt();
        if (ora < 0 || ora > 24) {
            System.out.println("Nu ai introdus o valoare valida");
        } else {
            System.out.println("Pana la miezul noptii au mai ramas: " + (24 - ora) + " ore");
        }

//        5. Declarati o variabila amEnergie de tip boolean si initializati-o prin citirea ei de la consola;
//        Daca ai energie programul iti va sugera sa iesi la alergat, daca nu sa bei o cafea;

        Scanner sc5 = new Scanner(System.in);
        System.out.println("Aveti energie ?");
        boolean amEnergie = sc5.nextBoolean();
        if (amEnergie = true) {
            System.out.println("Iesi la alergat");
        } else {
            System.out.println("Bea o cafea");
        }

//        6. Creati o aplicatie in care utilizatorul introduce un numar intre 1 si 100; Daca numarul este mai mic decat 50
//        aplicatia va afisa multiplicarea lui cu 5; Daca numarul este mai mare decat 50 aplicatia va afisa multiplicarea
//        lui cu 2 si daca numarul este impar va afisa multiplicarea lui cu 3;

        Scanner sc6 = new Scanner(System.in);
        System.out.println("Introduceti un numar intre 1 si 100: ");
        int numarIntrodus = sc6.nextInt();
        if (numarIntrodus < 0 || numarIntrodus > 100) {
            System.out.println("Ai introdus un numar peste limita acceptata");
        } else {
            if (numarIntrodus % 2 != 0) {
                System.out.println(numarIntrodus);
            } else if (numarIntrodus < 50) {
                System.out.println(numarIntrodus * 5);
            } else {
                System.out.println(numarIntrodus * 2);
            }
        }
    }
}
