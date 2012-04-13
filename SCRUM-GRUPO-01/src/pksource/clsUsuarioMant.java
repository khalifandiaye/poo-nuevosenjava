package pksource;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class clsUsuarioMant {

	public ArrayList<clsUsuario> usuarios;
	
	public clsUsuarioMant(){
		usuarios = new ArrayList<clsUsuario>();
	}
	
	public void pAgregar(int viIDUsuario, String vsCorreo, String vsApellidoPaterno, String vsApellidoMaterno, String vsNombres, int viRol, String vdFechaCreacion, String vdFechaModificacion, int viIDUsuarioCreacion, int viIDUsuarioModificacion){
		if (fbValidaciones(viIDUsuario, vsCorreo, vsApellidoPaterno, vsApellidoMaterno, vsNombres, viRol,vdFechaCreacion, vdFechaModificacion, viIDUsuarioCreacion, viIDUsuarioModificacion)){		
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

	public String fsNombreUsuario(int viIDUsuario){
		
		clsUsuario oBuscarUsuario = faBuscarPk(viIDUsuario);
		if (oBuscarUsuario!=null)
			return oBuscarUsuario.get_sNombres()+" "+oBuscarUsuario.get_sApellidoPaterno();
		
		return "";
		
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

	public boolean isDate(String fechax) {
	        try {
	            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
	            Date fecha = formatoFecha.parse(fechax);
	        } catch (Exception e) {
	            return false;
	        }
	        return true;
	    }
	public boolean fbValidaciones(int viIDUsuario, String vsCorreo, String vsApellidoPaterno, String vsApellidoMaterno, String vsNombres, int viRol,String vdFechaCreacion, String vdFechaModificacion, int viIDUsuarioCreacion, int viIDUsuarioModificacion){
		boolean err = false;
		//Valida duplicidad
		clsUsuario oUsuario = faBuscarPk(viIDUsuario);
		if (oUsuario != null){
			System.out.println("Error: Usuario duplicado");
			err = true;
		}
		//Valida exigencia de datos
		if (viIDUsuario<=0 || vsCorreo == "" || vsApellidoPaterno=="" || vsApellidoMaterno=="" || vsNombres=="" || viRol==0 || vdFechaCreacion=="" || vdFechaModificacion=="" || viIDUsuarioCreacion <= 0 || viIDUsuarioModificacion<=0)
		{
			System.out.println("Error: Datos incompletos");
			err = true;
		}
		//Valida usuariocreacion
		oUsuario = faBuscarPk(viIDUsuarioCreacion);
		if (oUsuario == null && viIDUsuarioCreacion != 1){
			System.out.println("Error: UsuarioCreacion no existe");
			err = true;
		}
		//Valida usuariomodificacion
		oUsuario = faBuscarPk(viIDUsuarioModificacion);
		if (oUsuario == null && viIDUsuarioModificacion != 1){
			System.out.println("Error: UsuarioModificacion no existe");
			err = true;
		}
		//Valida correo
		if (vsCorreo.indexOf('@')==-1 || vsCorreo.indexOf('.')==-1){
			System.out.println("Error: Correo no valido");
			err = true;
		}
		//Valida rol 1:PO, 2:SM, 3:TEAM, 4:QA
		if (viRol<1 || viRol>4){
			System.out.println("Error: Rol no valido");
			err = true;
		}
		//Valida fechas
		if (!isDate(vdFechaCreacion) || !isDate(vdFechaModificacion)){
			System.out.println("Error: Fecha no valida");
			err = true;
		}
		if (err == true){
			return false;
		}
		return true;
	}
}
