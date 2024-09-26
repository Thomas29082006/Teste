package funcoes;

import java.util.Scanner;

public class Ex06 {
    
    public static void main(String[] args) {
        int alturadoquadrado;
        int ladodoquadrado;
        int areadoquadrado;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a altura do quadrado");
        alturadoquadrado = input.nextInt();
        System.out.println("Digite o lado do quadrado");
        ladodoquadrado = input.nextInt();

        areadoquadrado = alturadoquadrado*ladodoquadrado*2;

        System.out.println("A área do quadrado é "+ areadoquadrado);

        input.close();
    }
}
