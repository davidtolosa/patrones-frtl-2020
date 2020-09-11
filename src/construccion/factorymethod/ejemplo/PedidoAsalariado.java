package construccion.factorymethod.ejemplo;

public class PedidoAsalariado extends Pedido {

	public PedidoAsalariado(double importe) {
		super(importe);
	}

	@Override
	public boolean valida() {
		if(importe < 400000) {
			return true;
		}else {
			return false;
		}		
	}

	@Override
	public void paga() {
		System.out.println(
				"El pago del pedido asalariado de: " +
				importe + " se ha realizado.");

	}

}
