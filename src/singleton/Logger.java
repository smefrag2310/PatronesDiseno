package singleton;

import java.util.ArrayList;

public class Logger {

	private ArrayList<String> mensajes;
	private static Logger logger;

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

	public static Logger getLogger() {
		if(logger == null) {
			logger = new Logger();
		}
		return logger;
	}


}
