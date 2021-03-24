package br.espm.poo.aula03.ex2;

public class Professor {

    public String nome;
    public String titulacao;
    public double valorHoraAula;
    public int totalDeAulas;

    public double calcularSalario() {
        double sb = valorHoraAula * totalDeAulas * 4.5 * (1 + (
                "mestre".equals(titulacao) ? .03 :
                "doutor".equals(titulacao) ? .085 :
                0
        ));
        double ha = sb * .05;
        double dsr = sb * (1/6) + ha;
        return sb + ha + dsr;
    }

    public void ajustarValorHoraAula(double porcentagem) {
        if (porcentagem < 0 || porcentagem > 100) {
            throw new RuntimeException("Valor do reajuste não é válido [0;100]");
        }
        this.valorHoraAula *= (1 + porcentagem/100);
    }

    public String retornarDados() {
        return toString();
    }

    @Override
    public String toString() {
        return "Professor{" +
                "nome='" + nome + '\'' +
                ", titulacao='" + titulacao + '\'' +
                ", salario=" + calcularSalario() +
                '}';
    }

}
