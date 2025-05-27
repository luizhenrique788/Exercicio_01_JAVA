package lista01;

import java.util.Scanner;

public class RestoDivisao {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int numero1 = sc.nextInt();
		System.out.println("Digite um número: ");
		int numero2 = sc.nextInt();
		int resto = numero1 % numero2;
		int resultado = numero1 / numero2;
		System.out.println("O valor do restante da divisão é: " + resto);
		System.out.println("O valor da divisão é: "+ resultado);
		sc.close();
	}

}
