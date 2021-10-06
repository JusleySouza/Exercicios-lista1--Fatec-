//. Faça um programa que solicite ao usuário um número de 1 a 10 e gere como 
//saida o produto dos números pares compreendidos entre 1 e o número informado:

package produtoDosNumerosPares;
import java.util.Scanner;
import java.util.ArrayList;

public class NumerosPares {
	private Scanner s = new Scanner(System.in);
	int numeroUsuario, resultado = 1;
	public ArrayList<Integer> numerosPares = new ArrayList();
	
public void lerDados() {
	do{
		System.out.println(" Digite um numero qualquer entre 1 e 10: ");
		numeroUsuario = s.nextInt();
	}while(numeroUsuario < 1 || numeroUsuario >10 );
}

public void produtoPares() {
	for (int examinaNumeros=1; examinaNumeros< numeroUsuario; examinaNumeros++) {
        if (examinaNumeros % 2 == 0) {
            numerosPares.add(examinaNumeros);
        }
	}
	for (int percorrerPares = 0; percorrerPares < numerosPares.size(); percorrerPares++) {
		resultado *= numerosPares.get(percorrerPares);
	}
	System.out.println(" Produto dos numeros pares: " + resultado);
}

public static void main(String[] args) {
	NumerosPares num = new NumerosPares();
	num.lerDados();
	num.produtoPares();
}

}
