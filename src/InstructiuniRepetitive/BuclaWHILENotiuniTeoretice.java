package InstructiuniRepetitive;

import java.util.Scanner;

public class BuclaWHILENotiuniTeoretice {

    public static void main(String[] args) {

        String nume = "Dragos";
        int counter = 0;

        while (counter < 10) {
            System.out.println(nume);
            counter++;
        }

//        Scrieti un program care cere utilizatorului sa introduca de la consola un numar mai mare decat 100:

        Scanner sc1 = new Scanner(System.in);
        while (true) {
            System.out.println("Introduceti un numar:");
            int numarIntrodus = sc1.nextInt();
            if (numarIntrodus > 100) {
                System.out.println("Felicitari, ai introdus un numar mai mare decat 100");
                break;
            } else {
                System.out.println("Trebuie sa introduci un numar mai mare decat 100");
            }
        }
    }
}
