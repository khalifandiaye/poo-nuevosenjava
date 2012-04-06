package gestionscrum.HistoriaUsuario;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class BuscarHistoriaTest {

	  @Test
	    public void admHistoriasDebeRegistrarHistoriaUsuario(){
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
	        AdmHistoriasUsuario adm = new AdmHistoriasUsuario();
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
	        adm.registrarHistoriaUsuario(iIDhistoria, iIdProducto, iOrdenPrioridadEstimada,iOrdenPrioridadReal, cEstado, iDuracionDias, fCosto);
	        	        
	        // Arrange
	        iIDhistoria = 0003;
	        iIdProducto = 0001;
	        iOrdenPrioridadEstimada = 1;
	        iOrdenPrioridadReal = 3;
	        cEstado = "A";
	        iDuracionDias=5;
	        fCosto=12;
	        // Act
	        //  Ejecutar los métodos a probar	   
	        adm.registrarHistoriaUsuario(iIDhistoria, iIdProducto, iOrdenPrioridadEstimada,iOrdenPrioridadReal, cEstado, iDuracionDias, fCosto);
	        
	        // Assert        
	        assertNotNull(adm.buscarHistoria(0001));
	        
	        //HistoriaUsuario historia = adm.buscarHistoria(codigo);
	        //assertNotNull(historia);
	        //assertTrue(historia.getCodigo().equals(codigo));
	        //assertTrue(historia.getDescripcion().equals(descripcion));
	        //assertTrue(historia.getFecha().equals(fecha));
	        //assertTrue(historia.getUsuario().equals(usuario));
	        //assertTrue(historia.getEstado().equals(estado));
	    }
}
