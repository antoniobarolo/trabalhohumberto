public class Vendedor extends Empregado {
    private double totalDasVendas;
    private double comissao;

    public void setVendedor(double totalDasVendas, double comissao){
        this.totalDasVendas = totalDasVendas;
        this.comissao = comissao;
    }
}
