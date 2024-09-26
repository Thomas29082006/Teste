public class Main {
    public static void  main(String [] args){
        
        int n1 = 10;
        int n2 = 15;
        double res;
        
        // Operadores Aritmeticos
        res = n1 +  n2;
        res = n1 - n2;
        res = n1 * n2;
        res = n1 / n2;
        res = n1 % n2;
        
        if (n1 < n2) {
            System.out.println("O valor e menor que o segundo.");
        } else if (n1 > n2) {
            System.out.println("O segundo valor, e menor que o primeiro.");
        } else {
            System.out.println("Os valores sao iguais.");
        }
        
        // Lacos de repeticao 
        // Laco while
        int repeticao = 0;
        while (repeticao < 10) {
            System.out.println("Volta Nr." + repeticao);
            repeticao++;
        }

        // Loop For
        System.out.println("\n");
        for (int i=0; i<=10; i++) {
            System.out.println("Loop " + i);
        }

        // Switch case 
        int caso = 2;
        switch(caso){
            case 1:
                System.out.println("Primeiro");
                break;
            case 2:
                System.out.println("Segundo");
                break;
            case 3:
                System.out.println("Terceiro");
                break;
            default:
                System.out.println("Outro caso");
                break;
        }

		int valor = 0;
		Scanner entrada =new Scanner(System.in);
		System.out.print("Insira um valor: ");
		valor = entrada.nextInt();
		System.out.println("O valor inserido foi " + valor);
		
		entrada.close();
    }
}
