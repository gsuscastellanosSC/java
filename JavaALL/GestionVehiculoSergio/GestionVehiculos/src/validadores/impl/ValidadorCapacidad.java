package validadores.impl;

import model.Persona;
import model.Vehiculo;
import validadores.ValidadorGestionVehiculo;

public class ValidadorCapacidad implements ValidadorGestionVehiculo {
	@Override
	public void validate(Vehiculo vehiculo, Persona persona) throws Exception {
		if( vehiculo.getCapacidad() <= vehiculo.getTripulantes().size()) {
			throw new Exception("El vehiculo ya se encuentra en su capacidad máxima");
		}
	}
}
