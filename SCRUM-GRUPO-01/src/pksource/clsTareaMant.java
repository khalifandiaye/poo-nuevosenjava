package pksource;
import java.util.ArrayList;
import java.util.Date;

public class clsTareaMant {

	public ArrayList<clsTarea> tareas;
	
	public clsTareaMant(){
		tareas = new ArrayList<clsTarea>();		
	}
	
	private boolean fbValidar(float vfPorcentajeAvance,Date vdFechaInicio,Date vdFechaFin){
		if (vfPorcentajeAvance<0){
			System.out.println("Debe grabar un porcentaje mayor o igual a cero");
			return false;
		}
		if (vfPorcentajeAvance>100){
			System.out.println("Debe grabar un porcentaje menor o igual a cien");
			return false;
		}
		
		int dateResult=vdFechaInicio.compareTo(vdFechaFin);
				
		if(dateResult>0){
			System.out.println("Debe grabar Fecha Inicio menor o igual a Fecha Final");
			return false;
		}
		return true;
	}
	
	private boolean fbValidarQA(String vsEstado, String vsTipo,	int viIDTareaPadre){
		
		//DebeGrabarTareasNormalessinTareaPadre
		if (vsTipo=="N"){
			if (viIDTareaPadre!=0) {
				System.out.println("Debe Grabar Tareas Normales sin Tarea Padre");	
				return false;
			}
				
		}
		//DebeGrabarTareasBugsconTareaPadreExistentedelTipoNormal
		if (vsTipo=="B"){
			if (faBuscarPk(viIDTareaPadre) == null)	{
				System.out.println("Debe Grabar Tareas Bugs con Tarea Padre Existente del Tipo Normal");
				return false;
			}
				
			//DebeGrabarTareasBugsconTareaPadre
			if (viIDTareaPadre==0) {
				System.out.println("Debe Grabar Tareas Bugs con Tarea Padre");
				return false;
			}
				
			//DebeActualizarSoloTareasNormalesaEstadosEnRevision
			if (vsEstado=="ER"){
				System.out.println("Debe Actualizar sólo Tareas Normales a Estados en Revision");
				return false;
			}
				
			//DebeCrearunaTareaBugcuyaTareaPadretengaEstadoEnRevision
			
			clsTarea oTareaBusq = faBuscarPk(viIDTareaPadre);
			if (oTareaBusq.get_sEstado()!="ER"){
				System.out.println("Debe Crear una Tarea Bug cuya Tarea Padre tenga Estado en Revision");
				return false;
			}
						
		}
		
		return true;
	}
	
	public void pAgregar(int viIDTarea,int viIDHistoria,String vsDescripcion,Date vdFechaInicio,
			Date vdFechaFin,int viDuracionHoras,String vsEstado,String vsTipo,
			int viIDTareaPadre, float vfPorcentajeAvance, 
			Date vdFechaCreacion,Date vdFechaModificacion,int viIDUsuarioCreacion,int viIDUsuarioModificacion){
		
		if (fbValidar(vfPorcentajeAvance,vdFechaInicio,vdFechaFin)==false)
			return;
		if (fbValidarQA(vsEstado,vsTipo,viIDTareaPadre)==false)
			return;
			
		if (faBuscar(vsDescripcion) == null){		
			clsTarea nuevaTarea = new clsTarea(viIDTarea,viIDHistoria,vsDescripcion,vdFechaInicio,
					vdFechaFin,viDuracionHoras,vsEstado,vsTipo,
					viIDTareaPadre,vfPorcentajeAvance,
					vdFechaCreacion,vdFechaModificacion,viIDUsuarioCreacion,viIDUsuarioModificacion);
			
			tareas.add(nuevaTarea);
			System.out.println("Tarea Agregada");
		}		
		else
			System.out.println("Tarea No Agregada");

	}
	
	public clsTarea faBuscar(String vsDescripcion){
		for( clsTarea tarea : tareas)
            if (tarea.get_sDescripcion() == vsDescripcion)
                return tarea;
        return null;
	}
	
	public clsTarea faBuscarPk(int viIDTarea){
		for( clsTarea tarea : tareas)
            if (tarea.get_iIDTarea() == viIDTarea)
                return tarea;
        return null;
	}
	
	public int faBuscarPkPos(int viIDTarea){
		int i = -1;
		for (clsTarea tarea : tareas)
		{
        	i++;
            if (tarea.get_iIDTarea() == viIDTarea)
                return i;
		}
        return i;
	}
	public String fsDescripcionTarea(int viIDTarea){
		
		clsTarea oBuscarTarea = faBuscarPk(viIDTarea);
		if (oBuscarTarea!=null)
			return oBuscarTarea.get_sDescripcion();
		
		return "";
		
	}
	
	public void pEditar(int viIDTarea,int viIDHistoria,String vsDescripcion,Date vdFechaInicio,
			Date vdFechaFin,int viDuracionHoras,String vsEstado,String vsTipo,
			int viIDTareaPadre, float vfPorcentajeAvance, 
			Date vdFechaCreacion,Date vdFechaModificacion,
			int viIDUsuarioCreacion,int viIDUsuarioModificacion){
		
		if (fbValidar(vfPorcentajeAvance,vdFechaInicio,vdFechaFin)==false)
			return;
		if (fbValidarQA(vsEstado,vsTipo,viIDTareaPadre)==false)
			return;
		
		if (faBuscarPkPos(viIDTarea) != -1) {
			clsTarea tarea = new clsTarea(viIDTarea,viIDHistoria,vsDescripcion,vdFechaInicio,
					vdFechaFin,viDuracionHoras,vsEstado,vsTipo,
					viIDTareaPadre,vfPorcentajeAvance,
					vdFechaCreacion,vdFechaModificacion,viIDUsuarioCreacion,viIDUsuarioModificacion);
			tareas.set(faBuscarPkPos(viIDTarea), tarea);
			System.out.println("Tarea Editada");
		}
		else
			System.out.println("Tarea No Editada");		
	}

	public void pEliminar(int viIDTarea){
		if (faBuscarPkPos(viIDTarea) != -1) {
			tareas.remove(faBuscarPkPos(viIDTarea));
			System.out.println("Tarea Eliminada");
		}
		else
			System.out.println("Tarea No Eliminada");		
	}
}
