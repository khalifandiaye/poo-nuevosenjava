package pktest;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

//import System.out.format;

import org.junit.Test;
import org.junit.Before;

import pksource.clsProyectoUsuario;
import pksource.clsUsuario;
import pksource.clsUsuarioMant;
import pksource.clsProyectoMant;
import pksource.clsProyecto;
import pksource.clsProyectoUsuarioMant;

public class clsTestUsuarioMant {
    clsUsuarioMant oUsuarioMant = new clsUsuarioMant();
    clsProyectoMant oProyectoMant = new clsProyectoMant();
    clsProyectoUsuarioMant oProyectoUsuarioMant = new clsProyectoUsuarioMant();

	@Before
    public void initObjects() {
        oProyectoMant.pAgregar(1,"GESTION DE PROVEEDORES","WONG","03/03/2012","03/03/2012",1,1);				
        oProyectoMant.pAgregar(2,"MODULO DE MANTENIMIENTO","UPC","03/03/2012","03/03/2012",1,1);				
        oProyectoMant.pAgregar(3,"CONTROL DE VISITAS","SARITA COLONIA","03/03/2012","03/03/2012",1,1);				
        oUsuarioMant.pAgregar(1,"romulo.leon@gmail.com","Leon","Alegria","Romulo",1,"03/03/2012","03/03/2012",1,1);				
        oUsuarioMant.pAgregar(2,"antauro.humala@gmail.com","Humala","Taso","Antauro",2,"03/03/2012","03/03/2012",1,1);				
        oUsuarioMant.pAgregar(3,"alberto.quimper@hotmail.com","Quimper","Herrera","Alberto",3,"03/03/2012","03/03/2012",1,1);				
        oUsuarioMant.pAgregar(4,"marco.denegri@gmail.com","Denegri","Santagadea","Marco Aurelio",1,"03/03/2012","03/03/2012",1,1);				
        oUsuarioMant.pAgregar(5,"luis.cripiani@hotmail.com","Cipriani","Thorne","a",3,"03/03/2012","03/03/2012",1,1);				
        oUsuarioMant.pAgregar(6,"kenji.fujimori@hotmail.com","Fujimori","Higuchi","Kenji",3,"03/03/2012","03/03/2012",1,1);				
        oProyectoUsuarioMant.pAgregar(1,1,"03/03/2012","03/03/2012",1,1);				
        oProyectoUsuarioMant.pAgregar(1,2,"03/03/2012","03/03/2012",1,1);				
        oProyectoUsuarioMant.pAgregar(1,3,"03/03/2012","03/03/2012",1,1);				
        oProyectoUsuarioMant.pAgregar(1,5,"03/03/2012","03/03/2012",1,1);				
        oProyectoUsuarioMant.pAgregar(1,6,"03/03/2012","03/03/2012",1,1);				
        
        String sFormato;

        //Usuario
        sFormato = "|%1$-4s|%2$-30s|%3$-20s|%4$-20s|%5$-20s|%6$-12s|%7$-10s|%8$-12s|%9$-10s|\n";
    	System.out.println("\n[USUARIOS]");
    	System.out.println("====================================================================================================================================================");
        System.out.format(sFormato,"ID","Correo","ApellidoPaterno","ApellidoMaterno","Nombres","F.Crea","U.Crea","F.Modif","U.Modif");
    	System.out.println("====================================================================================================================================================");
    	for( clsUsuario oUsuario  : oUsuarioMant.usuarios)
            System.out.format(sFormato,oUsuario.get_iIDUsuario(),oUsuario.get_sCorreo(),oUsuario.get_sApellidoPaterno(),oUsuario.get_sApellidoMaterno(),oUsuario.get_sNombres(),oUsuario.get_dFechaCreacion(),oUsuario.get_iIDUsuarioCreacion(),oUsuario.get_dFechaModificacion(),oUsuario.get_iIDUsuarioModificacion());    		
    	System.out.println("====================================================================================================================================================");

    	//Proyectos
        sFormato = "|%1$-4s|%2$-50s|%3$-30s|%4$-12s|%5$-10s|%6$-12s|%7$-10s|\n";
    	System.out.println("\n[PROYECTOS]");
    	System.out.println("========================================================================================================================================");
        System.out.format(sFormato,"ID","Descripcion","Cliente","F.Crea","U.Crea","F.Modif","U.Modif");
    	System.out.println("========================================================================================================================================");
    	for( clsProyecto oProyecto  : oProyectoMant.proyectos)
            System.out.format(sFormato,oProyecto.get_iIDProyecto(),oProyecto.get_sDescripcion(),oProyecto.get_sCliente(),oProyecto.get_dFechaCreacion(),oProyecto.get_iIDUsuarioCreacion(),oProyecto.get_dFechaModificacion(),oProyecto.get_iIDUsuarioModificacion());    			
    	System.out.println("========================================================================================================================================");
}
	
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
        //clsUsuarioMant oUsuarioMant = new clsUsuarioMant();
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
        //clsUsuarioMant oUsuarioMant = new clsUsuarioMant();

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
        //System.out.format("",oUsuario.get_iIDUsuario(),oUsuario.get_sCorreo(),oUsuario.get_sApellidoPaterno(),oUsuario.get_sApellidoMaterno(),oUsuario.get_sNombres());
       // System.out.println("IDUsuario: "  + oUsuario.get_iIDUsuario()); // imprime los valores grabados
        //System.out.println("Correo: " + oUsuario.get_sCorreo()); // imprime los valores grabados
        //System.out.println("ApellidoPaterno: " + oUsuario.get_sApellidoPaterno()); // imprime los valores grabados
        //System.out.println("ApellidoMaterno: " + oUsuario.get_sApellidoMaterno()); // imprime los valores grabados
        //System.out.println("Nombres: " + oUsuario.get_sNombres()); // imprime los valores grabados
        //System.out.println("Rol: " + oUsuario.get_iRol()); // imprime los valores grabados
        //System.out.println("FechaCreacion: " + oUsuario.get_dFechaCreacion()); // imprime los valores grabados
        //System.out.println("FechaModificacion: " + oUsuario.get_dFechaModificacion()); // imprime los valores grabados
        //System.out.println("UsuarioCreacion: " + oUsuario.get_iIDUsuarioCreacion()); // imprime los valores grabados
        //System.out.println("UsuarioModificacion: " + oUsuario.get_iIDUsuarioModificacion()); // imprime los valores grabados
    }
}
