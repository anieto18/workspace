import java.util.Scanner;

public class Suma {
	
	public static void main(String a[]){
		Scanner x=new Scanner (System.in);
		System.out.println("digite el primer valor");
		int r= x.nextInt();
		System.out.println("digite el segundo valor");
		int s=x.nextInt();
		int t=suma(r,s);
		int w=x.nextInt();
		System.out.println("el valor resultante es:"+t);
		int u;
		u=r;
	    r=s;
	    s=u;
	    if(r<s){
	    	System.out.println("la potencia es"+ Math.pow(r,s));
	    	}
	    else {
	    	System.out.println("la potencia es"+ Math.pow (s,r));
	    }
	    
	    if (s%3==0)
	    	System.out.println("s es multiplo de 3");
	    else
	    	System.out.println("s no es multiplo de 3");
	    
	   if(r%3==0)
		   System.out.println("r es multiplo de 3");
	    else
	    	System.out.println("r no es multiplo de 3");
	   
	  
	    
	    
	    
	   double v = (-s-Math.sqrt(s * s - 4* r * w)) / (2 * r);
	   
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
		
		
		
	}
	static int suma (int r,int s){
		return r+s; 
	}
}
