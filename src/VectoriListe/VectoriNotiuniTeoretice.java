package VectoriListe;

public class VectoriNotiuniTeoretice {

    public static void main(String[] args) {

        String[] vectorNume = new String[4];

        vectorNume[0] = "Andrei";
        vectorNume[1] = "Gabi";
        vectorNume[2] = "Andreea";

        for (int index = 0; index < vectorNume.length; index++) {
            System.out.print(vectorNume[index] + " ");
        }
        System.out.println();

        for (int index = vectorNume.length - 1; index >= 0; index--) {
            System.out.print(vectorNume[index] + " ");
        }
        System.out.println();

        for (String nume : vectorNume) {
            System.out.print(nume + " ");
        }
    }
}
