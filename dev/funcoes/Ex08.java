package funcoes;

import java.util.Scanner;

public class Ex08 {

    public static void main(String[] args) {
        int ganhoporhora;
        int horastrabalhadaspordia;
        int totalmes;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o número de ganho por hora ");
        ganhoporhora = input.nextInt();
        System.out.println("Digite o número de horas trabalhadas por mês ");
        horastrabalhadaspordia = input.nextInt();

        totalmes = ganhoporhora * horastrabalhadaspordia * 24;

        System.out.println("Seu salário total no mês é: " + totalmes);

    }
}
