package construccion.singleton.ejercicio1;

public class Logger {

	private static Logger _instance = null;
	
	public static Logger Instance() {
		if(_instance == null) {
			_instance = new Logger();
		}
		return _instance;
	}
	
	private Logger() {
		System.out.println("Se creo un objeto Logger");
	}

	private boolean abrirArchivoLog() {
		System.out.println("Archivo log abierto");
		return true;
	}

	private boolean cerrarArchivoLog() {
		System.out.println("Archivo log cerrado");
		return true;
	}

	public void log(String log) {
		if (this.abrirArchivoLog()) {
			System.out.println("Guardo en log: " + log);
		}
		this.cerrarArchivoLog();
	}

}
