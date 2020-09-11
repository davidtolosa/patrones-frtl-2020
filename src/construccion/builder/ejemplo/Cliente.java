package construccion.builder.ejemplo;

import java.util.Scanner;

public class Cliente {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		ConstructorDocumentacionVehiculo constructor;
		System.out.print("Desea generar " + "documentacion HTML (1) o PDF (2) o DOC(3):");
		String seleccion = reader.next();
		if (seleccion.equals("1")) {
			constructor = new ConstructorDocumentacionVehiculoHtml();
		} else if (seleccion.equals("2")) {
			constructor = new ConstructorDocumentacionVehiculoPDF();
		} else {
			System.out.print("Entro");
			constructor = new ConstructorDocumentacionVehiculoDOC();
		}
		Vendedor vendedor = new Vendedor(constructor);
		Documentacion documentacion = vendedor.construye("Martin");
		documentacion.imprime();
	}
}
