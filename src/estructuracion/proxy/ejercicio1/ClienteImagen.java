package estructuracion.proxy.ejercicio1;

public class ClienteImagen {
	public static void main(String[] args) {

		Imagen imagen = new ImagenProxy("img_10.jpg");

		// La imagen se va a cargar del diso
		imagen.mostrarImagen();

		System.out.println();

		// La imagen no se va a cargar del disco
		imagen.mostrarImagen();


		System.out.println();
		Imagen imagen2 = new ImagenProxy("imagen2.jpg");
		imagen2.mostrarImagen();
		System.out.println();
		imagen2.mostrarImagen();
		imagen2.mostrarImagen();
		imagen2.mostrarImagen();
	}
}
