//Faça um programa que solicite ao usuário a entrada de 5 números inteiros e imprima
//como resultado a soma de todos os pares

package somadorDeNumerosPares;
import java.util.Scanner;

public class somaPares {
	private Scanner s;
	public int soma, contador;
	public int numeros[] = new int[5];
	
public void lerDados() {
	s = new Scanner(System.in);
	for (int i = 0; i < 5; i++ ) {
		System.out.println("\n Digite um numero inteiro: ");
		numeros[i] = s.nextInt();
	}
}
	
public void processarDados() {
	for (int i = 0; i < 5; i++)	{
		if ( numeros[i] % 2 == 0 ) {
			soma = soma + numeros[i];
		}
	}
}
	
public void imprimirDados() {
	System.out.printf(" A soma dos números pares é: " +soma);
}
	
public static void main(String[] args) {
	somaPares som = new somaPares();
	som.lerDados();
	som.processarDados();
	som.imprimirDados();
}
}
