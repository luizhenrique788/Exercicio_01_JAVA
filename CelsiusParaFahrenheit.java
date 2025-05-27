package lista01;

import java.util.Scanner;

public class CelsiusParaFahrenheit {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o valor em Celsius para a conversão: ");
		float celsius = sc.nextFloat();
		System.out.println("O grau em Fahrenheit é: "+ (celsius*1.8 + 32));
		sc.close();
	}
}
