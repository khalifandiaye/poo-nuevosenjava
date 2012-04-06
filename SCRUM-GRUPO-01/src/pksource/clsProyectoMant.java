package pksource;

import java.util.ArrayList;

public class clsProyectoMant {

	public ArrayList<clsProyecto> proyectos;
	
	public clsProyectoMant(){
		proyectos = new ArrayList<clsProyecto>();
	}
	
	public void pAgregar(int viIDProyecto, String vsDescripcion, String vsCliente, String vdFechaCreacion, String vdFechaModificacion, int viIDUsuarioCreacion, int viIDUsuarioMoficacion){
		if (faBuscar(vsDescripcion) == null){		
			clsProyecto nuevoProyecto = new clsProyecto(viIDProyecto,vsDescripcion,vsCliente,vdFechaCreacion,vdFechaModificacion,viIDUsuarioCreacion,viIDUsuarioMoficacion);
			proyectos.add(nuevoProyecto);
			System.out.println("Proyecto Agregado");
		}		
		else
			System.out.println("Proyecto No Agregado");
	}
	
	public void pEliminar(int viIDProyecto){
		if (faBuscarPkPos(viIDProyecto) != -1) {
			proyectos.remove(faBuscarPkPos(viIDProyecto));
			System.out.println("Proyecto Borrado");
		}
		else
			System.out.println("Proyecto No Borrado");		
	}
	
	public void pEditar(int viIDProyecto, String vsDescripcion, String vsCliente, String vdFechaCreacion, String vdFechaModificacion, int viIDUsuarioCreacion, int viIDUsuarioMoficacion){
		if (faBuscarPkPos(viIDProyecto) != -1) {
			clsProyecto proyecto = new clsProyecto(viIDProyecto,vsDescripcion,vsCliente,vdFechaCreacion,vdFechaModificacion,viIDUsuarioCreacion,viIDUsuarioMoficacion);
			proyectos.set(faBuscarPkPos(viIDProyecto),proyecto);
			System.out.println("Proyecto Editado");
		}
		else
			System.out.println("Proyecto No Editado");		
	}

	public clsProyecto faBuscar(String vsDescripcion){
		for( clsProyecto proyecto  : proyectos)
            if (proyecto.get_sDescripcion() == vsDescripcion)
                return proyecto;
        return null;
	}
	
	public clsProyecto faBuscarPk(int viIDProyecto){
		for( clsProyecto proyecto  : proyectos)
            if (proyecto.get_iIDProyecto() == viIDProyecto)
                return proyecto;
        return null;
	}

	public int faBuscarPkPos(int viIDProyecto){
		int i = -1;
		for (clsProyecto proyecto  : proyectos)
		{
        	i = i++;
            if (proyecto.get_iIDProyecto() == viIDProyecto)
                return i;
		}
        return i;
	}

}