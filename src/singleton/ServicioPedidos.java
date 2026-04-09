package singleton;

public class ServicioPedidos {

	private Logger logger;
	
	ServicioPedidos(){
		logger= Logger.getLogger();
	}
	
	void registrar(String mensaje) {
		logger.registrar(mensaje);
	}
}
