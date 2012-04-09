package pksource;

public class clsHistoria {

	private int iIDhistoria;
    private int iIDProducto;
    private int iOrdenPrioridadEstimada;
    private int iOrdenPrioridadReal;
    private String cEstado;
    private int iDuracionDias;
    private float fCosto;
    
    public clsHistoria(int viIDhistoria, int viIDProducto, int viOrdenPrioridadEstimada,int viOrdenPrioridadReal, String vcEstado, int viDuracionDias, float vfCosto) {
        this.iIDhistoria = viIDhistoria;
        this.iIDProducto = viIDProducto;
        this.iOrdenPrioridadEstimada = viOrdenPrioridadEstimada;
        this.iOrdenPrioridadReal= viOrdenPrioridadReal;
        this.cEstado = vcEstado;
        this.iDuracionDias=viDuracionDias;
        this.fCosto=vfCosto;
    }

    /**
     * @return the iIDhistoria
     */
    public int getiIDhistoria() {
        return iIDhistoria;
    }

    /**
     * @param iIDhistoria the iIDhistoria to set
     */
    public void setiIDhistoria(int viIDhistoria) {
        this.iIDhistoria = viIDhistoria;
    }

    /**
     * @return the iIdProducto
     */
    public int getiIDProducto() {
        return iIDProducto;
    }

    /**
     * @param iIdProducto the iIdProducto to set
     */
    public void setiIdProducto(int viIDProducto) {
        this.iIDProducto = viIDProducto;
    }

    /**
     * @return the iOrdenPrioridadEstimada
     */
    public int getiOrdenPrioridadEstimada() {
        return iOrdenPrioridadEstimada;
    }

    /**
     * @param iOrdenPrioridadEstimada the iOrdenPrioridadEstimada to set
     */
    public void setiOrdenPrioridadEstimada(int viOrdenPrioridadEstimada) {
        this.iOrdenPrioridadEstimada = viOrdenPrioridadEstimada;
    }
    
    /**
     * @return the iOrdenPrioridadReal
     */
    public int getiOrdenPrioridadReal() {
        return iOrdenPrioridadReal;
    }

    /**
     * @param iOrdenPrioridadReal the iOrdenPrioridadReal to set
     */
    public void setiOrdenPrioridadReal(int viOrdenPrioridadReal) {
        this.iOrdenPrioridadReal = viOrdenPrioridadReal;
    }
    
    /**
     * @return the cEstado
     */
    public String getcEstado() {
        return cEstado;
    }

    /**
     * @param cEstado the cEstado to set
     */
    public void setcEstado(String vcEstado) {
        this.cEstado = vcEstado;
    }

    /**
     * @return the cEstado
     */
    public int getiDuracionDias() {
        return iDuracionDias;
    }

    /**
     * @param cEstado the cEstado to set
     */
    public void setiDuracionDias(int viDuracionDias) {
        this.iDuracionDias = viDuracionDias;
    }

    /**
     * @return the cEstado
     */
    public float getfCosto() {
        return fCosto;
    }

    /**
     * @param cEstado the cEstado to set
     */
    public void setfCosto(float vfCosto) {
        this.fCosto = vfCosto;
    }

	} 
	

