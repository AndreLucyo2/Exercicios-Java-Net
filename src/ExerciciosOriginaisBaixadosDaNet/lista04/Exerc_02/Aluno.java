package ExerciciosOriginaisBaixadosDaNet.lista04.Exerc_02;

/*******************************************************************************
Exercicio no arquivo de imagem.
*******************************************************************************/

public class Aluno extends Pessoa{
	private int matricula;

	//construtor
	public Aluno(String nome, String sobrenome, int matricula){
		super(nome,sobrenome);
		this.matricula=matricula;
	}

	//gets
	public int getMatricula(){
		return this.matricula;
	}

	//sets
	public void setMatricula(int matricula){
		this.matricula = matricula;
	}
}
