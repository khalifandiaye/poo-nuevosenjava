package pksource;

import java.util.ArrayList;

public class clsProyectoMant {

	public ArrayList<clsProyecto> proyectos;
	
	public clsProyectoMant(){
		proyectos = new ArrayList<clsProyecto>();
	}
	
	public void pListaProyectos (){
		String sFormato;
        sFormato = "|%1$-4s|%2$-50s|%3$-30s|%4$-12s|%5$-10s|%6$-12s|%7$-10s|\n";
    	System.out.println("\n[PROYECTOS]");
    	System.out.println("========================================================================================================================================");
        System.out.format(sFormato,"ID","Descripcion","Cliente","F.Crea","U.Crea","F.Modif","U.Modif");
    	System.out.println("========================================================================================================================================");
    	for( clsProyecto oProyecto  : proyectos)
        System.out.format(sFormato,oProyecto.get_iIDProyecto(),oProyecto.get_sDescripcion(),oProyecto.get_sCliente(),oProyecto.get_dFechaCreacion(),oProyecto.get_iIDUsuarioCreacion(),oProyecto.get_dFechaModificacion(),oProyecto.get_iIDUsuarioModificacion());    			
    	System.out.println("========================================================================================================================================");		
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
	
	public void pEditar(int viIDProyecto, String vsDescripcion, String vsCliente, String vdFechaModificacion, int viIDUsuarioMoficacion){
		if (faBuscarPkPos(viIDProyecto) != -1) {
			clsProyecto oProyecto_orig;
			oProyecto_orig = faBuscarPk(viIDProyecto); 
			clsProyecto proyecto = new clsProyecto(oProyecto_orig.get_iIDProyecto(),vsDescripcion,vsCliente,oProyecto_orig.get_dFechaCreacion(),vdFechaModificacion,oProyecto_orig.get_iIDUsuarioCreacion(),viIDUsuarioMoficacion);
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
        	i ++;
            if (proyecto.get_iIDProyecto() == viIDProyecto)
                return i;
		}
        return i;
	}

}
