package pksource;

import java.util.ArrayList;

public class clsSprintMant {
	
	public ArrayList<clsSprint> sprints;
	
	public clsSprintMant(){
		sprints = new ArrayList<clsSprint>();
	}
	
	public void pAgregar(int viIDSprint,String vsDescripcion,String vdFechaInicio, String vdFechaFin, int viDuracionDias,String vsEstado,double vdPorcentajeAvance,int viIDUsuarioCreacion,String vdFechaCreacion,int viIDUsuarioModificacion,String vdFechaModificacion){
		if (faBuscar(vsDescripcion) == null){		
			clsSprint nuevoSprint = new clsSprint(viIDSprint,vsDescripcion,vdFechaInicio,vdFechaFin,viDuracionDias,vsEstado,vdPorcentajeAvance,viIDUsuarioCreacion,vdFechaCreacion,viIDUsuarioModificacion,vdFechaModificacion);
			sprints.add(nuevoSprint);
			System.out.println("Sprint Agregado");
		}		
		else
			System.out.println("Sprint No Agregado");
	}
	
	public void pEliminar(int viIDSprint2){
		if (faBuscarPkPos(viIDSprint2) != -1) {
			sprints.remove(faBuscarPkPos(viIDSprint2));
			System.out.println("Sprint Borrado");
		}
		else
			System.out.println("Sprint No Borrado");		
	}
	
	public void pEditar(int viIDSprint,String vsDescripcion,String vdFechaInicio, String vdFechaFin, int viDuracionDias,String vsEstado,double vdPorcentajeAvance,int viIDUsuarioCreacion,String vdFechaCreacion,int viIDUsuarioModificacion,String vdFechaModificacion){
		if (faBuscarPkPos(viIDSprint) != -1) {
			clsSprint sprint = new clsSprint(viIDSprint,vsDescripcion,vdFechaInicio,vdFechaFin,viDuracionDias,vsEstado,vdPorcentajeAvance,viIDUsuarioCreacion,vdFechaCreacion,viIDUsuarioModificacion,vdFechaModificacion);
			sprints.set(faBuscarPkPos(viIDSprint),sprint);
			System.out.println("Sprint Editado");
		}
		else
			System.out.println("Sprint No Editado");		
	}

	public clsSprint faBuscar(String vsDescripcion){
		for( clsSprint sprint  : sprints)
            if (sprint.get_sDescripcion() == vsDescripcion)
                return sprint;
        return null;
	}
	
	public clsSprint faBuscarPk(int viIDSprint){
		for( clsSprint sprint  : sprints)
            if (sprint.get_iIDSprint() == viIDSprint)
                return sprint;
        return null;
	}

	public int faBuscarPkPos(int viIDSprint){
		int i = -1;
		for (clsSprint sprint  : sprints)
		{
        	i ++;
            if (sprint.get_iIDSprint() == viIDSprint)
                return i;
		}
        return i;
	}

}
