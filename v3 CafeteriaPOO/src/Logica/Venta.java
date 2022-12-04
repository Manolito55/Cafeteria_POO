package Logica;
import java.util.LinkedList;
import java.util.Scanner;

import Interfaz.Main;

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

	public static  Venta NuevaVenta() {
		
		Cafe cafe = new Cafe(0,0,0,true);
		
		cafe.TipoCafe();
		
		cafe.Socio();

		cafe.PrecioCafe();
		
		cafe.CantidadCafe();
		
		double tot = cafe.getPrecio() * cafe.getCantidad(); 
		
		Venta venta = new Venta(cafe,0);
		
		venta.setPrecio_final(venta.getPrecio_final() + tot); 
		
		System.out.println("El monto a pagar es " + venta.getPrecio_final() + "$");
		
		return venta;

	}
	
	public static void ContadorCafe(LinkedList<Venta> lista) { 

	int t1=0,t2=0,t3=0,t4=0;
	
	if (lista.isEmpty()) {
		
		System.out.println("No hubo cafe vendidos");
		
	} else {

	
for (Venta listaVentas : lista) {
	
	if (listaVentas.getCafe().getTipo()==1) {
		t1 = t1 + listaVentas.getCafe().getCantidad();
		//System.out.println("Cantidad de (Tipo 1) comprados = " + t1);
		
	} else if (listaVentas.getCafe().getTipo()==2) {
		t2 = t2 + listaVentas.getCafe().getCantidad();
		//System.out.println("Cantidad de (Tipo 2) comprados = " + t2);
		
	} else if (listaVentas.getCafe().getTipo()==3) {
		t3 = t3 + listaVentas.getCafe().getCantidad();
		//System.out.println("Cantidad de (Tipo 3) comprados = " + t3);
		
	} else {
		t4 = t4 + listaVentas.getCafe().getCantidad();
		//System.out.println("Cantidad de (Tipo 4) comprados = " + t4);
		
			}
		}
	
	if (t1>t2&&t1>t3&&t1>t4) {
		System.out.println("El Cafe mas vendido fue el Latte, vendiendo " + t1 + " unidades");
	} else if (t2>t1&&t2>t3&&t2>t4) {
		System.out.println("El Cafe mas vendido fue el Flat White, vendiendo " + t2 + " unidades");
	} else if (t3>t1&&t3>t2&&t3>t4) {
		System.out.println("El Cafe mas vendido fue la Lagrima, vendiendo " + t3 + " unidades");
	} else if (t4>t1&&t4>t2&&t4>t3) {
		System.out.println("El Cafe mas vendido fue el Expresso, vendiendo " + t4 + " unidades");
	}

	
	}





}

	public static void ContadorIngresos(LinkedList<Venta> lista) {
		double pf=0;
		
		if (lista.isEmpty()) {
			
			System.out.println("No hubo Ventas");
			
		} else {
	
		for (Venta listaVentas : lista) {
			
			pf= pf + listaVentas.getPrecio_final();
				
		}
		System.out.println("Los Ingresos totales del dia fueron " + pf + "$");
	}
}
	
	public static void ContadorSocios(LinkedList<Venta> lista) {
		int s=0;
		
		if (lista.isEmpty()) {
			
			System.out.println("No hubo Ventas");
			
		} else {

			
			
			for (Venta listaVentas : lista) {
				
				if (listaVentas.getCafe().isSocio()) {
					
					s++;
					
				}
				
					
			}

			System.out.println("Un total de " +s+" ventas recibieron descuento por ser Socios");
	
		}
	
	}
	
	public static void MostrarListaVentas(LinkedList<Venta> lista) {
		
		if (lista.isEmpty()) {
			
			System.out.println("La lista esta vacia");
			
		} else {
			
			for (Venta listaVentas : lista) {

			
			System.out.println("----------------------------------------------------");
			System.out.println("ID: "+lista.indexOf(listaVentas));
			System.out.println(listaVentas.getCafe());
			System.out.println("Precio Final: " + listaVentas.getPrecio_final() + "$");

			}

		}
		
	}
		
	public static void EliminarListaVentas(LinkedList<Venta> lista) {
		
		if (lista.isEmpty()) {
			
			System.out.println("La lista esta vacia");
			
		} else {
	
			System.out.println("----------------------------------------------------");
			System.out.println("Ingrese el ID de la Venta que desea borrar");
			System.out.println("----------------------------------------------------");
			
			Scanner entrada = new Scanner(System.in);
			
			int opcion = entrada.nextInt();
	
			
					 if (opcion+1>lista.size()) { 
						
							System.out.println("El ID ingresado no existe en la Lista, volviendo al menu");
							
							Main.ImprimirMenuFinal(lista);
			 
					} else {
						
						lista.remove(opcion);
						
						System.out.println("La Venta se ha eliminado exitosamente");
						
						Main.ImprimirMenuFinal(lista);
				
			}	
		}
	}	

	
}