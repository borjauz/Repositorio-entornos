package apoyoTeoria;
import java.util.Scanner;
public class IfSimple {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// meter 2 enteros y q los sume, si>5 "suma > 5"
		int numero1=0;
		int numero2=0;
		System.out.println("Mete el primer numero a sumar");
		numero1=teclado.nextInt();
		System.out.println("Mete el segundo numero a sumar");
		numero2=teclado.nextInt();
		int suma=numero1+numero2;
		if(suma>5) {
			System.out.println("La suma es mayor que 5, resultado: "+suma);
		}
		if(suma==5) {
				System.out.println("La suma es 5, resultado: "+suma);
		}
		if(suma<5) {
			System.out.println("La suma es menor que 5, resultado: "+suma);
		}
		
		
	}

}
