package apoyoTeoria;
import java.util.Scanner;

public class NumerosDistintosACero {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// meter numeros hasta teclear 0, por cada !=0: visualizar por pantalla y al final cuantos !=0 se metieron.
		int cont =0;
		System.out.println("Mete el numero");
		int numero = teclado.nextInt();
		while (numero!=0) {
			cont++;
			System.out.println("Has introducido el: "+numero);
			System.out.println("Mete otro numero");
			numero = teclado.nextInt();
		}
		System.out.print("Has introducido: "+cont+ " numeros distintos a 0");
	}
}
