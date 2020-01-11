package Empresa;

public class Persona {
	private String nombre;
	private String genero; 
	private int edad;
	private float peso;
	private static int cantidadPersonas;
	private String tipoVehiculo;
		
	public Persona(String nombre, String genero, int edad, float peso) {
		this.nombre = nombre;
		this.genero = genero;
		this.edad = edad;
		this.peso = peso;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public static int getCantidadPersonas() {
		return cantidadPersonas;
	}

	public static void setCantidadPersonas(int cantidadPersonas) {
		Persona.cantidadPersonas = cantidadPersonas;
	}
	
	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}
}
