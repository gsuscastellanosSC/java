package patronAbstractFactory.primerEjercicio.fabricas;

import patronAbstractFactory.primerEjercicio.interfaces.VehiculoDeTrasporte;
import patronAbstractFactory.primerEjercicio.interfaces.Vehiculo;

public class FabricaDeVehiculos {

	public static void crearFabricaDeVehiculo(VehiculoDeTrasporte factory){
		Vehiculo objetoVehiculo = factory.crearVehiculo();
		objetoVehiculo.codigoDeVehiculo();
	}

}
