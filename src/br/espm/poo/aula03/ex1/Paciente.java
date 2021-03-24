package br.espm.poo.aula03.ex1;

public class Paciente {

    String nome;
    int idade;

    public Paciente(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public int frequenciaMaxima() {
        return br.espm.poo.aula03.ex1.AHA.FREQUENCIA_MAXIMA - idade;
    }

    public int frequenciaAlvoMin() {
        return (int)(frequenciaMaxima() * .5);
    }

    public int frequenciaAlvoMax() {
        return (int)(frequenciaMaxima() * .85);
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                ", frqMax=" + frequenciaMaxima() +
                ", frqAlvo=[" + frequenciaAlvoMin() + ";" + frequenciaAlvoMax() + "]" +
                '}';
    }

}
