package polimorfismo.ventas.api;

import Polimorfismo.Ventas.API.MODEL.Empleado;
import Polimorfismo.Ventas.API.MODEL.Secretario;

public class MenuPrincipal {

	public MenuPrincipal() {
		// TODO Auto-generated constructor stub
		
	}
	public static void main(String[] args) {
		
		Secretario secre0 = new Secretario("Jesus", "Castellanos", "17800", "calle 97#70C-69", "2019-01-01", 313358101, 100000d, "sECRETA", "Supervisor","despacho", 2345);
		secre0.imprimir();
	}

}
