package patronAbstractFactory.primerEjercicio.fabricas;

import javax.swing.JOptionPane;

import patronAbstractFactory.primerEjercicio.clases.Taxi;
import patronAbstractFactory.primerEjercicio.interfaces.Vehiculo;
import patronAbstractFactory.primerEjercicio.interfaces.VehiculoDeTrasporte;

public class FabricaDeTaxis implements VehiculoDeTrasporte{

	public FabricaDeTaxis() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vehiculo crearVehiculo() {
		// TODO Auto-generated method stub
		Taxi miTaxi=new Taxi();
		miTaxi.setCodigo(miTaxi.generarCodigo());
		JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Taxi");
		return miTaxi;
	}

}
