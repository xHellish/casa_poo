
public class Administrador {
	
	// ----------------- Habitaciones ---------------- // 
	/* 
	 * 
	 * 
	 * Estas las hice clases separadas usando super entoncess no creo que necesitemos lo de aqui
	 * Yo diria que aqui pongamos a que hora se realiza cada cosa y ya 
	 * 
	 * 
	 * 
	Habitacion kitchen = new Habitacion("Cocina", 10, 3, 2);
	Habitacion room1 = new Habitacion("Dormitorio 1", 10, 1, 1);
	Habitacion room2 = new Habitacion("Dormitorio 2", 12, 1, 1);
	Habitacion laundry = new Habitacion("Lavanderia", 8, 2, 1);
	Habitacion living = new Habitacion("Sala", 20, 5, 3);
	Habitacion restroom = new Habitacion("Baño", 6, 1, 0);
	Habitacion restroom2 = new Habitacion("Baño 2", 6, 1, 1);
	Habitacion garage = new Habitacion("Cochera", 8, 2, 0);
	

	// ----------------- Métodos ------------------ //
	
	void orden(String _comando, String zona) {
		
		if (_comando == "status") {
			if (zona == "kitchen") {
				kitchen.estado();
			}else if (zona == "room1") {
				room1.estado();
			}else if (zona == "room2") {
				room2.estado();
			}else if (zona == "laundry") {
				laundry.estado();
			}else if (zona == "living") {
				living.estado();
			}else if (zona == "restroom1") {
				restroom.estado();
			}else if (zona == "restroom2") {
				restroom2.estado();
			}else if (zona == "garage") {
				garage.estado();
			}
			
		}else if (_comando == "ensuciar") {
			if (zona == "kitchen") {
				kitchen.ensuciar();
			}else if (zona == "room1") {
				room1.ensuciar();
			}else if (zona == "room2") {
				room2.ensuciar();
			}else if (zona == "laundry") {
				laundry.ensuciar();
			}else if (zona == "living") {
				living.ensuciar();
			}else if (zona == "restroom1") {
				restroom.ensuciar();
			}else if (zona == "restroom2") {
				restroom2.ensuciar();
			}else if (zona == "garage") {
				garage.ensuciar();
			}
			
		}else if (_comando == "taquear") {
			if (zona == "kitchen") {
				kitchen.taquear();
			}else if (zona == "room1") {
				room1.taquear();
			}else if (zona == "room2") {
				room2.taquear();
			}else if (zona == "laundry") {
				laundry.taquear();
			}else if (zona == "living") {
				living.taquear();
			}else if (zona == "restroom1") {
				restroom.taquear();
			}else if (zona == "restroom2") {
				restroom2.taquear();
			}else if (zona == "garage") {
				garage.taquear();
			}
		}
		
		 -Falta crear un método en la clase Habitación que desactive los servicios: 
		   	"serviciosOff" y otro que los active "serviciosOn". 
		   	
			-También un condicional en el método encender luz, que no sea posible si los servicios 
			están desactivados, a su vez que se apague la luz si se desactivan los servicios.
			
			--Si se van los servicios, en los banos y la cocina hay que poner que se va el agua
			
			-Todavía no está implementado el método de inundar habitación.
			
		
		 else if (_comando == "serviciosOff") {
			if (zona == "kitchen") {
				kitchen.serviciosOff();
			}else if (zona == "room1") {
				room1.serviciosOff();
			}else if (zona == "room2") {
				room2.serviciosOff();
			}else if (zona == "laundry") {
				laundry.serviciosOff();
			}else if (zona == "living") {
				living.serviciosOff();
			}else if (zona == "restroom1") {
				restroom.serviciosOff();
			}else if (zona == "restroom2") {
				restroom2.serviciosOff();
			}else if (zona == "garage") {
				garage.serviciosOff();
			}	
		} 
	}*/
}
		
			
