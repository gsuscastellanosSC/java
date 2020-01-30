package patronAbstractFactory.primerEjercicio.fabricas;

import javax.swing.JOptionPane;

import patronAbstractFactory.primerEjercicio.clases.Buseta;
import patronAbstractFactory.primerEjercicio.interfaces.Vehiculo;
import patronAbstractFactory.primerEjercicio.interfaces.VehiculoDeTrasporte;

public class FabricaBusetas implements VehiculoDeTrasporte{

	public FabricaBusetas() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public Vehiculo crearVehiculo() {
		// TODO Auto-generated method stub
		Buseta miBuseta=new Buseta();
		miBuseta.setCodigo(miBuseta.generarCodigo());
		JOptionPane.showMessageDialog(null, "Se ha creado un nuevo Objeto Buseta");
		return miBuseta;
	}

}
