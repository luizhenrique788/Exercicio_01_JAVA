package lista01;

import java.util.Scanner;

public class Soma {
public static void main(String [] arg){
	
	Scanner sc= new Scanner(System.in);
	
	System.out.println("Diite um numero: ");
	int numero1 =sc.nextInt();
	System.out.println("Digite um numero: ");
	int numero2 =sc.nextInt();
	int resultado =numero1+numero2;
	System.out.println("A soma dos valores digirados é: "+resultado);
	sc.close();
}
}
