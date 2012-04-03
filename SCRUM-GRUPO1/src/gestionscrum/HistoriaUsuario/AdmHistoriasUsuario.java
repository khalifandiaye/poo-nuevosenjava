package gestionscrum.HistoriaUsuario;

import java.util.ArrayList;


/**
 *
 * @author Evelyn Córdova
 */
public class AdmHistoriasUsuario {

    private ArrayList<HistoriaUsuario> historias;

    public AdmHistoriasUsuario(){
        // Creando la coleccion de historias
        historias = new ArrayList<HistoriaUsuario>();
    }

    public void registrarHistoriaUsuario(String codigo, String descripcion, String fecha, String usuario, String estado) {
        // Crear la nueva historia
        HistoriaUsuario historia = new HistoriaUsuario(codigo, descripcion, fecha, usuario, estado);
        // Insertarlo en la colección
        historias.add(historia);
    }

    public HistoriaUsuario buscarHistoria(String codigo) {
        // Busqueda secuencial
        for(HistoriaUsuario historia : historias)
            if (historia.getCodigo().equals(codigo))
                return historia;
        return null;

    }

}
