import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Venta> listaVentas = new LinkedList<Venta>();
		boolean onoff;
		
		
		while (onoff = true) {
		
			ImprimirMenuPrincipal();
			
			listaVentas.add(Venta.NuevaVenta());
			
			MostrarListaVentas(listaVentas);
			
			System.out.println("Venta finalizada");
			
		}
		
	}


	
	public static void ImprimirMenuPrincipal() {
		
		Scanner entrada = new Scanner(System.in);
		

		System.out.println("----------------------------------------------------");
		System.out.println("Que desea hacer ahora? - Elija una opcion");
		System.out.println("1. Agregar Nueva Venta");
		System.out.println("2. Finalizar Dia");
		System.out.println("3. Salir");
		System.out.println("----------------------------------------------------");

		int opcion = entrada.nextInt();
		switch (opcion) {

		case 1:
			 System.out.println("Nueva venta iniciada");
			break;
		case 2:
			//Finalizar Dia
			break;
		case 3:
			System.out.println("Finalizando Sistema...");
			System.exit(opcion);
			break;
		default:
			System.out.println("Se eligio una opción incorrecta, vuelva a intentarlo");
			ImprimirMenuPrincipal();
			break;

			
	
		}
		
	}

	public static void MostrarListaVentas(LinkedList<Venta> lista) {
		
		for (Venta listaVentas : lista) {
			
			System.out.println("----------------------------------");
			System.out.println("ID: "+lista.indexOf(listaVentas));
			System.out.println(listaVentas.getCafe());
			System.out.println("Precio Final: " + listaVentas.getPrecio_final() + "$");
			
		}
		
	}

	
}
	
	

