package lista01;

import java.util.Scanner;

public class Circulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o raio do circulo para calcular o perimetro: ");
		double pi = 3.14;
		double numero = sc.nextDouble();
		System.out.println("O valor do perimetro do circulo é: "+ pi*numero*2 );
		sc.close();
		
	}

}
