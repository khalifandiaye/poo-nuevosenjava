package pksource;

import java.util.Date;

public class clsSprint {
	
	private int iIDSprint;
	private String sDescripcion;
	private Date dFechaInicio; 
	private Date dFechaFin; 
	private int iDuracionDias;
	private String sEstado;
	private double dPorcentajeAvance;
	private int iIDUsuarioCreacion;
	private Date dFechaCreacion;
	private int iIDUsuarioModificacion;
	private Date dFechaModificacion;
	
	public clsSprint(int viIDSprint,String vsDescripcion,Date vdFechaInicio,Date vdFechaFin,int viDuracionDias,String vsEstado,double vdPorcentajeAvance,int viIDUsuarioCreacion,Date vdFechaCreacion,int viIDUsuarioModificacion,Date vdFechaModificacion) {					
	
		this.iIDSprint=viIDSprint;
		this.sDescripcion=vsDescripcion;
		this.dFechaInicio=vdFechaInicio; 
		this.dFechaFin=vdFechaFin; 
		this.iDuracionDias=viDuracionDias;
		this.sEstado=vsEstado;
		this.dPorcentajeAvance=vdPorcentajeAvance;
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

	public Date get_dFechaInicio(){
		return dFechaInicio;
	}
	
	public Date get_dFechaFin(){
			return dFechaFin;
	}

	public int get_iDuracionDias(){
		return iDuracionDias;
	}
	
	public String get_sEstado(){
		return sEstado;
	}

	public double get_dPorcentajeAvance(){
		return dPorcentajeAvance;
	}
	
	public Date get_dFechaCreacion(){
		return dFechaCreacion;
	}

	public Date get_sFechaModificacion(){
		return dFechaModificacion;
	}

	public int get_iIDUsuarioCreacion(){
		return iIDUsuarioCreacion;
	}
	
	public int get_iIDUsuarioModificacion(){
		return iIDUsuarioModificacion;
	}
	
	
}
