package construccion.builder.ejemplo;

public abstract class ConstructorDocumentacionVehiculo {

	protected Documentacion documentacion;

	public abstract void construyeSolicitudPedido(String nombreCliente);

	public abstract void construyeSolicitudMatriculacion(String nombreSolicitante);
	
	public abstract void construyeFacturaVenta(String nombreSolicitante);
	
	public abstract void construyeSolicitudDeEntrega(String nombreSolicitante);

	public Documentacion resultado() {
		return documentacion;
	}
}