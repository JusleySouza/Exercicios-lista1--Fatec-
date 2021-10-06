//4. Faça um programa que solicite ao usuário 5 números e apresente como saída:
//o maior e o menor

package maiorEmenor;
import java.util.ArrayList;
import java.util.Scanner;

public class Numeros {
	private Scanner s = new Scanner(System.in);
	public int maior, menor;
	public ArrayList<Integer> numeroUsuario = new ArrayList();
	
public void lerDados() {
	for (int quantidade = 1; quantidade<=5; quantidade++) {
		System.out.println(" Digite um numero: ");
		numeroUsuario.add(s.nextInt());
	}
}

public void examinarDados() {
	maior = numeroUsuario.get(0);
	menor = numeroUsuario.get(0);
	for( int i=0; i<5; i++) {
		if (numeroUsuario.get(i) > maior) {
			maior = numeroUsuario.get(i);
		}
		if ( numeroUsuario.get(i) < menor) {
			menor = numeroUsuario.get(i);
		}
	}
}

public void imprimirValores() {
	System.out.println(" Maior numero: " + maior);
	System.out.println(" Menor numero: " + menor);
}

public static void main(String[] args) {
	Numeros num = new Numeros();
	num.lerDados();
	num.examinarDados();
	num.imprimirValores();
}
}