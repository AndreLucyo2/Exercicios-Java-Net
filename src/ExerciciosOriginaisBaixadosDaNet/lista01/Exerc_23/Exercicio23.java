package ExerciciosOriginaisBaixadosDaNet.lista01.Exerc_23;

/*******************************************************************************
* 23) Escreva um programa que exiba as seguintes op��es e realize os que se pede em cada
* uma delas:
*		1 � Adi��o
*		2 � Subtra��o
*		3 � Multiplica��o
*		4 � Divis�o
*******************************************************************************/

import java.util.Scanner;

public class Exercicio23 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double PrimeiroNumero,SegundoNumero,Resultado;
		int Menu;
      	System.out.print("Menu Calculadora\n\n"); 
		
		
		System.out.print("Digite uma das opera��es a seguir:\n\t1 - Adi��o\n\t2 - Subtra��o\n\t3 - Multiplica��o\n\t4 - Divis�o\n");
		Menu = entrada.nextInt();
		
		
		System.out.print("Digite o primeiro n�mero: ");
		PrimeiroNumero = entrada.nextDouble();
		
		System.out.print("Digite o segundo n�mero: ");
		SegundoNumero = entrada.nextDouble();
		
		
		switch(Menu){
			case 1:
				Resultado = PrimeiroNumero + SegundoNumero;
				System.out.printf("%f + %f = %f",PrimeiroNumero,SegundoNumero,Resultado);
				break;
			case 2:
				Resultado = PrimeiroNumero - SegundoNumero;
				System.out.printf("%f - %f = %f",PrimeiroNumero,SegundoNumero,Resultado);
				break;
			case 3:
				Resultado = PrimeiroNumero * SegundoNumero;
				System.out.printf("%f * %f = %f",PrimeiroNumero,SegundoNumero,Resultado);
				break;
			case 4:
				Resultado = PrimeiroNumero / SegundoNumero;
				System.out.printf("%f / %f = %f",PrimeiroNumero,SegundoNumero,Resultado);
				break;
			default:
				System.out.print("Op��o inv�lida!");
		}
		
		
	}
	
}
