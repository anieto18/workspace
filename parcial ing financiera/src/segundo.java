import java.util.Scanner ;
public class segundo {
	public static void main(String[] args) {
	int l1,l2,l3,l4, base, altura, largo, ancho ;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("l1");
	l1=sc.nextInt();
	
	System.out.println("l2");
	l2=sc.nextInt();
	
	System.out.println("l3");
	l3=sc.nextInt();
	
	System.out.println("l4") ;
	l4=sc.nextInt ();
	
	System.out.println ("largo");
	largo=sc.nextInt ();
	
	System.out.println ("ancho");
	ancho=sc.nextInt ();
	
	System.out.println ("base");
	base=sc.nextInt ();
	
	System.out.println ("altura") ;
	altura=sc.nextInt ();
	
	int area=base*altura ;
	  System.out.println("el area es"+ area);
	  
	  if(largo*2==ancho)
		  System.out.println ("es doble del ancho");
	  
	  else
		  System.out.println (" no es doble del ancho") ;
	  
		  
		  
	
	}	
	
}
