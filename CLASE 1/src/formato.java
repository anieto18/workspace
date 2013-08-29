
public class formato {
	int edadpersona, numerotelefono;
	String sexopersona, nombrepersona;

	 formato (String nombrepersona, int edadpersona) {
		this.nombrepersona=nombrepersona;
		this.edadpersona=edadpersona;
		
		
		
		
	}
	
	formato (String nombrepersona, int edadpersona, String sexopersona){
		this.nombrepersona=nombrepersona;
		this.edadpersona=edadpersona;
		this.sexopersona=sexopersona;
		
		
	}
	String comprobar(){
		if(edadpersona>=0 && edadpersona<=17){
			return "menor de edad";
		}
		else{
			return "mayor de edad";
		}
	
		
	
		
		
		
	}
	public static void main(String x3[]){
		formato x1=new formato("Luis Eduardo Novoa Enciso", 2);
		System.out.println(x1.comprobar());
		x1.comprobar("Luis Eduardo Novoa Enciso", 5);
		
	}
	void comprobar(String nombre, int edad){
		if(edadpersona>=0 && edadpersona<=7){
			System.out.println(nombrepersona+" usted es un niño"); 
			
		}
		else{
			if(edadpersona>7 && edadpersona<=15){
				System.out.println(nombrepersona+" usted es un puber");
				
			}
			else{
				if(edadpersona>15 && edadpersona<=18){
					System.out.println(nombrepersona+" usted es un adolescente"); 
				}
				else
					if(edadpersona>18 && edadpersona<=25){
						System.out.println(nombrepersona+" usted es un joven"); 
					}
					else
						if(edadpersona>25 && edadpersona<=50){
							System.out.println(nombrepersona+" usted es mayor"); 
						}
						else{
							if(edadpersona>50 && edadpersona<=100){
								System.out.println(nombrepersona+" usted es anciano"); 
								
							}
							
						}
			
			}
		}
	
		
	}
	
	 
				
			
		
		
	}

		
	
		
			
		
		
	
	
	
		
		
	


