package Vectori;

import java.util.Arrays;

public class AlgoritmDeSortareBUBBLESORT {

    public static void main(String[] args) {

        int [] numere= {34,54,76,12,3,999,77,6,45,34};

        for (int i=0; i< numere.length; i++){
            for (int j=i+1; j< numere.length; j++){
                if (numere[i] > numere[j]){
                    int temp = numere[i];
                    numere[i] = numere[j];
                    numere[j]=temp;
                }
            }
        }

        System.out.println(Arrays.toString(numere));

    }

}
