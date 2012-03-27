package gestionscrum.AltaTareas;

public class clsArrTarea {
	private String IDTarea;
	private String IDHisUsu;
	private String descripcion;
	private String fecha;
	private double PorcentajeAvance;

    public clsArrTarea(String IDTarea,String IDHisUsu, String descripcion, String fecha, Double PorcentajeAvance) {
        this.IDTarea = IDTarea;
        this.IDHisUsu = IDHisUsu;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.PorcentajeAvance = PorcentajeAvance;
    }

    /**
     * @return the codigo
     */
    public String getIDTarea() {
        return IDTarea;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setIDTarea(String IDTarea) {
        this.IDTarea = IDTarea;
    }

    
    public String getIDHisUsu() {
        return IDHisUsu;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setIDHisUsu(String IDHisUsu) {
        this.IDHisUsu = IDHisUsu;
    }

    
    
    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    
    public double getPorcentajeAvance() {
        return PorcentajeAvance;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setPorcentajeAvance(double PorcentajeAvance) {
        this.PorcentajeAvance = PorcentajeAvance;
    }

}
