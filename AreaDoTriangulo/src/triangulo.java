//Fa�a um programa que calcule e mostre a �rea de um tri�ngulo.
//Area = (base * altura) / 2.

import java.util.Scanner;

public class triangulo {
	private Scanner s;
	private double base, altura, calcular;
	
public void lerDados() {	
	s = new Scanner(System.in);
	System.out.println("Informe o valor da base :  ");
	base = s.nextDouble();
	System.out.println("Informe o valor da altura:  ");
	altura = s.nextDouble();
}	

public void Calcular() {
	calcular = (base * altura) / 2;	
}

public void imprimirDados() {
	System.out.printf(" Area do Triangulo: " + calcular);
}
public static void main(String args[]) {
	triangulo tri = new triangulo();
	tri.lerDados();
	tri.Calcular();
	tri.imprimirDados();
}

}
