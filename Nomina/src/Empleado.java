
public class Empleado {
 
	 final private String cedula ;
	 private String apellido ;
	 private String nombre ;
     private double horasTrabajadas ;
     private double sueldoHoras ;
     
     public Empleado(String cedula, String apellido, String nombre, double horasTrabajas, double sueldoHoras) {

            if (cedula!=null) this.cedula = cedula ;
            else this.cedula ="" ;
            	setApellido(apellido);
            	setNombre(nombre);
            	setSueldoHoras(sueldoHoras);
            	setHorasTrabajadas(horasTrabajadas);
            	
     } 	

     public double calcularSueldo(){
    	 return horasTrabajadas * sueldoHoras;
     }
      
     public String getCalcular(){
    	 return cedula ;
     }
     
     public String getApellido(){
    	 return apellido ;
     }
     
     public void setApellido(String apellido){
    	 if (apellido!=null) this.apellido = apellido;
    	 else this.apellido = "" ;
     }
     
     public String getNombre(){
    	 return nombre;
     }
     
     public void setNombre(String nombre){
    	 if (nombre!=null) this.nombre = nombre;
    	 else this.nombre = "" ;
     }   
     
     public double getHorasTrabajadas(){
    	 return horasTrabajadas ;
     }
     
     public void setHorasTrabajadas(double horas){
    	 if (horasTrabajadas>=0) this.horasTrabajadas = horas;
    	 else this.horasTrabajadas = 0 ;
     }
     
     public double getSueldoHoras(){
    	 return sueldoHoras;
     }	 
     
     public void setSueldoHoras(double sueldo){
    	 if (sueldoHoras>=0) this.sueldoHoras = sueldo;
    	 else this.sueldoHoras = 0 ;
    	 
     }
     
     }
     
     
     

