package estructuracion.decorator.ejercicio1;

public class ChocolateDecorador extends Decorador {

	public ChocolateDecorador(Cafe componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDescripcion() {
		// TODO Auto-generated method stub
		return super.getDescripcion() + ", con Chocolate";
	}

	@Override
	public double costo() {
		// TODO Auto-generated method stub
		return super.costo() + 17;
	}
	
}
