package pktest;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pksource.ClsUsuariosTarea;
import pksource.ClsUsuariosTareaMant;
import pksource.clsTarea;
import pksource.clsTareaMant;
import pksource.clsUsuarioMant;

import java.util.Date;
import java.util.Calendar;

public class ClsTestUsuariosTareaMant {
	ClsUsuariosTareaMant oUsuariosTareaMant = new ClsUsuariosTareaMant();
	clsTareaMant oTareaMant = new clsTareaMant();
	clsUsuarioMant oUsuarioMant = new clsUsuarioMant();
	
	@Before
	public void CargarUsuarioTarea(){
		Calendar Cal = Calendar.getInstance();
        Cal.set(2012,3,9);Date vdFechaCreacion=Cal.getTime();              
        Cal.set(2012,3,7);Date vdFechaInicio=Cal.getTime();
        Cal.set(2012,3,8);Date vdFechaFin=Cal.getTime();

		oTareaMant.pAgregar(1, 1, "Tarea 1",vdFechaInicio,vdFechaFin, 24,	"PD", "N",0,0,vdFechaCreacion,null,	1, 0);
		oTareaMant.pAgregar(2, 1, "Tarea 2",vdFechaInicio,vdFechaFin, 36,	"PD", "N",0,0,vdFechaCreacion,null,	1, 0);
		oTareaMant.pAgregar(3, 1, "Tarea 3",vdFechaInicio,vdFechaFin, 36,	"TD", "N",0,0,vdFechaCreacion,null,	1, 0);

        oUsuarioMant.pAgregar(1,"romulo.leon@gmail.com","Leon","Alegria","Romulo",1,"03/03/2012","03/03/2012",1,1);				
        oUsuarioMant.pAgregar(2,"antauro.humala@gmail.com","Humala","Taso","Antauro",2,"03/03/2012","03/03/2012",1,1);				
        oUsuarioMant.pAgregar(3,"alberto.quimper@hotmail.com","Quimper","Herrera","Alberto",3,"03/03/2012","03/03/2012",1,1);				
        oUsuarioMant.pAgregar(4,"marco.denegri@gmail.com","Denegri","Santagadea","Marco Aurelio",1,"03/03/2012","03/03/2012",1,1);				

		
		oUsuariosTareaMant.pAgregar(1, 1, oTareaMant,oUsuarioMant,vdFechaCreacion, null, 1, 0);
		oUsuariosTareaMant.pAgregar(1, 2, oTareaMant,oUsuarioMant,vdFechaCreacion, null, 1, 0);
		oUsuariosTareaMant.pAgregar(2, 1, oTareaMant,oUsuarioMant,vdFechaCreacion, null, 1, 0);
		oUsuariosTareaMant.pAgregar(2, 2, oTareaMant,oUsuarioMant,vdFechaCreacion, null, 1, 0);
		
		Consultar();
	}

	
	private void Consultar(){
	       	       
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
	public void DebeAsignarUsuarioaTareaExistente(){
		Calendar Cal = Calendar.getInstance();
        Cal.set(2012,3,9);Date vdFechaCreacion=Cal.getTime();              
        
        int viIDTarea=4;
        int viIDUsuario=3;
        oUsuariosTareaMant.pAgregar(viIDTarea, viIDUsuario,oTareaMant, oUsuarioMant,vdFechaCreacion, null, 1, 0);
        
		System.out.println("");
		System.out.println("LUEGO DE GRABACIÓN...");
		Consultar();

		//Buscar
		ClsUsuariosTarea oUsuarioTarea = oUsuariosTareaMant.faBuscarPk(viIDTarea,viIDUsuario);
		//Confirmacion
		assertNotNull(oUsuarioTarea);

	}

	@Test
	public void DebeAsignarUsuarioaTareaenEstadoPendiente(){
		Calendar Cal = Calendar.getInstance();
        Cal.set(2012,3,9);Date vdFechaCreacion=Cal.getTime();              
        
        int viIDTarea=3;
        int viIDUsuario=3;
        oUsuariosTareaMant.pAgregar(viIDTarea, viIDUsuario,oTareaMant, oUsuarioMant,vdFechaCreacion, null, 1, 0);
        
		System.out.println("");
		System.out.println("LUEGO DE GRABACIÓN...");
		Consultar();

		//Buscar
		ClsUsuariosTarea oUsuarioTarea = oUsuariosTareaMant.faBuscarPk(viIDTarea,viIDUsuario);
		//Confirmacion
		assertNotNull(oUsuarioTarea);
		
	}

	@Test
	public void DebeAsignarUsuarioExistenteaTarea(){
		Calendar Cal = Calendar.getInstance();
        Cal.set(2012,3,9);Date vdFechaCreacion=Cal.getTime();              
        
        int viIDTarea=2;
        int viIDUsuario=5;
        oUsuariosTareaMant.pAgregar(viIDTarea, viIDUsuario,oTareaMant, oUsuarioMant,vdFechaCreacion, null, 1, 0);
        
		System.out.println("");
		System.out.println("LUEGO DE GRABACIÓN...");
		Consultar();

		//Buscar
		ClsUsuariosTarea oUsuarioTarea = oUsuariosTareaMant.faBuscarPk(viIDTarea,viIDUsuario);
		//Confirmacion
		assertNotNull(oUsuarioTarea);
		
	}

}
