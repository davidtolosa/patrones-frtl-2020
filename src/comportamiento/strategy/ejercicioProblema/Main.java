package comportamiento.strategy.ejercicioProblema;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Envio envio = new Envio("BA", "BA", 8.7f);
		System.out.println("Coste con env�o estandar:" + envio.getPrecio(1));
		System.out.println("Coste con env�o FedEx :" + envio.getPrecio(2));
		System.out.println("Coste con env�o UPS : " + envio.getPrecio(3));
		System.out.println("Coste con env�o Correo Argentino : " + envio.getPrecio(4));
	}

}
