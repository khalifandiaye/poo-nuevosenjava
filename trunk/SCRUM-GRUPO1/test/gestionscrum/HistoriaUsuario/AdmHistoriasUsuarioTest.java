package gestionscrum.HistoriaUsuario;

import gestionscrum.HistoriaUsuario.AdmHistoriasUsuario;
import gestionscrum.HistoriaUsuario.HistoriaUsuario;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author pcsiecon
 */
public class AdmHistoriasUsuarioTest {

    public AdmHistoriasUsuarioTest() {
    }

    @Test
    public void admHistoriasDebeRegistrarHistoriaUsuario(){
        // Arrange
        //   Definir los datos de pruebas
        String codigo = "HU001";
        String descripcion = "Realizar el requerimiento N1";
        String fecha = "24/03/2012";
        // Act
        //  Ejecutar los métodos a probar
        AdmHistoriasUsuario adm = new AdmHistoriasUsuario();
        adm.registrarHistoriaUsuario(codigo, descripcion, fecha);
        // Assert
        HistoriaUsuario historia = adm.buscarHistoria(codigo);
        assertNotNull(historia);
        assertTrue(historia.getCodigo().equals(codigo));
        assertTrue(historia.getDescripcion().equals(descripcion));
        assertTrue(historia.getFecha().equals(fecha));
    }


}