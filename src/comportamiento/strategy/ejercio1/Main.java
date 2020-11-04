package comportamiento.strategy.ejercio1;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Envio envio = new Envio("BA", "BA", 8.7f, new CalculoFedEx());
		System.out.println(envio.getPrecio());
		
		Envio envio1 = new Envio("BA", "BA", 8.7f, new CalculoEstandar());
		System.out.println(envio1.getPrecio());
		
		Envio envio2 = new Envio("BA", "BA", 8.7f, new CalculoUps());
		System.out.println(envio2.getPrecio());
		
		Envio envio3 = new Envio("BA", "BA", 8.7f, new CalculoCorreoArgentino());
		System.out.println(envio3.getPrecio());
		
		Envio envio4 = new Envio("BA", "BA", 8.7f, new CalculoOca());
		System.out.println(envio4.getPrecio());
		
		
		/*System.out.println("Coste con envío estandar:" + envio.getPrecio(1));
		System.out.println("Coste con envío FedEx :" + envio.getPrecio(2));
		System.out.println("Coste con envío UPS : " + envio.getPrecio(3));*/
	}

}
