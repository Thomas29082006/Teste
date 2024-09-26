package funcoes;

import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        pesoIdeal();
    }
    public static void pesoIdeal(){
        double altura;
        int peso;
        int genero;
        double pesoideal = 0;
        int homem;
        int mulher;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a sua altura: ");
        altura = input.nextDouble();
        
        System.out.println("Digite o gênero da pessoa (1 para feminino e 2 para masculino): ");
        genero = input.nextInt();
       


        if (genero == 2) {

            pesoideal = (72.7*altura) - 58;
            
        }else if (genero == 1) {
            pesoideal = (62.1*altura) - 44.7;
        } else {
            System.out.println("Valor inserido inválido!");
        }

        System.out.println("O peso ideal de acordo com o seu gênero é: "+pesoideal);

        input.close();
    }
    
}
