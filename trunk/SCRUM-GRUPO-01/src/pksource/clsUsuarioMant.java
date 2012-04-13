package pksource;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class clsUsuarioMant {

	public ArrayList<clsUsuario> usuarios;
	
	public clsUsuarioMant(){
		usuarios = new ArrayList<clsUsuario>();
	}
	
	public void pListaUsuarios (){
		String sFormato;
        sFormato = "|%1$-4s|%2$-30s|%3$-20s|%4$-20s|%5$-20s|%6$-5s|%7$-12s|%8$-10s|%9$-12s|%10$-10s|\n";
    	System.out.println("\n[USUARIOS]");
    	System.out.println("==========================================================================================================================================================");
        System.out.format(sFormato,"ID","Correo","ApellidoPaterno","ApellidoMaterno","Nombres","Rol","F.Crea","U.Crea","F.Modif","U.Modif");
    	System.out.println("==========================================================================================================================================================");
    	for(clsUsuario oUsuario : usuarios)
        System.out.format(sFormato,oUsuario.get_iIDUsuario(),oUsuario.get_sCorreo(),oUsuario.get_sApellidoPaterno(),oUsuario.get_sApellidoMaterno(),oUsuario.get_sNombres(),oUsuario.get_iRol(),oUsuario.get_dFechaCreacion(),oUsuario.get_iIDUsuarioCreacion(),oUsuario.get_dFechaModificacion(),oUsuario.get_iIDUsuarioModificacion());    		
    	System.out.println("==========================================================================================================================================================");    
	}
	
	public boolean pAgregar(int viIDUsuario, String vsCorreo, String vsApellidoPaterno, String vsApellidoMaterno, String vsNombres, int viRol, String vdFechaCreacion, String vdFechaModificacion, int viIDUsuarioCreacion, int viIDUsuarioModificacion){
		if (fbValidaciones(viIDUsuario, vsCorreo, vsApellidoPaterno, vsApellidoMaterno, vsNombres, viRol,vdFechaCreacion, vdFechaModificacion, viIDUsuarioCreacion, viIDUsuarioModificacion,"C")){		
			clsUsuario nuevoUsuario = new clsUsuario(viIDUsuario, vsCorreo, vsApellidoPaterno, vsApellidoMaterno, vsNombres, viRol, vdFechaCreacion, vdFechaModificacion, viIDUsuarioCreacion, viIDUsuarioModificacion);
			usuarios.add(nuevoUsuario);
			System.out.println("Usuario Agregado");
			return true;
		}		
		else
			System.out.println("Usuario No Agregado");
			return false;
	}
	
	public boolean pEliminar(int viIDUsuario, ClsUsuariosTareaMant oUsuariosTareaMant){
		if (faBuscarPkPos(viIDUsuario) != -1) {
			if (oUsuariosTareaMant.faBuscarFkPos(viIDUsuario) == -1)
			{
				usuarios.remove(faBuscarPkPos(viIDUsuario));
				System.out.println("Usuario Borrado");
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
	
	public boolean pEditar(int viIDUsuario, String vsCorreo, String vsApellidoPaterno, String vsApellidoMaterno, String vsNombres, int viRol, String vdFechaModificacion, int viIDUsuarioModificacion){
		if (faBuscarPkPos(viIDUsuario) != -1) {
			clsUsuario oUsuario_orig;
			oUsuario_orig = faBuscarPk(viIDUsuario);
			if (fbValidaciones(oUsuario_orig.get_iIDUsuario(), vsCorreo, vsApellidoPaterno, vsApellidoMaterno, vsNombres, viRol,oUsuario_orig.get_dFechaCreacion(), vdFechaModificacion, oUsuario_orig.get_iIDUsuarioCreacion(), viIDUsuarioModificacion,"E")){		
				clsUsuario oUsuario_edit = new clsUsuario(oUsuario_orig.get_iIDUsuario(),vsCorreo,vsApellidoPaterno,vsApellidoMaterno,vsNombres,viRol,oUsuario_orig.get_dFechaCreacion(),vdFechaModificacion,oUsuario_orig.get_iIDUsuarioCreacion(),viIDUsuarioModificacion);
				usuarios.set(faBuscarPkPos(viIDUsuario),oUsuario_edit);
				System.out.println("Usuario Editado");
				return true;
			}			
		}
		System.out.println("Usuario No Editado");
		return false;
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
        return -1;
	}

	public boolean isDate(String fechax) {
	        try {
	            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd-mm-yyyy");
	            Date fecha = formatoFecha.parse(fechax);
	        } catch (Exception e) {
	            return false;
	        }
	        return true;
	    }
	public boolean fbValidaciones(int viIDUsuario, String vsCorreo, String vsApellidoPaterno, String vsApellidoMaterno, String vsNombres, int viRol,String vdFechaCreacion, String vdFechaModificacion, int viIDUsuarioCreacion, int viIDUsuarioModificacion, String vsFlag ){
		boolean err = false;
		//Valida duplicidad
		clsUsuario oUsuario = faBuscarPk(viIDUsuario);
		if (oUsuario != null && vsFlag != "E"){
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
		if (!isDate(vdFechaCreacion)){
			System.out.println("Error: Fecha de creacion no valida");
			err = true;
		}
		if (!isDate(vdFechaModificacion)){
			System.out.println("Error: Fecha de modificacion no valida");
			err = true;
		}
		if (err == true){
			return false;
		}
		return true;
	}
}
