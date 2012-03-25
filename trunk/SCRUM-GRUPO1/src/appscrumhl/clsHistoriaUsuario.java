package appscrumhl;
import java.util.ArrayList;

public class clsHistoriaUsuario {
	private ArrayList<clsArrHistoriaUsuario> historias;
	
	public clsHistoriaUsuario(){
        
		historias = new ArrayList<clsArrHistoriaUsuario>();
	}
	
	public clsArrHistoriaUsuario ConsultarHistoriaUsuario(String IDHisUsu){
				
		for(clsArrHistoriaUsuario historia : historias)
            if (historia.getIDHisUsu().equals(IDHisUsu))
                return historia;
        return null;
	}
	
	public void InsertarHistoriaUsuario(String IDHisUsu, String Descripcion, String Fecha){
		clsArrHistoriaUsuario historia = new clsArrHistoriaUsuario(IDHisUsu,Descripcion,Fecha);
		
		historias.add(historia);	
		
	}
}
