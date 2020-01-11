package Empresa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public interface Vehiculo {
	
	Persona verPersonasFueraDeVehiculos();
	Persona verPersonasDentroDeVehiculos();
	String verVehiculoesDisponiblesYSusDatos();
	Vehiculo SubirPersonaAVehiculo(String[] elements);
	Vehiculo BajarPersonaDeVehiculo();
	
	String getTipoVehiculo();
	int getCapacidad();
	float getPeso();
	int getPlazas();
	int getRuedas();
	
	void setPeso(float peso);
	void setCapacidad(int capacidad);
	void setPlazas(int plazas);
	void setRuedas(int ruedas);
}
