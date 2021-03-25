public class Gerente extends Empregado implements Bonus {
    private double salario;
    private double bonus;

    public void setVendedor(double salario, double bonus){
        this.salario = salario;
        this.bonus = bonus;
    }
    
    public double calcularBonus() {
        double bonus = this.salario*this.bonus;
        return bonus;
    }
}