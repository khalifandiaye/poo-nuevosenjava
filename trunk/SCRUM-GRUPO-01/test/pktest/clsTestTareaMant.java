package pktest;
import static org.junit.Assert.*;

import org.junit.Test;

import pksource.clsTarea;
import pksource.clsTareaMant;
import java.util.Date;
import java.util.Calendar;

public class clsTestTareaMant {
	
	
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
		clsTareaMant oTareaMant = new clsTareaMant();
		
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
	public void DebeGrabarFechaInicioMenorIgualaFecheFin(){
		
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

}
