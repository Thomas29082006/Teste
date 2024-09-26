package funcoes;

import java.util.Scanner;

public class Ex01 {

    public static void main(String[] args){

        int anos, meses, dias, resultado;

        Scanner input = new Scanner(System.in);
        System.out.println("Insira os anos: ");
        anos = input.nextInt();
        System.out.println("Insira os meses: ");
        meses = input.nextInt();
        System.out.println("Insira os dias: ");
        dias = input.nextInt();

        resultado = (anos * 365) + (meses * 30) + dias;
        System.out.println("Resultado final" + resultado);
    
        input.close();
        
    }
}