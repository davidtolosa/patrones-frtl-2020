package estructuracion.decorator.ejemplo;

public abstract class Decorador implements ComponenteGraficoVehiculo {

	protected ComponenteGraficoVehiculo componente;
	
	public Decorador(ComponenteGraficoVehiculo componente)
	{
	this.componente = componente;
	}
	
	@Override
	public void visualiza() {
		componente.visualiza();
	}

}