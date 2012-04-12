package pksource;

import java.util.Date;
import java.util.ArrayList;

public class clsHistoriaMant {

	private ArrayList<clsHistoria> historias;

	public clsHistoriaMant() {
		// Creando la coleccion de historias
		historias = new ArrayList<clsHistoria>();
	}

	public boolean pRegistrarHistoria(int viIDhistoria, int viIDProducto,
			String vvDescripcion, int viOrdenPrioridadEstimada,
			int viOrdenPrioridadReal, String vcEstado, int viDuracionDias,
			float vfCosto, Date fecha, int viIDUsuarioCreacion,
			Date fecha2, int viIDUsuarioModificacion) {
		// Crear la nueva historia

		if (buscarHistoria(viIDhistoria) == null) {
			if (viIDhistoria != 0 && viIDProducto != 0
					&& viOrdenPrioridadEstimada != 0 && vcEstado != ""
					&& viDuracionDias != 0) {
				clsHistoria historia = new clsHistoria(viIDhistoria,
						viIDProducto, vvDescripcion, viOrdenPrioridadEstimada,
						viOrdenPrioridadReal, vcEstado, viDuracionDias,
						vfCosto, fecha, viIDUsuarioCreacion,
						fecha2, viIDUsuarioModificacion);
				// Insertarlo en la colección
				historias.add(historia);
				System.out.println("Historia Registrada");
				return true;
			} else {
				System.out.println("Ingrese los Datos necesarios");
				return false;
			}
		} else {
			System.out.println("La historia ya existe!!!");
			return false;
		}
	}

	public clsHistoria buscarHistoria(int viIDhistoria) {
		// Busqueda secuencial
		for (clsHistoria historia : historias) {
			if (historia.getiIDhistoria() == viIDhistoria) {
				return historia;
			}
		}
		return null;
	}

	public clsHistoria buscarHistoriaxIDProducto(int viIDProducto) {
		// Busqueda secuencial
		for (clsHistoria historia : historias) {
			if (historia.getiIDProducto() == viIDProducto) {
				return historia;
			}
		}
		return null;
	}

	public boolean eliminarHistoriaUsuario(int viIDhistoria) {
		int i;

		for (i = 0; i < historias.size(); i++) {
			if (historias.get(i).getiIDhistoria() == viIDhistoria) {
				if (!historias.get(i).getcEstado().equals("A")) {
					historias.remove(i);
					return true;
				} else {
					System.out
							.println("Historia ya ha sido aprobada no se puede eliminar");
					return false;
				}
			}
		}
		return false;
	}

	public void printHistoriaUsuario() {
		int i;

		for (i = 0; i < historias.size(); i++) {
			System.out.println("Codigo: " + historias.get(i).getiIDhistoria());
			System.out.println("Codigo Proyecto :"
					+ historias.get(i).getiIDProducto());
			System.out.println("IDOrdenProridadEstimada :"
					+ historias.get(i).getiOrdenPrioridadEstimada());
			System.out.println("IDOrdenPrioridadReal"
					+ historias.get(i).getiOrdenPrioridadReal());
			System.out.println("Estado: " + historias.get(i).getcEstado());
			System.out.println("DuraciónDias :"
					+ historias.get(i).getiDuracionDias());
			System.out.println("Costo :" + historias.get(i).getfCosto());
			System.out
					.println("-----------------------------------------------------------------------------");
		}
	}

	public boolean actualizarHistoriaUsuario(int viIDhistoria,
			int viIdProducto,String vDescripcion, int viOrdenPrioridadEstimada,
			int viOrdenPrioridadReal, String vcEstado, int viDuracionDias,
			float vfCosto, Date vdFechaCreacion, int viIDUsuarioCreacion,
			Date vdFechaModificacion, int viIDUsuarioModificacion) {
		int i;

		for (i = 0; i < historias.size(); i++) {
			if (historias.get(i).getiIDhistoria() == viIDhistoria) {
				historias.get(i).setiIdProducto(viIdProducto);
				historias.get(i).setvDescripcion(vDescripcion);
				historias.get(i).setiOrdenPrioridadEstimada(
						viOrdenPrioridadEstimada);
				historias.get(i).setiOrdenPrioridadReal(viOrdenPrioridadReal);
				historias.get(i).setcEstado(vcEstado);
				historias.get(i).setiDuracionDias(viDuracionDias);
				historias.get(i).setfCosto(vfCosto);
				historias.get(i).setdFechaCreacion(vdFechaCreacion);
				historias.get(i).setiIDUsuarioCreacion(viIDUsuarioCreacion);
				historias.get(i).setdFechaModificacion(vdFechaModificacion);
				historias.get(i).setiIDUsuarioModificacion(viIDUsuarioModificacion);
				return true;
			}
		}
		return false;
	}
}
