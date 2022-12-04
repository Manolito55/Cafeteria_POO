package Logica;

import java.util.Scanner;

public class Cafe {
	
	private int tipo,cantidad;
	private double precio; 
	private boolean Socio;
	
public Cafe(int tipo, int cantidad, double precio, boolean socio) {
		super();
		this.tipo = tipo;
		this.cantidad = cantidad;
		this.precio = precio;
		Socio = socio;
	}

public int getTipo() {
	return tipo;
}

public void setTipo(int tipo) {
	this.tipo = tipo;
}

public int getCantidad() {
	return cantidad;
}

public void setCantidad(int cantidad) {
	this.cantidad = cantidad;
}

public double getPrecio() {
	return precio;
}

public void setPrecio(double precio) {
	this.precio = precio;
}

public boolean isSocio() {
	return Socio;
}

public void setSocio(boolean socio) {
	Socio = socio;
}

@Override
public String toString() {
	return "Tipo de Cafe = " + tipo + ", Cantidad Comprada = " + cantidad + ", Socio = " + Socio;
}

public void PrecioCafe() {
	
	if (Socio) {
		
		if (this.tipo == 1) {
			this.precio = 1.27;	
		} else if (this.tipo == 2) {
			this.precio = 2.13;
		} else if (this.tipo == 3) {
			this.precio = 1.11;
		} else if (this.tipo == 4) {
			this.precio = 0.85;
		} else {
			System.out.println("El tipo de cafe ingresado no existe");
		}
		
	} else {
		
		if (this.tipo == 1) {
			this.precio = 1.50;	
		} else if (this.tipo == 2) {
			this.precio = 2.50;
		} else if (this.tipo == 3) {
			this.precio = 1.30;
		} else if (this.tipo == 4) {
			this.precio = 1.00;
		} else {
			System.out.println("El tipo de cafe ingresado no existe");
		}
	}	
	
	


	}

public void TipoCafe() {
	
	Scanner entrada = new Scanner(System.in);

	System.out.println("----------------------------------------------------");
	System.out.println("Seleccione el Tipo de Cafe");
	System.out.println("1. Latte");
	System.out.println("2. Flat White");
	System.out.println("3. Lagrima");
	System.out.println("4. Expresso");
	System.out.println("----------------------------------------------------");

	int opcion = entrada.nextInt();
	switch (opcion) {
	case 1:
		this.tipo = 1; 
		break;
	case 2:
		this.tipo = 2; 
		break;
	case 3:
		this.tipo = 3;
		break;
	case 4:
		this.tipo = 4; 
		break;
	default:
		System.out.println("Se eligio una opción incorrecta, vuelva a intentarlo");
		TipoCafe();
		break;
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

public void Socio() {
	
	Scanner entrada = new Scanner(System.in);

	System.out.println("----------------------------------------------------");
	System.out.println("Es Socio?");
	System.out.println("1. Si");
	System.out.println("2. No");
	System.out.println("----------------------------------------------------");
	int opcion = entrada.nextInt();
	switch (opcion) {
	case 1:
		setSocio(true);
		break;
	case 2:
		setSocio(false);
		break;
	default:
		System.out.println("Ingrese una opcion valida");
		Socio();
		break;
	}

	
}


}
