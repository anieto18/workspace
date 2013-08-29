
public class trabajo2 {
	public static void main (String[] args ){
		
		int A=8,B=12,a,b;
		    a=A%B;
		    b=B%A;
		   
		    
		    if(a==A && b==0)
		    	System.out.println("Esos numeros son multiplos");
		    else 
		    	System.out.println("Esos numeros no son multiplos");
		    
		    
		    if (A%2==0)
		    	System.out.println("la variable A es par ");
		    else 
		    	System.out.println("la variable A es impar ");
		    
		          if (Math.cbrt(A)*Math.cbrt(A)*Math.cbrt(A)==A)
		        System.out.println("raiz cubica de A e");
		          
		          else
		        	 System.out.println("A no tiene la raiz cubica exacta");
		       
		          System.out.println("la raiz cubica de A es  "+ Math.cbrt(A));
		          
		          
		  
		          
		          
		          if (B%2==0)
			    	System.out.println("la variable B es par ");
			else 
			    	System.out.println("la variable B es impar");
		          
		        if (Math.cbrt(B)*Math.cbrt(B)*Math.cbrt(B)==B)
	                  System.out.println("B tiene la raiz cubica exacta");
		        else
		        	 System.out.println("B no tiene la raiz cubica exacta");
		      
		        System.out.println("la raiz cubica de B es  " + Math.cbrt(B));
		 }

		

}
