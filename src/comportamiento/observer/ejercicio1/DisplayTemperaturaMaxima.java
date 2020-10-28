package comportamiento.observer.ejercicio1;

public class DisplayTemperaturaMaxima implements Observador {

	private double temperatura = 0;
	
	private EstacionMeteorologica estacionMeteorologica;

	public DisplayTemperaturaMaxima(EstacionMeteorologica estacionMeteorologica) {
		this.estacionMeteorologica = estacionMeteorologica;
		this.estacionMeteorologica.agrega(this);
	}
	
	@Override
	public void actualiza() {
		// TODO Auto-generated method stub

		if(estacionMeteorologica.getTemperatura() > temperatura) {
			temperatura = estacionMeteorologica.getTemperatura();
			System.out.println("Nueva temperatura Maxima: " + this.temperatura);
		}
	}

	
	
}
