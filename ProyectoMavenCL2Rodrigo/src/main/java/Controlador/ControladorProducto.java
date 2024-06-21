package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.TblProductocl2Imp;
import model.TblProductocl2;

/**
 * Servlet implementation class ControladorProducto
 */
public class ControladorProducto extends HttpServlet {
    private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorProducto() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub

        TblProductocl2 producto = new TblProductocl2();
        TblProductocl2Imp crud = new TblProductocl2Imp();

        List<TblProductocl2> listadoproducto = crud.ListarProducto();

        // Asignamos el listado de productos recuperados en la BD
        request.setAttribute("listadoproducto", listadoproducto);

        // Redirigimos a la página ListadoProductos.jsp
        request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
    }

    /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        // doGet(request, response);

        // Recuperamos los datos del formulario
        String Nombre = request.getParameter("nombre");
        Double PrecioVenta = Double.parseDouble(request.getParameter("precioventa"));
        Double PrecioCompra = Double.parseDouble(request.getParameter("preciocompra"));
        String Estado = request.getParameter("estado");
        String Descripcion = request.getParameter("descripcion");

        // Instanciamos las respectivas clases...
        TblProductocl2 producto = new TblProductocl2();
        TblProductocl2Imp crud = new TblProductocl2Imp();

        // Asignamos valores
        producto.setNombrecl2(Nombre);
        producto.setDescripcl2(Descripcion);
        producto.setEstadocl2(Estado);
        producto.setPreciocompcl2(PrecioCompra);
        producto.setPrecioventacl2(PrecioVenta);

        // Invocamos al método registrar producto en la BD
        crud.RegistrarProducto(producto);

        // Actualizar el listado
        List<TblProductocl2> listadoproducto = crud.ListarProducto();

        // Asignamos el listado de productos recuperados en la BD
        request.setAttribute("listadoproducto", listadoproducto);

        // Redirigimos hacia la URL ProyectoMavenCL2Rodrigo
        request.getRequestDispatcher("/ListadoProductos.jsp").forward(request, response);
    }
}
