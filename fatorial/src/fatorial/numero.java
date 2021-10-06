//Faça um programa que receba como entrada um valor inteiro e apresente como
//resultado o seu fatorial

package fatorial;
import java.util.Scanner;

public class numero {
	private Scanner s = new Scanner(System.in);
	public int numeroUsuario, fatorial = 1;
	
public void lerDados() {
	System.out.println(" Digite um numero para receber o fatorial: \n");
	numeroUsuario = s.nextInt();
}
	
public void fatorando() {
		for (int i = 0; i < numeroUsuario; i++) {
			fatorial  =  fatorial * (numeroUsuario - i);
		}
		System.out.printf("Fatorial do numero " + numeroUsuario + ": " +fatorial);
}

public static void main(String[] args) {
	numero num = new numero();
	num.lerDados();
	num.fatorando();
}
}
