package pksource;
import java.util.Date;

public class ClsUsuariosTarea {
	private int iIDTarea;
	private int iIDUsuario;

	private Date dFechaCreacion;
	private Date dFechaModificacion;
	private int iIDUsuarioCreacion;
	private int iIDUsuarioModificacion;
	
	
	public ClsUsuariosTarea(int viIDTarea,int viIDUsuario,
			Date vdFechaCreacion, 
			Date vdFechaModificacion, int viIDUsuarioCreacion, int viIDUsuarioModificacion){
		
		this.iIDTarea=viIDTarea;
		this.iIDUsuario=viIDUsuario;
		
		this.dFechaCreacion=vdFechaCreacion;
		this.dFechaModificacion =vdFechaModificacion;
		this.iIDUsuarioCreacion=viIDUsuarioCreacion;
		this.iIDUsuarioModificacion=viIDUsuarioModificacion;
		
	}
	
	public int get_iIDTarea(){
		return iIDTarea;
	}
	public int get_iIDUsuario(){
		return iIDUsuario;
	}
	
	public Date get_dFechaCreacion(){
		return dFechaCreacion;
	}

	public Date get_dFechaModificacion(){
		return dFechaModificacion;
	}

	public int get_iIDUsuarioCreacion(){
		return iIDUsuarioCreacion;
	}
	
	public int get_iIDUsuarioModificacion(){
		return iIDUsuarioModificacion;
	}
}
