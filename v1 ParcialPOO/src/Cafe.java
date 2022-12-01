import java.util.Scanner;

import javax.swing.JOptionPane;

public class Cafe {
	
	private int tipo;
	private double precio; 
	private boolean Socio;
	



public Cafe(int tipo, double precio, boolean socio) {
		super();
		this.tipo = tipo;
		this.precio = precio;
		Socio = socio;
	}



public int getTipo() {
	return tipo;
}



public void setTipo(int tipo) {
	this.tipo = tipo;
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
	System.out.println("Seleccione el Tipo de Cafe que desea");
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


	


public void Socio() {
	
	int x = Integer.parseInt(JOptionPane.showInputDialog("Es usted socio?"));
	if (x==1) {
		this.Socio = true;
	} else {
		this.Socio = false;
	}
	
}


}
