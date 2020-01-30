package validadores.impl;

import model.Persona;
import model.Vehiculo;
import validadores.ValidadorGestionVehiculo;

public class ValidadorPersona implements ValidadorGestionVehiculo {

	@Override
	public void validate(Vehiculo vehiculo, Persona persona) throws Exception {
		if (vehiculo.getTripulantes().contains(persona)) {
			throw new Exception("En el vechiulo ya se encuentra la persona indicada");
		}
		if (persona.isEstaEnVehiculo()) {
			throw new Exception("La persona ya se encuentra en un vehiculo");
		}
	}

}
