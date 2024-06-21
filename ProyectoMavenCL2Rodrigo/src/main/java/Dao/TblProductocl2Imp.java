package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IProducto;
import model.TblProductocl2;

public class TblProductocl2Imp implements IProducto{

	@Override
	public void RegistrarProducto(TblProductocl2 producto) {
		
		// Establecer la conexion con la unidad de persistencia		
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoMavenCL2Rodrigo");
		// Gestionar las entidades
		EntityManager emanager=em.createEntityManager();
		// iniciamos la transacción
		emanager.getTransaction().begin();
		//registramos a la base de datos
		emanager.persist(producto);
		//emitimos mensaje por pantalla
		System.out.println("Producto registrado en la base de dato");
		//confirmamos la transaccion
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
		
	}

	@Override
	public void ActualizarProducto(TblProductocl2 producto) {
		// establecemos conexion con la unidad de persitencia
		
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoMavenCL2Rodrigo");
		//Gestionar las entidades
		
		EntityManager emanager=em.createEntityManager();
		//Iniciamos la transaccion
		
		emanager.getTransaction().begin();
		//Actualizamos 
		emanager.merge(producto);
		//Emitir mensaje por consola
		System.out.println("Producto actualizado en la BD");
		//Confirmamos
		
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
		
	}

	@Override
	public void EliminarProducto(TblProductocl2 producto) {
	// Establecemos la conexion con la unidad de persitencia
		
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoMavenCL2Rodrigo");
		
		//Gestionar las Entidades
		
		EntityManager emanager=em.createEntityManager();
		
		//Iniciamos la transacción
		
		emanager.getTransaction().begin();
		//Recuperamos el codigo a eliminar
		
		TblProductocl2 elim=emanager.merge(producto);
		//Procedemos a eliminar el registro
		
		emanager.remove(elim);
		//Emitir mensaje por consola
		System.out.println("Producto eliminado de la base de datos");
		
		//confirmamos
		emanager.getTransaction().commit();
		//cerramos
		emanager.close();
	}

	@Override
	public TblProductocl2 BuscarProducto(TblProductocl2 producto) {
		//Establecemos la conexion con la unidad de persistencia
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoMavenCL2Rodrigo");
		//Gestionar las Entidades
		
		EntityManager emanager=em.createEntityManager();
		//Iniciamos la transacción
		
		emanager.getTransaction().begin();
		
		//Recuperamos el codigo buscar
		
		TblProductocl2 busproducto=emanager.find(TblProductocl2.class,producto.getIdproductocl2());
		
		//Confirmamos
		emanager.getTransaction().commit();
		
		//cerrramos
		emanager.close();
		

			return busproducto;
	}

	@Override
	public List<TblProductocl2> ListarProducto() {
		// Establecemos la conexion con la unidad de persitencia
		
		EntityManagerFactory fab=Persistence.createEntityManagerFactory("ProyectoMavenCL2Rodrigo");
		
		//Gestionar las Entidades
		
		EntityManager em=fab.createEntityManager();
		
		//Iniciamos la transacción
		
		em.getTransaction().begin();
		
		//Recuperamos los clientes
		//Create createquery sirve para la creacion de consultas dinamicas
		
		List<TblProductocl2> listado=em.createQuery("select c from TblProductocl2 c", TblProductocl2.class).getResultList();
		//Confirmamos
		em.getTransaction().commit();
			
		//cerrramos
		em.close();
			return listado;
		}
	}


