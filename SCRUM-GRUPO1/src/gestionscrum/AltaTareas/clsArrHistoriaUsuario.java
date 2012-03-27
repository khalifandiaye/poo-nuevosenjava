package gestionscrum.AltaTareas;

public class clsArrHistoriaUsuario {
	private String IDHisUsu;
	private String Descripcion;
	private String Fecha;

	public clsArrHistoriaUsuario(String IDHisUsu, String Descripcion, String Fecha){
		this.IDHisUsu=IDHisUsu;
		this.Descripcion=Descripcion;
		this.Fecha=Fecha;
		
	}
    public String getIDHisUsu() {
        return IDHisUsu;
    }

    public void setIDHisUsu(String IDHisUsu) {
        this.IDHisUsu = IDHisUsu;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.Descripcion = descripcion;
    }
    
    public String getFecha() {
        return Fecha;
    }

    
    public void setFecha(String fecha) {
        this.Fecha = fecha;
    }

}
