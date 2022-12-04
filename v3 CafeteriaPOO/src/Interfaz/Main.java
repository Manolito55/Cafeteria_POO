package Interfaz;

import java.util.LinkedList;
import java.util.Scanner;

import Logica.Cafe;
import Logica.Venta;

public class Main {

	public static void main(String[] args) {
		
		LinkedList<Venta> listaVentas = new LinkedList<Venta>();
		boolean onoff=true;
		boolean onoff2=true;
		//Venta venta = null;
		//Cafe cafe = null;
		//PROBLEMAS CONOCIDOS: CONECTAR TODAS LAS FUNCIONES CON EL INTERFAZ/// UBICAR BIEN LAS FUNCIONES(FUERA DE MAIN)
		//ToDo: 
		while (onoff == true) {
		
			onoff=ImprimirMenuPrincipal(listaVentas);
			
			
	
			
		}
		
		//System.out.println("Dia Finalizado");
		
		while (onoff2==true) {
			
			ImprimirMenuFinal(listaVentas);
			
		}
		
	}


	
	public static boolean ImprimirMenuPrincipal(LinkedList<Venta> A) {
		
		Scanner entrada = new Scanner(System.in);
		boolean devolver=true;

		System.out.println("----------------------------------------------------");
		System.out.println("XXXXXXXXXXXXXXXXX CAFETERIA MANOLO XXXXXXXXXXXXXXXXX");
		System.out.println("X                                                  X");
		System.out.println("X 1. Nueva Venta                                   X");
		System.out.println("X 2. Finalizar Ventas del dia                      X");
		System.out.println("X 3. Salir del Sistema                             X");
		System.out.println("X                                                  X");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("----------------------------------------------------");

		int opcion = entrada.nextInt();
		switch (opcion) {

		case 1:
			 //System.out.println("Nueva venta iniciada");;
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

	public static boolean ImprimirMenuFinal(LinkedList<Venta> lista) {
		
		boolean return_casero=true;
		Scanner entrada = new Scanner(System.in);

		System.out.println("----------------------------------------------------");
		System.out.println("XXXXXXXXXXXXXXXXX CAFETERIA MANOLO XXXXXXXXXXXXXXXXX");
		System.out.println("X              X Ventas Finalizadas X              X");
		System.out.println("X                                                  X");
		System.out.println("X 1. Mostrar Lista de Ventas                       X");
		System.out.println("X 2. Eliminar una Venta de la Lista                X");
		System.out.println("X 3. Mostrar Cafe mas vendido                      X");
		System.out.println("X 4. Mostrar Ingresos Totales                      X");
		System.out.println("X 5. Mostrar Ventas con Descuento Aplicado         X");
		System.out.println("X 6. Salir del Sistema                             X");
		System.out.println("X                                                  X");
		System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
		System.out.println("----------------------------------------------------");
		int opcion = entrada.nextInt();
		switch (opcion) {
		case 1:
			Venta.MostrarListaVentas(lista);
			return_casero=true;
			break;
		case 2:
			Venta.EliminarListaVentas(lista);
			return_casero=true;
			break;
		case 3:
			Venta.ContadorCafe(lista);
			return_casero=true;
			break;
		case 4:
			Venta.ContadorIngresos(lista) ;
			return_casero=true;
			break;
		case 5:
			Venta.ContadorSocios(lista);
			return_casero=true;
			break;
		case 6:
			System.out.println("Finalizando Sistema...");
			System.exit(opcion);
			break;
		default:
			System.out.println("Se eligio una opción incorrecta, vuelva a intentarlo");
			ImprimirMenuFinal(lista);
			return_casero=true;
			break;


		
		}
		return return_casero;
	}
	
}

