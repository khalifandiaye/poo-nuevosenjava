package pksource;

public class clsProyectoUsuario {
	private int iIDProyecto;
	private int iIDUsuario;
	private String dFechaCreacion;
	private String dFechaModificacion;
	private int iIDUsuarioCreacion;
	private int iIDUsuarioModificacion;
	
	public clsProyectoUsuario(int viIDProyecto, int viIDUsuario, String vdFechaCreacion, String vdFechaModificacion, int viIDUsuarioCreacion, int viIDUsuarioModificacion) {
		this.iIDProyecto=viIDProyecto;
		this.iIDUsuario=viIDUsuario;
		this.dFechaCreacion=vdFechaCreacion;
		this.dFechaModificacion=vdFechaModificacion;
		this.iIDUsuarioCreacion=viIDUsuarioCreacion;
		this.iIDUsuarioModificacion=viIDUsuarioModificacion;
	}
	
	public int get_iIDProyecto(){
		return iIDProyecto;
	}

	public int get_iIDUsuario(){
		return iIDUsuario;
	}
	
	public String get_dFechaModificacion(){
		return dFechaModificacion;
	}

	public int get_iIDUsuarioCreacion(){
		return iIDUsuarioCreacion;
	}
	
	public String get_dFechaCreacion(){
		return dFechaCreacion;
	}

	public int get_iIDUsuarioModificacion(){
		return iIDUsuarioModificacion;
	}
	
	
}
