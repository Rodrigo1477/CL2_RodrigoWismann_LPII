package Test;

import Dao.TblUsuariocl2Imp;
import model.TblUsuariocl2;

public class TestUsuario {
	
	public static void main(String[] args) {
		// Instanciamos la entidad tblcliente
		
		TblUsuariocl2 usuario=new TblUsuariocl2();
		TblUsuariocl2Imp crud=new TblUsuariocl2Imp();
		
		//Asignamos datos
		
		usuario.setUsuariocl2("rodrigo122");
		usuario.setPasswordcl2("123123");
		
		//Invocamos el metodo registrar datos en BD
		crud.RegistrarUsuario(usuario); 
		
		

}
}