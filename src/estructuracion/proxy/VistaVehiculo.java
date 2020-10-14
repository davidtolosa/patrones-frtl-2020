package estructuracion.proxy;

public class VistaVehiculo {
	public static void main(String[] args) {
		
		/*Animacion animacion = new AnimacionProxy();
		animacion.dibuja();		
		System.out.println();
		animacion.clic();
		System.out.println();
		animacion.dibuja();*/
		
		Animacion animacion = new Video();
		animacion.dibuja();
		
		
		
	}
}
