package pktest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import pksource.clsProyectoUsuario;
import pksource.clsProyectoUsuarioMant;

public class clsTestProyectoUsuarioMant {
	
	@Test
    public void DebeAsignarUsuarioAlProyecto(){
        System.out.println("");
        System.out.println("Agregar Usuario al Proyecto");
        System.out.println("===========================");
        // Arrange
        int viIDProyecto = 1;
        int viIDUsuario = 1;
    	String vdFechaCreacion = "05/04/2012";
    	String vdFechaModificacion = "05/04/2012";
    	int viIDUsuarioCreacion = 3;
    	int viIDUsuarioModificacion = 3;    	
        clsProyectoUsuarioMant oProyectoUsuarioMant = new clsProyectoUsuarioMant();
        // Act
        oProyectoUsuarioMant.pAgregar(viIDProyecto,viIDProyecto,vdFechaCreacion,vdFechaModificacion,viIDUsuarioCreacion,viIDUsuarioModificacion);    
        //Assert
        clsProyectoUsuario oProyecto = oProyectoUsuarioMant.faBuscarPk(viIDProyecto,viIDUsuario);
        assertNotNull(oProyecto);
        System.out.println("<<Resultados>>");
        System.out.println("IDProyecto: "  + oProyecto.get_iIDProyecto()); // imprime los valores grabados
        System.out.println("IDUsuario: "  + oProyecto.get_iIDUsuario()); // imprime los valores grabados
        System.out.println("FechaCreacion: " + oProyecto.get_dFechaCreacion()); // imprime los valores grabados
        System.out.println("FechaModificacion: " + oProyecto.get_dFechaModificacion()); // imprime los valores grabados
        System.out.println("UsuarioCreacion: " + oProyecto.get_iIDUsuarioCreacion()); // imprime los valores grabados
        System.out.println("UsuarioModificacion: " + oProyecto.get_iIDUsuarioModificacion()); // imprime los valores grabados
        
           }
	@Test
    public void DebeQuitarUsuarioDelProyecto(){
        System.out.println("");
        System.out.println("Eliminacion de usuario del proyecto");
        System.out.println("===================================");
        // Arrange
        // Valores para la primera asociacion
        int viIDProyecto = 1;
        int viIDUsuario = 1;
    	String vdFechaCreacion = "05/04/2012";
    	String vdFechaModificacion = "05/04/2012";
    	int viIDUsuarioCreacion = 3;
    	int viIDUsuarioModificacion = 3;    	
        // Valores para la segunda asociacion
        int viIDProyecto2 = 1;
        int viIDUsuario2 = 2;
    	String vdFechaCreacion2 = "05/04/2012";
    	String vdFechaModificacion2 = "05/04/2012";
    	int viIDUsuarioCreacion2 = 3;
    	int viIDUsuarioModificacion2 = 3;    	

    	clsProyectoUsuarioMant oProyectoMant = new clsProyectoUsuarioMant();
        // Act
        oProyectoMant.pAgregar(viIDProyecto,viIDUsuario,vdFechaCreacion,vdFechaModificacion,viIDUsuarioCreacion,viIDUsuarioModificacion);    
        oProyectoMant.pAgregar(viIDProyecto2,viIDUsuario2,vdFechaCreacion2,vdFechaModificacion2,viIDUsuarioCreacion2,viIDUsuarioModificacion2);    
        oProyectoMant.pEliminar(viIDProyecto,viIDUsuario);    
        //Assert
        clsProyectoUsuario oProyecto = oProyectoMant.faBuscarPk(viIDProyecto,viIDUsuario);        
        assertNull(oProyecto); // no encuentra elemento borrado              
    }

}
