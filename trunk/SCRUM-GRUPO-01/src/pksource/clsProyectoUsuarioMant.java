package pksource;

import java.util.ArrayList;

public class clsProyectoUsuarioMant {

	public ArrayList<clsProyectoUsuario> proyectousuarios;
	
	public clsProyectoUsuarioMant(){
		proyectousuarios = new ArrayList<clsProyectoUsuario>();
	}
	
	public boolean pAgregar(int viIDProyecto, int viIDUsuario, String vdFechaCreacion, String vdFechaModificacion, int viIDUsuarioCreacion, int viIDUsuarioMoficacion){
		if (faBuscarPk(viIDProyecto,viIDUsuario) == null){		
			clsProyectoUsuario nuevoProyectoUsuario = new clsProyectoUsuario(viIDProyecto,viIDUsuario,vdFechaCreacion,vdFechaModificacion,viIDUsuarioCreacion,viIDUsuarioMoficacion);
			proyectousuarios.add(nuevoProyectoUsuario);
			System.out.println("Usuario Agregado al Proyecto");
			return true;
		}		
		else
			System.out.println("Usuario No Agregado al Proyecto");
			return false;
	}
	
	public boolean pEliminar(int viIDProyecto,int viIDUsuario, ClsUsuariosTareaMant oUsuariosTareaMant){
		if (faBuscarPkPos(viIDProyecto,viIDUsuario) != -1) {
			if (oUsuariosTareaMant.faBuscarFkPos(viIDUsuario) == -1)
			{
				proyectousuarios.remove(faBuscarPkPos(viIDProyecto,viIDUsuario));
				System.out.println("Usuario borrado del proyecto");
				return true;
				}
			else
			{
				System.out.println("Error : Usuario esta asignado a tareas");
				System.out.println("Usuario No Borrado");
				return false;
			}
		}
		else
			System.out.println("Usuario No Borrado");
			return false;
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
        return -1;
	}

	public boolean fbValidaciones(int viIDProyecto, int viIDUsuario, String vdFechaCreacion, String vdFechaModificacion, int viIDUsuarioCreacion, int viIDUsuarioModificacion){
		boolean err = false;
		//Valida duplicidad
		int pos = faBuscarPkPos(viIDProyecto,viIDUsuario);
		if (pos == -1 ){
			System.out.println("Error: Usuario ya agregado al proyecto");
			err = true;
		}
		//Valida exigencia de datos
		if (viIDProyecto<=0 || viIDUsuario<=0 || vdFechaCreacion=="" || vdFechaModificacion=="" || viIDUsuarioCreacion <= 0 || viIDUsuarioModificacion<=0)
		{
			System.out.println("Error: Datos incompletos");
			err = true;
		}
		//Valida usuariocreacion
		clsUsuarioMant oUsuarioMant ; 
		clsUsuario oUsuario;
		oUsuario = clsUsuarioMant.faBuscarPk(viIDUsuarioCreacion);
		if (oUsuario == null && viIDUsuarioCreacion != 1){
			System.out.println("Error: UsuarioCreacion no existe");
			err = true;
		}
		//Valida usuariomodificacion
		oUsuario = clsUsuarioMant.faBuscarPk(viIDUsuarioModificacion);
		if (oUsuario == null && viIDUsuarioModificacion != 1){
			System.out.println("Error: UsuarioModificacion no existe");
			err = true;
		}
		//Valida fechas
		if (!clsUsuarioMant.isDate(vdFechaCreacion)){
			System.out.println("Error: Fecha de creacion no valida");
			err = true;
		}
		if (!clsUsuarioMant.isDate(vdFechaModificacion)){
			System.out.println("Error: Fecha de modificacion no valida");
			err = true;
		}
		
		
		if (err == true){
			return false;
		}
		return true;
	}
}
