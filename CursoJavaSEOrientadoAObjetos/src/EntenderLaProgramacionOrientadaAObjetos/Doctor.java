package EntenderLaProgramacionOrientadaAObjetos;

public class Doctor {
	//Atributos
	int id;
	String name;
	String speciality;
	//Constructor
	public Doctor(int id, String name, String speciality) {
		// TODO Auto-generated constructor stub
		this.id = id;
		this.name = name;
		this.speciality = speciality;
	}
	//Metodos
	public void showName() {
		System.out.println(name);
	}
	public void showAll() {
		System.out.println("id: "+ id + " name: "+ name + " speciality: " + speciality);
	}
}
