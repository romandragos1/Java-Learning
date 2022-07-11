package VectoriListe;

import java.util.ArrayList;

public class ArrayListNotiuniTeoretice1 {

    public static void main(String[] args) {

        // Declaram o lista Arraylist de tip String
        ArrayList <String> cuvinte = new ArrayList<>();
        cuvinte.add("curs");
        cuvinte.add("curs2");
        cuvinte.add("curs3");

        // Printam lista la consola
        for (String cuvant : cuvinte){
            System.out.print(cuvant+" ");
        }

        // Stergem elementul 3 din lista
        cuvinte.remove(2);
        System.out.println();

        // Printam din nou lista cu elementul 3 sters
        for (String cuvant : cuvinte){
            System.out.print(cuvant+" ");
        }
        System.out.println();

        // Adaugam un element pe indexul 1
        cuvinte.add(1,"in_plus");

        // Printam din nou lista cu elementul adaugat pe indexul 1
        for (String cuvant : cuvinte){
            System.out.print(cuvant+" ");
        }
    }
}
