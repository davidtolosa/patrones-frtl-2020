package estructuracion.decorator.ejemplo;

public class ColorDecorador extends Decorador {

	public ColorDecorador(ComponenteGraficoVehiculo componente) {
		super(componente);
	}

	protected void visualizaColor() {
		System.out.println("Color del Auto");
	}

	public void visualiza() {
		super.visualiza();
		this.visualizaColor();
	}
}
