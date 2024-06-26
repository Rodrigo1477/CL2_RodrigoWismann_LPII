package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;

import model.TblUsuariocl2;

public class TblUsuariocl2Imp implements IUsuario {

	@Override
	public void RegistrarUsuario(TblUsuariocl2 usuario) {
		// Establecer la conexion con la unidad de persistencia		
				EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoMavenCL2Rodrigo");
				// Gestionar las entidades
				EntityManager emanager=em.createEntityManager();
				// iniciamos la transacción
				emanager.getTransaction().begin();
				//registramos a la base de datos
				emanager.persist(usuario);
				//emitimos mensaje por pantalla
				System.out.println("Usuario registrado en la base de dato");
				//confirmamos la transaccion
				emanager.getTransaction().commit();
				//cerramos
				emanager.close();
		
	}

	@Override
	public void ActualizarUsuario(TblUsuariocl2 usuario) {
	// establecemos conexion con la unidad de persitencia
		
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoMavenCL2Rodrigo");
		//Gestionar las entidades
		
		EntityManager emanager=em.createEntityManager();
		//Iniciamos la transaccion
		
		emanager.getTransaction().begin();
		//Actualizamos 
		emanager.merge(usuario);
		//Emitir mensaje por consola
		System.out.println("Usuario actualizado en la BD");
		//Confirmamos
		
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
		
	}

	@Override
	public void EliminarUsuario(TblUsuariocl2 usuario) {
	// Establecemos la conexion con la unidad de persitencia
		
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoMavenCL2Rodrigo");
		
		//Gestionar las Entidades
		
		EntityManager emanager=em.createEntityManager();
		
		//Iniciamos la transacción
		
		emanager.getTransaction().begin();
		//Recuperamos el codigo a eliminar
		
		TblUsuariocl2 elim=emanager.merge(usuario);
		//Procedemos a eliminar el registro
		
		emanager.remove(elim);
		//Emitir mensaje por consola
		System.out.println("Usuario eliminado de la base de datos");
		
		//confirmamos
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
		
	}

	@Override
	public TblUsuariocl2 BuscarUsuario(TblUsuariocl2 usuario) {
		//Establecemos la conexion con la unidad de persistencia
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoMavenCL2Rodrigo");
		//Gestionar las Entidades
		
		EntityManager emanager=em.createEntityManager();
		//Iniciamos la transacción
		
		emanager.getTransaction().begin();
		
		//Recuperamos el codigo buscar
		
		TblUsuariocl2 bususuario=emanager.find(TblUsuariocl2.class,usuario.getIdusuariocl2());
		
		//Confirmamos
		emanager.getTransaction().commit();
		
		//cerrramos
		emanager.close();
		

			return bususuario;
	}

	@Override
	public List<TblUsuariocl2> ListarUsuario() {
	// Establecemos la conexion con la unidad de persitencia
		
		EntityManagerFactory fab=Persistence.createEntityManagerFactory("ProyectoMavenCL2Rodrigo");
		
		//Gestionar las Entidades
		
		EntityManager em=fab.createEntityManager();
		
		//Iniciamos la transacción
		
		em.getTransaction().begin();
		
		//Recuperamos los clientes
		//Create createquery sirve para la creacion de consultas dinamicas
		
		List<TblUsuariocl2> listado=em.createQuery("select c from TblUsuariocl2 c", TblUsuariocl2.class).getResultList();
		//Confirmamos
		em.getTransaction().commit();
			
		//cerrramos
		em.close();
			return listado;
	}

}
