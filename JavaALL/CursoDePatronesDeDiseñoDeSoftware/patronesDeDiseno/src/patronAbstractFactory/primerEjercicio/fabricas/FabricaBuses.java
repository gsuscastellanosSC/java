package patronAbstractFactory.primerEjercicio.fabricas;

import javax.swing.JOptionPane;

import patronAbstractFactory.primerEjercicio.interfaces.VehiculoDeTrasporte;
import patronAbstractFactory.primerEjercicio.clases.Bus;
import patronAbstractFactory.primerEjercicio.interfaces.Vehiculo;



public class FabricaBuses implements VehiculoDeTrasporte{

	public FabricaBuses(){
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vehiculo crearVehiculo() {
		// TODO Auto-generated method stub
		Bus miBus=new Bus();
		miBus.setCodigo(miBus.generarCodigo());
		JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Bus  ");
		return miBus;
	}

}
