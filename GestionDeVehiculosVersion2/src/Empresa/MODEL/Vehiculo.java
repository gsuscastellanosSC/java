package Empresa.MODEL;

import java.util.ArrayList;
import java.util.List;

import Empresa.UI.Menu;
import Empresa.UI.MenuVerPersonasFueraVehiculos;


public abstract class Vehiculo {
	
	private int capacidad; 
	private float peso;
		
	public static List<Vehiculo> vehiculos = new ArrayList<Vehiculo>();
		
	public Vehiculo(int capacidad, float peso) {
		this.capacidad = capacidad;
		this.peso = peso;
	}

	public int getCapacidad() {
		return capacidad;
	}

	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public void subirPersonas(int i, int j, String tipo_vehiculo) {
		
		if(vehiculos.get(i).getPeso() > vehiculos.get(i).getPeso()-Persona.personas.get(j).getPeso() && vehiculos.get(i).getCapacidad() > 0) {
			setPeso(vehiculos.get(i).getPeso()-Persona.personas.get(j).getPeso());
			setCapacidad((vehiculos.get(i).capacidad)-1);
			Persona.personasVehiculo.add(Persona.personas.get(j));
			Persona.personasVehiculo.get(Persona.personasVehiculo.size()-1).setTipo_vehiculo(tipo_vehiculo);
			System.out.println(Persona.personas.get(j).getNombre() + " Ahora esta en el vehículo " + tipo_vehiculo);
			Persona.personas.remove(j);
		}else {
			System.out.println("Imposible subir a " + Persona.personas.get(j).getNombre() + " en el vehiculo " + tipo_vehiculo);
			if(vehiculos.get(i).getPeso() < vehiculos.get(i).getPeso()-Persona.personas.get(j).getPeso()) {
				System.out.println("Se supera el peso disponible en el vehiculo " + tipo_vehiculo);
			}
			if(vehiculos.get(i).getCapacidad() == 0) {
				System.out.println("No hay plazas diponibles en el vehiculo " + tipo_vehiculo);
			}
		}
	}
	
	public void bajarPersonas(int i, int j, String tipo_vehiculo) {
		System.out.println("Hola Bjar Personas");
		Vehiculo.vehiculos.get(j).setPeso(Vehiculo.vehiculos.get(j).getPeso()+Persona.personasVehiculo.get(i).getPeso());
		Vehiculo.vehiculos.get(j).setCapacidad(Vehiculo.vehiculos.get(j).getCapacidad()+1);
		Persona.personas.add(Persona.personasVehiculo.get(i));
		Persona.personasVehiculo.remove(i);
	};
	
	public abstract  void verVehiculosDisponibles();
		
}
