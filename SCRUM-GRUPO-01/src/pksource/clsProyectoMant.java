package pksource;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

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

	public boolean pAgregar(int viIDProyecto, String vsDescripcion, String vsCliente, String vdFechaCreacion, String vdFechaModificacion, int viIDUsuarioCreacion, int viIDUsuarioModificacion){
		if (fbValidaciones(viIDProyecto, vsDescripcion, vsCliente, vdFechaCreacion, vdFechaModificacion, viIDUsuarioCreacion, viIDUsuarioModificacion,"C" )){		
			clsProyecto nuevoProyecto = new clsProyecto(viIDProyecto,vsDescripcion,vsCliente,vdFechaCreacion,vdFechaModificacion,viIDUsuarioCreacion,viIDUsuarioModificacion);
			proyectos.add(nuevoProyecto);
			System.out.println("Proyecto Agregado");
			return true;
		}		
		System.out.println("Proyecto No Agregado");
		return false;
	}
	
	public boolean pEliminar(int viIDProyecto){
		if (faBuscarPkPos(viIDProyecto) != -1) {
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

		
		
		
		
		
		
		if (faBuscarPkPos(viIDProyecto) != -1) {
			proyectos.remove(faBuscarPkPos(viIDProyecto));
			System.out.println("Proyecto Borrado");
			return true;
		}
		System.out.println("Proyecto No Borrado");
		return false;
	}
	

	
	
	
	
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

	
	
	
	
	
	
	
	
	public boolean pEditar(int viIDProyecto, String vsDescripcion, String vsCliente, String vdFechaModificacion, int viIDUsuarioModificacion){
		if (faBuscarPkPos(viIDProyecto) != -1) {
			clsProyecto oProyecto_orig;
			oProyecto_orig = faBuscarPk(viIDProyecto);
			if (fbValidaciones(viIDProyecto, vsDescripcion, vsCliente, oProyecto_orig.get_dFechaCreacion(), vdFechaModificacion, oProyecto_orig.get_iIDUsuarioCreacion() ,viIDUsuarioModificacion,"E" )){		
				oProyecto_orig = faBuscarPk(viIDProyecto); 
				clsProyecto proyecto = new clsProyecto(oProyecto_orig.get_iIDProyecto(),vsDescripcion,vsCliente,oProyecto_orig.get_dFechaCreacion(),vdFechaModificacion,oProyecto_orig.get_iIDUsuarioCreacion(),viIDUsuarioModificacion);
				proyectos.set(faBuscarPkPos(viIDProyecto),proyecto);
				System.out.println("Proyecto Editado");
				return true;
				}
		
		}
		else
			System.out.println("Error: Proyecto no existe");
	System.out.println("Proyecto No Editado");		
	return false;
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
        return -1;
	}

	public boolean fbValidaciones(int viIDProyecto, String vsDescripcion, String vsCliente, String vdFechaCreacion, String vdFechaModificacion, int viIDUsuarioCreacion, int viIDUsuarioModificacion, String vsFlag ){
		boolean err = false;
		//Valida duplicidad
		clsProyecto oProyecto = faBuscarPk(viIDProyecto);
		if (oProyecto != null && vsFlag != "E"){
			System.out.println("Error: Proyecto duplicado");
			err = true;
		}
		//Valida exigencia de datos
		if (viIDProyecto<=0 || vsDescripcion == "" || vsCliente=="" || vdFechaCreacion=="" || vdFechaModificacion=="" || viIDUsuarioCreacion <= 0 || viIDUsuarioModificacion<=0)
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

