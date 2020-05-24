package ExerciciosOriginaisBaixadosDaNet.lista01.Exerc_31;

/*******************************************************************************
* 31) Escrever um programa que leia um conjunto de n�meros positivos, e exiba se o n�mero
* lido � par ou �mpar. Exiba ao final a soma total dos n�meros pares lidos e tamb�m a soma dos
* n�meros �mpares lidos. Suporemos que o n�mero de elementos deste conjunto n�o �
* conhecido, e que um n�mero negativo ser� utilizado para sinalizar o fim dos dados.
*******************************************************************************/
import java.util.Scanner;

public class Exercicio31 {

  public static void main(String[] args) {
  
    Scanner entrada = new Scanner(System.in);
    int Numero=0,QuantPar=0,QuantImpar=0;
	
	while(Numero>=0){
	
		System.out.print("Digite um n�mero (numeros negativos finalizam): ");
		Numero = entrada.nextInt();
		if(Numero>=0){
			if(Numero%2==0){
				QuantPar++;
			}else{
				QuantImpar++;
			}
		}
	}
    
	System.out.println("\n\nQuantidade de N�meros Pares: "+QuantPar+"\nQuantidade de N�meros Impares: "+QuantImpar);
	
  }
}
