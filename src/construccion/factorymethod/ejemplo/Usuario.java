package construccion.factorymethod.ejemplo;

public class Usuario {

	public static void main(String[] args) {
		
		Cliente cliente;
		cliente = new ClienteContado();
		cliente.nuevoPedido(2000.0);
		cliente.nuevoPedido(10000.0);
		cliente = new ClienteCredito();
		cliente.nuevoPedido(2000.0);
		cliente.nuevoPedido(10000.0);
		
		cliente = new ClienteCreditoAsalariado();
		cliente.nuevoPedido(1000);
		
		
		//if cliente.tipocliente=="CONTADADO"
		//Pedido= new PedidoContado
		//	else
		//Pedido = new PedidoCredito
	}

}
