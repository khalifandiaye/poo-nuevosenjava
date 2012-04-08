package pksource;
import java.util.Date;

public class clsTarea {
	private int iIDTarea;
	private int iIDHistoria;
	private String sDescripcion;
	private Date dFechaInicio;
	private Date dFechaFin;
	private int iDuracionHoras;
	private String sEstado;
	private String sTipo;
	private int iIDTareaPadre;
	private float fPorcentajeAvance;
	
	private Date dFechaCreacion;
	private Date dFechaModificacion;
	private int iIDUsuarioCreacion;
	private int iIDUsuarioModificacion;

	
	public clsTarea(int viIDTarea, int viIDHistoria, 
			String vsDescripcion, Date vdFechaInicio, Date vdFechaFin, 
			int viDuracionHoras, String vsEstado, String vsTipo,
			int viIDTareaPadre, float vfPorcentajeAvance,
			Date vdFechaCreacion, 
			Date vdFechaModificacion, int viIDUsuarioCreacion, int viIDUsuarioModificacion){
		
		this.iIDTarea=viIDTarea;
		this.iIDHistoria=viIDHistoria;
		this.sDescripcion=vsDescripcion;
		this.dFechaInicio=vdFechaInicio;
		this.dFechaFin=vdFechaFin;
		this.iDuracionHoras=viDuracionHoras;
		this.sEstado=vsEstado;
		this.sTipo=vsTipo;
		this.iIDTareaPadre=viIDTareaPadre;
		this.fPorcentajeAvance=vfPorcentajeAvance;
		
		this.dFechaCreacion=vdFechaCreacion;
		this.dFechaModificacion =vdFechaModificacion;
		this.iIDUsuarioCreacion=viIDUsuarioCreacion;
		this.iIDUsuarioModificacion=viIDUsuarioModificacion;
		
		
	}
	
	public int get_iIDTarea(){
		return iIDTarea;
	}
	public int get_iIDHistoria(){
		return iIDHistoria;
	}
	public String get_sDescripcion(){
		return sDescripcion;
	}
	public Date get_dFechaInicio(){
		return dFechaInicio;
	}
	public Date get_dFechaFin(){
		return dFechaFin;
	}
	public int get_iDuracionHoras(){
		return iDuracionHoras;
	}
	public String get_sEstado(){
		return sEstado;
	}
	public String get_sTipo(){
		return sTipo;
	}
	
	public int get_iIDTareaPadre(){
		return iIDTareaPadre;
	}
	public float get_fPorcentajeAvance(){
		return fPorcentajeAvance;
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

