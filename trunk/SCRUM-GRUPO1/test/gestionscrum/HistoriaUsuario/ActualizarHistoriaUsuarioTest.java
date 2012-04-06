package gestionscrum.HistoriaUsuario;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ActualizarHistoriaUsuarioTest {

	@Test
	public void ActualizarHistoriaUsuario() {
		AdmHistoriasUsuario adm = new AdmHistoriasUsuario();

		// Arrange
		// Definir los datos de pruebas
		  int iIDhistoria = 0001;
	        int iIdProducto = 0001;
	        int iOrdenPrioridadEstimada = 1;
	        int iOrdenPrioridadReal = 3;
	        String cEstado = "A";
	        int iDuracionDias=5;
	        float fCosto=12;
		// Act
		// Ejecutar los métodos a probar

		adm.registrarHistoriaUsuario(iIDhistoria, iIdProducto, iOrdenPrioridadEstimada,iOrdenPrioridadReal, cEstado, iDuracionDias, fCosto);

		iIDhistoria = 0002;
        iIdProducto = 0001;
        iOrdenPrioridadEstimada = 1;
        iOrdenPrioridadReal = 3;
        cEstado = "A";
        iDuracionDias=5;
        fCosto=12;
		// Act
		// Ejecutar los métodos a probar

		adm.registrarHistoriaUsuario(iIDhistoria, iIdProducto, iOrdenPrioridadEstimada,iOrdenPrioridadReal, cEstado, iDuracionDias, fCosto);

		adm.printHistoriaUsuario();
		
		iIDhistoria = 0002;
        iIdProducto = 0001;
        iOrdenPrioridadEstimada = 1;
        iOrdenPrioridadReal = 3;
        cEstado = "E";
        iDuracionDias=5;
        fCosto=12;

		assertTrue(adm.actualizarHistoriaUsuario(iIDhistoria, iIdProducto, iOrdenPrioridadEstimada,iOrdenPrioridadReal, cEstado, iDuracionDias, fCosto));

		System.out.println("Despues de Actualización:");

		adm.printHistoriaUsuario();
	}
}
