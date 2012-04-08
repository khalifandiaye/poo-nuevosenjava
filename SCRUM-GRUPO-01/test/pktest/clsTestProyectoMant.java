package pktest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import pksource.clsProyecto;
import pksource.clsProyectoMant;

public class clsTestProyectoMant {
	
	@Test
    public void DebeCrearProyecto(){
        System.out.println("");
        System.out.println("Agregar Proyecto");
        System.out.println("================");
        // Arrange
        int viIDProyecto = 1;
    	String vsDescripcion = "GESTION DE PROVEEDORES";
    	String vsCliente = "WONG";
    	String vdFechaCreacion = "05/04/2012";
    	String vdFechaModificacion = "05/04/2012";
    	int viIDUsuarioCreacion = 3;
    	int viIDUsuarioModificacion = 3;    	
        clsProyectoMant oProyectoMant = new clsProyectoMant();
        // Act
        oProyectoMant.pAgregar(viIDProyecto,vsDescripcion,vsCliente,vdFechaCreacion,vdFechaModificacion,viIDUsuarioCreacion,viIDUsuarioModificacion);    
        //Assert
        clsProyecto oProyecto = oProyectoMant.faBuscarPk(viIDProyecto);
        assertNotNull(oProyecto);
        System.out.println("<<Resultados>>");
        System.out.println("IDProyecto: "  + oProyecto.get_iIDProyecto()); // imprime los valores grabados
        System.out.println("Descripcion: " + oProyecto.get_sDescripcion()); // imprime los valores grabados
        System.out.println("Cliente: " + oProyecto.get_sCliente()); // imprime los valores grabados
        System.out.println("FechaCreacion: " + oProyecto.get_dFechaCreacion()); // imprime los valores grabados
        System.out.println("FechaModificacion: " + oProyecto.get_dFechaModificacion()); // imprime los valores grabados
        System.out.println("UsuarioCreacion: " + oProyecto.get_iIDUsuarioCreacion()); // imprime los valores grabados
        System.out.println("UsuarioModificacion: " + oProyecto.get_iIDUsuarioModificacion()); // imprime los valores grabados
        
           }
	@Test
    public void DebeEliminarProyecto(){
        System.out.println("");
        System.out.println("Eliminacion de proyecto");
        System.out.println("=======================");
        // Arrange
        // Valores para el primer proyecto
        int viIDProyecto = 1;
    	String vsDescripcion = "GESTION DE PROVEEDORES";
    	String vsCliente = "WONG";
    	String vdFechaCreacion = "05/04/2012";
    	String vdFechaModificacion = "05/04/2012";
    	int viIDUsuarioCreacion = 3;
    	int viIDUsuarioModificacion = 3;    	
        // Valores para el segundo proyecto
        int viIDProyecto2 = 2;
        String vsDescripcion2 = "GESTION DE RECLAMOS";
    	String vsCliente2 = "UPC";
    	String vdFechaCreacion2 = "05/04/2012";
    	String vdFechaModificacion2 = "05/04/2012";
    	int viIDUsuarioCreacion2 = 7;
    	int viIDUsuarioModificacion2 = 7;

    	clsProyectoMant oProyectoMant = new clsProyectoMant();
        // Act
        oProyectoMant.pAgregar(viIDProyecto,vsDescripcion,vsCliente,vdFechaCreacion,vdFechaModificacion,viIDUsuarioCreacion,viIDUsuarioModificacion);    
        oProyectoMant.pAgregar(viIDProyecto2,vsDescripcion2,vsCliente2,vdFechaCreacion2,vdFechaModificacion2,viIDUsuarioCreacion2,viIDUsuarioModificacion2);    
        oProyectoMant.pEliminar(viIDProyecto);    
        //Assert
        clsProyecto oProyecto = oProyectoMant.faBuscarPk(viIDProyecto);        
        assertNull(oProyecto); // no encuentra elemento borrado              
    }

    @Test
    public void DebeEditarProyecto(){
        System.out.println("");
        System.out.println("Edicion de proyecto");
        System.out.println("===================");
        
        // Arrange
        // Valores para el primer proyecto
        int viIDProyecto = 1;
    	String vsDescripcion = "GESTION DE PROVEEDORES";
    	String vsCliente = "WONG";
    	String vdFechaCreacion = "05/04/2012";
    	String vdFechaModificacion = "05/04/2012";
    	int viIDUsuarioCreacion = 3;
    	int viIDUsuarioModificacion = 3;    	
        // Valores para el segundo proyecto
        int viIDProyecto2 = 2;
        String vsDescripcion2 = "GESTION DE RECLAMOS";
    	String vsCliente2 = "UPC";
    	String vdFechaCreacion2 = "05/04/2012";
    	String vdFechaModificacion2 = "05/04/2012";
    	int viIDUsuarioCreacion2 = 7;
    	int viIDUsuarioModificacion2 = 7;
        // Valores modificados para reemplazar el segundo proyecto
        String vsDescripcion3 = "GESTION DE RECLAMOS 2012";
    	String vsCliente3 = "UPC.EDU.PE";
    	String vdFechaModificacion3 = "06/04/2012";
    	int viIDUsuarioModificacion3 = 7;
    	
    	clsProyectoMant oProyectoMant = new clsProyectoMant();
    	
        // Act
        oProyectoMant.pAgregar(viIDProyecto,vsDescripcion,vsCliente,vdFechaCreacion,vdFechaModificacion,viIDUsuarioCreacion,viIDUsuarioModificacion);    
        oProyectoMant.pAgregar(viIDProyecto2,vsDescripcion2,vsCliente2,vdFechaCreacion2,vdFechaModificacion2,viIDUsuarioCreacion2,viIDUsuarioModificacion2);    
        oProyectoMant.pEditar(viIDProyecto2,vsDescripcion3,vsCliente3,vdFechaModificacion3,viIDUsuarioModificacion3);    
        //Assert
        clsProyecto oProyecto = oProyectoMant.faBuscarPk(viIDProyecto2);        
        assertNotNull(oProyecto); //Encuentra el registro modificado  
        System.out.println("<<Resultados>>");
        System.out.println("IDProyecto: "  + oProyecto.get_iIDProyecto()); // imprime los valores grabados
        System.out.println("Descripcion: " + oProyecto.get_sDescripcion()); // imprime los valores grabados
        System.out.println("Cliente: " + oProyecto.get_sCliente()); // imprime los valores grabados
        System.out.println("FechaCreacion: " + oProyecto.get_dFechaCreacion()); // imprime los valores grabados
        System.out.println("FechaModificacion: " + oProyecto.get_dFechaModificacion()); // imprime los valores grabados
        System.out.println("UsuarioCreacion: " + oProyecto.get_iIDUsuarioCreacion()); // imprime los valores grabados
        System.out.println("UsuarioModificacion: " + oProyecto.get_iIDUsuarioModificacion()); // imprime los valores grabados
    }
}
