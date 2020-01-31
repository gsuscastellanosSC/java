package patronAbstractFactory.primerEjercicio.clases;

import javax.swing.JOptionPane;

import patronAbstractFactory.primerEjercicio.interfaces.Vehiculo;

public class Buseta implements Vehiculo{
	private int codigo;
	public Buseta() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void codigoDeVehiculo() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"El Codigo de la Buseta es:"+getCodigo());
	}

	@Override
	public int generarCodigo() {
		// TODO Auto-generated method stub
		int codigoBuseta=(int) (Math.random()*9999);
		return codigoBuseta;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
