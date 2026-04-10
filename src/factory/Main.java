package factory;

import java.util.Scanner;

public class Main {
	
	public void show() {
		
		Scanner sc= new Scanner(System.in);
		int option;
		String mensaje;
		Notificacion n = null;
		NotificacionFactory factory = new NotificacionFactory();
		
		menu();
		System.out.println("¿Que tipo de mensaje quieres enviar?: ");
		option= sc.nextInt();
		
		if(option==1) {
			n=factory.crearNotificacion("email");
		}else if(option==2) {
			n=factory.crearNotificacion("sms");
		}else if(option==3) {
			n=factory.crearNotificacion("push");
		}else {
			System.out.println("Tipo inesperado");
		}
		
		if(n!=null) {
			sc.nextLine();
			System.out.println("Escribe el mensaje que quieres enviar: ");
			mensaje= sc.nextLine();
			n.enviar(mensaje);
		}
	}
	
	private void menu() {
		System.out.println("""
				===== Menú =====
				1. Email
				2. SMS
				3. Push
				================
				""");
	}

	public static void main(String[] args) {
		new Main().show();
	}

}
