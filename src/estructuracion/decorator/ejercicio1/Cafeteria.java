package estructuracion.decorator.ejercicio1;

public class Cafeteria {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 Cafe cafe1 = new Capuchino();
	 cafe1 = new CanelaDecorador(cafe1);
	 cafe1 = new CanelaDecorador(cafe1);
	 cafe1 = new CremaDecorador(cafe1);
	 cafe1 = new ChocolateDecorador(cafe1);
	 
	 
	 System.out.println(cafe1.getDescripcion());
	 System.out.println(cafe1.costo());
	}

}
