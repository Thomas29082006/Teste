package funcoes;

import java.util.Scanner;

public class Ex05 {

    public static void main(String[] args) {
        circuloEarea();
    public static void circuloEarea(){
        
        int raiodocirculo;
        double PI = 3.14;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o raio do circulo");
        raiodocirculo = input.nextInt();
        
        double resultado = PI*Math.pow(raiodocirculo, 2);

        System.out.println("O resultado "+ resultado);
    }
}
