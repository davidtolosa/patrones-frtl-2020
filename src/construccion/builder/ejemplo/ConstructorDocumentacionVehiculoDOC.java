package construccion.builder.ejemplo;

public class ConstructorDocumentacionVehiculoDOC extends ConstructorDocumentacionVehiculo {
	
	public ConstructorDocumentacionVehiculoDOC() {
		documentacion = new DocumentacionDOC();
	}

	@Override
	public void construyeSolicitudPedido(String nombreCliente) {
		String documento;
		documento = "<DOC>Solicitud de pedido Cliente: " + nombreCliente + "</HTML>";
		documentacion.agregaDocumento(documento);

	}

	@Override
	public void construyeSolicitudMatriculacion(String nombreSolicitante) {
		String documento;
		documento = "<DOC>Solicitud de matriculacion Solicitante: " + nombreSolicitante + "</HTML>";
		documentacion.agregaDocumento(documento);

	}

	@Override
	public void construyeFacturaVenta(String nombreSolicitante) {
		String documento;
		documento = "<DOC>Factura venta Solicitante: " + nombreSolicitante + "</HTML>";
		documentacion.agregaDocumento(documento);

	}

	@Override
	public void construyeSolicitudDeEntrega(String nombreSolicitante) {
		String documento;
		documento = "<DOC>Solicitud Entrega, Solicitante: " + nombreSolicitante + "</HTML>";
		documentacion.agregaDocumento(documento);

	}

}
