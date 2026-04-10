package factory;

public class EmailNotificacion implements Notificacion{

	@Override
	public void enviar(String mensaje) {
		System.out.printf("Enviado email: %s\n",mensaje);
	}
}
