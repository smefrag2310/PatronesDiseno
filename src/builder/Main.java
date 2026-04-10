package builder;


public class Main {
	
	public void show() {
		
		Pedido p1,p2;
		
		p1 = new Pedido.Builder("Juan", "Calle mágica 123").build();
		System.out.printf("Pedido básico:\n%s\n",p1);
		
		p2 = new Pedido.Builder("Pepe", "Calle falsa 321")
				.setEmail("pepe@ejemplo.com")
				.setTelefono("999888777")
				.setObservaciones("Robó una pata de jamón").build();
		System.out.printf("Pedido completo:\n%s\n",p2);
		
	}

	public static void main(String[] args) {
		new Main().show();
	}

}
