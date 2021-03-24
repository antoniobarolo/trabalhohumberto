package br.espm.poo.aula04;

import java.util.Arrays;

public class ExemploArray {

    public static void main(String[] args) {

        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++) {
            vetor[i] = i * i;
            System.out.print(String.format("%d, ", vetor[i]));
        }
        System.out.println();

        for (int x : vetor) {
            System.out.print(String.format("%d, ", x));
        }
        System.out.println();
        for (int x : vetor) {
            x = 10;
            System.out.print(String.format("%d, ", x));
        }
        System.out.println();
        System.out.println(Arrays.toString(vetor));


    }


}
