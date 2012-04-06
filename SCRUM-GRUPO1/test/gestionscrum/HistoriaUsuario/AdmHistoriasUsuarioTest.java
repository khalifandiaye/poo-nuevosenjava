package gestionscrum.HistoriaUsuario;

import gestionscrum.HistoriaUsuario.AdmHistoriasUsuario;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * 
 * @author Evelyn Córdova
 */
public class AdmHistoriasUsuarioTest {

	@Test
    public void admHistoriasDebeRegistrarHistoriaUsuario(){
    	
    	  int iIDhistoria = 0001;
	        int iIdProducto = 0001;
	        int iOrdenPrioridadEstimada = 1;
	        int iOrdenPrioridadReal = 3;
	        String cEstado = "A";
	        int iDuracionDias=5;
	        float fCosto=12;
	        // Act
	        //  Ejecutar los métodos a probar
	        AdmHistoriasUsuario adm = new AdmHistoriasUsuario();
	        adm.registrarHistoriaUsuario(iIDhistoria, iIdProducto, iOrdenPrioridadEstimada,iOrdenPrioridadReal, cEstado, iDuracionDias, fCosto);
	        
	        // Arrange
	        //   Definir los datos de pruebas
	        iIDhistoria = 0002;
	        iIdProducto = 0001;
	        iOrdenPrioridadEstimada = 1;
	        iOrdenPrioridadReal = 3;
	        cEstado = "";
	        iDuracionDias=5;
	        fCosto=12;
	        // Act
	        //  Ejecutar los métodos a probar	   
	        adm.registrarHistoriaUsuario(iIDhistoria, iIdProducto, iOrdenPrioridadEstimada,iOrdenPrioridadReal, cEstado, iDuracionDias, fCosto);
	        	                
        
	        // Arrange
	        //   Definir los datos de pruebas
	        iIDhistoria = 0002;
	        iIdProducto = 0001;
	        iOrdenPrioridadEstimada = 1;
	        iOrdenPrioridadReal = 3;
	        cEstado = "A";
	        iDuracionDias=5;
	        fCosto=12;
	        // Act
	        //  Ejecutar los métodos a probar	   
	        
	        	        
        assertTrue(adm.registrarHistoriaUsuario(iIDhistoria, iIdProducto, iOrdenPrioridadEstimada,iOrdenPrioridadReal, cEstado, iDuracionDias, fCosto));       
       // adm.printHistoriaUsuario();
    }
}