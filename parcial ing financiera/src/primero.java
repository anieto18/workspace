import java.util.Scanner ;

public class primero {

	public static void main(String[] args) {
		System.out.println("area del triangulo");
		int l1,l2,l3,base,altura;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("base");
		base=sc.nextInt();
		System.out.println("altura");
		altura=sc.nextInt();
		
		System.out.println("l1");
		l1=sc.nextInt ();
		System.out.println("l2");
		l2=sc.nextInt ();
		System.out.println("l3");
		l3=sc.nextInt () ;
		
	  int  area =base*altura/2 ;
	    		System.out.println("el area es"+area  );


	    if(l1==l2&&l1==l2&&l2==l3)
	    	System.out.println("equilatero");
	    else
	    	System.out.println("no equilatero");

	    
	    
	    		

		
		
		
		
		 
		
				
		
		
				
		
		
		

	}

}
