package pktest;
import static org.junit.Assert.assertNotNull;

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
		float vfPorcentajeAvance=(float) 0.00; 
		String vdFechaCreacion="07/04/2012";
		String vdFechaModificacion=null;
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
		 
	}
}
