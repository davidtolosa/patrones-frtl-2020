package comportamiento.strategy;

public class Usuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VistaCatalogo vistaCatalogo1 = new VistaCatalogo(new DibujaTresVehiculosPorLinea());
		vistaCatalogo1.dibuja();
		VistaCatalogo vistaCatalogo2 = new VistaCatalogo(new DibujaCuatroVehiculosPorLiena());
		vistaCatalogo2.dibuja();
	}
}

