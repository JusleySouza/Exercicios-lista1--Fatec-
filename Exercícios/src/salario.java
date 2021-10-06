//. Faça um programa que receba o salário de um funcionário, calcule e mostre o
//novo salário, adicionando um aumento de 25%.

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
	System.out.println("Informe o salário do funcionário..:");
	salAntigo = s.nextDouble();
}

public void calcularSalarioNovo() {
	salNovo = salAntigo * 1.25;
}

public void imprimirSalarios() {
	System.out.printf("Salário antigo = %.2f\n", salAntigo);
	System.out.printf("Salário novo = %.2f\n", salNovo);
}

public static void main(String args[]) {
	salario obj = new salario();
	obj.lerSalario();
	obj.calcularSalarioNovo();
	obj.imprimirSalarios();
}
}