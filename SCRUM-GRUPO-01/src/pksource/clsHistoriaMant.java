package pksource;

import java.util.ArrayList;

public class clsHistoriaMant {

	private ArrayList<clsHistoria> historias;

    public clsHistoriaMant(){
        // Creando la coleccion de historias
        historias = new ArrayList<clsHistoria>();
    }

    public boolean pRegistrarHistoria(int viIDhistoria, int viIDProducto, int viOrdenPrioridadEstimada,int viOrdenPrioridadReal, String vcEstado, int viDuracionDias, float vfCosto) {
        // Crear la nueva historia
    	
    		if (buscarHistoria(viIDhistoria) == null)
    		{
		    	if (viIDhistoria != 0 && viIDProducto != 0 && viOrdenPrioridadEstimada!=0 && vcEstado != "" && viDuracionDias !=0)
		    	{
		    		clsHistoria historia = new clsHistoria(viIDhistoria, viIDProducto, viOrdenPrioridadEstimada,viOrdenPrioridadReal, vcEstado, viDuracionDias,vfCosto);
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

    public clsHistoria buscarHistoria(int viIDhistoria) {
        // Busqueda secuencial
        for(clsHistoria historia : historias)
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
    			if (!historias.get(i).getcEstado().equals("A"))
    			{
    				historias.remove(i);
    				return true;
    			} 
    			else 
    			{
    				System.out.println("Historia ya ha sido aprobada no se puede eliminar");
    				return false;
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
    		System.out.println("Codigo: " + historias.get(i).getiIDhistoria());
    		System.out.println("Codigo Proyecto :" +  historias.get(i).getiIDProducto());
    		System.out.println("IDOrdenProridadEstimada :" + historias.get(i).getiOrdenPrioridadEstimada());
    		System.out.println("IDOrdenPrioridadReal" + historias.get(i).getiOrdenPrioridadReal());
    		System.out.println("Estado: " + historias.get(i).getcEstado());
    		System.out.println("DuraciónDias :" + historias.get(i).getiDuracionDias());
    		System.out.println("Costo :" + historias.get(i).getfCosto());    	
    		System.out.println("-----------------------------------------------------------------------------");
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
