package estructuracion.composite.ejercio1;

public class PedidoSimple extends Pedido {

	@Override
	public double calcularTotalPedido() {
		
		double totalPedido = 0;
		
		for(DetallePedido producto: productos) {
			totalPedido = totalPedido + (producto.cantidad * producto.precioUnitario);
		}
		
		return totalPedido;
	}

	@Override
	public boolean agregarSubpedido(Pedido pedido) {
		return false;
	}

}
