package Empresa.model;

import java.util.List;

import Empresa.ui.Menu;

public class Carro implements Vehiculo{
	
	private static final String tipo = "Carro";
	private static int capacidad; 
	private static float peso; 
	private final float pesoMaximo;
	private static int plazas; 
	private static int cantidadVehiculos;
	
	public Carro(int capacidad, float peso, int plazas, int ruedas) {
		this.capacidad = capacidad;
		this.peso = peso;
		pesoMaximo = peso;
		this.plazas = plazas;
		cantidadVehiculos++;
	}
	
	
	public String verVehiculoesDisponiblesYSusDatos() {
		// TODO Auto-generated method stub
		return "Tipo Vehículo: " + tipo + ", Cantidad Vehículos: " +cantidadVehiculos + ", Peso Diponible: " + peso + " Kilogramos, Plazas Disponibles: "+ plazas + ", Capacida Máxima de Personas: " + capacidad + ", Peso Maximo: " + pesoMaximo + "Kilogramos";
	}

	public static void SubirPersonaAVehiculo(String name_persona, String tipo_vehiculo) {
		for (int i = 0; i < Persona.personas.size(); i++) {
			if(Persona.personas.get(i).getNombre().equalsIgnoreCase(name_persona)) {
				if((peso > Persona.personas.get(i).getPeso() ) && (plazas > 0)){
					peso = peso - Persona.personas.get(i).getPeso();
					plazas--;
					if(plazas==0) {
						cantidadVehiculos--;
					}
					Vehiculo.personasEnVehiculos.add(Persona.personas.get(i));
					Vehiculo.personasEnVehiculos.get(Vehiculo.personasEnVehiculos.size()-1).setTipoVehiculo(tipo);
					System.out.println(name_persona+" Ahora esta en "+tipo_vehiculo);
					Persona.personas.remove(i);
				}else {
					if(peso < Persona.personas.get(i).getPeso()) {
						System.out.println("El peso de la persona supera el peso del Vehiculo");
					}
					if(plazas == 0) {
						System.out.println("No hay plazas disponibles");
					}
					if(cantidadVehiculos==0) {
						System.out.println("No hay Vehículos disponibles");
				}
					System.out.println("Valide lo datos ingresados, no es posible subir A: " + name_persona + " del Vehículo: " + tipo_vehiculo);
			}
				i = Persona.personas.size();
			}
		}
	}
	
	
	public static void bajarPersonaDeVehiculo(String name_persona, String tipo_vehiculo) {
		// TODO Auto-generated method stub
		for (int i = 0; i < Vehiculo.personasEnVehiculos.size(); i++) {
			if(Vehiculo.personasEnVehiculos.get(i).getNombre().equalsIgnoreCase(name_persona) && tipo_vehiculo.equalsIgnoreCase(Vehiculo.personasEnVehiculos.get(i).getTipoVehiculo())) {
				peso = peso + Vehiculo.personasEnVehiculos.get(i).getPeso();
				if(plazas==0) {
					cantidadVehiculos++;
				}
				plazas++;
				Persona.personas.add(Vehiculo.personasEnVehiculos.get(i));
				Vehiculo.personasEnVehiculos.remove(i);
				System.out.println(name_persona+" bajo del vehículo "+tipo_vehiculo);
				i = Persona.personas.size();
			}
			else{
				System.out.println("Valide lo datos ingresados, no es posible bajar: " + name_persona + " del Vehículo: " + tipo_vehiculo);
			}
		}
	}
}