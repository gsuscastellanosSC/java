package patronAbstractFactory.primerEjercicio.clases;

import javax.swing.JOptionPane;

import patronAbstractFactory.primerEjercicio.interfaces.Vehiculo;

public class Taxi implements Vehiculo{
	private int codigo;
	public Taxi() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void codigoDeVehiculo() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"El Codigo del Taxi es : "+getCodigo());
	}

	@Override
	public int generarCodigo() {
		// TODO Auto-generated method stub
		int codigoTaxi=(int) (Math.random()*9999);
		return codigoTaxi;
	}

	public void setCodigo(int generarCodigo) {
		// TODO Auto-generated method stub
		this.codigo = codigo;
	}

	public int getCodigo() {
		return codigo;
	}


}
