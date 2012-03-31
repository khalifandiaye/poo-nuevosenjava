package gestionscrum.AltaTest;
import gestionscrum.AltaTareas.clsArrHistoriaUsuario;
import gestionscrum.AltaTareas.clsHistoriaUsuario;
import gestionscrum.AltaTareas.clsTarea;

import org.junit.Test;
import static org.junit.Assert.*;

public class clsTareaTest {
	
	
	public clsTareaTest(){
		
	}

	//public ArrHistoriaUsuario getHistorias(){
		//return clsHistoriaUsuario();
	//}
	
	@Test
	public void DebeRegistrarTareaqueNoEsteEnProgreso(){
		String IDTarea="TA0001";
		String IDHisUsu="HU00001";
		String Descripcion="Tarea 1";
		String Fecha="22/03/2012";
		double PorcentajeAvance=0;

		//aca se registra una historia para la sgte prueba
		clsHistoriaUsuario objHisUsu=new clsHistoriaUsuario();
		objHisUsu.InsertarHistoriaUsuario(IDHisUsu, "Historia 1", "23/03/2012");

		clsTarea objTar=new clsTarea();
		
		clsArrHistoriaUsuario historia=objHisUsu.ConsultarHistoriaUsuario(IDHisUsu);
		
		objTar.InsertarTarea(IDTarea, IDHisUsu, Descripcion, Fecha, PorcentajeAvance,historia);
		//objTar.InsertarTarea("TA0002", IDHisUsu, Descripcion, Fecha, PorcentajeAvance);
		
		
		/*
		clsArrTarea tarea2 = objTar.ConsultarTarea("TA0002");
		assertTrue(tarea2.getIDTarea().equals("TA0002"));//ok
		assertTrue(tarea2.getIDTarea().equals("TA0001"));//ok
		*/
		
		//aca se intenta registrar una tarea existente en proceso(porcentaje de avance>0  (24.6))
		assertTrue(objTar.InsertarTarea(IDTarea, IDHisUsu, Descripcion, Fecha, 0,historia));//error
		
		
	}
	
	@Test
	public void DebeRegistrarTareaquehagaReferenciaaunaHistoriaExistente(){
		String IDHisUsu="HU00002";
		//aca se registra una historia para la sgte prueba
		clsHistoriaUsuario objHisUsu=new clsHistoriaUsuario();
		objHisUsu.InsertarHistoriaUsuario(IDHisUsu, "Historia HU00002", "23/03/2012");
	
		//se carga arreglo con la historia HU00003 (No existe)
		String IDHisUsuaRegistrar="HU00002";
		clsArrHistoriaUsuario historia=objHisUsu.ConsultarHistoriaUsuario(IDHisUsuaRegistrar);
		//assertTrue(historia.getIDHisUsu().equals(IDHisUsuaRegistrar));
		
		
		//aca se intenta registrar una tarea a una historia inexistente(HU00003)
		clsTarea objTar=new clsTarea();
		
		
		assertTrue(objTar.InsertarTarea("TA0003", IDHisUsuaRegistrar, "Tarea 3", "23/03/2012", 2,historia));//ERROR porque historia HU00003 NO EXISTE
	 
	}
	
	@Test
	public void DebeIngresarDatosMandatorios(){
		String IDTarea="TA0001";
		String IDHisUsu="HU00001";
		String Descripcion="";
		String Fecha="30/03/2012";
		double PorcentajeAvance=0;

		//aca se registra una historia para la sgte prueba
		clsHistoriaUsuario objHisUsu=new clsHistoriaUsuario();
		objHisUsu.InsertarHistoriaUsuario(IDHisUsu, "Historia X", "30/03/2012");

		//se carga arreglo con la historia HU00003 (No existe)
		String IDHisUsuaRegistrar="HU00003";
		clsArrHistoriaUsuario historia=objHisUsu.ConsultarHistoriaUsuario(IDHisUsuaRegistrar);
		
		clsTarea objTar=new clsTarea();
			
		
		objTar.InsertarTarea(IDTarea, IDHisUsu, Descripcion, Fecha, PorcentajeAvance,historia);
		
		String strMensaje=objTar.strValidaDatos(IDTarea, IDHisUsu, Descripcion, Fecha, PorcentajeAvance);
		if (strMensaje!=null){
			System.out.println(strMensaje);
			assertNull(strMensaje);
		}
		else
			objTar.InsertarTarea(IDTarea, IDHisUsu, Descripcion, Fecha, 0,historia);
				
	}
	
	@Test
	public void DebeIngresarPorcentajeMayoraCero(){
		String IDTarea="TA0001";
		String IDHisUsu="HU00001";
		String Descripcion="";
		String Fecha="30/03/2012";
		double PorcentajeAvance=-5;

		//aca se registra una historia para la sgte prueba
		clsHistoriaUsuario objHisUsu=new clsHistoriaUsuario();
		objHisUsu.InsertarHistoriaUsuario(IDHisUsu, "Historia X", "30/03/2012");

		//se carga arreglo con la historia HU00003 (No existe)
		String IDHisUsuaRegistrar="HU00003";
		clsArrHistoriaUsuario historia=objHisUsu.ConsultarHistoriaUsuario(IDHisUsuaRegistrar);
				
		clsTarea objTar=new clsTarea();
		
		boolean blnPorcentaje = objTar.blnValidaPorcentaje(PorcentajeAvance);
				
		if (blnPorcentaje==false){
			System.out.println("Debe ingresar un pocentaje de avance mayor a cero");
			assertTrue(blnPorcentaje);
		}
			
		else
			objTar.InsertarTarea(IDTarea, IDHisUsu, Descripcion, Fecha, 0,historia);
				
	}

}
