//Faça um programa que solicite ao usuário um número e gere como saída todo os
//números primos entre 1 e o número informado

package todosOsNumerosPrimos;
import java.util.Scanner;
import java.util.ArrayList;

public class Numeros {
	private Scanner s = new Scanner(System.in);
	public int numero, primo;
	public ArrayList<Integer> totalDePrimos = new ArrayList();
	
public void lerDados() {
	System.out.println("Digite um numero inteiro quelquer: ");
	numero = s.nextInt();
}
	
public void processarDados() {
	for(int j=1; j<=numero; j++) {
		primo = 0;
		for (int i=1; i<= j; i++) {
			if (j % i == 0) {
            primo++;
			}
        }
		if (primo == 2) {
            totalDePrimos.add(j) ;
        }
	}
}
public void imprimirDados() {
	for (int x=0; x < totalDePrimos.size(); x++) {
		System.out.println(" Numeros primos: "+ totalDePrimos.get(x));
	}
}
	
public static void main(String[] args) {
	Numeros num = new Numeros();
	num.lerDados();
	num.processarDados();
	num.imprimirDados();
}
}
