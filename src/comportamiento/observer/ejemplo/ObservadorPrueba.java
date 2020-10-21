package comportamiento.observer.ejemplo;

public class ObservadorPrueba implements Observador {
	
	protected Vehiculo vehiculo;

	public ObservadorPrueba(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
		vehiculo.agrega(this);
	}

	@Override
	public void actualiza() {
		System.out.println("Se actualizaron datos del vehiculo");
	}

}
