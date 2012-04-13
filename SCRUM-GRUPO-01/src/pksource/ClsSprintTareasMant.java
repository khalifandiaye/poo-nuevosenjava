package pksource;
import java.util.ArrayList;
import java.util.Date;

public class ClsSprintTareasMant {
	
	public ArrayList<ClsSprintTareas> sprintstareas;
	
	public ClsSprintTareasMant(){
		sprintstareas = new ArrayList<ClsSprintTareas>();
	}
	
	public void pAgregar(int viIDSprintTareas,int viIDSprint,int viIDUsuarioCreacion,Date vdFechaCreacion,int viIDUsuarioModificacion,Date vdFechaModificacion){
		if (viIDSprintTareas == 0){
			System.out.println("La Tarea a Asignar no debe de estar en blanco");
			System.out.println("Tarea No Agregada");}
		else
		    if (faBuscar(viIDSprintTareas,viIDSprint) == null){		
					ClsSprintTareas nuevoSprintTareas = new ClsSprintTareas(viIDSprintTareas,viIDSprint,viIDUsuarioCreacion,vdFechaCreacion,viIDUsuarioModificacion,vdFechaModificacion);
					sprintstareas.add(nuevoSprintTareas);}		
				else
					System.out.println("Tarea No Agregada");
	}
	
	public void pEliminar(int viIDSprintTareas, int viIDSprint){
		if (faBuscarPkPos(viIDSprintTareas,viIDSprint) != -1) {
				sprintstareas.remove(faBuscarPkPos(viIDSprintTareas,viIDSprint));
				System.out.println("Sprint Borrado");}
		else
			System.out.println("Sprint No Borrado");		
	}
	
	public void pEditar(int viIDSprintTareas,int viIDSprint,int viIDUsuarioCreacion,Date vdFechaCreacion,int viIDUsuarioModificacion,Date vdFechaModificacion){
		if (viIDSprintTareas == 0){
			System.out.println("La Tarea a Asignar no debe de estar en blanco");
			System.out.println("Tarea en Sprint No Editada");}
		else
		 	if (faBuscarPkPos(viIDSprintTareas,viIDSprint) != -1) {
		 		ClsSprintTareas oSprintTareas_orig;
				oSprintTareas_orig = faBuscarPk(viIDSprint,viIDSprint); 
				ClsSprintTareas oUsuario_edit = new ClsSprintTareas(viIDSprintTareas,viIDSprint,viIDUsuarioCreacion,vdFechaCreacion,viIDUsuarioModificacion,vdFechaModificacion);
				sprintstareas.set(faBuscarPkPos(viIDSprintTareas,viIDSprint),oUsuario_edit);
				System.out.println("Usuario Editado");}
		 	else
		 		System.out.println("Sprint No Editado");		
	}

	public ClsSprintTareas faBuscar(int viIDSprintTareas, int viIDSprint){
		for( ClsSprintTareas sprintstarea  : sprintstareas)
            if (sprintstarea.get_iIDSprintTareas() == viIDSprintTareas && sprintstarea.get_iIDSprint() == viIDSprint)
                return sprintstarea;
        return null;
	}
	
	public ClsSprintTareas faBuscarPk(int viIDSprintTareas, int viIDSprint){
		for( ClsSprintTareas sprintstarea  : sprintstareas)
            if (sprintstarea.get_iIDSprintTareas() == viIDSprintTareas  && sprintstarea.get_iIDSprint() == viIDSprint)
                return sprintstarea;
        return null;
	}

	public int faBuscarPkPos(int viIDSprintTareas, int viIDSprint){
		int i = -1;
		for (ClsSprintTareas sprintstarea  : sprintstareas)
		{
        	i ++;
        	if (sprintstarea.get_iIDSprintTareas() == viIDSprintTareas && sprintstarea.get_iIDSprint() == viIDSprint)
                return i;
		}
        return i;
	}

}
