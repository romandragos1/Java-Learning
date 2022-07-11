package InstructiuniRepetitive;

public class BuclaFORNotiuniTeoretice {

    public static void main(String[] args) {

        String nume = "Dragos";
        for (int i = 0; i < 200; i++) {
            System.out.println(nume + " a fost printat x" + (i + 1));
        }

        for (int i = 1; i <= 100; i++) {
            System.out.println(i);
        }

        for (int i = 100; i >= 1; i--) {
            System.out.println(i);
        }
    }
}
