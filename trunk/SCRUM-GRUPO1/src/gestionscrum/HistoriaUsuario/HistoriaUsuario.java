package gestionscrum.HistoriaUsuario;
/**
 *
 * @author Evelyn Cordova
 */
public class HistoriaUsuario {
    private String codigo;
    private String descripcion;
    private String fecha;
    private String usuario;
    private String estado;


    public HistoriaUsuario(String codigo, String descripcion, String fecha,String usuario, String estado) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.usuario= usuario;
        this.estado = estado;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
    
    /**
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param fecha the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param fecha the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

}
