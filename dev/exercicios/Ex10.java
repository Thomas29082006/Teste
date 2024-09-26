package funcoes;

import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        calculador();
    }
public static void calculador(){
    int numerointeiro;
    int numerointeiro1;
    double numeroreal;
    Scanner input = new Scanner(System.in);

    System.out.println("Digite o primeiro número inteiro ");
    numerointeiro = input.nextInt();

    System.out.println("Digite o segundo número inteiro ");
    numerointeiro1 = input.nextInt();

    System.out.println("Digite um número real ");
    numeroreal = input.nextDouble();

    double produto = (2 * numerointeiro)*(numerointeiro1 / 2);

    double soma = (3 * numerointeiro)+numeroreal;

    double cubo = Math.pow(numeroreal, 3);

    System.out.println("Resultado do produto do dobro do primeiro com metade do segundo: "+produto);
    System.out.println("Resultado da soma do triplo do primeiro produto com o terceiro: "+soma);
    System.out.println("Resultado do terceiro elevado ao cubo: "+cubo);

    input.close();


}  
}
