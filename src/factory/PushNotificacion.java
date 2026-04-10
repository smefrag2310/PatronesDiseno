package factory;

public class PushNotificacion implements Notificacion {

	@Override
	public void enviar(String mensaje) {
		System.out.printf("Enviado push: %s\n",mensaje);
	}
}
