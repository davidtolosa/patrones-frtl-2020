package comportamiento.observer.ejemplo;

public class VistaPrecio implements Observador {

	protected Vehiculo vehiculo;
	protected String texto = "";

	public VistaPrecio(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
		vehiculo.agrega(this);
		actualizaTexto();
	}

	protected void actualizaTexto() {
		texto = "El Precio es: " + vehiculo.getPrecio();
	}

	@Override
	public void actualiza() {
		actualizaTexto();
		this.redibuja();
	}

	public void redibuja() {
		System.out.println(texto);
	}

}
