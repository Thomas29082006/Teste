package funcoes;

import java.util.Scanner;

public class Ex07 {
    public static void main(String [] args){
        
        int n1, n2, n3;

        Scanner input = new Scanner(System.in);
        
        System.out.println("Insira o valor de n1 ");
        n1 = input.nextInt();
        System.out.println("Digite o valor de n2 ");
        n2 = input.nextInt();
        System.out.println("Digite o valor de n3");
        n3 = input.nextInt();

        int maior = n1;
        
        if (n2 > maior) {
            maior = n2;
        }
        if (n3 > maior) {
            maior = n3;
        }

        System.out.println("O maior número é: "+maior);

        input.close();
    }
}
