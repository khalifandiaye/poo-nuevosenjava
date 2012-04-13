package pksource;
import java.util.ArrayList;
import java.util.Date;

public class clsSprintMant {
	
	public ArrayList<clsSprint> sprints;
	
	public clsSprintMant(){
		sprints = new ArrayList<clsSprint>();
	}
	
	public void pAgregar(int viIDSprint,String vsDescripcion,Date vdFechaInicio, Date vdFechaFin, int viDuracionDias,String vsEstado,double vdPorcentajeAvance,int viIDUsuarioCreacion,Date vdFechaCreacion,int viIDUsuarioModificacion,Date vdFechaModificacion){
		if (vdPorcentajeAvance != 0){
			System.out.println("Debe grabar un porcentaje igual a cero");
			System.out.println("Sprint No Agregado");}
		else
		 	if (vdFechaInicio.compareTo(vdFechaFin)>0){
				System.out.println("Debe grabar Fecha Inicio menor o igual a Fecha Final");	}
			else
				if (faBuscar(vsDescripcion) == null){		
					clsSprint nuevoSprint = new clsSprint(viIDSprint,vsDescripcion,vdFechaInicio,vdFechaFin,viDuracionDias,vsEstado,vdPorcentajeAvance,viIDUsuarioCreacion,vdFechaCreacion,viIDUsuarioModificacion,vdFechaModificacion);
					sprints.add(nuevoSprint);}		
				else
					System.out.println("Sprint No Agregado");
	}
	
	public void pEliminar(int viIDSprint2, double vdPorcentajeAvance){
		if (vdPorcentajeAvance != 0) {
			System.out.println("No se puede eliminar un Sprint ya avanzado");
			System.out.println("Sprint No Borrado");}
		else
			if (faBuscarPkPos(viIDSprint2) != -1) {
				sprints.remove(faBuscarPkPos(viIDSprint2));
				System.out.println("Sprint Borrado");
			}
		else
			System.out.println("Sprint No Borrado");		
	}
	
	public void pEditar(int viIDSprint,String vsDescripcion,Date vdFechaInicio, Date vdFechaFin, int viDuracionDias,String vsEstado,double vdPorcentajeAvance,int viIDUsuarioCreacion,Date vdFechaCreacion,int viIDUsuarioModificacion,Date vdFechaModificacion){
		if (vdPorcentajeAvance<0 || vdPorcentajeAvance > 100){
			System.out.println("Debe grabar un porcentaje mayor o igual a cero.  Debe de grabar un porcentaje menor o igual a cien");
			System.out.println("Sprint No Editado");}
		else
		 	if (vdFechaInicio.compareTo(vdFechaFin)>0){
				System.out.println("Debe grabar Fecha Inicio menor o igual a Fecha Final");	}
		 	else
		 		if (faBuscarPkPos(viIDSprint) != -1) {
		 			clsSprint oSprint_orig;
					oSprint_orig = faBuscarPk(viIDSprint); 
					clsSprint oUsuario_edit = new clsSprint(oSprint_orig.get_iIDSprint(),vsDescripcion,vdFechaInicio,vdFechaFin,viDuracionDias,vsEstado,vdPorcentajeAvance,oSprint_orig.get_iIDUsuarioCreacion(),oSprint_orig.get_dFechaCreacion(),viIDUsuarioModificacion,vdFechaModificacion);
					sprints.set(faBuscarPkPos(viIDSprint),oUsuario_edit);
					System.out.println("Usuario Editado");}
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
