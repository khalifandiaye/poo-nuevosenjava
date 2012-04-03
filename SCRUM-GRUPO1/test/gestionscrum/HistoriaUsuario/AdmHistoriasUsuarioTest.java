package gestionscrum.HistoriaUsuario;

import gestionscrum.HistoriaUsuario.AdmHistoriasUsuario;
import gestionscrum.HistoriaUsuario.HistoriaUsuario;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Evelyn Córdova
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
        String usuario = "P0001";
        String estado = "Asignado";
        // Act
        //  Ejecutar los métodos a probar
        AdmHistoriasUsuario adm = new AdmHistoriasUsuario();
        adm.registrarHistoriaUsuario(codigo, descripcion, fecha,usuario, estado);
        // Assert
        HistoriaUsuario historia = adm.buscarHistoria(codigo);
        assertNotNull(historia);
        assertTrue(historia.getCodigo().equals(codigo));
        assertTrue(historia.getDescripcion().equals(descripcion));
        assertTrue(historia.getFecha().equals(fecha));
        assertTrue(historia.getUsuario().equals(usuario));
        assertTrue(historia.getEstado().equals(estado));
    }


}