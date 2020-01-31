package patronAbstractFactory.primerEjercicio.clases;

import javax.swing.JOptionPane;

import patronAbstractFactory.primerEjercicio.interfaces.Vehiculo;

public class Bus implements Vehiculo{
	private int codigo;
	public Bus() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void codigoDeVehiculo() {
		// TODO Auto-generated method stub
		JOptionPane.showMessageDialog(null,"El Codigo del Bus es : "+getCodigo());
		
	}

	@Override
	public int generarCodigo() {
		int codigoBus=(int) (Math.random()*9999);
		return codigoBus;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

}
