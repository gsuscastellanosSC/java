package Polimorfismo.Ventas.API.MODEL;

public class Vendedor extends Empleado{

	public Vendedor(String nombre, String apellidos, String dni, String direccion, String fechaIngreso,
			double telefonoContacto, double salario, String puestoEmpleado, String supervisor) {
		super(nombre, apellidos, dni, direccion, fechaIngreso, telefonoContacto, salario, puestoEmpleado, supervisor);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double incrementarSalario(double salario) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
