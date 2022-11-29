import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Venta> listaVentas = new LinkedList<Venta>();
		boolean onoff=true;
		boolean onoff2=true;
		Venta venta = null;
		Cafe cafe = null;
		//PROBLEMAS CONOCIDOS: CONECTAR TODAS LAS FUNCIONES CON EL INTERFAZ/// UBICAR BIEN LAS FUNCIONES(FUERA DE MAIN)
		
		while (onoff == true) {
		
			onoff=ImprimirMenuPrincipal(listaVentas);
			
			
	
			
		}
		
		System.out.println("Dia Finalizado");
		
		while (onoff2==true) {
			
			venta.FinalizarVenta(listaVentas);
			
		}
		
	}


	
	public static boolean ImprimirMenuPrincipal(LinkedList<Venta> A) {
		
		Scanner entrada = new Scanner(System.in);
		boolean devolver=true;

		System.out.println("----------------------------------------------------");
		System.out.println("Que desea hacer ahora? - Elija una opcion");
		System.out.println("1. Agregar Nueva Venta");
		System.out.println("2. Finalizar Dia");
		System.out.println("3. Salir del Sistema");
		System.out.println("----------------------------------------------------");

		int opcion = entrada.nextInt();
		switch (opcion) {

		case 1:
			 System.out.println("Nueva venta iniciada");;
			A.add(Venta.NuevaVenta());
			break;
		case 2:
			devolver=false;
			break;
		case 3:
			System.out.println("Finalizando Sistema...");
			System.exit(opcion);
			break;
		default:
			System.out.println("Se eligio una opción incorrecta, vuelva a intentarlo");
			
			break;
			
	
		}
		return devolver;
		
	}

	public static void MostrarListaVentas(LinkedList<Venta> lista) {
		
		for (Venta listaVentas : lista) {
			
			System.out.println("----------------------------------");
			System.out.println("ID: "+lista.indexOf(listaVentas));
			System.out.println(listaVentas.getCafe());
			System.out.println("Precio Final: " + listaVentas.getPrecio_final() + "$");
			
		}
		
	}

	
	
	
	
	
	
	
	
	
	
/*	public static void ContadorCafe(LinkedList<Venta> lista) {

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
*/

}



	
	

