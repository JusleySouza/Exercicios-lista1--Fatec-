//Fa�a um programa que receba um valor inteiro e informe se ele � um n�mero 
//primo.
 
package numPrimo;
import java.util.Scanner;

public class NumeroPrimo {
	private Scanner s = new Scanner(System.in);
	public int numero, primo=0;
	
public void lerDados() {
	System.out.println("Digite um numero: ");
	numero= s.nextInt();
}

public void analise() {
	for (int i=1; i<= numero; i++) {
            if (numero % i == 0) {
                primo++;
            }
        }
        if (primo == 2) {
            System.out.printf("\n O n�mero " + numero + " � PRIMO!");
        }
        else {
        	 System.out.printf("\n O n�mero " + numero + " N�O � PRIMO!");
    }
}


public static void main(String[] args) {
	NumeroPrimo num = new NumeroPrimo();
	num.lerDados();
	num.analise();
}

}
