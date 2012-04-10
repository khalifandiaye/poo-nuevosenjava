package pktest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import pksource.clsHistoria;
import pksource.clsHistoriaMant;

public class clsTestHistoriaMant {

	clsHistoriaMant adm = new clsHistoriaMant();
	int iIDhistoria;
	int iIdProducto;
	int iOrdenPrioridadEstimada;
	int iOrdenPrioridadReal;
	String cEstado;
	int iDuracionDias;
	float fCosto;

	@Before
	public void Carga() {
		// Registro 1
		adm.pRegistrarHistoria(1, 1, 1, 1, "A", 5, 1000);
		// Registro 2
		adm.pRegistrarHistoria(2, 1, 2, 2, "A", 10, 2000);
		// Registro 3
		adm.pRegistrarHistoria(3, 1, 3, 3, "P", 15, 3000);
	}

	@Test
	public void RegistrarHistoria() {
		System.out.println("Registro de Historia de Usuario");		

		// Registro 4
		iIDhistoria = 0004;
		iIdProducto = 0001;
		iOrdenPrioridadEstimada = 1;
		iOrdenPrioridadReal = 3;
		cEstado = "A";
		iDuracionDias = 5;
		fCosto = 12;

		// Registra, valida que no exista y que se hayan ingresado los datos
		// necesarios.
		assertTrue(adm.pRegistrarHistoria(iIDhistoria, iIdProducto,
				iOrdenPrioridadEstimada, iOrdenPrioridadReal, cEstado,
				iDuracionDias, fCosto));
		// adm.printHistoriaUsuario();
	}

	@Test
	public void BuscarHistoria() {
		System.out.println("Busqueda de Historia de Usuario");
		
		// Buscar un registro
		clsHistoria historia = adm.buscarHistoria(0001);
		assertNotNull(historia);
		System.out.println("Historia encontrada con los siguientes datos: ");
		System.out.println("Codigo: " + historia.getiIDhistoria());
		System.out.println("ID Producto: " + historia.getiIDProducto());
		System.out.println("IDOrdenPrioridadEstimada: "
				+ historia.getiOrdenPrioridadEstimada());
		System.out.println("IDOrdenPrioridadReal: "
				+ historia.getiOrdenPrioridadReal());
		System.out.println("Estado: " + historia.getcEstado());
		System.out.println("Costo : " + historia.getfCosto());
	}

	@Test
	public void ActualizarHistoria() {

		System.out.println("Actualizacion de Historia de Usuario");
	
		adm.printHistoriaUsuario();

		// historia a actualizar
		iIDhistoria = 0002;
		iIdProducto = 0001;
		iOrdenPrioridadEstimada = 1;
		iOrdenPrioridadReal = 3;
		cEstado = "E";
		iDuracionDias = 5;
		fCosto = 12;

		assertTrue(adm.actualizarHistoriaUsuario(iIDhistoria, iIdProducto,
				iOrdenPrioridadEstimada, iOrdenPrioridadReal, cEstado,
				iDuracionDias, fCosto));

		System.out.println("Despues de Actualización:");

		adm.printHistoriaUsuario();
	}

	@Test
	public void EliminarHistoriaUsuario() {
		System.out.println("Eliminación de Historia de Usuario");
		
		adm.printHistoriaUsuario();

		assertTrue(adm.eliminarHistoriaUsuario(0003));

		System.out.println("Despues de la Eliminación:");

		adm.printHistoriaUsuario();
	}

}
