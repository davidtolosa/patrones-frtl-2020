package estructuracion.decorator.ejemplo;

public class VistaVehiculo implements ComponenteGraficoVehiculo {

	@Override
	public void visualiza() {
		System.out.println("Visualización del vehículo");
	}

}
