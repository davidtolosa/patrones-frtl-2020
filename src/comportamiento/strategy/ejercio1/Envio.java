package comportamiento.strategy.ejercio1;

public class Envio {
	private String origen;
	private String destino;
	private float peso;
	
	private CalculoEnvio calculoEnvio; 

	public Envio(String origen, String destino, float peso, CalculoEnvio calculoEnvio) {
		this.origen = origen;
		this.destino = destino;
		this.peso = peso;
		this.calculoEnvio = calculoEnvio;
	}
	
	
	public float getPrecio() {
		return calculoEnvio.calcular(origen, destino, peso);
	}
}
