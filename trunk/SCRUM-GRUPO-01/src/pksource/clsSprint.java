package pksource;

public class clsSprint {
	
	private int iIDSprint;
	private String sDescripcion;
	private String dFechaInicio; 
	private String dFechaFin; 
	private int iDuracionDias;
	private int iIDUsuarioCreacion;
	private String dFechaCreacion;
	private int iIDUsuarioModificacion;
	private String dFechaModificacion;
	
	public clsSprint(int viIDSprint,String vsDescripcion,String vdFechaInicio,String vdFechaFin,int viDuracionDias,int viIDUsuarioCreacion,String vdFechaCreacion,int viIDUsuarioModificacion,String vdFechaModificacion) {					
	
		this.iIDSprint=viIDSprint;
		this.sDescripcion=vsDescripcion;
		this.dFechaInicio=vdFechaInicio; 
		this.dFechaFin=vdFechaFin; 
		this.iDuracionDias=viDuracionDias;
		this.iIDUsuarioCreacion=viIDUsuarioCreacion;
		this.dFechaCreacion=vdFechaCreacion;
		this.iIDUsuarioModificacion=viIDUsuarioModificacion;
		this.dFechaModificacion=vdFechaModificacion;
		
	}
	
	public String get_sDescripcion(){
		return sDescripcion;
	}
	
	public int get_iIDSprint(){
		return iIDSprint;
	}

	public String get_dFechaInicio(){
		return dFechaInicio;
	}
	
	public String get_dFechaFin(){
			return dFechaFin;
	}

	public int get_iDuracionDias(){
		return iDuracionDias;
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
