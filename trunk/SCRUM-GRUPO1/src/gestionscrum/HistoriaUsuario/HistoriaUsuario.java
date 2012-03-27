package gestionscrum.HistoriaUsuario;
/**
 *
 * @author pcsiecon
 */
public class HistoriaUsuario {
    private String codigo;
    private String descripcion;
    private String fecha;


    public HistoriaUsuario(String codigo, String descripcion, String fecha) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.fecha = fecha;
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

}
