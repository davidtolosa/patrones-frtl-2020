package construccion.singleton.ejemplo;

public class TestVendedor {

	public static void main(String[] args)
	{
	// inicialización del comercial en el sistema
	Vendedor elVededor = Vendedor.Instance();
	
	elVededor.setNombre("Comercial Auto");
	elVededor.setDireccion("Madrid");
	elVededor.setEmail("comercial@comerciales.com");
	// muestra el comercial del sistema
	visualiza();
	}

	public static void visualiza() {
		Vendedor elveVendedor = Vendedor.Instance();
		elveVendedor.visualiza();
	}

}
