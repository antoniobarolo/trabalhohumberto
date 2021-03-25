public class Pessoa {
    protected String nome;
    protected String cpf;
    
   public void setPessoa(String nome, String cpf){
    this.nome = nome;
    this.cpf = cpf;
   }

	@Override
	public String toString() {
		return "Nome: "+this.nome+", Cpf: "+this.cpf;
	}

}
