package appscrumhl;
import java.util.ArrayList;



public class clsTarea {

	private ArrayList<clsArrTarea> tareas;
	//private ArrayList<clsArrHistoriaUsuario> historias;
	
	public clsTarea(){
        // 
		tareas = new ArrayList<clsArrTarea>();
		//historias = new ArrayList<clsArrHistoriaUsuario>();
	}
	public boolean InsertarTarea(String IDTarea, String IDHisUsu, String Descripcion, String Fecha, double PorcentajeAvance,clsArrHistoriaUsuario consHistoria){
		//VALIDAR SI YA HAY ESTA EN PROGRESO LA TAREA
		clsArrTarea consTarea;
		
		consTarea = ConsultarTarea(IDTarea);
		if (consTarea!= null){
			if (consTarea.getPorcentajeAvance()>0)
				return false;			
		}
					
		//VALIDAR SI LA HISTORIA DE USUARIO DE LA TAREA A REGISTRAR EXISTE EN ARR DE HISTORIAS DE USUARIO
		
		//clsArrHistoriaUsuario consHistoria;
		//clsHistoriaUsuario objHisUsu = new clsHistoriaUsuario() ;
		//consHistoria = objHisUsu.ConsultarHistoriaUsuario(IDHisUsu);
		if (consHistoria==null)
			return false;
		
		
		
		
		clsArrTarea tarea=new clsArrTarea(IDTarea,IDHisUsu,Descripcion,Fecha,PorcentajeAvance);
		
		tareas.add(tarea);
		
		return true;
		
	}
	public clsArrTarea ConsultarTarea(String IDTarea){
		
		
		for(clsArrTarea tarea : tareas)
            if (tarea.getIDTarea().equals(IDTarea))
                return tarea;
        return null;
		
	}
    
}
