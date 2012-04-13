package pksource;
import java.util.ArrayList;
import java.util.Date;

public class ClsUsuariosTareaMant {

public ArrayList<ClsUsuariosTarea> usuariostarea;
	
	public ClsUsuariosTareaMant(){
		usuariostarea = new ArrayList<ClsUsuariosTarea>();		
	}
	
	/*
	public ClsUsuariosTarea faBuscar(String vsDescripcion){
		for( ClsUsuariosTarea tarea : usuariostarea)
            if (tarea.get_sDescripcion() == vsDescripcion)
                return tarea;
        return null;
	}
	*/
	
	public ClsUsuariosTarea faBuscarPk(int viIDTarea, int viIDUsuario){
		for( ClsUsuariosTarea usuariotarea : usuariostarea)
            if (usuariotarea.get_iIDTarea() == viIDTarea && usuariotarea.get_iIDUsuario() == viIDUsuario)
                return usuariotarea;
        return null;
	}
	
	public int faBuscarFkPos(int viIDUsuario){
		int i = -1;
		for (ClsUsuariosTarea usuariotarea : usuariostarea)
		{
        	i++;
            if (usuariotarea.get_iIDUsuario() == viIDUsuario)
                return i;
		}
        return -1;
	}

	public int faBuscarPkPos(int viIDTarea, int viIDUsuario){
		int i = -1;
		for (ClsUsuariosTarea usuariotarea : usuariostarea)
		{
        	i++;
            if (usuariotarea.get_iIDTarea() == viIDTarea  && usuariotarea.get_iIDUsuario() == viIDUsuario)
                return i;
		}
        return i;
	}
	
	private boolean fbValidar(int viIDTarea,int viIDUsuario,clsTareaMant oTareaMant,clsUsuarioMant oUsuarioMant){
		//DebeAsignarUsuarioaTareaExistente
		if (oTareaMant.faBuscarPk(viIDTarea)==null){
			System.out.println("Debe Asignar Usuario a Tarea Existente");
			return false;
		}
			
		
		//DebeAsignarUsuarioaTareaenEstadoPendiente
		clsTarea oTarea = oTareaMant.faBuscarPk(viIDTarea);
		if (oTarea.get_sEstado()!="PD"){
			System.out.println("Debe Asignar Usuario a Tarea en Estado Pendiente");
			return false;
		}
			
		
		//DebeAsignarUsuarioExistenteaTarea
		if (oUsuarioMant.faBuscarPk(viIDUsuario)==null){
			System.out.println("Debe Asignar Usuario Existente a Tarea");
			return false;
		}
			
		
		return true;
	}

	public void pAgregar(int viIDTarea,int viIDUsuario, 
			clsTareaMant oTareaMant,
			clsUsuarioMant oUsuarioMant,
			Date vdFechaCreacion,Date vdFechaModificacion,int viIDUsuarioCreacion,int viIDUsuarioModificacion){
		
		if (fbValidar(viIDTarea,viIDUsuario,oTareaMant,oUsuarioMant)==false)
			return;

		if (faBuscarPk(viIDTarea,viIDUsuario) == null){
			ClsUsuariosTarea nuevousuariotarea = new ClsUsuariosTarea(viIDTarea,viIDUsuario,
					vdFechaCreacion,vdFechaModificacion,viIDUsuarioCreacion,viIDUsuarioModificacion);
			
			usuariostarea.add(nuevousuariotarea);
			System.out.println("Usuario asignado a la tarea");
		}		
		
		else
			System.out.println("Usuario No asignado a la tarea");
			
		
	}

	public void pEliminar(int viIDTarea,int viIDUsuario){
		if (faBuscarPkPos(viIDTarea,viIDUsuario) != -1) {
			usuariostarea.remove(faBuscarPkPos(viIDTarea,viIDUsuario));
			System.out.println("Usuario eliminado de la tarea");
		}
		else
			System.out.println("Usuario no eliminado de la tarea");
	}

}
