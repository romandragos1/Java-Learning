package InstructiuniDecizionale;

import java.util.Scanner;

public class InstructiuneaSWITCHNotiuniTeoretice {

    public static void main(String[] args) {

//      Exemplul 1:
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Introduceti culoare semafor:");
        String culoareSemafor = sc1.nextLine();

        switch (culoareSemafor) {
            case "rosu":
                System.out.println("Stam si asteptam");
                break;
            case "verde":
                System.out.println("Puteti traversa");
                break;
            case "galben":
                System.out.println("Suntem prudenti");
                break;
            default:
                System.out.println("Nu ai introdus o culoare valabila");
                break;
        }

//      Exemplul2:
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Introduceti luna curenta:");
        String lunaCurenta = sc2.nextLine();

        switch (lunaCurenta) {
            case "decembrie":
            case "ianuarie":
            case "februarie":
                System.out.println("Este iarna");
                break;
            case "martie":
            case "aprilie":
            case "mai":
                System.out.println("Este primavara");
                break;
            case "iunie":
            case "iulie":
            case "august":
                System.out.println("Este vara");
                break;
            case "septembrie":
            case "octombrie":
            case "noiembrie":
                System.out.println("Este toamna");
                break;
            default:
                System.out.println("Nu ai introdus o luna valida");
                break;
        }
    }
}
