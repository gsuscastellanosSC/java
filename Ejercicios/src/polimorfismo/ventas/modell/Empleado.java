package Polimorfismo.Ventas.API.MODEL;

public abstract class Empleado {
	private String nombre;
	private String apellidos;
	private String dni;
	private String direccion;
	private String fechaIngreso;
	private double telefonoContacto;
	private double salario;
	private String puestoEmpleado;
	private String supervisor;
	
		
	public Empleado(String nombre, String apellidos, String dni, String direccion, String fechaIngreso,
			double telefonoContacto, double salario, String puestoEmpleado, String supervisor) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.fechaIngreso = fechaIngreso;
		this.telefonoContacto = telefonoContacto;
		this.salario = salario;
		this.puestoEmpleado = puestoEmpleado;
		this.supervisor = supervisor;
	}
	
	
	public Empleado(String nombre, String apellidos, String dni, String direccion, String fechaIngreso,
			double telefonoContacto, double salario, String puestoEmpleado) {
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.direccion = direccion;
		this.fechaIngreso = fechaIngreso;
		this.telefonoContacto = telefonoContacto;
		this.salario = salario;
		this.puestoEmpleado = puestoEmpleado;
	}





	public abstract double incrementarSalario(double salario);
	
	public void imprimir() {
		System.out.println("Nombre: "+getNombre());
		System.out.println("Apellidos: "+getApellidos());
		System.out.println("DNI: "+getDni());
		System.out.println("Dirección: "+getDireccion());
		System.out.println("Fecha ingreso: "+getFechaIngreso());
		System.out.println("Telefono contacto: " + getTelefonoContacto());
		System.out.println("Salario: "+getSalario());
		System.out.println("Cargo en la empresa: "+getpuestoEmpleado());
		System.out.println("Supervisor :"+getSupervisor());

	}
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getFechaIngreso() {
		return fechaIngreso;
	}

	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}

	public Double getTelefonoContacto() {
		return telefonoContacto;
	}

	public void setTelefonoContacto(Double telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getpuestoEmpleado() {
		return puestoEmpleado;
	}
	public void setpuestoEmpleado(String puestoEmpleado) {
		this.puestoEmpleado = puestoEmpleado;
	}




	public String getPuestoEmpleado() {
		return puestoEmpleado;
	}




	public void setPuestoEmpleado(String puestoEmpleado) {
		this.puestoEmpleado = puestoEmpleado;
	}




	public String getSupervisor() {
		return supervisor;
	}




	public void setSupervisor(String supervisor) {
		this.supervisor = supervisor;
	}




	public void setTelefonoContacto(double telefonoContacto) {
		this.telefonoContacto = telefonoContacto;
	}
	
	
}
