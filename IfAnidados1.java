package apoyoTeoria;
import java.util.Scanner;
	

public class IfAnidados1 {
	static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		// meter numero que representa mes, si es 1: enero... mayo
		int numero1=0;
		System.out.println("Introduce el numero de mes");
		numero1=teclado.nextInt();
		if(numero1==1) {
			System.out.println("Enero");
		}else if(numero1==2) {
			System.out.println("Febrero");
		}else if(numero1==3) {
			System.out.println("Marzo");
		}else if(numero1==4) {
			System.out.println("Abril");
		}else if(numero1==5) {
			System.out.println("Mayo");
		}
	}
}
