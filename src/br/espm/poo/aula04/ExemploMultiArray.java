package br.espm.poo.aula04;

public class ExemploMultiArray {

    public static void main(String[] args) {

        int N = 1;
        int M = 1;
        int L = 1;
        int[][][] matrix = new int[N][M][L];

        System.out.println(1000*1000*1000*32/8);

        System.out.println(soma(5, 6, 7));
        System.out.println(soma(5, 6, 7, 9, 1));

    }

    public static double soma(double... termos) {
        double s = 0;
        for (double t : termos) {
            s += t;
        }
        return s;
    }

}
