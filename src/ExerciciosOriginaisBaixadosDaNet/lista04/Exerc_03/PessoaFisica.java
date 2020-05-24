package ExerciciosOriginaisBaixadosDaNet.lista04.Exerc_03;

/*******************************************************************************
Exercicio no arquivo de imagem.
*******************************************************************************/

public class PessoaFisica extends Cliente{
	private String cpf;

	//construtor
	public PessoaFisica(String nome, String endereco,String telefone,String cpf){
		super(nome,endereco,telefone);
		this.cpf=cpf;
	}

	//gets
	public String getCpf(){
		return this.cpf;
	}

	//sets
	public void setCpf(String cpf){
		this.cpf = cpf;
	}

	//toString
	public void ImprimirDados(){
		System.out.println("Pessoa Física:\n\tNome: "+this.nome+"\n\tEndereço: "+this.endereco+"\n\tTelefone: "+this.telefone+"\n\tCPF: "+this.cpf);
	}
}
