package construccion.singleton.ejemplo;

public class Vendedor {
	protected String nombre;
	protected String direccion;
	protected String email;

	private static Vendedor _instance = null;

	private Vendedor() {
	}

	public static Vendedor Instance() {
		if (_instance == null)
			_instance = new Vendedor();
		return _instance;
	}

	public void visualiza() {
		System.out.println("Nombre: " + nombre);
		System.out.println("Dirección: " + direccion);
		System.out.println("Email: " + email);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
