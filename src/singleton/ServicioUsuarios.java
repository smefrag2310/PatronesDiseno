package singleton;

public class ServicioUsuarios {
	
	private Logger logger;
	
	ServicioUsuarios(){
		logger= Logger.getLogger();
	}
	
	void registrar(String mensaje) {
		logger.registrar(mensaje);
	}
}
