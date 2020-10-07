package estructuracion.composite.ejercio1;

public class PruebaComposite {

	public static void main(String[] args) {
		
	 Pedido pedidoSimple1 = new PedidoSimple();
	 pedidoSimple1.agregarDetallePedido(new DetallePedido("1", 1, 10));
		
	 System.out.println("Pedido simple 1 :" + pedidoSimple1.calcularTotalPedido());
	 
	 Pedido pedidoSimple2= new PedidoSimple();
	 pedidoSimple2.agregarDetallePedido(new DetallePedido("2", 2, 10));
	 pedidoSimple2.agregarDetallePedido(new DetallePedido("3", 1, 10));	
	 
	 System.out.println("Pedido simple 2 :" + pedidoSimple2.calcularTotalPedido());
	
	
	 Pedido pedidoCompuesto1 = new PedidoCompuesto();
	 pedidoCompuesto1.agregarSubpedido(pedidoSimple1);
	 pedidoCompuesto1.agregarSubpedido(pedidoSimple2);
	 
	 pedidoCompuesto1.agregarDetallePedido(new DetallePedido("4", 1, 10));
	 
	 System.out.println("Pedido compuesto 1 :" + pedidoCompuesto1.calcularTotalPedido());
	}

}
