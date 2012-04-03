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
        String codigo = "HU001";
        String descripcion = "Realizar el requerimiento N1";
        String fecha = "24/03/2012";
        String usuario= "PO0001";
        String estado= "Asignado"; //asignar, en progreso, finalizado
        // Act
        //  Se ejecuta el método a probar
        HistoriaUsuario historia = new HistoriaUsuario(codigo, descripcion, fecha, usuario, estado);
        // Assert
        //  Se comprueba los resultados de la ejecución
        assertNotNull(historia);
        assertTrue(historia.getCodigo().equals(codigo));
        assertTrue(historia.getDescripcion().equals(descripcion));
        assertTrue(historia.getFecha().equals(fecha));
        assertTrue(historia.getUsuario().equals(usuario));
        assertTrue(historia.getEstado().equals(estado));
    }


}