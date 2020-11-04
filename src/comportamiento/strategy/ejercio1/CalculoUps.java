package comportamiento.strategy.ejercio1;

public class CalculoUps implements CalculoEnvio {
	
	float costoPorKilo = 2.00f;

	@Override
	public float calcular(String origen, String destino, float peso) {	
		return costoPorKilo * peso;
	}

}
