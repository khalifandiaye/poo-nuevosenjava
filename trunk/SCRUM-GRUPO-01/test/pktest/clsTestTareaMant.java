package pktest;
import static org.junit.Assert.*;

import org.junit.Test;

import pksource.clsTarea;
import pksource.clsTareaMant;

public class clsTestTareaMant {
	
	
	@Test
	public void AgregarTarea(){
		System.out.println("");
        System.out.println("Agregar Tarea");
        System.out.println("================");
        
        int viIDTarea=1;
        int viIDHistoria=1;
        String vsDescripcion="Tarea 1";
        String vdFechaInicio="07/04/2012";
		String vdFechaFin="08/04/2012";
        int viDuracionHoras=24;
        String vsEstado="PD";//Pendiente
        String vsTipo="N";//Normal
		int viIDTareaPadre=0;
		float vfPorcentajeAvance=0; 
		String vdFechaCreacion="07/04/2012";
		String vdFechaModificacion="";
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
		//assertEquals(vfPorcentajeAvance,oTarea.get_fPorcentajeAvance());
		assertEquals(vdFechaCreacion,oTarea.get_dFechaCreacion());
		assertEquals(vdFechaModificacion,oTarea.get_dFechaModificacion());
		assertEquals(viIDUsuarioCreacion,oTarea.get_iIDUsuarioCreacion());
		assertEquals(viIDUsuarioModificacion,oTarea.get_iIDUsuarioModificacion());
		
	}
	
	
	@Test
	public void EliminarTarea(){
		System.out.println("");
        System.out.println("Eliminar Tarea");
        System.out.println("================");
        
        int viIDTarea=2;
        int viIDHistoria=1;
        String vsDescripcion="Tarea 2";
        String vdFechaInicio="07/04/2012";
		String vdFechaFin="08/04/2012";
        int viDuracionHoras=24;
        String vsEstado="PD";//Pendiente
        String vsTipo="N";//Normal
		int viIDTareaPadre=0;
		float vfPorcentajeAvance=0; 
		String vdFechaCreacion="07/04/2012";
		String vdFechaModificacion="";
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
	public void EditarTarea(){
		System.out.println("");
        System.out.println("Editar Tarea");
        System.out.println("================");
        
        int viIDTarea=2;
        int viIDHistoria=1;
        String vsDescripcion="Tarea 2";
        String vdFechaInicio="07/04/2012";
		String vdFechaFin="08/04/2012";
        int viDuracionHoras=24;
        String vsEstado="PD";//Pendiente
        String vsTipo="N";//Normal
		int viIDTareaPadre=0;
		float vfPorcentajeAvance=0; 
		String vdFechaCreacion="07/04/2012";
		String vdFechaModificacion="";
		int viIDUsuarioCreacion=1;
		int viIDUsuarioModificacion=0;
        //Eliminar
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
}
