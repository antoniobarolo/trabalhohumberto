package br.espm.poo.aula03.ex2;

public class Main {

    public static void main(String[] args) {

        Professor p1 = new Professor();
        p1.nome = "Selmini";
        p1.titulacao = "doutor";
        p1.totalDeAulas = 160;
        p1.valorHoraAula = 150;

        System.out.println(p1);

        p1.ajustarValorHoraAula(103);
        System.out.println(p1);

    }

}
