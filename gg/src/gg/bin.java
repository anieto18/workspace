package gg;

import java.util.Scanner;

public class bin {
public static void main(String[] args) {
	Scanner dato = new Scanner (System.in);
	
	System.out.println("ingrese el primer dato");
	int x= dato.nextInt();
	/*System.out.println("ingrese el segundo dato");
	int y= dato.nextInt();
	*/
	if (x > 1 && x < 0){
		System.out.println("no es binario");
	}
}
}
