package programacion;

public class totalfactura {
	
	double valorarticulo;
	int cantidadarticulo;
	double subtotal;
	double iva;
	
	totalfactura(double valorarticulo, int cantidadarticulo){
		this.valorarticulo=valorarticulo;
		this.cantidadarticulo=cantidadarticulo;
		
		
	}
	
	totalfactura(double valorarticulo, int cantidadarticulo, double iva){
		this.valorarticulo=valorarticulo;
		this.cantidadarticulo=cantidadarticulo;
		this.iva=iva;
		subtotal=(valorarticulo*cantidadarticulo)/1.15;
		iva=(valorarticulo*cantidadarticulo)-subtotal;
		
	}



}
