package construccion.abstractfactory.ejemplo;

public class FabricaVehiculoHibrida implements FabricaVehiculo {

	public Automovil creaAutomovil(String modelo, String color, int potencia, double espacio) {
		return new AutomovilHibrido(modelo, color, potencia, espacio);
	}

	public Scooter creaScooter(String modelo, String color, int potencia) {
		return new ScooterHibrida(modelo, color, potencia);
	}

}
