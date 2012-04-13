package pksource;

import java.util.Date;

public class ClsSprintTareas {
	
	private int iIDSprintTareas;
	private int iIDSprint;
	private int iIDUsuarioCreacion;
	private Date dFechaCreacion;
	private int iIDUsuarioModificacion;
	private Date dFechaModificacion;
	
	public ClsSprintTareas(int viIDSprintTareas,int viIDSprint,int viIDUsuarioCreacion,Date vdFechaCreacion,int viIDUsuarioModificacion,Date vdFechaModificacion) {					
	
		this.iIDSprintTareas=viIDSprintTareas;
		this.iIDSprint=viIDSprint;
		this.iIDUsuarioCreacion=viIDUsuarioCreacion;
		this.dFechaCreacion=vdFechaCreacion;
		this.iIDUsuarioModificacion=viIDUsuarioModificacion;
		this.dFechaModificacion=vdFechaModificacion;
		
	}
	
	public int get_iIDSprintTareas(){
		return iIDSprintTareas;
	}
	
	public int get_iIDSprint(){
		return iIDSprint;
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
