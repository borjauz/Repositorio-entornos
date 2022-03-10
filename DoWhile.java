package apoyoTeoria;
import java.util.Scanner;

public class DoWhile {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		int numero=0;
		do {
			System.out.println("Introduce un numero entre 1 y 5");
			numero = teclado.nextInt();
		}while(!(numero<=5 && numero>=1));
		System.out.println("Su numero esta entre 1 y 5");
		doWhile1();
		doWhile2();
		doWhile3();
	}
	
	public static void doWhile1() {
		int c=4;
		int mult = 1;
		do {
			mult = mult*c;
			c--;
		}while(c!=0);
		System.out.println(mult);
	}
	
	public static void doWhile2() {
		int c=1;
		int mult = 1;
		do {
			mult = mult*c;
			c++;
		}while(c<=4);
		System.out.println(mult);
	}
	
	public static void doWhile3() {
		int c=1;
		int mult = 4;
		do {
			mult = mult*c;
			c++;
		}while(c<=4);
		System.out.println(mult);
	}
}
