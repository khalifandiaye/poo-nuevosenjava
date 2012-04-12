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
	
	public void pAgregar(int viIDTarea,int viIDUsuario, 
			Date vdFechaCreacion,Date vdFechaModificacion,int viIDUsuarioCreacion,int viIDUsuarioModificacion){
		
	}

	public void pEliminar(int viIDTarea,int viIDUsuario){
		
	}

}
