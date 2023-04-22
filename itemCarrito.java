package trabajoocho;

public class itemCarrito extends Producto {
	double total;
	
	itemCarrito(String producto1, double precio1, int cantidad1, double total){
		
		super(producto1, precio1, cantidad1);
		this.total=total;
	}
	
}

