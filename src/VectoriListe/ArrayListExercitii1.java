package VectoriListe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayListExercitii1 {

    public static void main(String[] args) {

//        1. Sa se declare o lista numita characters care sa contina urmatoarele elemente: "Luke Skywalker", "Han Solo" si "Chewbacca";
//        Sa se introduca ulterior elementul "Darth Vader", apoi sa se stearga al doilea element, folosind metodele listei;
//        Printati lista la consola in doua moduri diferite;

        ArrayList<String> characters = new ArrayList<>();
        characters.add("Luke Skywalker");
        characters.add("Han Solo");
        characters.add("Chewbacca");
        characters.add("Darth Vader");

        characters.remove(1);

        for (String caracter : characters) {
            System.out.println(caracter + " ");
        }

        for (int i = 0; i < characters.size(); i++) {
            System.out.println(characters.get(i));
        }

//        2. Sa se declare o lista cu 5 sumere si o a doua lista cu 5 numere; Sa se copieze a doua lista in prima; Printati cu foreach
//        prima lista care sa contina toate cele 10 numere;

        ArrayList<Integer> listaNumere1 = new ArrayList<>();
        listaNumere1.add(2);
        listaNumere1.add(4);
        listaNumere1.add(6);
        listaNumere1.add(8);
        listaNumere1.add(10);

        ArrayList<Integer> listaNumere2 = new ArrayList<>(Arrays.asList(1, 3, 5, 7, 9));

        for (int numar : listaNumere2) {
            listaNumere1.add(numar);
        }
        //  sau alta modalitate mai simpla:     listaNumere1.addAll(listaNumere2);

        for (int numar : listaNumere1) {
            System.out.println(numar);
        }

//        3. Sa se declare o lista de caractere care sa contina * g - 3 . Q / ^ p
//        Sa se afiseze numarul de elemenete din lista folosind o metoda a listei sau un ciclu;

        ArrayList<Character> caractere = new ArrayList<>(Arrays.asList('*', 'g', '-', '3', '.', 'Q', '/', '^', 'p'));
        // Print prin ciclu
        for (char character : caractere) {
            System.out.println(character);
        }

        // Print prin lista
        System.out.println(caractere.toString());

//        4. Utilizatorul va introduce cuvinte random intr-o lista pana in momentul in care introduce cuvantul "gata";
//        Dupa aceea se va parcurge lista descrescator si se va printa fiecare element la consola;

        ArrayList<String> lista = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Ce cuvand doriti adaugat in lista?");
            String cuvantCitit = sc.nextLine();
            if (cuvantCitit.equals("gata")) {
                break;
            } else {
                lista.add(cuvantCitit);
            }

        }
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.println(lista.get(i));
        }

//        5. Sa se declare un Arraylist de numere intregi in care sa intorduceti 200 de numere introduse random (valori intre 0 si 100);
//        Printati la consola suma numerelor pare din acea lista;

        ArrayList<Integer> numere = new ArrayList<>();
        Random generator = new Random();
        for (int i = 1; i <= 200; i++) {
            int numarGenerat = generator.nextInt(200) + 1;
            numere.add(numarGenerat);
        }
        int suma = 0;
        for (int numar : numere) {
            if (numar % 2 == 0) {
                suma += numar;
            }
        }
        System.out.println("Suma tuturor numerelor pare generate este egala cu " + suma);
    }
}
