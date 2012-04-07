package pktest;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import pksource.clsProyecto;
import pksource.clsProyectoMant;

public class clsTestProyectoMant {
	
	@Test
    public void AgregaProyecto(){
        System.out.println("");
        System.out.println("Agregar Proyecto");
        System.out.println("================");
        // Arrange
        int viIDProyecto = 1;
    	String vsDescripcion = "PROYECTO SCRUM 1";
    	String vsCliente = "UPC";
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
        
           }

}
