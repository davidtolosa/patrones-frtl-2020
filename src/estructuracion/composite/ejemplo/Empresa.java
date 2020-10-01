package estructuracion.composite.ejemplo;

public abstract class Empresa {
	protected static double costeUnitarioVehiculo = 5.0;
	protected int nVehiculos;

	public void agregaVehiculo() {
		nVehiculos = nVehiculos + 1;
	}

	public abstract double calculaCosteMantenimiento();

	public abstract boolean agregaFilial(Empresa filial);
}
