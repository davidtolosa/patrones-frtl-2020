package construccion.builder.ejemplo;

public class DocumentacionPDF extends Documentacion {

	public void agregaDocumento(String documento) {
		if (documento.startsWith("<PDF>"))
			contenido.add(documento);
	}

	public void imprime() {
		System.out.println("Documentacion PDF");
		for (String s : contenido)
			System.out.println(s);
	}

}