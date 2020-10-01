package estructuracion.composite.ejemplo;

public class Usuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Empresa empresa1 = new EmpresaSinFilial();
		empresa1.agregaVehiculo();
		System.out.println("Empresa1: " + empresa1.calculaCosteMantenimiento());
		
		Empresa empresa2 = new EmpresaSinFilial();
		empresa2.agregaVehiculo();
		empresa2.agregaVehiculo();
		
		System.out.println("Empresa2: " + empresa2.calculaCosteMantenimiento());
		
		Empresa empresaGrupo = new EmpresaMadre();
		empresaGrupo.agregaFilial(empresa1);
		empresaGrupo.agregaFilial(empresa2);
		empresaGrupo.agregaVehiculo();
		
		System.out.println("Empresa Grupo: " + empresaGrupo.calculaCosteMantenimiento());
		
		
		Empresa empresaGrupo2 = new EmpresaMadre();
		empresaGrupo2.agregaFilial(empresa1);
		empresaGrupo2.agregaFilial(empresa2);
		empresaGrupo2.agregaFilial(empresaGrupo);
		empresaGrupo2.agregaVehiculo();
		
		System.out.println("Empresa Grupo 2: " + empresaGrupo2.calculaCosteMantenimiento());
		
		
		
		
	}

}
