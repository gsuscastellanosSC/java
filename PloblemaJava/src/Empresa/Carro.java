package Empresa;

public class Carro implements Vehiculo{
	
	private final String tipo;
	private int capacidad; 
	private float peso; 
	private int plazas; 
	private int ruedas;
	private static int cantidadCarros = 0;
	
	public Carro(int capacidad, float peso, int plazas, int ruedas) {
		this.tipo = "Carro";
		this.capacidad = capacidad;
		this.peso = peso;
		this.plazas = plazas;
		this.ruedas = ruedas;
		cantidadCarros++;
	}

	@Override
	public Persona verPersonasFueraDeVehiculos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Persona verPersonasDentroDeVehiculos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String verVehiculoesDisponiblesYSusDatos() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vehiculo SubirPersonaAVehiculo(String[] elements) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Vehiculo BajarPersonaDeVehiculo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getTipoVehiculo() {
		// TODO Auto-generated method stub
		return tipo;
	}

	@Override
	public int getCapacidad() {
		// TODO Auto-generated method stub
		return capacidad;
	}

	@Override
	public float getPeso() {
		// TODO Auto-generated method stub
		return peso;
	}

	@Override
	public int getPlazas() {
		// TODO Auto-generated method stub
		return plazas;
	}

	@Override
	public int getRuedas() {
		// TODO Auto-generated method stub
		return ruedas;
	}
	@Override
	public void setPeso(float peso) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	@Override
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}

	@Override
	public void setRuedas(int ruedas) {
		this.ruedas = ruedas;
	}
}
