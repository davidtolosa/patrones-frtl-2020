package estructuracion.adapter.ejercicio1;

public class PruebaClima {
	public static void main(String[] args) {
		ClimaApi servicioWindguru = new ApiWindguruAdapter();
		
		Clima climaSerMetNac = servicioWindguru.obtenerClima("Trenque Lauquen");
		
		System.out.println(climaSerMetNac);
		System.out.println();
		
	//	ClimaApi windguru= new ApiWindguruAdapter();
	//	Clima climaWind = windguru.obtenerClima("Trenque Lauquen");
	//	System.out.println(climaWind);		
	}
}
