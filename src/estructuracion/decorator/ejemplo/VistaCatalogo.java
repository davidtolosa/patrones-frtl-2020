package estructuracion.decorator.ejemplo;

public class VistaCatalogo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//VistaVehiculo vistaVehiculo = new VistaVehiculo();
		//ModeloDecorador modeloDecorador = new ModeloDecorador(vistaVehiculo);
		//MarcaDecorador marcaDecorador = new MarcaDecorador(modeloDecorador);
		//marcaDecorador.visualiza();
		
		ComponenteGraficoVehiculo miVehiculo = new VistaVehiculo();
		
		miVehiculo = new MarcaDecorador(miVehiculo);
		miVehiculo = new ColorDecorador(miVehiculo);
		
		/*************************************/
		
		miVehiculo.visualiza();
	}

}
