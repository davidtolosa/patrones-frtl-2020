package construccion.builder.ejemplo;

public class DocumentacionDOC extends Documentacion {

	@Override
	public void agregaDocumento(String documento) {
		if(documento.startsWith("<DOC>"))
			contenido.add(documento);
	}

	@Override
	public void imprime() {
		System.out.println("Documentacion DOC");
		for (String s : contenido)
			System.out.println(s);

	}

}
