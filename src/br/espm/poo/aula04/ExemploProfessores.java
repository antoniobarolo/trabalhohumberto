package br.espm.poo.aula04;

import br.espm.poo.aula03.ex2.Professor;

public class ExemploProfessores {

    public static void main(String[] args) {


        Professor[] profs = new Professor[2];

        profs[0] = new Professor();
        profs[0].nome = "Selmini";
        profs[0].titulacao = "doutor";
        profs[0].totalDeAulas = 160;
        profs[0].valorHoraAula = 150;

        Professor p1 = new Professor();
        p1.nome = "Humberto";
        p1.titulacao = "bacharel";
        p1.totalDeAulas = 20;
        p1.valorHoraAula = 30;

        profs[1] = p1;

        for (Professor p : profs) {
            p.ajustarValorHoraAula(40);
            System.out.println(p);
        }
    }

}
