package comportamiento.strategy;

import java.util.List;

public class DibujaCuatroVehiculosPorLiena implements DibujaCatalogo {

	@Override
	public void dibuja(List<VistaVehiculo> contenido) {
		// TODO Auto-generated method stub
		int contador;
		System.out.println("Dibuja los vehiculos mostrando tres vehiculos por linea");
		contador = 0;
		for (VistaVehiculo vistaVehiculo : contenido) {
			vistaVehiculo.dibuja();
			contador++;
			if (contador == 4) {
				System.out.println();
				contador = 0;
			} else
				System.out.print(" -- ");
		}
		if (contador != 0) {
			System.out.println();
		}
	}

}
