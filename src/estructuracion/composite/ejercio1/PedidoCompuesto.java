package estructuracion.composite.ejercio1;

import java.util.ArrayList;
import java.util.List;

public class PedidoCompuesto extends Pedido {

	protected List<Pedido> subpedidos = new ArrayList<Pedido>();

	@Override
	public double calcularTotalPedido() {

		double totalSubpedidos = 0;

		for (Pedido pedido : subpedidos) {
			totalSubpedidos += pedido.calcularTotalPedido();
		}

		double totalPedido = 0;

		for (DetallePedido producto : productos) {
			totalPedido = totalPedido + (producto.cantidad * producto.precioUnitario);
		}

		return totalPedido + totalSubpedidos;
	}

	@Override
	public boolean agregarSubpedido(Pedido pedido) {
		// TODO Auto-generated method stub
		return subpedidos.add(pedido);
	}

}
