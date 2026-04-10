package singleton;

import java.util.ArrayList;

public class Logger {

	// Parte estática de la propia clase
	private static Logger logger;

	public static Logger getLogger() {
		if(logger == null) {
			logger = new Logger();
		}
		return logger;
	}
	
	// Parte del objeto en sí
	private ArrayList<String> mensajes;
	
	private Logger() {
		mensajes = new ArrayList<>();
	}

	void registrar(String mensaje) {
		mensajes.add(mensaje);
	}

	void mostrarLogs() {
		for (String m : mensajes) {
			System.out.println(m);
		}
	}

	


}
