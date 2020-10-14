package estructuracion.decorator.ejemplo;

public class ModeloDecorador extends Decorador {

	public ModeloDecorador(ComponenteGraficoVehiculo componente) {
		super(componente);
		// TODO Auto-generated constructor stub
	}

	protected void visualizaInformacionTecnica() {
		System.out.println("Información técnica del modelo");
	}

	public void visualiza() {
		super.visualiza();
		this.visualizaInformacionTecnica();
	}
}
