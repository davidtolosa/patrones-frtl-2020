package estructuracion.adapter.ejemplo;

public class DocumentoPDF implements Documento {

	protected ComponentePDF herramientaPdf = new ComponentePDF();

	@Override
	public void setContenido(String contenido) {
		herramientaPdf.pdfFijaContenido(contenido);
	}

	@Override
	public void dibuja() {
		herramientaPdf.pdfPreparaVisualizacion();
		herramientaPdf.pdfRefresca();
		herramientaPdf.pdfFinalizaVisualizacion();
	}

	@Override
	public void imprime() {
		herramientaPdf.pdfEnviaImpresora();
	}

}
