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

	public static  Venta NuevaVenta() {
		
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
		
	public  boolean FinalizarVenta(LinkedList<Venta> listaVentas) {
		
		boolean return_casero=true;
		Scanner entrada = new Scanner(System.in);

		System.out.println("----------------------------------------------------");
		System.out.println("xxxxxxxxxxxxxxxxxxxxxx Dia Finalizado xxxxxxxxxxxxxxxxxxxxxx");
		System.out.println("1. Mostrar Lista de Ventas");
		System.out.println("2. Eliminar una Venta de la Lista");
		System.out.println("3. Mostrar Cafe mas vendido");
		System.out.println("4. Mostrar Ingresos Totales");
		System.out.println("5. Mostrar Ventas con Descuento Aplicado");
		System.out.println("6. Salir del Sistema");
		System.out.println("----------------------------------------------------");
		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1:
			Main.MostrarListaVentas(listaVentas);
			return_casero=true;
			break;
		case 2:
			//Elminar en Lista
			return_casero=true;
			break;
		case 3:
			ContadorCafe(listaVentas);
			return_casero=true;
			break;
		case 4:
			ContadorIngresos(listaVentas) ;
			return_casero=true;
			break;
		case 5:
			//Mostrar total ventas socio=true)
			return_casero=true;
			break;
		case 6:
			System.out.println("Finalizando Sistema...");
			System.exit(opcion);
			//return_casero=false; ???????
			break;
		default:
			System.out.println("Se eligio una opción incorrecta, vuelva a intentarlo");
			FinalizarVenta(listaVentas);
			return_casero=true;
			break;


		
		}
		return return_casero;
	}
	
	public static void ContadorCafe(LinkedList<Venta> lista) {  // PORQUE PUBLIC VOID SIN STATIC?????

	int t1=0,t2=0,t3=0,t4=0;
	
for (Venta listaVentas : lista) {
	
	if (listaVentas.getCafe().getTipo()==1) {
		t1 = t1 + listaVentas.getCafe().getCantidad();
		System.out.println("Cantidad de Lattes (Tipo 1) comprados = " + t1);
		
	} else if (listaVentas.getCafe().getTipo()==2) {
		t2 = t2 + listaVentas.getCafe().getCantidad();
		System.out.println("Cantidad de cafe (Tipo 2) comprados = " + t2);
		
	} else if (listaVentas.getCafe().getTipo()==3) {
		t3 = t3 + listaVentas.getCafe().getCantidad();
		System.out.println("Cantidad de cafe (Tipo 3) comprados = " + t3);
		
	} else {
		t4 = t4 + listaVentas.getCafe().getCantidad();
		System.out.println("Cantidad de cafe (Tipo 4) comprados = " + t4);
		
			}
		}
	
	if (t1>t2&&t1>t3&&t1>t4) {
		System.out.println("El Cafe mas vendido fue el Latte, vendiendo " + t1 + "unidades");
	} else if (t2>t1&&t2>t3&&t2>t4) {
		System.out.println("El Cafe mas vendido fue el Flat White, vendiendo " + t2 + "unidades");
	} else if (t3>t1&&t3>t2&&t3>t4) {
		System.out.println("El Cafe mas vendido fue la Lagrima, vendiendo " + t3 + "unidades");
	} else if (t4>t1&&t4>t2&&t4>t3) {
		System.out.println("El Cafe mas vendido fue el Expresso, vendiendo " + t4 + "unidades");
	}

	






}

	public static void ContadorIngresos(LinkedList<Venta> lista) {
		double pf=0;
		for (Venta listaVentas : lista) {
			
			pf= pf + listaVentas.getPrecio_final();
				
		}
		System.out.println("Los Ingresos totales de el dia de hoy fueron " + pf + "$");
	}
	
}