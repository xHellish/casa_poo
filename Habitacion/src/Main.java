
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Habitacion cocina = new Habitacion("Cocina", 20, 2, 3);
		
		cocina.agregarObjeto("Olla");
		cocina.agregarObjeto("Taza");
		
		cocina.objetos(0);
	
		cocina.estado();

	}

}
