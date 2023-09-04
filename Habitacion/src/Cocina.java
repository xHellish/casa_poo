
public class Cocina extends Habitacion{
	boolean grifo=false;
	
	public Cocina() {
		super("Cocina",10,3,2);
	}
	
	public void abrirGrifo() {
		if(servicios) {
			grifo=true;
		}
		else {
			System.out.println("Los servicios estan desactivados");
		}
	}
	public void cerrarGrifo() {
		grifo = false;
	}
}
