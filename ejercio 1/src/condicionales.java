
public class condicionales {

	public static void main(String[] args) {
		double A=20, B=5, C=20;
		System.out.println(Math.sqrt(A));
		if(Math.sqrt(A)*Math.sqrt(A)==A)
			System.out.println(A+"exacta");
		else
			System.out.println(A+" no exacta");
		
		System.out.println("A/2==0,B/2==0,C/2==0");
		if(A%2!=0)
		System.out.println(A+"impar");
		else 
			System.out.println( A+"el numero es par");
		if(B%2==0)
		System.out.println(B+"el numero es par");
		else
			System.out.println(B+"el numero es impar");
		if(C%2==0)
			System.out.println(C+"par");
		else
			System.out.println(C+"impar");
		
		 if (A>B)
			if(A>C)
				if(B>C)
					System.out.println(" "+A+B+C);
				else System.out.println(" "+A+C+B);
			else System.out.println(" "+C+A+B);
		 else
		 if(B>C)
		   if(A>C)
		      System.out.println(" "+B+A+C);
		   else
		      System.out.println(" "+B+C+A);
		 	else
	    	  System.out.println(" "+C+B+A);
		 

	}

}
