package trabajoocho;

public class Descuento extends itemCarrito {
	double descuento;
	
	Descuento(String producto1, double precio1, int cantidad1, double total, double descuento){
		
		super(producto1, precio1, cantidad1, total);
		this.descuento=descuento;
	}
	
}