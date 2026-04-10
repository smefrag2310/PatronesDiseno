package factory;

public class NotificacionFactory {

	Notificacion crearNotificacion(String tipo) {
		
		TiposMensaje tipoMensaje;
		
		tipoMensaje= switch(tipo) {
		case "email" -> TiposMensaje.EMAIL;
		case "push" -> TiposMensaje.PUSH;
		case "sms" -> TiposMensaje.SMS;
		default -> throw new IllegalArgumentException();
		};
		
		return switch(tipoMensaje) {
		case EMAIL -> new EmailNotificacion();
		case PUSH -> new PushNotificacion();
		case SMS -> new SmsNotificacion();
		};
	}
}
