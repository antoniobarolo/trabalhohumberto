public class Vendedor extends Empregado implements Salario{
    private double totalDasVendas;
    private double comissao;

    public void setVendedor(double totalDasVendas, double comissao){
        this.totalDasVendas = totalDasVendas;
        this.comissao = comissao;
    }

    public double CalcularSalario(){
        return this.totalDasVendas*this.comissao;
    }
}
