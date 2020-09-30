package construccion.singleton.ejercicio1;

public class PruebaLogger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger l1 = Logger.Instance();
		l1.log("Error desde L1");
		
		Logger l2 = Logger.Instance();
		l2.log("Error desde L2");	
		}
}
