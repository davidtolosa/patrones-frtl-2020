package estructuracion.decorator.ejercicio1;

public class CremaDecorador extends Decorador {

	public CremaDecorador(Cafe componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		return super.getDescripcion() + ", con Crema";
	}

	@Override
	public double costo() {
		return super.costo() + 10;
	}
}
