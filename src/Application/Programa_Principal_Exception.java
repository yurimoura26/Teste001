package Application;

import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class Programa_Principal_Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		try {
			String[] vect = ler.nextLine().split(" ");
			int position = ler.nextInt();
			System.out.println(vect[position]);
			}
			catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição Invalida!");
			}
			catch (InputMismatchException e) {
			System.out.println("Input error");
			}
			System.out.println("End of program");
		
		
		
	ler.close();	
	}

}
