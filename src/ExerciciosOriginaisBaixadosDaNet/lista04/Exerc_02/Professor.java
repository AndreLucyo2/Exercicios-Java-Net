package ExerciciosOriginaisBaixadosDaNet.lista04.Exerc_02;

/*******************************************************************************
Exercicio no arquivo de imagem.
*******************************************************************************/

public class Professor extends Pessoa{
	private String disciplina;

	//construtor
	public Professor(String nome, String sobrenome,String disciplina){
		super(nome,sobrenome);
		this.disciplina = disciplina;
	}

	//gets
	public String getDisciplina(){
		return this.disciplina;
	}

	//sets
	public void setDisciplina(String disciplina){
		this.disciplina = disciplina;
	}
}
