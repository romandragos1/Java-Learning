package VectoriListe;

import java.util.*;

public class ArrayListExercitii2 {

    public static void main(String[] args) {

//        1. Declarati un vector de numere intregi in care sa bagati 5 numere random;
//        Copiati toate elementele vectorului intr-o noua lista apoi printati-o la consola in 2 moduri diferite;


        int[] numere = new int[5];
        Random generator = new Random();

        for (int i = 0; i < numere.length; i++) {
            int numarGenerat = generator.nextInt(100);
            numere[i] = numarGenerat;
        }

        ArrayList<Integer> lista = new ArrayList<>();
        for (int numar : numere) {
            lista.add(numar);
        }

        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i));
        }

        for (int numar : lista) {
            System.out.println(numar);
        }

//        2. Declarati o noua lista de tip String in care utilizatorul va introduce cuvinte de la tastatura pana in momentul in
//         care introduce "stop"; Sortati lista alfabetic, dupa care listati toate elementele listei pe acelasi rand;

        ArrayList<String> lista1 = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Ce cuvand doriti adaugat in lista?");
            String cuvantCitit = sc.nextLine();
            if (cuvantCitit.equals("stop")) {
                break;
            } else {
                lista1.add(cuvantCitit);
            }
        }
        Collections.sort(lista1);

        for (String text : lista1) {
            System.out.print(text + " ");
        }

//        3. Declarati o lista de numere double in care sa introduceti in ordine bugetul vostru pentru fiecare luna a anului;
//        Declarati o lista de numere double in care sa introduceti in ordine cheltuielile pentru fiecare luna a anului;
//        Daca cheltuielile unei luni depasesc bugetul, se va afisa: "Cheltuielile lunii 1/2/3../12 depasesc bugetul alocat";
//        Afisati un mesaj in care specificati cati bani ramasi veti avea la sfarsitul anului sau cu cat veti fi pe minus;
//        - caz 1 - "La terminarea anului vom ramane pe plus cu X lei";
//        - caz 2 - " La terminarea anului vom ramane pe minus cu X lei";

        ArrayList<Double> bugetLunar = new ArrayList<>();
        bugetLunar.add(100.4);
        bugetLunar.add(233.4);
        bugetLunar.add(100.4);
        bugetLunar.add(150.5);
        bugetLunar.add(123.4);
        bugetLunar.add(345.0);
        bugetLunar.add(345.6);
        bugetLunar.add(43.2);
        bugetLunar.add(234.5);
        bugetLunar.add(123.3);
        bugetLunar.add(333.1);
        bugetLunar.add(111.4);

        ArrayList<Double> cheltuieliLunare = new ArrayList<>(Arrays.asList(99.6, 23.4, 54.6, 23.5, 65.3, 234.5, 567.5, 234.5, 765.3, 9.0, 100.0, 12.4));

        for (int i = 0; i < bugetLunar.size(); i++) {
            if (bugetLunar.get(i) < cheltuieliLunare.get(i)) {
                System.out.println("Cheltuielile lunii " + (i + 1) + " depasesc bugetul alocat");
            }
        }
        int bugetTotal = 0;
        int cheltuieliTotale = 0;

        for (double buget : bugetLunar) {
            bugetTotal += buget;
        }
        for (double expense : cheltuieliLunare) {
            cheltuieliTotale += expense;
        }

        if (bugetTotal > cheltuieliTotale) {
            System.out.println("La terminarea anului vom ramane pe plus cu " + (bugetTotal - cheltuieliTotale));
        } else if (bugetTotal < cheltuieliTotale) {
            System.out.println("La terminarea anului vom ramane pe minus cu " + (cheltuieliTotale - bugetTotal));
        } else {
            System.out.println("Banii s-au potrivit la fix");
        }

//        4. Decalarati 4 liste si numiti-le noteRomana, noteMatematica, noteEngleza si noteFranceza;
//        Introduceti 3 note in fiecare lista - valori posibile intre 1 si 10;
//        Calculati mediile la fiecare materie, apoi media generala;
//        La final efisati un mesaj de forma:
//        Note romana: X1 X2 X3 - Media X4;
//        Note matematica: X1 X2 X3 - Media X4;
//        Note engleza: X1 X2 X3 - Media X4;
//        Note franceza: X1 X2 X3 - Media X4;
//        Media generala: X;
//        A TRECUT/A PICAT. (elevul va trece daca media generala este mai mare ca 5 si nici o medie nu este mai mica ca 4);

        Scanner sc1 = new Scanner(System.in);

        ArrayList<Double> noteRomana = new ArrayList<>();
        ArrayList<Double> noteMatematica = new ArrayList<>();
        ArrayList<Double> noteEngleza = new ArrayList<>();
        ArrayList<Double> noteFranceza = new ArrayList<>();

        int notaAdaugateRomana = 0;
        while (notaAdaugateRomana < 3) {
            System.out.println("Introduceti nota la Romana");
            double nota = sc1.nextDouble();
            if (nota >= 1 && nota <= 10) {
                noteRomana.add(nota);
                notaAdaugateRomana++;
            } else {
                System.out.println("Poti introduce doar note intre 1 si 10");
            }
        }

        int noteAdaugateMatematica = 0;
        while (noteAdaugateMatematica < 3) {
            System.out.println("Introduceti nota la Matematica");
            double nota = sc1.nextDouble();
            if (nota >= 1 && nota <= 10) {
                noteMatematica.add(nota);
                noteAdaugateMatematica++;
            } else {
                System.out.println("Poti introduce doar note intre 1 si 10");
            }
        }

        int noteAdaugateEngleza = 0;
        while (noteAdaugateEngleza < 3) {
            System.out.println("Introduceti nota la Engleza");
            double nota = sc1.nextDouble();
            if (nota >= 1 && nota <= 10) {
                noteEngleza.add(nota);
                noteAdaugateEngleza++;
            } else {
                System.out.println("Poti introduce doar note intre 1 si 10");
            }
        }

        int noteAdaugateFranceza = 0;
        while (noteAdaugateFranceza < 3) {
            System.out.println("Introduceti nota la Franceza");
            double nota = sc1.nextDouble();
            if (nota >= 1 && nota <= 10) {
                noteFranceza.add(nota);
                noteAdaugateFranceza++;
            } else {
                System.out.println("Poti introduce doar note intre 1 si 10");
            }
        }


        double totalRomana = 0;
        double totalMatematica = 0;
        double totalEngleza = 0;
        double totalFranceza = 0;

        for (double numar : noteRomana) {
            totalRomana += numar;
        }
        for (double numar : noteMatematica) {
            totalMatematica += numar;
        }
        for (double numar : noteEngleza) {
            totalEngleza += numar;
        }
        for (double numar : noteFranceza) {
            totalFranceza += numar;
        }

        double medieRomana = totalRomana / noteRomana.size();
        double medieMatematica = totalMatematica / noteMatematica.size();
        double medieEngleza = totalEngleza / noteEngleza.size();
        double medieFranceza = totalFranceza / noteFranceza.size();

        double medieGenerala = (medieRomana + medieMatematica + medieEngleza + medieFranceza) / 4;

        System.out.println("Note Romana " + noteRomana.get(0) + " " + noteRomana.get(1) + " " + noteRomana.get(2) + " Media" + medieRomana);
        System.out.println("Note Matematica " + noteMatematica.get(0) + " " + noteMatematica.get(1) + " " + noteMatematica.get(2) + " Media" + medieMatematica);
        System.out.println("Note Engleza " + noteEngleza.get(0) + " " + noteEngleza.get(1) + " " + noteEngleza.get(2) + " Media" + medieEngleza);
        System.out.println("Note Franceza " + noteFranceza.get(0) + " " + noteFranceza.get(1) + " " + noteFranceza.get(2) + " Media" + medieFranceza);
        System.out.println("Media generala " + medieGenerala);
        System.out.println(medieGenerala > 5 ? "A trecut" : "A picat");
    }
}
