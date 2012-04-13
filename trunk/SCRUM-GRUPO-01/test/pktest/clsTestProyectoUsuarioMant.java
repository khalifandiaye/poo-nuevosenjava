package pktest;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;

import pksource.ClsUsuariosTarea;
import pksource.ClsUsuariosTareaMant;
import pksource.clsHistoriaMant;
import pksource.clsProyectoMant;
import pksource.clsProyectoUsuario;
import pksource.clsProyectoUsuarioMant;
import pksource.clsTarea;
import pksource.clsTareaMant;
import pksource.clsUsuarioMant;

public class clsTestProyectoUsuarioMant {
	
    clsUsuarioMant oUsuarioMant = new clsUsuarioMant();
    clsProyectoMant oProyectoMant = new clsProyectoMant();
    clsProyectoUsuarioMant oProyectoUsuarioMant = new clsProyectoUsuarioMant();
    clsTareaMant oTareaMant = new clsTareaMant();
    ClsUsuariosTareaMant oUsuariosTareaMant = new ClsUsuariosTareaMant();
    clsHistoriaMant oHistoriaMant = new clsHistoriaMant();
    String sFormato;
	Calendar Cal = Calendar.getInstance();

	@Before
    public void initObjects() {
	    Cal.set(2012,3,7);Date vdFechaInicio=Cal.getTime();
	    Cal.set(2012,3,8);Date vdFechaFin=Cal.getTime();
	    Cal.set(2012,3,9);Date vdFechaCreacion=Cal.getTime();              
		oHistoriaMant.pRegistrarHistoria(1, 1, "Requerimiento 1", 1, 1, "A", 5, 0f,vdFechaCreacion, 1,vdFechaCreacion, 1);
		oHistoriaMant.pRegistrarHistoria(2, 1, "Requerimiento 2", 2, 2, "A", 10, 0f,vdFechaCreacion, 1, vdFechaCreacion, 1);
		oHistoriaMant.pRegistrarHistoria(3, 1, "Requerimiento 3", 3, 3, "P", 15, 0f,vdFechaCreacion, 1, vdFechaCreacion, 1);

	    oUsuarioMant.pAgregar(1,"romulo.leon@gmail.com","Leon","Alegria","Romulo",1,"03-03-2012","03-03-2012",1,1);				
        oUsuarioMant.pAgregar(2,"antauro.humala@gmail.com","Humala","Tasso","Antauro",2,"03-03-2012","03-03-2012",1,1);				
        oUsuarioMant.pAgregar(3,"alberto.quimper@hotmail.com","Quimper","Herrera","Alberto",3,"03-03-2012","03-03-2012",1,1);				
        oUsuarioMant.pAgregar(4,"marco.denegri@gmail.com","Denegri","Santagadea","Marco Aurelio",3,"03-03-2012","03-03-2012",1,1);				
        oUsuarioMant.pAgregar(5,"luis.cripiani@hotmail.com","Cipriani","Thorne","Luis",3,"03-03-2012","03-03-2012",1,1);				
        oUsuarioMant.pAgregar(6,"kenji.fujimori@hotmail.com","Fujimori","Higuchi","Kenji",4,"03-03-2012","03-03-2012",1,1);				
		oProyectoMant.pAgregar(1,"GESTION DE PROVEEDORES","WONG","03-03-2012","03-03-2012",1,1);				
        oProyectoMant.pAgregar(2,"MODULO DE MANTENIMIENTO","UPC","03-03-2012","03-03-2012",1,1);				
        oProyectoMant.pAgregar(3,"CONTROL DE VISITAS","SARITA COLONIA","03-03-2012","03-03-2012",1,1);				
        oProyectoUsuarioMant.pAgregar(1,1,"03-03-2012","03-03-2012",1,1);				
        oProyectoUsuarioMant.pAgregar(1,2,"03-03-2012","03-03-2012",1,1);				
        oProyectoUsuarioMant.pAgregar(1,3,"03-03-2012","03-03-2012",1,1);				
        oProyectoUsuarioMant.pAgregar(1,5,"03-03-2012","03-03-2012",1,1);				
        oProyectoUsuarioMant.pAgregar(1,6,"03-03-2012","03-03-2012",1,1);				
		oTareaMant.pAgregar(1, 1, "Tarea 1",vdFechaInicio,vdFechaFin, 24,	"PD", "N",0,0,vdFechaCreacion,null,	1, 0);
		oTareaMant.pAgregar(2, 1, "Tarea 2",vdFechaInicio,vdFechaFin, 36,	"PD", "N",0,0,vdFechaCreacion,null,	1, 0);
		oTareaMant.pAgregar(3, 1, "Tarea 3",vdFechaInicio,vdFechaFin, 48,	"PD", "N",0,0,vdFechaCreacion,null,	2, 0);
		oTareaMant.pAgregar(4, 2, "Tarea 4",vdFechaInicio,vdFechaFin, 36,	"ER", "N",0,0,vdFechaCreacion,null,	2, 0);
		oTareaMant.pAgregar(5, 2, "Tarea 5",vdFechaInicio,vdFechaFin, 24,	"PD", "B",4,0,vdFechaCreacion,null,	3, 0);
		oTareaMant.pAgregar(6, 2, "Tarea 6",vdFechaInicio,vdFechaFin, 24,	"PD", "N",0,0,vdFechaCreacion,null,	4, 0);
		oTareaMant.pAgregar(7, 3, "Tarea 7",vdFechaInicio,vdFechaFin, 24,	"PD", "N",0,0,vdFechaCreacion,null,	2, 0);
		oTareaMant.pAgregar(8, 3, "Tarea 8",vdFechaInicio,vdFechaFin, 48,	"PD", "N",0,0,vdFechaCreacion,null,	3, 0);
		oTareaMant.pAgregar(9, 3, "Tarea 9",vdFechaInicio,vdFechaFin, 36,	"PD", "N",0,0,vdFechaCreacion,null,	4, 0);
		oUsuariosTareaMant.pAgregar(1, 1, vdFechaCreacion, null, 1, 0);
		oUsuariosTareaMant.pAgregar(1, 2, vdFechaCreacion, null, 1, 0);
		oUsuariosTareaMant.pAgregar(2, 3, vdFechaCreacion, null, 1, 0);
		oUsuariosTareaMant.pAgregar(2, 4, vdFechaCreacion, null, 1, 0);

        
        //Usuario
        oUsuarioMant.pListaUsuarios();

    	//Proyectos
        oProyectoMant.pListaProyectos();
        
        //Tareas
    	sFormato = "|%1$-4s|%2$-30s|%3$-30s|%4$-30s|%5$-20s|%6$-12s|%7$-10s|\n";
    	System.out.println("\n[TAREAS]");
    	System.out.println("====================================================================================================================================================");
        System.out.format(sFormato,"ID","Descripción","Fecha Inicio","Fecha Fin","Duración","Tipo","Estado");
    	System.out.println("====================================================================================================================================================");
    	for( clsTarea oTarea  : oTareaMant.tareas)
            System.out.format(sFormato,oTarea.get_iIDTarea(),oTarea.get_sDescripcion(),oTarea.get_dFechaInicio(),
            		oTarea.get_dFechaFin(),oTarea.get_iDuracionHoras(),oTarea.get_sTipo(),oTarea.get_sEstado());    		
    	System.out.println("====================================================================================================================================================");

    	//UsuariosTareas
    	String  sFormato = "|%1$-30s|%2$-30s|\n";
    	System.out.println("\n[USUARIOS DE TAREAS]");
    	System.out.println("====================================================================================================================================================");
        System.out.format(sFormato,"Tarea","Usuario");
    	System.out.println("====================================================================================================================================================");
    	for( ClsUsuariosTarea oUsuarioTarea  : oUsuariosTareaMant.usuariostarea)
            System.out.format(sFormato, oTareaMant.fsDescripcionTarea(oUsuarioTarea.get_iIDTarea()),oUsuarioMant.fsNombreUsuario(oUsuarioTarea.get_iIDUsuario()));    		
    	System.out.println("====================================================================================================================================================");	
	}

	@Test
    public void DebeAsignarUsuarioAlProyecto(){
        System.out.println("");
        System.out.println("Agregar Usuario al Proyecto");
        System.out.println("===========================");
        int viIDProyecto = 1;
        int viIDUsuario = 4;
    	String vdFechaCreacion = "05/04/2012";
    	String vdFechaModificacion = "05/04/2012";
    	int viIDUsuarioCreacion = 3;
    	int viIDUsuarioModificacion = 3;    	
        // Act
        boolean boAgrega = oProyectoUsuarioMant.pAgregar(viIDProyecto,viIDUsuario,vdFechaCreacion,vdFechaModificacion,viIDUsuarioCreacion,viIDUsuarioModificacion);    
        //Assert
        assertEquals(true,boAgrega);
        System.out.println("<<Resultados>>");
        
           }
	@Test
    public void NoDebeAsignarUsuarioAlProyecto(){
        System.out.println("");
        System.out.println("Agregar Usuario al Proyecto");
        System.out.println("===========================");
        int viIDProyecto = 1;
        int viIDUsuario = 5;
    	String vdFechaCreacion = "05/04/2012";
    	String vdFechaModificacion = "05/04/2012";
    	int viIDUsuarioCreacion = 3;
    	int viIDUsuarioModificacion = 3;    	
        // Act
        boolean boAgrega = oProyectoUsuarioMant.pAgregar(viIDProyecto,viIDUsuario,vdFechaCreacion,vdFechaModificacion,viIDUsuarioCreacion,viIDUsuarioModificacion);    
        //Assert
        assertEquals(false,boAgrega);
        System.out.println("<<Resultados>>");
        
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
