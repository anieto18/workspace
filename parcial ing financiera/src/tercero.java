

import java.util.Scanner;
public class tercero {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		
		int x,y,z;
		
		double promedio;
		double suma;
		double doble;
		double triple;
		double cuadrado;
		
		System.out.println("este programa halla el promedio de 3numeros, la suma y desplegar del 1er numero el doble, del 2do numero el triple y del tercer el numero el cuadrado");
		System.out.println("ingresa el 1er numero");
		x= teclado.nextInt();
		System.out.println("ingresa el 2do numero");
		y= teclado.nextInt();
		System.out.println("ingresa el 3er numero");
		z= teclado.nextInt();
		
		promedio= (x+y+z)/3;
		System.out.println("el promedio es="+promedio);
		
		suma= x+y+z;
		System.out.println("la suma es="+suma);
		
		doble= x*2;
		System.out.println("el doble es"+doble);
		
		triple= y*3;
		System.out.println("el triple es"+triple);
		
		cuadrado= z*z;
		System.out.println("el cuadrado es"+cuadrado);
		
	}
	
}


