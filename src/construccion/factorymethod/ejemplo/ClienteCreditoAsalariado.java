package construccion.factorymethod.ejemplo;

public class ClienteCreditoAsalariado extends Cliente {

	@Override
	protected Pedido creaPedido(double importe) {
		// TODO Auto-generated method stub
		return new PedidoAsalariado(importe);
	}

}
