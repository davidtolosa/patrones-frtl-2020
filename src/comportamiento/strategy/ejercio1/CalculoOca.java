package comportamiento.strategy.ejercio1;

public class CalculoOca implements CalculoEnvio {
	
	public float getValorEnvio(float peso) {
		return peso * 0.3f;
	}

	@Override
	public float calcular(String origen, String destino, float peso) {
		// TODO Auto-generated method stub
		return getValorEnvio(peso);
	}
}
