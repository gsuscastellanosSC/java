package EntenderLaProgramacionOrientadaAObjetos;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Doctor myDoctor = new Doctor("Jesús", "Cardiologo");
		myDoctor.showName();
		myDoctor.showAll();
		Doctor myDoctor2 = new Doctor("Jesús", "Cardiologo");
		myDoctor2.showName();
		myDoctor2.showAll();
		
		UIMenu.showMenu();
	}

}
