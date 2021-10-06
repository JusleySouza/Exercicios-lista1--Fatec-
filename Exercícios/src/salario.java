//. Fa�a um programa que receba o sal�rio de um funcion�rio, calcule e mostre o
//novo sal�rio, adicionando um aumento de 25%.

import java.util.Scanner;

public class salario {
	private Scanner s;
	private double salAntigo, salNovo;

public salario() {
	s = new Scanner(System.in);
	salAntigo = 0;
	salNovo = 0;
}

public void lerSalario() {
	System.out.println("Informe o sal�rio do funcion�rio..:");
	salAntigo = s.nextDouble();
}

public void calcularSalarioNovo() {
	salNovo = salAntigo * 1.25;
}

public void imprimirSalarios() {
	System.out.printf("Sal�rio antigo = %.2f\n", salAntigo);
	System.out.printf("Sal�rio novo = %.2f\n", salNovo);
}

public static void main(String args[]) {
	salario obj = new salario();
	obj.lerSalario();
	obj.calcularSalarioNovo();
	obj.imprimirSalarios();
}
}