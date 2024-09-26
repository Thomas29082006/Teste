package funcoes;

import java.util.Scanner;

public class Paramentrizacao {
    public static void main(String[] args) {
        
        int x, y, resultado;

        Scanner input = new Scanner(System.in);
        System.out.println( "Insira o valor de X: ");
        x = input.nextInt();
        System.out.println( "Insira o valor de Y: ");
        y = input.nextInt();
          
        resultado = soma(x, y);
        System.out.println("O resultado é" + resultado);

        input.close();
    }
    
    public static int soma(int x, int y) {
        int resultado = x + y;
        return resultado;
    }
}
