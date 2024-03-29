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
import pksource.clsProyecto;
import pksource.clsProyectoMant;
import pksource.clsProyectoUsuarioMant;
import pksource.clsTarea;
import pksource.clsTareaMant;
import pksource.clsUsuarioMant;
import pksource.clsHistoriaMant;

public class clsTestProyectoMant {
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
		oUsuariosTareaMant.pAgregar(1, 1, oTareaMant, oUsuarioMant,vdFechaCreacion, null, 1, 0);
		oUsuariosTareaMant.pAgregar(1, 2, oTareaMant, oUsuarioMant,vdFechaCreacion, null, 1, 0);
		oUsuariosTareaMant.pAgregar(2, 3, oTareaMant, oUsuarioMant,vdFechaCreacion, null, 1, 0);
		oUsuariosTareaMant.pAgregar(2, 4, oTareaMant, oUsuarioMant,vdFechaCreacion, null, 1, 0);

        
        //Usuario
        oUsuarioMant.pListaUsuarios();

    	//Proyectos
        oProyectoMant.pListaProyectos();
        
        //Tareas
    	sFormato = "|%1$-4s|%2$-30s|%3$-30s|%4$-30s|%5$-20s|%6$-12s|%7$-10s|\n";
    	System.out.println("\n[TAREAS]");
    	System.out.println("====================================================================================================================================================");
        System.out.format(sFormato,"ID","Descripci�n","Fecha Inicio","Fecha Fin","Duraci�n","Tipo","Estado");
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
    public void DebeCrearProyecto(){
        System.out.println("");
        System.out.println("Agregar Proyecto");
        System.out.println("================");
        // Arrange
        int viIDProyecto = 4;
    	String vsDescripcion = "MODULO DE VENTAS";
    	String vsCliente = "VIVANDA";
    	String vdFechaCreacion = "05-04-2012";
    	String vdFechaModificacion = "05-04-2012";
    	int viIDUsuarioCreacion = 3;
    	int viIDUsuarioModificacion = 3;    	
        // Act
        oProyectoMant.pAgregar(viIDProyecto,vsDescripcion,vsCliente,vdFechaCreacion,vdFechaModificacion,viIDUsuarioCreacion,viIDUsuarioModificacion);    
        //Assert
        clsProyecto oProyecto = oProyectoMant.faBuscarPk(viIDProyecto);
        assertNotNull(oProyecto);
        oProyectoMant.pListaProyectos();
           }

    @Test
	public void NoDebeCrearProyecto(){
        System.out.println("");
        System.out.println("No Agrega Proyecto");
        System.out.println("==================");
        // Arrange
        int viIDProyecto = 1;
    	String vsDescripcion = "MODULO DE VENTAS";
    	String vsCliente = "VIVANDA";
    	String vdFechaCreacion = "05-2012";
    	String vdFechaModificacion = "05-04-2012";
    	int viIDUsuarioCreacion = 3;
    	int viIDUsuarioModificacion = 8;    	
        // Act
        oProyectoMant.pAgregar(viIDProyecto,vsDescripcion,vsCliente,vdFechaCreacion,vdFechaModificacion,viIDUsuarioCreacion,viIDUsuarioModificacion);    
        //Assert
        clsProyecto oProyecto = oProyectoMant.faBuscarPk(viIDProyecto);
        assertNotNull(oProyecto);
        oProyectoMant.pListaProyectos();
           }

    @Test
    public void DebeEliminarProyecto(){
        System.out.println("");
        System.out.println("Eliminacion de proyecto");
        System.out.println("=======================");
        // Arrange
        int viIDProyecto =2;
        // Act
        boolean boElimina = oProyectoMant.pEliminar(viIDProyecto, oHistoriaMant);    
        //Assert
        assertEquals(true,boElimina); // no encuentra elemento borrado              
        System.out.println("<<Resultados>>");
        oProyectoMant.pListaProyectos();
    }

    @Test
    public void NoDebeEliminarProyecto(){
        System.out.println("");
        System.out.println("No Eliminacion de proyecto");
        System.out.println("==========================");
        // Arrange
        int viIDProyecto =1;
        // Act
        boolean boElimina = oProyectoMant.pEliminar(viIDProyecto, oHistoriaMant);    
        //Assert
        assertEquals(false,boElimina); // no encuentra elemento borrado              
        System.out.println("<<Resultados>>");
        oProyectoMant.pListaProyectos();
    }

    @Test
    public void DebeEditarProyecto(){
        System.out.println("");
        System.out.println("Edicion de proyecto");
        System.out.println("===================");
        
        // Arrange
        // Valores para el primer proyecto
        int viIDProyecto = 2;
    	String vsDescripcion = "GESTION DE RECLAMOS";
    	String vsCliente = "UPC";
    	String vdFechaModificacion = "13-04-2012";
    	int viIDUsuarioModificacion = 1;    	
    	  	
        // Act
        boolean boEdita = oProyectoMant.pEditar(viIDProyecto,vsDescripcion,vsCliente,vdFechaModificacion,viIDUsuarioModificacion);    
        //Assert
        assertEquals(true,boEdita); //Encuentra el registro modificado  
        System.out.println("<<Resultados>>");
        oProyectoMant.pListaProyectos();
    }


@Test
public void NoDebeEditarProyecto(){
    System.out.println("");
    System.out.println("No Edicion de proyecto");
    System.out.println("======================");
    
    // Arrange
    // Valores para el primer proyecto
    int viIDProyecto = 8;
	String vsDescripcion = "GESTION DE RECLAMOS";
	String vsCliente = "UPC";
	String vdFechaModificacion = "13-04-2012";
	int viIDUsuarioModificacion = 8;    	
	  	
    // Act
    boolean boEdita = oProyectoMant.pEditar(viIDProyecto,vsDescripcion,vsCliente,vdFechaModificacion,viIDUsuarioModificacion);    
    //Assert
    clsProyecto oProyecto = oProyectoMant.faBuscarPk(viIDProyecto);        
    assertEquals(false, boEdita); //Encuentra el registro modificado  
    System.out.println("<<Resultados>>");
    oProyectoMant.pListaProyectos();
}
}
