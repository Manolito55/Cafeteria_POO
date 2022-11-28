import java.util.LinkedList;
import java.util.Scanner;

import javax.swing.JOptionPane;

public class Venta {
	
	private Cafe cafe;
	private int cantidad;
	private double precio_final;

	public Venta(Cafe cafe, int cantidad, double precio_final) {
		super();
		this.cafe = cafe;
		this.cantidad = cantidad;
		this.precio_final = precio_final;
	}

	public Cafe getCafe() {
		return cafe;
	}

	public void setCafe(Cafe cafe) {
		this.cafe = cafe;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public double getPrecio_final() {
		return precio_final;
	}

	public void setPrecio_final(double precio_final) {
		this.precio_final = precio_final;
	}

	@Override
	public String toString() {
		return "Venta [cafe=" + cafe + ", cantidad=" + cantidad + ", precio_final=" + precio_final + "]";
	}

	public void NuevaVenta() {
		
		Cafe cafe = new Cafe(0,0,true);
		
		cafe.TipoCafe();
		
		cafe.isSocio();

		cafe.PrecioCafe();
		
		CantidadCafe();
		
		double tot = cafe.getPrecio() * this.cantidad;
		
		setPrecio_final(tot);
	
		
		/*
		Scanner entrada = new Scanner(System.in);

		System.out.println("----------------------------------------------------");
		System.out.println("Desea agregar otro producto?");
		System.out.println("1. Agregar otro producto");
		System.out.println("2. Finalizar Venta");
		System.out.println("----------------------------------------------------");
		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1:
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;
*/

				
				

		Venta venta = new Venta(cafe,this.cantidad,precio_final);
	}
		
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
			
			break;
		case 2:
			
			break;
		case 3:
			
			break;

	
	}
	
	public static void MostrarListaVentas(LinkedList<Venta> lista) {
		
		for (Venta ventas : lista) {
			
			System.out.println("----------------------------------");
			System.out.println("ID: "+lista.indexOf(ventas)+" - " + "Tipo de Cafe: " + );
			
		}
		
	}

	public void CantidadCafe() {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("----------------------------------------------------");
		System.out.println("Ingrese la cantidad");
		System.out.println("----------------------------------------------------");
		int cant = entrada.nextInt();
		
		setCantidad(cant);
	}

	
}
