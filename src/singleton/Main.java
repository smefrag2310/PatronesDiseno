package singleton;

public class Main {
	
	public void show() {
		
		
		
		ServicioPedidos pedidos= new ServicioPedidos();
		ServicioUsuarios usuarios= new ServicioUsuarios();
		Logger logger= Logger.getLogger();
		
		usuarios.registrar("[INFO] Usuario creado");
		usuarios.registrar("[INFO] Usuario eliminado");
		pedidos.registrar("[INFO] Pedido creado");
		pedidos.registrar("[INFO] Pedido enviado");
		
		logger.mostrarLogs();
		
	}

	public static void main(String[] args) {
		new Main().show();
	}

}
