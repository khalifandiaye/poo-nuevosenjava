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

    public boolean registrarHistoriaUsuario(int viIDhistoria, int viIdProducto, int viOrdenPrioridadEstimada,int viOrdenPrioridadReal, String vcEstado, int viDuracionDias, float vfCosto) {
        // Crear la nueva historia
    	
    		if (buscarHistoria(viIDhistoria) == null)
    		{
		    	if (viIDhistoria != 0 && viIdProducto != 0 && viOrdenPrioridadEstimada!=0 && vcEstado != "" && viDuracionDias !=0)
		    	{
		    		HistoriaUsuario historia = new HistoriaUsuario(viIDhistoria, viIdProducto, viOrdenPrioridadEstimada,viOrdenPrioridadReal, vcEstado, viDuracionDias,vfCosto);
		    	    // Insertarlo en la colección
		    		historias.add(historia);
		    		System.out.println("Historia Registrada");
					return true;
		    	}
		    	else
		    	{
		    		System.out.println("Ingrese los Datos necesarios");
		    		return false;
		    	}
    		}
    		else
    		{
    			System.out.println("La historia ya existe!!!");
    			return false;    			
    		}    	
    }

    public HistoriaUsuario buscarHistoria(int viIDhistoria) {
        // Busqueda secuencial
        for(HistoriaUsuario historia : historias)
        {
            if (historia.getiIDhistoria()==viIDhistoria) 
            {            	
                return historia;       
            }
        }       
        return null;
    }  
    
    public boolean eliminarHistoriaUsuario(int viIDhistoria)
    {
    	int i;
    	
    	for (i=0; i<historias.size(); i++)
    	{
    		if (historias.get(i).getiIDhistoria()==viIDhistoria)
    		{
    			if (historias.get(i).getcEstado().endsWith("A"))
    			{
    				historias.remove(i);
    				return true;
    			}    	
    		}
    	}
		return false;
    }
    
    public void printHistoriaUsuario()
    {
    	int i;
    	
    	for (i=0; i<historias.size(); i++)
    	{
    		System.out.println(historias.get(i).getiIDhistoria() + "-" + historias.get(i).getiIdProducto() + " " + historias.get(i).getiOrdenPrioridadEstimada() + " " + historias.get(i).getiOrdenPrioridadReal() + " " + historias.get(i).getcEstado()+ " " + historias.get(i).getiDuracionDias()+ " " + historias.get(i).getfCosto());    		 		
    	}		
    }
    
    public boolean actualizarHistoriaUsuario(int viIDhistoria, int viIdProducto, int viOrdenPrioridadEstimada,int viOrdenPrioridadReal, String vcEstado, int viDuracionDias, float vfCosto)
    {
    	int i;
    	
    	for (i=0; i<historias.size(); i++)
    	{
    		if (historias.get(i).getiIDhistoria()==viIDhistoria)
    		{
    			historias.get(i).setiIdProducto(viIdProducto);
    			historias.get(i).setiOrdenPrioridadEstimada(viOrdenPrioridadEstimada);    			
    			historias.get(i).setiOrdenPrioridadReal(viOrdenPrioridadReal);
    			historias.get(i).setcEstado(vcEstado);
    			historias.get(i).setiDuracionDias(viDuracionDias);
    			historias.get(i).setfCosto(vfCosto);
    			return true;
    		}
    	}
    	return false;
    }
}
