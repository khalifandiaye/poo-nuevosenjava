package pksource;

import java.util.ArrayList;

public class clsUsuarioMant {

	public ArrayList<clsUsuario> usuarios;
	
	public clsUsuarioMant(){
		usuarios = new ArrayList<clsUsuario>();
	}
	
	public void pAgregar(int viIDUsuario, String vsCorreo, String vsApellidoPaterno, String vsApellidoMaterno, String vsNombres, int viRol, String vdFechaCreacion, String vdFechaModificacion, int viIDUsuarioCreacion, int viIDUsuarioModificacion){
		if (faBuscar(vsCorreo) == null){		
			clsUsuario nuevoUsuario = new clsUsuario(viIDUsuario, vsCorreo, vsApellidoPaterno, vsApellidoMaterno, vsNombres, viRol, vdFechaCreacion, vdFechaModificacion, viIDUsuarioCreacion, viIDUsuarioModificacion);
			usuarios.add(nuevoUsuario);
			System.out.println("Usuario Agregado");
		}		
		else
			System.out.println("Usuario No Agregado");
	}
	
	public void pEliminar(int viIDUsuario){
		if (faBuscarPkPos(viIDUsuario) != -1) {
			usuarios.remove(faBuscarPkPos(viIDUsuario));
			System.out.println("Usuario Borrado");
		}
		else
			System.out.println("Usuario No Borrado");		
	}
	
	public void pEditar(int viIDUsuario, String vsCorreo, String vsApellidoPaterno, String vsApellidoMaterno, String vsNombres, int viRol, String vdFechaModificacion, int viIDUsuarioModificacion){
		if (faBuscarPkPos(viIDUsuario) != -1) {
			clsUsuario oUsuario_orig;
			oUsuario_orig = faBuscarPk(viIDUsuario); 
			clsUsuario oUsuario_edit = new clsUsuario(oUsuario_orig.get_iIDUsuario(),vsCorreo,vsApellidoPaterno,vsApellidoMaterno,vsNombres,viRol,oUsuario_orig.get_dFechaCreacion(),vdFechaModificacion,oUsuario_orig.get_iIDUsuarioCreacion(),viIDUsuarioModificacion);
			usuarios.set(faBuscarPkPos(viIDUsuario),oUsuario_edit);
			System.out.println("Usuario Editado");
		}
		else
			System.out.println("Proyecto No Editado");		
	}

	public clsUsuario faBuscar(String vsCorreo){
		for( clsUsuario oUsuario  : usuarios)
            if (oUsuario.get_sCorreo() == vsCorreo)
                return oUsuario;
        return null;
	}
	
	public clsUsuario faBuscarPk(int viIDUsuario){
		for( clsUsuario oUsuario  : usuarios)
            if (oUsuario.get_iIDUsuario() == viIDUsuario)
                return oUsuario;
        return null;
	}

	public int faBuscarPkPos(int viIDUsuario){
		int i = -1;
		for (clsUsuario oUsuario  : usuarios)
		{
        	i ++;
            if (oUsuario.get_iIDUsuario() == viIDUsuario)
                return i;
		}
        return i;
	}

}
