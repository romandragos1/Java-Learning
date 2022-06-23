package InstructiuniRepetitive;

import java.util.Random;
import java.util.Scanner;

public class BuclaWHILEExercitii1 {

    public static void main(String[] args) {

        //1. Scrieti un program care sa afiseze textul "Voi deveni programator" de 10 ori folosing WHILE

//        String nume="Voi deveni programator";
//        int counter=0;
//        while (counter<10){
//            System.out.println(nume);
//            counter++;
//        }

        // Afisam primele 5 numere divizibile cu 3
//        int counter=0;
//        while (counter<13){
//            if (counter%3==0){
//                System.out.println(counter);
//            }
//            counter++;
//        }


        //2. Scrieti un program care sa afiseze suma primelor 10 numere naturale folosind WHILE

//        int counter=1;
//        int suma=0;
//        while (counter<=10){
//            suma=suma+counter;
//            counter++;
//        }
//        System.out.println("Suma primelor 10 numere naturale este "+suma);

        //3. Scrieti un program care citeste 4 numere de la user, apoi le inmulteste folosind while

//        Scanner sc1=new Scanner(System.in);
//        int counter=1;
//        int produs=1;
//        while (counter<=4){
//            System.out.println("Introduceti un numar:");
//            int numarCitit=sc1.nextInt();
//            produs=produs*numarCitit;
//            counter++;
//        }
//        System.out.println("Produsul numerelor introduse este "+produs);

        //4. Scrieti un program care citeste un numar int n de la user si afiseaza textul "stiu sa folosesc ciclul WHILE"
        // de n ori pe randuri diferite

//        Scanner sc2=new Scanner(System.in);
//        System.out.println("Introduceti un numar:");
//        int n=sc2.nextInt();
//        int counter=0;
//        while (counter<n){
//            System.out.println("Stiu sa folosesc ciclul WHILE");
//            counter++;
//        }


        //5. Scrieti un program care cere userului in mod repetat un numar int n
        // Cand userul introduce un numar divizibil cu 15, se va printa suma tuturor numerelor introduse si programul se va termina

//        Scanner sc3 = new Scanner(System.in);
//        int suma=0;
//        while (true) {
//            System.out.println("Introduceti un numar:");
//            int numar = sc3.nextInt();
//            suma=suma+numar;
//            if (numar%15==0){
//                break;
//            }
//        }
//        System.out.println("Suma numerelor introduse este "+suma);

        //6. Scrieti un program care cere userului in mod repetat sa introduca numere de la tastatura.
        // Cand userul introduce 0, programul va printa media aritmetica a tuturor numerelor introduse si programul se va termina

//        Scanner sc4=new Scanner(System.in);
//        int suma=0;
//        int count=0;
//        while (true){
//            System.out.println("Introduceti un numar:");
//            int numar=sc4.nextInt();
//
//            if (numar==0){
//                break;
//            }else {
//                suma=suma+numar;
//                count++;
//            }
//        }
//        System.out.println("Meia ariitmetica a numerelor introduse este egala cu "+(suma/count));

        //7. Declarati o variabila de tip int si initializa-ti-o. Programul va cere in mod repetat userului sa ghiceasc numarul.
        // Daca utilizatorul introduce un numar mai mic, se va printa mai adauga
        // Daca utilizatorul introduce un numar mai mare, se va printa mai scade
        // Daca ghiceste numarul, se va printa ai ghicit numarul din x incercari

//        Random generator=new Random();
//        int numarAscuns=generator.nextInt(100);
//        int incercari=0;
//        Scanner sc5=new Scanner(System.in);
//        while (true){
//            System.out.println("Introduceti un numar:");
//            int numar=sc5.nextInt();
//            incercari++;
//            if (numar<numarAscuns){
//                System.out.println("Mai adauga");
//            } else if (numar>numarAscuns) {
//                System.out.println("Mai scade");
//            }else {
//                System.out.println("Felicitari, ai ghicit numarul din "+incercari+ " incercari");
//                break;
//            }
//        }



    }

}
