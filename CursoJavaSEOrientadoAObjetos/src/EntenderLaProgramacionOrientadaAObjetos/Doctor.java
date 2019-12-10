package EntenderLaProgramacionOrientadaAObjetos;

public class Doctor {
	//Atributos
	private static int id = 0; //Autoincrement
	String name;
	String speciality;
	
	//Constructor
	public Doctor(String name, String speciality) {
		// TODO Auto-generated constructor stub
		this.id ++;
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
