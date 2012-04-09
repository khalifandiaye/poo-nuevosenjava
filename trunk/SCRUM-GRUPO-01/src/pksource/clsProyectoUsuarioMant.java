package pksource;

import java.util.ArrayList;

public class clsProyectoUsuarioMant {

	public ArrayList<clsProyectoUsuario> proyectousuarios;
	
	public clsProyectoUsuarioMant(){
		proyectousuarios = new ArrayList<clsProyectoUsuario>();
	}
	
	public void pAgregar(int viIDProyecto, int viIDUsuario, String vdFechaCreacion, String vdFechaModificacion, int viIDUsuarioCreacion, int viIDUsuarioMoficacion){
		if (faBuscarPk(viIDProyecto,viIDUsuario) == null){		
			clsProyectoUsuario nuevoProyectoUsuario = new clsProyectoUsuario(viIDProyecto,viIDUsuario,vdFechaCreacion,vdFechaModificacion,viIDUsuarioCreacion,viIDUsuarioMoficacion);
			proyectousuarios.add(nuevoProyectoUsuario);
			System.out.println("Usuario Agregado al Proyecto");
		}		
		else
			System.out.println("Usuario No Agregado al Proyecto");
	}
	
	public void pEliminar(int viIDProyecto,int viIDUsuario){
		if (faBuscarPkPos(viIDProyecto,viIDUsuario) != -1) {
			proyectousuarios.remove(faBuscarPkPos(viIDProyecto,viIDUsuario));
			System.out.println("Usuario Quitado del Proyecto");
		}
		else
			System.out.println("Usuario No Quitado del Proyecto");		
	}
	
	
	public clsProyectoUsuario faBuscarPk(int viIDProyecto,int viIDUsuario){
		for( clsProyectoUsuario proyectousuario  : proyectousuarios)
            if (proyectousuario.get_iIDProyecto() == viIDProyecto && proyectousuario.get_iIDUsuario() == viIDUsuario)
                return proyectousuario;
        return null;
	}

	public int faBuscarPkPos(int viIDProyecto, int viIDUsuario){
		int i = -1;
		for (clsProyectoUsuario proyectousuario  : proyectousuarios)
		{
        	i ++;
            if (proyectousuario.get_iIDProyecto() == viIDProyecto && proyectousuario.get_iIDUsuario() == viIDUsuario)
                return i;
		}
        return i;
	}

}
