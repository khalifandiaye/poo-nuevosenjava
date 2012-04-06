package gestionscrum.HistoriaUsuario;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;

public class EliminarHistoriaUsuarioTest {
	
	ArrayList<String> Historias = new ArrayList<String>();
	
	@Test
	public void EliminarHistoriaUsuario()
	{  
		AdmHistoriasUsuario adm = new AdmHistoriasUsuario();
		
		// Arrange
        //   Definir los datos de pruebas
		  int iIDhistoria = 0001;
	        int iIdProducto = 0001;
	        int iOrdenPrioridadEstimada = 1;
	        int iOrdenPrioridadReal = 3;
	        String cEstado = "A";
	        int iDuracionDias=5;
	        float fCosto=12;
        // Act
        //  Ejecutar los métodos a probar
     	
		adm.registrarHistoriaUsuario(iIDhistoria, iIdProducto, iOrdenPrioridadEstimada,iOrdenPrioridadReal, cEstado, iDuracionDias, fCosto);
		
		iIDhistoria = 0002;
        iIdProducto = 0001;
        iOrdenPrioridadEstimada = 1;
        iOrdenPrioridadReal = 3;
        cEstado = "A";
        iDuracionDias=5;
        fCosto=12;
        // Act
        //  Ejecutar los métodos a probar
	     	
	     adm.registrarHistoriaUsuario(iIDhistoria, iIdProducto, iOrdenPrioridadEstimada,iOrdenPrioridadReal, cEstado, iDuracionDias, fCosto);
	     
	     adm.printHistoriaUsuario();
	     
	     assertTrue(adm.eliminarHistoriaUsuario(0002));	
	     
	     System.out.println("Despues de la Eliminación:");
	    
	     adm.printHistoriaUsuario();
	}
}
