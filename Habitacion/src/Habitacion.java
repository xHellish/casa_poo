
public class Habitacion {
	
	// --------------- Atributos --------------
	
	boolean servicios = true;
	boolean puertaAbierta = true;
	boolean ventanasAbiertas = true;
	boolean iluminado = true;
	boolean sucio = false;
	boolean taqueado = false;
	
	int metrosCuadrados;
	int puertasCont;
	int ventanasCont;
	
	int objetosCont = 0;
	String[] objetos = new String[20];
	
	// --------------- Constructor--------------
	
	public Habitacion() {
		metrosCuadrados = 0;
		puertasCont = 0;
		ventanasCont = 0;		
	}
	public Habitacion(int _dimension, int _puertas, int _ventanas) {
		metrosCuadrados = _dimension;
		puertasCont = _puertas;
		ventanasCont = _ventanas;		
	}
	
	//----------------- Métodos-----------------
	
	public void cerrarPuerta() {
		puertaAbierta = false;
	}
	
	public void abrirPuerta() {
		puertaAbierta = true;
	}
	
	public void cerrarVentana() {
		ventanasAbiertas = false;
	}
	
	public void abrirVentana() {
		ventanasAbiertas = true;
	}
	
	public void encenderLuz() {
		iluminado = true;
	}
	
	public void apagarLuz() {
		iluminado = false;
	}
	
	public void ensuciar() {
		sucio = true;
	}
	
	public void limpiar() {
		sucio = false;
	}
	
	public void taquear() {
		taqueado = true;
	}
	
	public void destaquear() {
		taqueado = false;
	}
	
	public void estado() {
		System.out.println("Servicios: "+ servicios);
		System.out.println("Puertas abiertas: "+ puertaAbierta);
		System.out.println("Ventanas abiertas: "+ ventanasAbiertas);
		System.out.println("Iluminado: "+ iluminado);
		System.out.println("Sucio: "+ sucio);
		System.out.println("taqueado: "+ taqueado);
		
	}
	
	public void agregarObjeto(String _objeto) {
		
		if (objetosCont < 20) {
			objetos[objetosCont] = _objeto;
			objetosCont += 1;
			
		}else {
			System.out.println("No puede agregar más objetos. (máx 20)");
		}
		
	}
	
}

