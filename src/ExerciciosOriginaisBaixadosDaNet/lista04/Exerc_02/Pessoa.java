package ExerciciosOriginaisBaixadosDaNet.lista04.Exerc_02;

/*******************************************************************************
Exercicio no arquivo de imagem.
*******************************************************************************/

public class Pessoa{
	String nome,sobrenome;

	//construtor
	public Pessoa(String nome, String sobrenome){
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	//gets
	public String getNome(){
	 return this.nome;
	}
	public String getSobrenome(){
		return this.sobrenome;
	}
	//sets
	public void setNome(String nome){
		this.nome = nome;
	}
	public void setSobrenome(String sobrenome){
		this.sobrenome = sobrenome;
	}
}
