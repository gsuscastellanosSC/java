package Empresa;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public interface Vehiculo {
	
	Persona verPersonasFueraDeVehiculos();
	Persona verPersonasDentroDeVehiculos();
	String verVehiculoesDisponiblesYSusDatos();
	Vehiculo SubirPersonaAVehiculo(String[] elements);
	Vehiculo BajarPersonaDeVehiculo(String[] elements);
	
}
