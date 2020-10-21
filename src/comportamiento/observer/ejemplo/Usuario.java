package comportamiento.observer.ejemplo;


public class Usuario {

	public static void main(String[] args) {
		Vehiculo vehiculo = new Vehiculo();
		vehiculo.setDescripcion("Vehiculo economico");
		vehiculo.setPrecio(5000.0);
		
		VistaVehiculo vistaVehiculo = new VistaVehiculo(vehiculo);
		vehiculo.setPrecio(4500.0);
		
		System.out.println();
		
		VistaVehiculo vistaVehiculo2 = new VistaVehiculo(vehiculo);
		VistaVehiculo vistaVehiculo3 = new VistaVehiculo(vehiculo);
		
		VistaPrecio vistaPrecio1 = new VistaPrecio(vehiculo);
		
		ObservadorPrueba observadorPrueba = new ObservadorPrueba(vehiculo);
		
		vehiculo.setPrecio(5500.0);
		vehiculo.setPrecio(10000.0);
	}

}