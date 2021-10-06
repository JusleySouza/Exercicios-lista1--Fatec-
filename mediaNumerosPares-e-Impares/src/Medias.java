//Faça um programa que solicite ao usuário um número e apresente como resultado
//a média de todos os números pares e ímpares

import java.util.Scanner;
import java.util.ArrayList;


public class Medias {
	private Scanner s = new Scanner(System.in);
	public int numeroSolicitado, media1, media2;
	public ArrayList<Integer> numerosPares = new ArrayList();
	public ArrayList<Integer> numerosImpares = new ArrayList();

public void lerDados() {
	System.out.println("Digite um numero qualquer: ");
	numeroSolicitado = s.nextInt();
}

public void processarDados() {
	for (int examinaDados  =1; examinaDados<= numeroSolicitado; examinaDados++) {
        if (examinaDados % 2 == 0) {
            numerosPares.add(examinaDados);
        }
        else {
        	numerosImpares.add(examinaDados);
        }
	}
	for (int percorrerPares = 0; percorrerPares < numerosPares.size(); percorrerPares++) {
		media1 += numerosPares.get(percorrerPares);
	}
	for (int percorrerImpares = 0; percorrerImpares < numerosImpares.size(); percorrerImpares++) {
		media2 += numerosImpares.get(percorrerImpares);
	}
	//System.out.println( "Numeros pares: "+ media1);
	//System.out.println( "Numeros impares: "+ media2);
	System.out.println(" Media dos numeros pares: " + media1 / numerosPares.size());
	System.out.println(" Media dos numeros impares: " + media2 / numerosImpares.size());
}

public static void main(String[] args) {
	Medias med = new Medias();
	med.lerDados();
	med.processarDados();
}
}
