package factoryMethod.Product;

public abstract class Carro {
	String nombre;
	String speed;
	
	public Carro() {

	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}

	@Override
	public String toString() {
		return "Carro [nombre=" + nombre + ", speed=" + speed + "]";
	}
	

}
