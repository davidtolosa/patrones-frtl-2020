package estructuracion.decorator.ejercicio1;

public class CanelaDecorador extends Decorador {

	public CanelaDecorador(Cafe componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public String getDescripcion() {
		return super.getDescripcion() + ", con Canela";
	}

	@Override
	public double costo() {
		return super.costo() + 5;	
	}

}
