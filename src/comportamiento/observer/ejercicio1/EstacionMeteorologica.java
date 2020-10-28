package comportamiento.observer.ejercicio1;

public class EstacionMeteorologica extends Sujeto {

	private double temperatura;
	private double humedad;
	private double presion;
	
	public double getTemperatura() {
		return temperatura;
	}
	
	public double getHumedad() {
		return humedad;
	}
	
	public double getPresion() {
		return presion;
	}
	

	public void condicionesActuales(double temperatura, double humedad, double presion) {
		this.temperatura = temperatura;
		this.humedad = humedad;
		this.presion = presion;
		this.notifica();
	}	
}
