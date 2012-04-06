package gestionscrum.HistoriaUsuario;

import gestionscrum.HistoriaUsuario.HistoriaUsuario;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Evelyn Córdova
 */
public class HistoriaUsuarioTest {

    public HistoriaUsuarioTest() {
    }

    @Test
    public void historiaUsuarioDebeCrearseConCodigoDescripcionFecha(){
        // Arrange
        //   Definir los datos de pruebas
    	  int iIDhistoria = 0001;
	        int iIdProducto = 0001;
	        int iOrdenPrioridadEstimada = 1;
	        int iOrdenPrioridadReal = 3;
	        String cEstado = "A";
	        int iDuracionDias=5;
	        float fCosto=12;//asignar, en progreso, finalizado
        // Act
        //  Se ejecuta el método a probar
        HistoriaUsuario historia = new HistoriaUsuario(iIDhistoria, iIdProducto, iOrdenPrioridadEstimada,iOrdenPrioridadReal, cEstado, iDuracionDias, fCosto);
        // Assert
        //  Se comprueba los resultados de la ejecución
        assertNotNull(historia);
        assertTrue(historia.getiIDhistoria()==(iIDhistoria));
        assertTrue(historia.getiIdProducto()==(iIdProducto));
        assertTrue(historia.getiOrdenPrioridadEstimada()==(iOrdenPrioridadEstimada));
        assertTrue(historia.getiOrdenPrioridadReal()==(iOrdenPrioridadReal));
        assertTrue(historia.getcEstado().equals(cEstado));
        assertTrue(historia.getiDuracionDias()==(iDuracionDias));
        assertTrue(historia.getfCosto()==(fCosto));
        
    }


}