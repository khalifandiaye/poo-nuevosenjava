package pktest;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pksource.clsTarea;
import pksource.clsTareaMant;
import pksource.clsUsuario;

import java.util.Date;
import java.util.Calendar;


public class clsTestTareaMant {
	clsTareaMant oTareaMant = new clsTareaMant();
	
	@Before
	public void CargarTareas(){
		Calendar Cal = Calendar.getInstance();
        Cal.set(2012,3,7);Date vdFechaInicio=Cal.getTime();
        Cal.set(2012,3,8);Date vdFechaFin=Cal.getTime();
        Cal.set(2012,3,9);Date vdFechaCreacion=Cal.getTime();              
		oTareaMant.pAgregar(1, 1, "Tarea 1",vdFechaInicio,vdFechaFin, 24,	"PD", "N",0,0,vdFechaCreacion,null,	1, 0);
		oTareaMant.pAgregar(2, 1, "Tarea 2",vdFechaInicio,vdFechaFin, 36,	"PD", "N",0,0,vdFechaCreacion,null,	1, 0);
		oTareaMant.pAgregar(3, 1, "Tarea 3",vdFechaInicio,vdFechaFin, 48,	"PD", "N",0,0,vdFechaCreacion,null,	2, 0);
		oTareaMant.pAgregar(4, 2, "Tarea 4",vdFechaInicio,vdFechaFin, 36,	"ER", "N",0,0,vdFechaCreacion,null,	2, 0);
		oTareaMant.pAgregar(5, 2, "Tarea 5",vdFechaInicio,vdFechaFin, 24,	"PD", "B",4,0,vdFechaCreacion,null,	3, 0);
		oTareaMant.pAgregar(6, 2, "Tarea 6",vdFechaInicio,vdFechaFin, 24,	"PD", "N",0,0,vdFechaCreacion,null,	4, 0);
		oTareaMant.pAgregar(7, 3, "Tarea 7",vdFechaInicio,vdFechaFin, 24,	"PD", "N",0,0,vdFechaCreacion,null,	2, 0);
		oTareaMant.pAgregar(8, 3, "Tarea 8",vdFechaInicio,vdFechaFin, 48,	"PD", "N",0,0,vdFechaCreacion,null,	3, 0);
		oTareaMant.pAgregar(9, 3, "Tarea 9",vdFechaInicio,vdFechaFin, 36,	"PD", "N",0,0,vdFechaCreacion,null,	4, 0);
		
       String sFormato;

       
        sFormato = "|%1$-4s|%2$-30s|%3$-30s|%4$-30s|%5$-20s|%6$-12s|%7$-10s|\n";
    	System.out.println("\n[TAREAS]");
    	System.out.println("====================================================================================================================================================");
        System.out.format(sFormato,"ID","Descripción","Fecha Inicio","Fecha Fin","Duración","Tipo","Estado");
    	System.out.println("====================================================================================================================================================");
    	for( clsTarea oTarea  : oTareaMant.tareas)
            System.out.format(sFormato,oTarea.get_iIDTarea(),oTarea.get_sDescripcion(),oTarea.get_dFechaInicio(),
            		oTarea.get_dFechaFin(),oTarea.get_iDuracionHoras(),oTarea.get_sTipo(),oTarea.get_sEstado());    		
    	System.out.println("====================================================================================================================================================");

	}
	
	
	@Test
	public void DebeAgregarTarea(){
		System.out.println("");
        System.out.println("Agregar Tarea");
        System.out.println("================");
        
        int viIDTarea=1;
        int viIDHistoria=1;
        String vsDescripcion="Tarea 1";
        
        Calendar Cal = Calendar.getInstance();
        Cal.set(2012,3,7);//07/04/2012
        Date vdFechaInicio=Cal.getTime();
        
		//Date vdFechaFin="08/04/2012";
        Cal.set(2012,3,8);//08/04/2012
        Date vdFechaFin=Cal.getTime();
        
        int viDuracionHoras=24;
        String vsEstado="PD";//Pendiente
        String vsTipo="N";//Normal
		int viIDTareaPadre=0;
		float vfPorcentajeAvance=0; 
		//Date vdFechaCreacion="07/04/2012";
        
        Cal.set(2012,3,7);//07/04/2012
        Date vdFechaCreacion=Cal.getTime();

		Date vdFechaModificacion=null;
		int viIDUsuarioCreacion=1;
		int viIDUsuarioModificacion=0;
		
		//Agregar
		//clsTareaMant oTareaMant = new clsTareaMant();
		
		oTareaMant.pAgregar(viIDTarea, viIDHistoria, vsDescripcion, 
				vdFechaInicio, vdFechaFin, viDuracionHoras, 
				vsEstado, vsTipo, viIDTareaPadre, 
				vfPorcentajeAvance, vdFechaCreacion, vdFechaModificacion, 
				viIDUsuarioCreacion, viIDUsuarioModificacion);
		//Buscar
		clsTarea oTarea = oTareaMant.faBuscarPk(viIDTarea);
		//Confirmacion
		assertNotNull(oTarea);
		//Confirmacion Cada Campo
		assertEquals(viIDTarea,oTarea.get_iIDTarea());
		assertEquals(viIDHistoria,oTarea.get_iIDHistoria());
		assertEquals(vsDescripcion,oTarea.get_sDescripcion());
		assertEquals(vdFechaInicio,oTarea.get_dFechaInicio());
		assertEquals(vdFechaFin,oTarea.get_dFechaFin());
		assertEquals(viDuracionHoras,oTarea.get_iDuracionHoras());
		assertEquals(vsEstado,oTarea.get_sEstado());
		assertEquals(vsTipo,oTarea.get_sTipo());
		assertEquals(viIDTareaPadre,oTarea.get_iIDTareaPadre());
		assertEquals(vfPorcentajeAvance,oTarea.get_fPorcentajeAvance(),0.1);
		assertEquals(vdFechaCreacion,oTarea.get_dFechaCreacion());
		assertEquals(vdFechaModificacion,oTarea.get_dFechaModificacion());
		assertEquals(viIDUsuarioCreacion,oTarea.get_iIDUsuarioCreacion());
		assertEquals(viIDUsuarioModificacion,oTarea.get_iIDUsuarioModificacion());
		
		
        System.out.println("<<Resultados>>");
        System.out.println("IDTarea: "  + oTarea.get_iIDTarea()); // imprime los valores grabados
        System.out.println("IDHistoria: " + oTarea.get_iIDHistoria()); // imprime los valores grabados
        System.out.println("Descripción: " + oTarea.get_sDescripcion()); // imprime los valores grabados
        System.out.println("Fecha Inicio: " + oTarea.get_dFechaInicio()); // imprime los valores grabados
        System.out.println("Fecha Fin: " + oTarea.get_dFechaFin()); // imprime los valores grabados
        System.out.println("Duración: " + oTarea.get_iDuracionHoras()); // imprime los valores grabados
        System.out.println("Estado: " + oTarea.get_sEstado()); // imprime los valores grabados
        System.out.println("Tipo: " + oTarea.get_sTipo()); // imprime los valores grabados
        System.out.println("Porcentaje Avance: " + oTarea.get_fPorcentajeAvance()); // imprime los valores grabados
        
        System.out.println("FechaCreacion: " + oTarea.get_dFechaCreacion()); // imprime los valores grabados        
        System.out.println("UsuarioCreacion: " + oTarea.get_iIDUsuarioCreacion()); // imprime los valores grabados
        

	}
	
	
	@Test
	public void DebeEliminarTarea(){
		System.out.println("");
        System.out.println("Eliminar Tarea");
        System.out.println("================");
        
        int viIDTarea=2;
        int viIDHistoria=1;
        String vsDescripcion="Tarea 2";
        Calendar Cal = Calendar.getInstance();
        Cal.set(2012,3,7);//07/04/2012
        Date vdFechaInicio=Cal.getTime();
        
		//Date vdFechaFin="08/04/2012";
        Cal.set(2012,3,8);//08/04/2012
        Date vdFechaFin=Cal.getTime();
        int viDuracionHoras=24;
        String vsEstado="PD";//Pendiente
        String vsTipo="N";//Normal
		int viIDTareaPadre=0;
		float vfPorcentajeAvance=0; 
		//String vdFechaCreacion="07/04/2012";
        Cal.set(2012,3,7);//07/04/2012
        Date vdFechaCreacion=Cal.getTime();

		Date vdFechaModificacion=null;
		int viIDUsuarioCreacion=1;
		int viIDUsuarioModificacion=0;
        //Eliminar
		clsTareaMant oTareaMant = new clsTareaMant();
		oTareaMant.pAgregar(viIDTarea, viIDHistoria, vsDescripcion, 
				vdFechaInicio, vdFechaFin, viDuracionHoras, 
				vsEstado, vsTipo, viIDTareaPadre, 
				vfPorcentajeAvance, vdFechaCreacion, vdFechaModificacion, 
				viIDUsuarioCreacion, viIDUsuarioModificacion);
		
		oTareaMant.pEliminar(viIDTarea);
		//Buscar
		clsTarea oTarea = oTareaMant.faBuscarPk(viIDTarea);
		//Confirmacion que la tarea ya no se encuentra
		assertNull(oTarea);
		
	}

	
	
	@Test
	public void DebeEditarTarea(){
		System.out.println("");
        System.out.println("Editar Tarea");
        System.out.println("================");
        
        int viIDTarea=2;
        int viIDHistoria=1;
        String vsDescripcion="Tarea 2";
        //String vdFechaInicio="07/04/2012";
        Calendar Cal = Calendar.getInstance();
        Cal.set(2012,3,7);//07/04/2012
        Date vdFechaInicio=Cal.getTime();

		//String vdFechaFin="08/04/2012";
        Cal.set(2012,3,8);//08/04/2012
        Date vdFechaFin=Cal.getTime();

        int viDuracionHoras=24;
        String vsEstado="PD";//Pendiente
        String vsTipo="N";//Normal
		int viIDTareaPadre=0;
		float vfPorcentajeAvance=0; 
		//String vdFechaCreacion="07/04/2012";
        Cal.set(2012,3,7);//07/04/2012
        Date vdFechaCreacion=Cal.getTime();

		Date vdFechaModificacion=null;
		int viIDUsuarioCreacion=1;
		int viIDUsuarioModificacion=0;
        //Editar
		clsTareaMant oTareaMant = new clsTareaMant();
		oTareaMant.pAgregar(viIDTarea, viIDHistoria, vsDescripcion, 
				vdFechaInicio, vdFechaFin, viDuracionHoras, 
				vsEstado, vsTipo, viIDTareaPadre, 
				vfPorcentajeAvance, vdFechaCreacion, vdFechaModificacion, 
				viIDUsuarioCreacion, viIDUsuarioModificacion);
		
		vsEstado="PS";//En Proceso
		oTareaMant.pEditar(viIDTarea, viIDHistoria, vsDescripcion, 
				vdFechaInicio, vdFechaFin, viDuracionHoras, 
				vsEstado, vsTipo, viIDTareaPadre, 
				vfPorcentajeAvance, vdFechaCreacion, vdFechaModificacion, 
				viIDUsuarioCreacion, viIDUsuarioModificacion);
		
		//Buscar
		clsTarea oTarea = oTareaMant.faBuscarPk(viIDTarea);
		assertNotNull(oTarea); // existe el registro
		//Confirmacion que la tarea ha sido editada
		assertEquals(vsEstado,oTarea.get_sEstado());
		System.out.println("Nuevo Estado: " + oTarea.get_sEstado());
		
	}

	
	@Test
	public void DebeGrabarPorcentajeAvanceEntreCeroyCien(){

		System.out.println("");
        System.out.println("Editar Campo Porcentaje Avance Entre Cero y Cien Porcentaje Tarea");
        System.out.println("=================================================================");
        
        int viIDTarea=2;
        int viIDHistoria=1;
        String vsDescripcion="Tarea 2";
        //String vdFechaInicio="07/04/2012";
        Calendar Cal = Calendar.getInstance();
        Cal.set(2012,3,7);//07/04/2012
        Date vdFechaInicio=Cal.getTime();

		//String vdFechaFin="08/04/2012";        
        Cal.set(2012,3,8);//08/04/2012
        Date vdFechaFin=Cal.getTime();

        int viDuracionHoras=24;
        String vsEstado="PD";//Pendiente
        String vsTipo="N";//Normal
		int viIDTareaPadre=0;
		float vfPorcentajeAvance=0; 
		//String vdFechaCreacion="07/04/2012";
        Cal.set(2012,3,7);//07/04/2012
        Date vdFechaCreacion=Cal.getTime();

		Date vdFechaModificacion=null;
		int viIDUsuarioCreacion=1;
		int viIDUsuarioModificacion=0;

        //Editar
		clsTareaMant oTareaMant = new clsTareaMant();
		oTareaMant.pAgregar(viIDTarea, viIDHistoria, vsDescripcion, 
				vdFechaInicio, vdFechaFin, viDuracionHoras, 
				vsEstado, vsTipo, viIDTareaPadre, 
				vfPorcentajeAvance, vdFechaCreacion, vdFechaModificacion, 
				viIDUsuarioCreacion, viIDUsuarioModificacion);
		
		vfPorcentajeAvance=100;
		
		oTareaMant.pEditar(viIDTarea, viIDHistoria, vsDescripcion, 
				vdFechaInicio, vdFechaFin, viDuracionHoras, 
				vsEstado, vsTipo, viIDTareaPadre, 
				vfPorcentajeAvance, vdFechaCreacion, vdFechaModificacion, 
				viIDUsuarioCreacion, viIDUsuarioModificacion);

		//Buscar
		clsTarea oTarea = oTareaMant.faBuscarPk(viIDTarea);
		assertNotNull(oTarea); // existe el registro
		//Confirmacion que la tarea ha sido editada
		assertEquals(vfPorcentajeAvance,oTarea.get_fPorcentajeAvance(),0.1);
		
		System.out.println("Nuevo Porcentaje: " + oTarea.get_fPorcentajeAvance());

	}

	@Test
	public void DebeGrabarFechaInicioMenorIgualaFechaFin(){
		
		System.out.println("");
        System.out.println("Editar Campo Fecha Inicio menor a Fecha Fin");
        System.out.println("=================================================================");
        
        int viIDTarea=2;
        int viIDHistoria=1;
        String vsDescripcion="Tarea 2";
        //String vdFechaInicio="07/04/2012";
        Calendar Cal = Calendar.getInstance();
        Cal.set(2012,3,7);//07/04/2012
        Date vdFechaInicio=Cal.getTime();

		//String vdFechaFin="08/04/2012";        
        Cal.set(2012,3,8);//08/04/2012
        Date vdFechaFin=Cal.getTime();
        int viDuracionHoras=24;
        String vsEstado="PD";//Pendiente
        String vsTipo="N";//Normal
		int viIDTareaPadre=0;
		float vfPorcentajeAvance=0; 
		//String vdFechaCreacion="07/04/2012";
        Cal.set(2012,3,7);//07/04/2012
        Date vdFechaCreacion=Cal.getTime();

		Date vdFechaModificacion=null;
		int viIDUsuarioCreacion=1;
		int viIDUsuarioModificacion=0;

        //Editar
		clsTareaMant oTareaMant = new clsTareaMant();
		oTareaMant.pAgregar(viIDTarea, viIDHistoria, vsDescripcion, 
				vdFechaInicio, vdFechaFin, viDuracionHoras, 
				vsEstado, vsTipo, viIDTareaPadre, 
				vfPorcentajeAvance, vdFechaCreacion, vdFechaModificacion, 
				viIDUsuarioCreacion, viIDUsuarioModificacion);

		
        Cal.set(2012,3,8);//08/04/2012
        vdFechaInicio=Cal.getTime();
        Cal.set(2012,3,7);//07/04/2012		
		vdFechaFin=Cal.getTime();
		
		oTareaMant.pEditar(viIDTarea, viIDHistoria, vsDescripcion, 
				vdFechaInicio, vdFechaFin, viDuracionHoras, 
				vsEstado, vsTipo, viIDTareaPadre, 
				vfPorcentajeAvance, vdFechaCreacion, vdFechaModificacion, 
				viIDUsuarioCreacion, viIDUsuarioModificacion);

		//Buscar
		clsTarea oTarea = oTareaMant.faBuscarPk(viIDTarea);
		assertNotNull(oTarea); // existe el registro
		//Confirmacion que la tarea ha sido editada
		assertEquals(vdFechaInicio,oTarea.get_dFechaInicio());
		assertEquals(vdFechaFin,oTarea.get_dFechaFin());
		
		System.out.println("Nueva Rango de Fechas: " + oTarea.get_dFechaInicio()+ " a " +oTarea.get_dFechaFin() );

		
	}

	@Test
	public void DebeGrabarTareasBugsconTareaPadre(){
        Calendar Cal = Calendar.getInstance();
        Cal.set(2012,3,7);//07/04/2012
        Date vdFechaInicio=Cal.getTime();
        
		//Date vdFechaFin="08/04/2012";
        Cal.set(2012,3,8);//08/04/2012
        Date vdFechaFin=Cal.getTime();
        
        Cal.set(2012,3,7);//07/04/2012
        Date vdFechaCreacion=Cal.getTime();

        int viIDTarea=11;
		oTareaMant.pAgregar(viIDTarea, 1, "Tarea Bug sin Tarea Padre",vdFechaInicio,vdFechaFin, 
				24,	"PD", "B",0,0,vdFechaCreacion,null,	1, 0);
		
		clsTarea oTarea = oTareaMant.faBuscarPk(viIDTarea);
		assertNotNull(oTarea);
	}
	@Test
	public void DebeGrabarTareasBugsconTareaPadreExistentedelTipoNormal(){
		
        Calendar Cal = Calendar.getInstance();
        Cal.set(2012,3,7);//07/04/2012
        Date vdFechaInicio=Cal.getTime();
        
		//Date vdFechaFin="08/04/2012";
        Cal.set(2012,3,8);//08/04/2012
        Date vdFechaFin=Cal.getTime();
        
        Cal.set(2012,3,7);//07/04/2012
        Date vdFechaCreacion=Cal.getTime();

        int viIDTarea=12;
		oTareaMant.pAgregar(viIDTarea, 1, "Tarea Bug con Tarea Padre del Tipo Bug",vdFechaInicio,vdFechaFin, 
				24,	"PD", "B",5,0,vdFechaCreacion,null,	1, 0);
		
		clsTarea oTarea = oTareaMant.faBuscarPk(viIDTarea);
		assertNotNull(oTarea);
		
	}

	@Test
	public void DebeGrabarTareasNormalessinTareaPadre(){
		
		
	}

	@Test
	public void DebeActualizarSoloTareasNormalesaEstadosEnRevision(){
		
		
	}
	@Test
	public void DebeCrearunaTareaBugcuyaTareaPadretengaEstadoEnRevision(){
		
	}

}
