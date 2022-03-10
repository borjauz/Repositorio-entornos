package apoyoTeoria;
import java.util.Scanner;
public class TablaForYWhile {
static Scanner teclado = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Introduce el NUMERO de la tabla");
		final int NUMERO = teclado.nextInt();
		int total=0;
		System.out.println("tabla del " + NUMERO + " usando bucle for:");
		 for(int i =0; i<=10; i++) {
			 total=NUMERO*i;
			 System.out.println(total);
		 }
		 
		 int count=0;
		 int tablas=0;
		 System.out.println("tabla del " + NUMERO + " usando bucle while:");
		 while(count<=10) {
			 tablas=count*NUMERO;
			 System.out.println(tablas);
			 count++;
		 }
	}

}
