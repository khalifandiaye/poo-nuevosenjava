package pksource;

public class clsProyecto {
	private int iIDProyecto;
	private String sDescripcion;
	private String sCliente;
	private String dFechaCreacion;
	private String dFechaModificacion;
	private int iIDUsuarioCreacion;
	private int iIDUsuarioModificacion;
	
	public clsProyecto(int viIDProyecto, String vsDescripcion, String vsCliente, String vdFechaCreacion, String vdFechaModificacion, int viIDUsuarioCreacion, int viIDUsuarioModificacion) {
		this.iIDProyecto=viIDProyecto;
		this.sDescripcion=vsDescripcion;
		this.sCliente=vsCliente;
		this.dFechaCreacion=vdFechaCreacion;
		this.dFechaModificacion=vdFechaModificacion;
		this.iIDUsuarioCreacion=viIDUsuarioCreacion;
		this.iIDUsuarioModificacion=viIDUsuarioModificacion;
	}
	
	public String get_sDescripcion(){
		return sDescripcion;
	}
	
	public int get_iIDProyecto(){
		return iIDProyecto;
	}

	public String get_sCliente(){
		return sCliente;
	}

	public String get_dFechaCreacion(){
		return dFechaCreacion;
	}

	public String get_sFechaModificacion(){
		return dFechaModificacion;
	}

	public int get_iIDUsuarioCreacion(){
		return iIDUsuarioCreacion;
	}
	
	public int get_iIDUsuarioModificacion(){
		return iIDUsuarioModificacion;
	}
	
	
}
