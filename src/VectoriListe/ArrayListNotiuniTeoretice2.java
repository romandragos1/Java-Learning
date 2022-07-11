package VectoriListe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ArrayListNotiuniTeoretice2 {

    public static void main(String[] args) {

        // Cream o lista de tip Integer in doua feluri
        ArrayList<Integer> listaNumere = new ArrayList<>();
        listaNumere.add(4);
        listaNumere.add(76);
        listaNumere.add(98);
        listaNumere.add(34);
        listaNumere.add(1);
        listaNumere.add(5);
        // sau ArrayList <Integer> listaNumere = new ArrayList<>(Arrays.asList(4,76,98,34,1,5));

        // Printam lista la consola
        for (int numar : listaNumere) {
            System.out.println(numar);
        }

        // Sortam lista:
        Collections.sort(listaNumere);

        // Printam lista sortata
        for (int numar : listaNumere) {
            System.out.println(numar);
        }

        System.out.println();
        System.out.println();

        // Diferite modalitati de introducere cuvinte in lista
        ArrayList<String> lista = new ArrayList<>(Arrays.asList("test1", "test2"));
        lista.add("test3");

        // Printam lista la consola
        for (String s : lista) {
            System.out.println(s);
        }

        // Tipuri de liste
        ArrayList<Double> numereDouble = new ArrayList<>();
        ArrayList<Character> caractere = new ArrayList<>();

        // Printam elementele din lista in mod descrescator
        for (int i = lista.size() - 1; i >= 0; i--) {
            System.out.println(lista.get(i));
        }
    }
}
