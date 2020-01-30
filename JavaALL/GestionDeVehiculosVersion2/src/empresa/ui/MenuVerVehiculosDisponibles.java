package empresa.ui;

import empresa.model.Vehiculo;

public class MenuVerVehiculosDisponibles {
	public static void show() {
		for (int i = 0; i < Vehiculo.vehiculos.size(); i++) {
			Vehiculo.vehiculos.get(i).verVehiculosDisponibles();
		}		
	}
}
