package ExerciciosOriginaisBaixadosDaNet.lista01.Exerc_32;

/*******************************************************************************
* 32) Escreva um programa que calcule e exiba a soma dos quadrados dos 20 primeiros
* n�meros inteiros positivos �mpares a partir do n�mero informado pelo usu�rio menor que 10
* e maior que zero.
*******************************************************************************/
import java.util.Scanner;

public class Exercicio32 {

	public static void main(String[] args) {
  
		Scanner entrada = new Scanner(System.in);
		int Numero,NumeroQuadrado,Resultado=0;
		
		do{
			System.out.print("Digite um n�mero maior que 0 e menor que 10: ");
			Numero = entrada.nextInt();
		}while(Numero<=0||Numero>=10);
		
		for(int x = Numero;x < 40+Numero;x++){
			if(x%2==1){
				Resultado += x*x;
			}
		}
		System.out.println("O resultado da soma dos quadrados dos 20 primeiros n�meros inteiros positivos �mpares a partir do n�mero informado �: "+Resultado);
	
	}
}