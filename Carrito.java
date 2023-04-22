package trabajoocho;

import java.util.*;

public class Carrito {

	public static void main(String[] args) {	
		String producto1;
		double precio1, total, descuento;
		int cantidad1;
		total=0;
		descuento=0;
		precio1=0;
		cantidad1=0;
		Scanner entrada = new Scanner(System.in);
		

		try {
		System.out.println("Ingrese el nombre del producto: ");
		producto1=entrada.nextLine();
		System.out.println("Ingrese el precio del producto: ");
		precio1= entrada.nextDouble();
		System.out.println("Ingrese la cantidad del producto: ");
		cantidad1= entrada.nextInt();
			
		System.out.println("------------------------------------------------------");
		total=precio1*cantidad1;
		
		Producto catalogo = new Producto(producto1, precio1, cantidad1);
		
		itemCarrito compra = new itemCarrito(catalogo.producto1, catalogo.precio1, catalogo.cantidad1, total);
		
		System.out.println("Cantidad           Precio             Producto");
		System.out.println("   " + compra.cantidad1 + "               " + compra.precio1  + "            " + compra.producto1);
		System.out.println("------------------------------------------------------");
		
		
		Descuento rebaja = new Descuento(compra.producto1, compra.precio1, compra.cantidad1, compra.total, descuento);
		
		rebaja.descuento=compra.total*0.85;
		
		if(rebaja.total>1500) {
			System.out.println("El total de la compra es: $" + rebaja.total + ". Debido a que"
					+ " supera los $1500, tiene un descuento del 15%. Por lo tanto, debe pagar: $" 
					+ rebaja.descuento);
		}else {
			System.out.println("El total a pagar es: $" + rebaja.total);
		}
	
		} catch (InputMismatchException e) {
			System.out.println("Debe ingresar los datos de forma correcta.");
		}
	}
}
