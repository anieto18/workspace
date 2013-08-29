package programacion;

public class operacion {

int x,y;
public static void main (String m []) {
operacion t=new operacion ();
t.x=7 ;
t.y=8 ;
t.suma ();
t.division();
t.multiplicacion();
t.resta();

}
public void suma  () {
	int r ;
	r= x+y ;
	System.out.println("la suma es" + r) ;
	
}
public void resta  () {
	int p ;
	p= x-y ;
	System.out.println("la resta es" + p) ;

}
public void multiplicacion  () {
	int o ;
	o= x*y ;
	System.out.println("la multiplicacion es" + o) ;
}
public void division () {
	int s ;
	s= x/y ;
	System.out.println("la division es" + s) ;
}
}
 
	 
