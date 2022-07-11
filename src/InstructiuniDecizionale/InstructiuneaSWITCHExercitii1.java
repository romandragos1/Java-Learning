package InstructiuniDecizionale;

import java.util.Scanner;

public class InstructiuneaSWITCHExercitii1 {

    public static void main(String[] args) {

//        1. Introduceti un numar intre 1 si 9. Sa se printeze pentru fiecare numar introdus numele lui de tip text;

        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduceti un numar intre 1 si 9:");
        int numarIntrodus = sc1.nextInt();
        switch (numarIntrodus) {
            case 1:
                System.out.println("unu");
                break;
            case 2:
                System.out.println("doi");
                break;
            case 3:
                System.out.println("trei");
                break;
            case 4:
                System.out.println("patru");
                break;
            case 5:
                System.out.println("cinci");
                break;
            case 6:
                System.out.println("sase");
                break;
            case 7:
                System.out.println("sapte");
                break;
            case 8:
                System.out.println("opt");
                break;
            case 9:
                System.out.println("noua");
                break;
            default:
                System.out.println("Nu ai introdus un numar valid");
                break;
        }

//        2. Scrieti un program care cere utilizatorului nota obtinuta la matematica si afiseaza:
//        1 - 4: Ai picat;
//        5 - 6: Mai ai de munca;
//        7 - 9: Bravo;
//        10: FELICITARI;

        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduceti nota obtinuta la matematica:");
        int notaObtinuta = sc2.nextInt();
        switch (notaObtinuta) {
            case 1:
            case 2:
            case 3:
            case 4:
                System.out.println("Ai picat");
                break;
            case 5:
            case 6:
                System.out.println("Mai ai de munca");
                break;
            case 7:
            case 8:
            case 9:
                System.out.println("Bravo");
                break;
            case 10:
                System.out.println("FELICITARI");
                break;
            default:
                System.out.println("Nu ai introdus o nota valida");
                break;
        }

//        3. Scrieti un program care cere ziua actuala si afisati mesaje corespunzatoare:
//        daca este zi lucratoare: Spor la munca, daca nu: Odihna placuta;

        Scanner sc3 = new Scanner(System.in);
        System.out.println("Introduceti ziua actuala:");
        String ziuaActuala = sc3.nextLine();
        switch (ziuaActuala) {
            case ("luni"):
            case ("marti"):
            case ("miercuri"):
            case ("joi"):
            case ("vineri"):
                System.out.println("Spor la munca");
                break;
            case ("sambata"):
            case ("duminica"):
                System.out.println("Odihna placuta");
                break;
            default:
                System.out.println("Nu ai introdus o zi valida");
                break;
        }

//        4. Scrieti un program care intreaba utilizatorul cum se descurca la acest curs;
//        daca introduce "foarte bine" computerul va afisa "<3";
//        daca intrduce "bine" computerul va afisa "Ma bucur";
//        daca intrduce "slab" computerul va afisa "Hai sa refacem exercitiile de la inceput";
//        daca intrduce "nu inteleg nimic" computerul va afisa "Minti";

        Scanner sc4 = new Scanner(System.in);
        System.out.println("Cum va descurcati la acest curs:");
        String raspuns = sc4.nextLine();
        switch (raspuns) {
            case ("foarte bine"):
                System.out.println("<3");
                break;
            case ("bine"):
                System.out.println("Ma bucur");
                break;
            case ("slab"):
                System.out.println("Hai sa refacem exercitiile de la inceput");
                break;
            case ("nu inteleg nimic"):
                System.out.println("Minti");
                break;
            default:
                System.out.println("Nu ai introdus un raspuns valid");
                break;
        }

//        5. Scrieti un program care sa intrebe care este destinatia ta de vacanta preferata: mare munte sau la tara;
//        Pentru fiecare caz programul va printa niste locuri interesante corespunzatoare;

        Scanner sc5 = new Scanner(System.in);
        System.out.println("Care este destinatia ta de vacanta preferata?");
        String raspunsUser = sc5.nextLine();
        switch (raspunsUser) {
            case ("mare"):
                System.out.println("Locuri interesante corespunzatoare mare");
                break;
            case ("munte"):
                System.out.println("Locuri interesante corespunzatoare munte");
                break;
            case ("la tara"):
                System.out.println("Locuri interesante corespunzatoare la tara");
                break;
            default:
                System.out.println("Nu ai introdus o destinatie preferata");
                break;
        }
    }
}
