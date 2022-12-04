import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Venta {
	
	private Cafe cafe;
	private double precio_final;

	public Venta(Cafe cafe, double precio_final) {
		super();
		this.cafe = cafe;
		this.precio_final = precio_final;
	}
	
	public Cafe getCafe() {
		return cafe;
	}

	public void setCafe(Cafe cafe) {
		this.cafe = cafe;
	}

	public double getPrecio_final() {
		return precio_final;
	}

	public void setPrecio_final(double precio_final) {
		this.precio_final = precio_final;
	}
	
	@Override
	public String toString() {
		return "Venta [cafe=" + cafe + ", precio_final=" + precio_final + "]";
	}

	public static Venta NuevaVenta() {
		
		Cafe cafe = new Cafe(0,0,0,true);
		
		cafe.TipoCafe();
		
		cafe.Socio();

		cafe.PrecioCafe();
		
		cafe.CantidadCafe();
		
		double tot = cafe.getPrecio() * cafe.getCantidad(); 
		
		Venta venta = new Venta(cafe,0);
		
		venta.setPrecio_final(venta.getPrecio_final() + tot); 
		
		System.out.println("El monto a pagar es: " + venta.getPrecio_final() + "$");
		
		return venta;

	}
		
	/*
	public static void FinalizarVenta() {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("----------------------------------------------------");
		System.out.println("Desea agregar otro producto?");
		System.out.println("1. Agregar otro producto");
		System.out.println("2. Finalizar Venta");
		System.out.println("----------------------------------------------------");
		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1:
			Venta.NuevaVenta();
			break;
		case 2:
			System.out.println("Venta finalizada");
		
			break;
		case 3:
			
			break;
		}
	}
	*/

}
