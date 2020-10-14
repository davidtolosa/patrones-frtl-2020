package estructuracion.facade.ejercicio1;

public class Cliente {
	
	public static void main(String[] args) {
		BancoFacade banco = new BancoFacadeImplementacion(1234567890, 1234);
		
		System.out.println();
		
		banco.depositarDinero(1000);
		
		
		System.out.println();
		banco.retirarDinero(6000);
	}

}
