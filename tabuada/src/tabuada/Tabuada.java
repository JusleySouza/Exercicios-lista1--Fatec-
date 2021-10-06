//Construa um programa que exiba a tabuada de 1 até N, onde N é o número
//informado pelo usuário

package tabuada;
import java.util.Scanner;

public class Tabuada {
	private Scanner s = new Scanner(System.in);
	public int numero;
	
public void lerDados() {
	System.out.println(" Digite um numero para efetuar a tabuada: ");
	numero = s.nextInt();
	System.out.printf("Tabuada limite = " + numero);
}

public void multiplicacao() {
	for (int tabu = 1; tabu <= numero; tabu++){
		System.out.println("\n**********************************");
		System.out.println("\nTabuada do "+tabu + ":"); 
		for (int multiplica = 1; multiplica <= 10; multiplica++){ 
			System.out.print(+ tabu +" x "+ multiplica +" = " + tabu * multiplica + "\n");
		}
	}
	System.out.println("\n***********************************");
}

public static void main(String[] args) {
	Tabuada tab = new Tabuada();
	tab.lerDados();
	tab.multiplicacao();
}
}
