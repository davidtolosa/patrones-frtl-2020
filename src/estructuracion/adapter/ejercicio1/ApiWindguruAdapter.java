package estructuracion.adapter.ejercicio1;

public class ApiWindguruAdapter implements ClimaApi {
	
	private ApiWindguru apiWinguru = new ApiWindguru();

	@Override
	public Clima obtenerClima(String ciudad) {
		
		String ciudadSeleccionada = apiWinguru.seleccionarCiudad(ciudad);
		float temperatura = apiWinguru.obtenerTemperatura();
		float humedad = apiWinguru.obtenerHumedad();
		float presion = apiWinguru.obtenerPresion();
		
		return new Clima(ciudadSeleccionada,temperatura,humedad,presion);
	}

}
