package pktest;

import static org.junit.Assert.*;

import org.junit.Test;

import pksource.clsHistoria;
import pksource.clsHistoriaMant;

public class clsTestHistoriaMant {

	@Test
	public void RegistrarHistoria() {
		System.out.println("Registro de Historia de Usuario");
		// Registro 1
		int iIDhistoria = 0001;
		int iIdProducto = 0001;
		int iOrdenPrioridadEstimada = 1;
		int iOrdenPrioridadReal = 3;
		String cEstado = "A";//A: Aprobado P:Pendiente
		int iDuracionDias = 5;
		float fCosto = 12;

		clsHistoriaMant adm = new clsHistoriaMant();
		adm.pRegistrarHistoria(iIDhistoria, iIdProducto,
				iOrdenPrioridadEstimada, iOrdenPrioridadReal, cEstado,
				iDuracionDias, fCosto);

		// Registro 2
		iIDhistoria = 0002;
		iIdProducto = 0001;
		iOrdenPrioridadEstimada = 1;
		iOrdenPrioridadReal = 3;
		cEstado = "A";
		iDuracionDias = 5;
		fCosto = 12;

		adm.pRegistrarHistoria(iIDhistoria, iIdProducto,
				iOrdenPrioridadEstimada, iOrdenPrioridadReal, cEstado,
				iDuracionDias, fCosto);

		// Registro 3
		iIDhistoria = 0003;
		iIdProducto = 0001;
		iOrdenPrioridadEstimada = 1;
		iOrdenPrioridadReal = 3;
		cEstado = "A";
		iDuracionDias = 5;
		fCosto = 12;

		// Registra, valida que no exista y que se hayan ingresado los datos necesarios.
		assertTrue(adm.pRegistrarHistoria(iIDhistoria, iIdProducto,
				iOrdenPrioridadEstimada, iOrdenPrioridadReal, cEstado,
				iDuracionDias, fCosto));
		// adm.printHistoriaUsuario();
	}

	@Test
	public void BuscarHistoria() {
		System.out.println("Busqueda de Historia de Usuario");
		// Definir los datos de pruebas
		int iIDhistoria = 0001;
		int iIdProducto = 0001;
		int iOrdenPrioridadEstimada = 1;
		int iOrdenPrioridadReal = 3;
		String cEstado = "A";
		int iDuracionDias = 5;
		float fCosto = 12;
		
		// Ejecutar los métodos a probar
		clsHistoriaMant adm = new clsHistoriaMant();
		adm.pRegistrarHistoria(iIDhistoria, iIdProducto,
				iOrdenPrioridadEstimada, iOrdenPrioridadReal, cEstado,
				iDuracionDias, fCosto);
		
		// Definir los datos de pruebas
		iIDhistoria = 0002;
		iIdProducto = 0001;
		iOrdenPrioridadEstimada = 1;
		iOrdenPrioridadReal = 3;
		cEstado = "A";
		iDuracionDias = 5;
		fCosto = 12;
		
		// Ejecutar los métodos a probar
		adm.pRegistrarHistoria(iIDhistoria, iIdProducto,
				iOrdenPrioridadEstimada, iOrdenPrioridadReal, cEstado,
				iDuracionDias, fCosto);

		// Definir los datos de pruebas
		iIDhistoria = 0003;
		iIdProducto = 0001;
		iOrdenPrioridadEstimada = 1;
		iOrdenPrioridadReal = 3;
		cEstado = "A";
		iDuracionDias = 5;
		fCosto = 12;
		
		// Ejecutar los métodos a probar
		adm.pRegistrarHistoria(iIDhistoria, iIdProducto,
				iOrdenPrioridadEstimada, iOrdenPrioridadReal, cEstado,
				iDuracionDias, fCosto);

		// Buscar un registro 
		
		clsHistoria historia = adm.buscarHistoria(0001);
		assertNotNull(historia);
		System.out.println("Historia encontrada con los siguientes datos: ");
		System.out.println(historia.getiIDhistoria());
		System.out.println(historia.getiIDProducto());
		System.out.println(historia.getiOrdenPrioridadEstimada());
		System.out.println(historia.getiOrdenPrioridadReal());
		System.out.println(historia.getcEstado());
		System.out.println(historia.getfCosto());		
	}

	@Test
	public void ActualizarHistoria() {
		
		System.out.println("Actualizacion de Historia de Usuario");
		
		clsHistoriaMant adm = new clsHistoriaMant();
		
		// Definir los datos de pruebas
		int iIDhistoria = 0001;
		int iIdProducto = 0001;
		int iOrdenPrioridadEstimada = 1;
		int iOrdenPrioridadReal = 3;
		String cEstado = "A";
		int iDuracionDias = 5;
		float fCosto = 12;
		
		// Ejecutar los métodos a probar
		adm.pRegistrarHistoria(iIDhistoria, iIdProducto,
				iOrdenPrioridadEstimada, iOrdenPrioridadReal, cEstado,
				iDuracionDias, fCosto);

		iIDhistoria = 0002;
		iIdProducto = 0001;
		iOrdenPrioridadEstimada = 1;
		iOrdenPrioridadReal = 3;
		cEstado = "A";
		iDuracionDias = 5;
		fCosto = 12;
		// Act
		// Ejecutar los métodos a probar

		adm.pRegistrarHistoria(iIDhistoria, iIdProducto,
				iOrdenPrioridadEstimada, iOrdenPrioridadReal, cEstado,
				iDuracionDias, fCosto);

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
		clsHistoriaMant adm = new clsHistoriaMant();

		// Arrange
		// Definir los datos de pruebas
		int iIDhistoria = 0001;
		int iIdProducto = 0001;
		int iOrdenPrioridadEstimada = 1;
		int iOrdenPrioridadReal = 3;
		String cEstado = "A";
		int iDuracionDias = 5;
		float fCosto = 12;
		// Act
		// Ejecutar los métodos a probar

		adm.pRegistrarHistoria(iIDhistoria, iIdProducto,
				iOrdenPrioridadEstimada, iOrdenPrioridadReal, cEstado,
				iDuracionDias, fCosto);

		iIDhistoria = 0002;
		iIdProducto = 0001;
		iOrdenPrioridadEstimada = 1;
		iOrdenPrioridadReal = 3;
		cEstado = "P";
		iDuracionDias = 5;
		fCosto = 12;
		// Act
		// Ejecutar los métodos a probar

		adm.pRegistrarHistoria(iIDhistoria, iIdProducto,
				iOrdenPrioridadEstimada, iOrdenPrioridadReal, cEstado,
				iDuracionDias, fCosto);

		adm.printHistoriaUsuario();

		assertTrue(adm.eliminarHistoriaUsuario(0002));

		System.out.println("Despues de la Eliminación:");

		adm.printHistoriaUsuario();
	}

}
