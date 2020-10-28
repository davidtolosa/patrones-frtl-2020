package comportamiento.observer.ejercicio1;

public class DisplayCondicionesActuales implements Observador {
	
	private double temperatura;
	private double humedad;
	private double presion;

	private EstacionMeteorologica estacionMeteorologica;

	public DisplayCondicionesActuales(EstacionMeteorologica estacionMeteorologica) {
		this.estacionMeteorologica = estacionMeteorologica;
		this.estacionMeteorologica.agrega(this);
	}


	@Override
	public void actualiza() {
		this.temperatura = estacionMeteorologica.getTemperatura();
		this.humedad = estacionMeteorologica.getHumedad();
		this.presion = estacionMeteorologica.getPresion();
		this.display();
	}

	public void display() {
		System.out.println("Condiciones actuales: " + this.temperatura + "ºC y  " + this.humedad + "% Humedad");
	}

}
