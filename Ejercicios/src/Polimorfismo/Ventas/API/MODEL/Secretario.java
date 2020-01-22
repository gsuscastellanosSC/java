package Polimorfismo.Ventas.API.MODEL;

public class Secretario extends Empleado{
	String despacho;
	double fax;
	
	public Secretario(String nombre, String apellidos, String dni, String direccion, String fechaIngreso,
			double telefonoContacto, double salario, String puestoEmpleado, String supervisor, String despacho, double fax) {
		super(nombre, apellidos, dni, direccion, fechaIngreso, telefonoContacto, salario, puestoEmpleado, supervisor);
		this.despacho = despacho;
		this.fax = fax;
	}
	
	
	@Override
	public void imprimir() {
		// TODO Auto-generated method stub
		super.imprimir();
		System.out.println("Despacho: "+getDespacho());
		System.out.println("Número fax: "+getFax());
		System.out.println("Salario con aumento: "+incrementarSalario(this.getSalario()));
	}
	
	@Override
	public double incrementarSalario(double salario) {
		// TODO Auto-generated method stub
		salario = salario + salario*0.05d;
		return salario;
	}
	public String getDespacho() {
		return despacho;
	}
	public void setDespacho(String despacho) {
		this.despacho = despacho;
	}
	public double getFax() {
		return fax;
	}
	public void setFax(double fax) {
		this.fax = fax;
	}
	


}
