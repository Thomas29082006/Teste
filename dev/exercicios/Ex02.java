package funcoes;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		calculdorDeExpressao();

	}

	public static void calculdorDeExpressao() {
		
		double A, B, C, R, S, D;

		Scanner input = new Scanner(System.in);
		System.out.println("Insira o valor de A");
		A= input.nextInt();
		System.out.println("Insira o valor de B");
		B= input.nextInt();
		System.out.println("Insira o valor de C");
		C= input.nextInt();

		R = Math.pow((A + B), 2);
		S = Math.pow((B + C), 2);
		D = (R + S)/ 2;

		System.out.println("O resultado " + D );

		input.close();
		
	}
	public static void funcao() {
		double A, B, C, R, S, D;

		Scanner input = new Scanner(System.in);
		System.out.println("Insira o valor de A");
		A= input.nextInt();
		System.out.println("Insira o valor de B");
		B= input.nextInt();
		System.out.println("Insira o valor de C");
		C= input.nextInt();

		R = Math.pow((A + B), 2);
		S = Math.pow((B + C), 2);
		D = (R + S)/ 2;

		System.out.println("O resultado " + D );

		input.close();
	}

}
