package estructuracion.adapter.ejemplo;

public class ServidorWeb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Documento documento1, documento2;
		documento1 = new DocumentoHTML();
		documento1.setContenido("Hello");
		documento1.dibuja();
		
		System.out.println();
		
		documento2 = new DocumentoPDF();
		documento2.setContenido("Hola");
		documento2.dibuja();
	}

}
