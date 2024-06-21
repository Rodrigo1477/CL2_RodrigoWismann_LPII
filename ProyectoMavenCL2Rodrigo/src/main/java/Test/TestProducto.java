package Test;

import java.util.List;

import Dao.TblProductocl2Imp;
import model.TblProductocl2;

public class TestProducto {
	
	public static void main(String[] args) {
		// Instanciamos la entidad tblcliente
		
		TblProductocl2 producto=new TblProductocl2();
		TblProductocl2Imp crud=new TblProductocl2Imp();
		
		//Asignamos Datos
		
		producto.setNombrecl2("nuggetso");
		producto.setPrecioventacl2(5.00);
		producto.setPreciocompcl2(4.00);
		producto.setEstadocl2("Nuevo");
		producto.setDescripcl2("La caserita");
		
		//Invocamos el metodo registrar datos en BD
		crud.RegistrarProducto(producto); 
		
		
	/*	//Testeamos Actualizar
		
		producto.setNombrecl2("Hamburguesa");
		producto.setPrecioventacl2(6.00);
		producto.setPreciocompcl2(4.00);
		producto.setEstadocl2("Por Vencer");
		producto.setDescripcl2("La caserita");
		
		//Invocamos el metodo registrar datos en BD
		crud.ActualizarProducto(producto); */
		
/*	//Testeamos el eliminar
		
		producto.setIdproductocl2(2);
		
		//invocamos el metodo eliminar datos
		
		crud.EliminarProducto(producto); */
		
		
	/*		//**********Testeamos el metodo buscar
		producto.setIdproductocl2(1);
		//invocamos el metodo bucar
		TblProductocl2 bus=crud.BuscarProducto(producto);
		//Imprimimos en pantalla el registro buscado
		System.out.println("codigo" + bus.getIdproductocl2() + " nombre "+bus.getNombrecl2() + 
				" Descripcion: " +bus.getDescripcl2() + 
				" Estado: " +bus.getEstadocl2() + 
				" Precio de Compra: " + bus.getPreciocompcl2() + 
				" Precio de Venta: " + bus.getPrecioventacl2());  */
		
		
		//Testeamos el metodo listado de productos registrados en la base de datos
		
	/*			List<TblProductocl2> listado=crud.ListarProducto();
				
				for(TblProductocl2 lis:listado) {
					//imprimimos en pantalla los datos recuperados
					System.out.println("codigo" + lis.getIdproductocl2() + " nombre "+lis.getNombrecl2() + 
							" Descripcion: " +lis.getDescripcl2() + 
							" Estado: " +lis.getEstadocl2() + 
							" Precio de Compra: " + lis.getPreciocompcl2() + 
							" Precio de Venta: " + lis.getPrecioventacl2());;
				}*/
		
		
			

}}
