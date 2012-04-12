package pksource;

import java.util.Date;

public class clsHistoria {

	private int iIDhistoria;
	private int iIDProducto;
	private String vDescripcion;
	private int iOrdenPrioridadEstimada;
	private int iOrdenPrioridadReal;
	private String cEstado;
	private int iDuracionDias;
	private float fCosto;
	private Date dFechaCreacion;
	private int iIDUsuarioCreacion;
	private Date dFechaModificacion;
	private int iIDUsuarioModificacion;

	public clsHistoria(int viIDhistoria, int viIDProducto,
			String vvDescripcion, int viOrdenPrioridadEstimada,
			int viOrdenPrioridadReal, String vcEstado, int viDuracionDias,
			float vfCosto, Date vdFechaCreacion, int viIDUsuarioCreacion,
			Date vdFechaModificacion, int viIDUsuarioModificacion) {
		this.iIDhistoria = viIDhistoria;
		this.iIDProducto = viIDProducto;
		this.vDescripcion = vvDescripcion;
		this.iOrdenPrioridadEstimada = viOrdenPrioridadEstimada;
		this.iOrdenPrioridadReal = viOrdenPrioridadReal;
		this.cEstado = vcEstado;
		this.iDuracionDias = viDuracionDias;
		this.fCosto = vfCosto;
		this.dFechaCreacion = vdFechaCreacion;
		this.iIDUsuarioCreacion = viIDUsuarioCreacion;
		this.dFechaModificacion = vdFechaModificacion;
		this.iIDUsuarioModificacion = viIDUsuarioModificacion;
	}

	/**
	 * @return the iIDhistoria
	 */
	public int getiIDhistoria() {
		return iIDhistoria;
	}

	/**
	 * @param iIDhistoria
	 *            the iIDhistoria to set
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
	 * @param iIdProducto
	 *            the iIdProducto to set
	 */
	public void setiIdProducto(int viIDProducto) {
		this.iIDProducto = viIDProducto;
	}

	/**
	 * @return the vDescripcion
	 */
	public String getvDescripcion() {
		return vDescripcion;
	}

	/**
	 * @param vDescripcion
	 *            the vDescripcion to set
	 */

	public void setvDescripcion(String vDescripcion) {
		this.vDescripcion = vDescripcion;
	}

	/**
	 * @return the iOrdenPrioridadEstimada
	 */
	public int getiOrdenPrioridadEstimada() {
		return iOrdenPrioridadEstimada;
	}

	/**
	 * @param iOrdenPrioridadEstimada
	 *            the iOrdenPrioridadEstimada to set
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
	 * @param iOrdenPrioridadReal
	 *            the iOrdenPrioridadReal to set
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
	 * @param cEstado
	 *            the cEstado to set
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
	 * @param cEstado
	 *            the cEstado to set
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
	 * @param cEstado
	 *            the cEstado to set
	 */
	public void setfCosto(float vfCosto) {
		this.fCosto = vfCosto;
	}

	public Date getdFechaCreacion() {
		return dFechaCreacion;
	}

	public void setdFechaCreacion(Date vdFechaCreacion) {
		this.dFechaCreacion = vdFechaCreacion;
	}

	public int getiIDUsuarioCreacion() {
		return iIDUsuarioCreacion;
	}

	public void setiIDUsuarioCreacion(int viIDUsuarioCreacion) {
		this.iIDUsuarioCreacion = viIDUsuarioCreacion;
	}

	public Date getdFechaModificacion() {
		return dFechaModificacion;
	}

	public void setdFechaModificacion(Date vdFechaModificacion) {
		this.dFechaModificacion = vdFechaModificacion;
	}

	public int getiIDUsuarioModificacion() {
		return iIDUsuarioModificacion;
	}

	public void setiIDUsuarioModificacion(int viIDUsuarioModificacion) {
		this.iIDUsuarioModificacion = viIDUsuarioModificacion;
	}

}
