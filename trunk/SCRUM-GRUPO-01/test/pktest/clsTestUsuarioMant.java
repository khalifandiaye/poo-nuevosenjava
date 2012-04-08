package pktest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import pksource.clsUsuario;
import pksource.clsUsuarioMant;

public class clsTestUsuarioMant {
	
	@Test
    public void DebeCrearUsuario(){
        System.out.println("");
        System.out.println("Agregar Usuario");
        System.out.println("===============");
        // Arrange
        int viIDUsuario = 1;
    	String vsCorreo = "juan.perez@gmail.com";
    	String vsApellidoPaterno = "Perez";
    	String vsApellidoMaterno = "Lopez";
    	String vsNombres = "Juan";
    	int viRol = 2;
    	String vdFechaCreacion = "05/04/2012";
    	String vdFechaModificacion = "05/04/2012";
    	int viIDUsuarioCreacion = 1;
    	int viIDUsuarioModificacion = 1;    	
        clsUsuarioMant oUsuarioMant = new clsUsuarioMant();
        // Act
        oUsuarioMant.pAgregar(viIDUsuario, vsCorreo, vsApellidoPaterno, vsApellidoMaterno, vsNombres, viRol, vdFechaCreacion, vdFechaModificacion, viIDUsuarioCreacion, viIDUsuarioModificacion);    
        //Assert
        clsUsuario oUsuario = oUsuarioMant.faBuscarPk(viIDUsuario);
        assertNotNull(oUsuario);
        System.out.println("<<Resultados>>");
        System.out.println("IDUsuario: "  + oUsuario.get_iIDUsuario()); // imprime los valores grabados
        System.out.println("Correo: " + oUsuario.get_sCorreo()); // imprime los valores grabados
        System.out.println("ApellidoPaterno: " + oUsuario.get_sApellidoPaterno()); // imprime los valores grabados
        System.out.println("ApellidoMaterno: " + oUsuario.get_sApellidoMaterno()); // imprime los valores grabados
        System.out.println("Nombres: " + oUsuario.get_sNombres()); // imprime los valores grabados
        System.out.println("Rol: " + oUsuario.get_iRol()); // imprime los valores grabados
        System.out.println("FechaCreacion: " + oUsuario.get_dFechaCreacion()); // imprime los valores grabados
        System.out.println("FechaModificacion: " + oUsuario.get_dFechaModificacion()); // imprime los valores grabados
        System.out.println("UsuarioCreacion: " + oUsuario.get_iIDUsuarioCreacion()); // imprime los valores grabados
        System.out.println("UsuarioModificacion: " + oUsuario.get_iIDUsuarioModificacion()); // imprime los valores grabados
        
           }
	@Test
    public void DebeEliminarUsuario(){
        System.out.println("");
        System.out.println("Eliminacion de usuario");
        System.out.println("======================");
        // Arrange
        // Valores para el primer proyecto
        int viIDUsuario = 1;
    	String vsCorreo = "juan.perez@gmail.com";
    	String vsApellidoPaterno = "Perez";
    	String vsApellidoMaterno = "Lopez";
    	String vsNombres = "Juan";
    	int viRol = 2;
    	String vdFechaCreacion = "05/04/2012";
    	String vdFechaModificacion = "05/04/2012";
    	int viIDUsuarioCreacion = 1;
    	int viIDUsuarioModificacion = 1;    	
        // Valores para el segundo proyecto
        int viIDUsuario2 = 2;
    	String vsCorreo2 = "pedro.garcia@gmail.com";
    	String vsApellidoPaterno2 = "Garcia";
    	String vsApellidoMaterno2 = "Gonzales";
    	String vsNombres2 = "Pedro";
    	int viRol2 = 3;
    	String vdFechaCreacion2 = "05/04/2012";
    	String vdFechaModificacion2 = "05/04/2012";
    	int viIDUsuarioCreacion2 = 1;
    	int viIDUsuarioModificacion2 = 1;    	
        clsUsuarioMant oUsuarioMant = new clsUsuarioMant();

        // Act
        oUsuarioMant.pAgregar(viIDUsuario, vsCorreo, vsApellidoPaterno, vsApellidoMaterno, vsNombres, viRol, vdFechaCreacion, vdFechaModificacion, viIDUsuarioCreacion, viIDUsuarioModificacion);    
        oUsuarioMant.pAgregar(viIDUsuario2, vsCorreo2, vsApellidoPaterno2, vsApellidoMaterno2, vsNombres2, viRol2, vdFechaCreacion2, vdFechaModificacion2, viIDUsuarioCreacion2, viIDUsuarioModificacion2);    
        oUsuarioMant.pEliminar(viIDUsuario);    
        //Assert
        clsUsuario oUsuario = oUsuarioMant.faBuscarPk(viIDUsuario);        
        assertNull(oUsuario); // no encuentra elemento borrado              
    }

    @Test
    public void DebeEditarProyecto(){
        System.out.println("");
        System.out.println("Edicion de usuario");
        System.out.println("==================");
        
        // Arrange
        // Valores para el primer usuario
        int viIDUsuario = 1;
    	String vsCorreo = "juan.perez@gmail.com";
    	String vsApellidoPaterno = "Perez";
    	String vsApellidoMaterno = "Lopez";
    	String vsNombres = "Juan";
    	int viRol = 2;
    	String vdFechaCreacion = "05/04/2012";
    	String vdFechaModificacion = "05/04/2012";
    	int viIDUsuarioCreacion = 1;
    	int viIDUsuarioModificacion = 1;    	
        // Valores para el segundo usuario
        int viIDUsuario2 = 2;
    	String vsCorreo2 = "pedro.garcia@gmail.com";
    	String vsApellidoPaterno2 = "Garcia";
    	String vsApellidoMaterno2 = "Gonzales";
    	String vsNombres2 = "Pedro";
    	int viRol2 = 3;
    	String vdFechaCreacion2 = "05/04/2012";
    	String vdFechaModificacion2 = "05/04/2012";
    	int viIDUsuarioCreacion2 = 1;
    	int viIDUsuarioModificacion2 = 1;    	
        // Valores para el segundo usuario
    	String vsCorreo3 = "antauro.humala@gmail.com";
    	String vsApellidoPaterno3 = "Humala";
    	String vsApellidoMaterno3 = "Tazo";
    	String vsNombres3 = "Antauro";
    	int viRol3 = 2;
    	String vdFechaModificacion3 = "07/04/2012";
    	int viIDUsuarioModificacion3 = 1;    	
    	
        // Act
        clsUsuarioMant oUsuarioMant = new clsUsuarioMant();
        oUsuarioMant.pAgregar(viIDUsuario, vsCorreo, vsApellidoPaterno, vsApellidoMaterno, vsNombres, viRol, vdFechaCreacion, vdFechaModificacion, viIDUsuarioCreacion, viIDUsuarioModificacion);    
        oUsuarioMant.pAgregar(viIDUsuario2, vsCorreo2, vsApellidoPaterno2, vsApellidoMaterno2, vsNombres2, viRol2, vdFechaCreacion2, vdFechaModificacion2, viIDUsuarioCreacion2, viIDUsuarioModificacion2);    
        oUsuarioMant.pEditar(viIDUsuario2, vsCorreo3, vsApellidoPaterno3, vsApellidoMaterno3, vsNombres3, viRol3, vdFechaModificacion3, viIDUsuarioModificacion3);    
        //Assert
        clsUsuario oUsuario = oUsuarioMant.faBuscarPk(viIDUsuario2);        
        assertNotNull(oUsuario); //Encuentra el registro modificado  
        System.out.println("<<Resultados>>");
        System.out.println("IDUsuario: "  + oUsuario.get_iIDUsuario()); // imprime los valores grabados
        System.out.println("Correo: " + oUsuario.get_sCorreo()); // imprime los valores grabados
        System.out.println("ApellidoPaterno: " + oUsuario.get_sApellidoPaterno()); // imprime los valores grabados
        System.out.println("ApellidoMaterno: " + oUsuario.get_sApellidoMaterno()); // imprime los valores grabados
        System.out.println("Nombres: " + oUsuario.get_sNombres()); // imprime los valores grabados
        System.out.println("Rol: " + oUsuario.get_iRol()); // imprime los valores grabados
        System.out.println("FechaCreacion: " + oUsuario.get_dFechaCreacion()); // imprime los valores grabados
        System.out.println("FechaModificacion: " + oUsuario.get_dFechaModificacion()); // imprime los valores grabados
        System.out.println("UsuarioCreacion: " + oUsuario.get_iIDUsuarioCreacion()); // imprime los valores grabados
        System.out.println("UsuarioModificacion: " + oUsuario.get_iIDUsuarioModificacion()); // imprime los valores grabados
    }
}
