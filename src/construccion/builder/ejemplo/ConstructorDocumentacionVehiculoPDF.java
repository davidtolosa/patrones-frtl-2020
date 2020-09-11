package construccion.builder.ejemplo;

public class ConstructorDocumentacionVehiculoPDF extends ConstructorDocumentacionVehiculo {

	public ConstructorDocumentacionVehiculoPDF()
	{
	documentacion = new DocumentacionPDF();
	}

	public void construyeSolicitudPedido(String nombreCliente) {
		String documento;
		documento = "<PDF>Solicitud de pedido Cliente: " + nombreCliente + "</PDF>";
		documentacion.agregaDocumento(documento);
	}

	public void construyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento;
		documento = "<PDF>Solicitud de matriculacion Solicitante: " + nombreSolicitante + "</PDF>";
		documentacion.agregaDocumento(documento);
	}

	@Override
	public void construyeFacturaVenta(String nombreSolicitante) {
		String documento;
		documento = "<PDF>Solicitud Factura de Venta, Solicitante: " + nombreSolicitante + "</PDF>";
		documentacion.agregaDocumento(documento);		
	}

	@Override
	public void construyeSolicitudDeEntrega(String nombreSolicitante) {
		String documento;
		documento = "<PDF>Solicitud de Entrega Solicitante: " + nombreSolicitante + "</HTML>";
		documentacion.agregaDocumento(documento);
		
	}

}
