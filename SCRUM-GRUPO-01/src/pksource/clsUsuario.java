package pksource;

public class clsUsuario {
	private int iIDUsuario;
	private String sCorreo;
	private String sApellidoPaterno;
	private String sApellidoMaterno;
	private String sNombres;
	private int iRol;
	private String dFechaCreacion;
	private String dFechaModificacion;
	private int iIDUsuarioCreacion;
	private int iIDUsuarioModificacion;
	
	public clsUsuario(int viIDUsuario, String vsCorreo, String vsApellidoPaterno, String vsApellidoMaterno, String vsNombres, int viRol, String vdFechaCreacion, String vdFechaModificacion, int viIDUsuarioCreacion, int viIDUsuarioModificacion) {
		this.iIDUsuario=viIDUsuario;
		this.sCorreo=vsCorreo;
		this.sApellidoPaterno=vsApellidoPaterno;
		this.sApellidoMaterno=vsApellidoMaterno;
		this.sNombres=vsNombres;
		this.iRol=viRol;
		this.dFechaCreacion=vdFechaCreacion;
		this.dFechaModificacion=vdFechaModificacion;
		this.iIDUsuarioCreacion=viIDUsuarioCreacion;
		this.iIDUsuarioModificacion=viIDUsuarioModificacion;
	}
	
	public int get_iIDUsuario(){
		return iIDUsuario;
	}
	
	public String get_sCorreo(){
		return sCorreo;
	}

	public String get_sApellidoPaterno(){
		return sApellidoPaterno;
	}

	public String get_sApellidoMaterno(){
		return sApellidoMaterno;
	}

	public String get_sNombres(){
		return sNombres;
	}

	public int get_iRol(){
		return iRol;
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
