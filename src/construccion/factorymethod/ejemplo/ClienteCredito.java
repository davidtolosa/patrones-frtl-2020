package construccion.factorymethod.ejemplo;

public class ClienteCredito extends Cliente {

	@Override
	protected Pedido creaPedido(double importe) {
		return new PedidoCredito(importe);
	}

}
