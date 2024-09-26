package funcoes;

import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        int grausfahreint;
        int grauscelsius;
        int celsius;
        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em Fahreint ");
        grausfahreint = input.nextInt();
       
         celsius = 5*((grausfahreint - 32) /9);

         System.out.println("A temperatura em graus Celsius é: "+celsius);
         input.close();
    }
}
