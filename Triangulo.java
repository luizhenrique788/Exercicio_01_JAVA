package lista01;

import java.util.Scanner;

public class Triangulo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Digite dois valor: ");
		 float numero01 = sc.nextFloat();
		 float numero02 = sc.nextFloat();
		 float resultado = numero01*numero02;
		 System.out.println("O valor do triangulo é: "+ resultado/2);
		 System.out.println("O valor do triangulo é: "+ (numero01*numero02)/2);
}

}
