//Fa�a um programa que solicite ao usu�rio a entrada de 5 n�meros inteiros e 
//imprima como resultado a soma de todos os �mpares

package somaImpares;
import java.util.Scanner;

public class somadorDeNumerosImpar{
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
	
public void processarDados(int i) {
	if ( numeros[i] % 2 != 0 ) {
		soma = soma + numeros[i];
	}
}
	
public void imprimirDados() {
	System.out.printf(" A soma dos n�meros impares �: " +soma);
}
	
public static void main(String[] args) {
	somadorDeNumerosImpar som = new somadorDeNumerosImpar();
	som.lerDados();
	for (int i = 0; i < 5; i++)	{
		som.processarDados(i);
	}
	
	som.imprimirDados();
}
}
