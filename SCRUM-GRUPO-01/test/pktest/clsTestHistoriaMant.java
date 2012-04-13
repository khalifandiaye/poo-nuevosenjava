package pktest;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import pksource.clsHistoria;
import pksource.clsHistoriaMant;
import pksource.clsProyectoMant;
import pksource.clsTarea;
import pksource.clsTareaMant;
import pksource.clsUsuarioMant;

public class clsTestHistoriaMant {
	//Historias
	clsHistoriaMant adm = new clsHistoriaMant();	
	//Proyectos
	clsProyectoMant oProyectoMant = new clsProyectoMant();	
	//Usuarios
	clsUsuarioMant oUsuarioMant = new clsUsuarioMant();
	//Tareas
	clsTareaMant oTareaMant = new clsTareaMant();
	
	int iIDhistoria;
	int iIdProducto;
	String vDescripcion;
	int iOrdenPrioridadEstimada;
	int iOrdenPrioridadReal;
	String cEstado;
	int iDuracionDias;
	float fCosto;
	Date dFechaCreacion;
	int iIDUsuarioCreacion;
	Date dFechaModificacion;
	int iIDUsuarioModificacion;
	Calendar c1 = Calendar.getInstance();
	java.util.Date Fecha = c1.getTime();
	
	@Before
	public void Carga() {		
		
		//Historias
		adm.pRegistrarHistoria(1, 1, "Requerimiento 1", 1, 1, "A", 5, 0f,Fecha, 1, Fecha, 1);
		adm.pRegistrarHistoria(2, 1, "Requerimiento 2", 2, 2, "A", 10, 0f,Fecha, 1, Fecha, 1);
		adm.pRegistrarHistoria(3, 1, "Requerimiento 3", 3, 3, "A", 15, 0f,Fecha, 1, Fecha, 1);
		//Proyectos
		oProyectoMant.pAgregar(1, "GESTION DE PROVEEDORES", "WONG",	"03/03/2012", "03/03/2012", 1, 1);
		oProyectoMant.pAgregar(2, "MODULO DE MANTENIMIENTO", "UPC",	"03/03/2012", "03/03/2012", 1, 1);
		oProyectoMant.pAgregar(3, "CONTROL DE VISITAS", "SARITA COLONIA","03/03/2012", "03/03/2012", 1, 1);
		//Usuarios
		oUsuarioMant.pAgregar(1,"romulo.leon@gmail.com","Leon","Alegria","Romulo",1,"03/03/2012","03/03/2012",1,1);				
	    oUsuarioMant.pAgregar(2,"antauro.humala@gmail.com","Humala","Taso","Antauro",2,"03/03/2012","03/03/2012",1,1);				
	    oUsuarioMant.pAgregar(3,"alberto.quimper@hotmail.com","Quimper","Herrera","Alberto",3,"03/03/2012","03/03/2012",1,1);				
	    oUsuarioMant.pAgregar(4,"marco.denegri@gmail.com","Denegri","Santagadea","Marco Aurelio",1,"03/03/2012","03/03/2012",1,1);				
	    oUsuarioMant.pAgregar(5,"luis.cripiani@hotmail.com","Cipriani","Thorne","a",3,"03/03/2012","03/03/2012",1,1);				
        oUsuarioMant.pAgregar(6,"kenji.fujimori@hotmail.com","Fujimori","Higuchi","Kenji",3,"03/03/2012","03/03/2012",1,1);
        //Tareas
        Calendar Cal = Calendar.getInstance();
        Cal.set(2012,3,7);Date vdFechaInicio=Cal.getTime();
        Cal.set(2012,3,8);Date vdFechaFin=Cal.getTime();
        Cal.set(2012,3,9);Date vdFechaCreacion=Cal.getTime();  
        oTareaMant.pAgregar(1, 1, "Tarea 1",vdFechaInicio,vdFechaFin, 24,	"PD", "N",0,0,vdFechaCreacion,null,	1, 0);
		oTareaMant.pAgregar(2, 1, "Tarea 2",vdFechaInicio,vdFechaFin, 36,	"PD", "N",0,0,vdFechaCreacion,null,	1, 0);
		oTareaMant.pAgregar(3, 1, "Tarea 3",vdFechaInicio,vdFechaFin, 36,	"PD", "N",0,0,vdFechaCreacion,null,	2, 0);
		oTareaMant.pAgregar(4, 2, "Tarea 4",vdFechaInicio,vdFechaFin, 36,	"PD", "N",0,0,vdFechaCreacion,null,	2, 0);
		oTareaMant.pAgregar(5, 2, "Tarea 5",vdFechaInicio,vdFechaFin, 36,	"PD", "N",0,0,vdFechaCreacion,null,	3, 0);
		oTareaMant.pAgregar(6, 2, "Tarea 6",vdFechaInicio,vdFechaFin, 36,	"PD", "N",0,0,vdFechaCreacion,null,	4, 0);
		oTareaMant.pAgregar(7, 3, "Tarea 7",vdFechaInicio,vdFechaFin, 36,	"PD", "N",0,0,vdFechaCreacion,null,	2, 0);
		oTareaMant.pAgregar(8, 3, "Tarea 8",vdFechaInicio,vdFechaFin, 36,	"PD", "N",0,0,vdFechaCreacion,null,	3, 0);
		oTareaMant.pAgregar(9, 3, "Tarea 9",vdFechaInicio,vdFechaFin, 36,	"PD", "N",0,0,vdFechaCreacion,null,	4, 0);
	}

	@Test
	public void RegistrarHistoriaConIDProductoInexistente() {
		System.out.println("//Registro de Historia de Usuario");

		// Registro 4
		iIDhistoria = 4;
		iIdProducto = 3;
		vDescripcion="Requerimiento 4";
		iOrdenPrioridadEstimada = 1;
		iOrdenPrioridadReal = 3;
		cEstado = "A";
		iDuracionDias = 5;
		fCosto = 12.00f;
		dFechaCreacion=Fecha;
		iIDUsuarioCreacion=1;
		dFechaModificacion=Fecha;
		iIDUsuarioModificacion=1;

		// Registra, valida que no exista y que se hayan ingresado los datos
		// necesarios.
		if (!oProyectoMant.faBuscarPk(iIdProducto).equals(null)) {
			assertTrue(adm.pRegistrarHistoria(iIDhistoria, iIdProducto,vDescripcion,
					iOrdenPrioridadEstimada, iOrdenPrioridadReal, cEstado,
					iDuracionDias, fCosto,dFechaCreacion,iIDUsuarioCreacion,dFechaModificacion,iIDUsuarioModificacion));
		} else {
			System.out.println("Producto no existe.");
		}

		// adm.printHistoriaUsuario();
	}
	
	@Test
	public void RegistrarHistoriaConIDUsuarioInexistente() {
		System.out.println("//Registro de Historia de Usuario//");

		// Registro 4
		iIDhistoria = 4;
		iIdProducto = 3;
		vDescripcion="Requerimiento 4";
		iOrdenPrioridadEstimada = 1;
		iOrdenPrioridadReal = 3;
		cEstado = "A";
		iDuracionDias = 5;
		fCosto = 12.00f;
		dFechaCreacion=Fecha;
		iIDUsuarioCreacion=1;
		dFechaModificacion=Fecha;
		iIDUsuarioModificacion=1;

		// Registra, valida que no exista y que se hayan ingresado los datos
		// necesarios.
		if (!oUsuarioMant.faBuscarPk(iIDUsuarioCreacion).equals(null)) {
			assertTrue(adm.pRegistrarHistoria(iIDhistoria, iIdProducto,vDescripcion,
					iOrdenPrioridadEstimada, iOrdenPrioridadReal, cEstado,
					iDuracionDias, fCosto,dFechaCreacion,iIDUsuarioCreacion,dFechaModificacion,iIDUsuarioModificacion));
		} else {
			System.out.println("Usuario no existe.");
		}

		// adm.printHistoriaUsuario();
	}

	@Test
	public void BuscarHistoria() {
		System.out.println("//Busqueda de Historia de Usuario");

		// Buscar un registro
		clsHistoria historia = adm.buscarHistoria(0001);
		assertNotNull(historia);
		
		String sFormato;
	    
	    sFormato = "|%1$-10s|%2$-30s|%3$-20s|%4$-25s|%5$-25s|%6$-10s|%7$-10s|%8$-9s|\n";
	    System.out.println("\n[HISTORIAS]");
	    System.out.println("Historia encontrada con los siguientes datos: ");
    	System.out.println("====================================================================================================================================================");
        System.out.format(sFormato,"IDUSUARIO","IDPRODUCTO","HISTORIA","PRIORIDADESTIMADA","PRIORIDADREAL","DURACION","ESTADO","COSTO");
    	System.out.println("====================================================================================================================================================");
    	
		System.out.format(sFormato, historia.getiIDhistoria(), historia.getiIDProducto(),historia.getvDescripcion(), 
				historia.getiOrdenPrioridadEstimada(),historia.getiOrdenPrioridadReal(),historia.getiDuracionDias(),historia.getcEstado(), historia.getfCosto());
		System.out.println("====================================================================================================================================================");
	}

	@Test
	public void ActualizarHistoria() {

		System.out.println("//Actualizacion de Historia de Usuario");

		adm.printHistoriaUsuario();

		// historia a actualizar
		iIDhistoria = 0002;
		iIdProducto = 0001;
		vDescripcion="Requerimiento 4";
		iOrdenPrioridadEstimada = 1;
		iOrdenPrioridadReal = 3;
		cEstado = "E";
		iDuracionDias = 5;
		fCosto = 12;
		dFechaCreacion=Fecha;
		iIDUsuarioCreacion=1;
		dFechaModificacion=Fecha;
		iIDUsuarioModificacion=1;


		assertTrue(adm.actualizarHistoriaUsuario(iIDhistoria, iIdProducto,vDescripcion,
				iOrdenPrioridadEstimada, iOrdenPrioridadReal, cEstado,
				iDuracionDias, fCosto,dFechaCreacion,iIDUsuarioCreacion,dFechaModificacion,iIDUsuarioModificacion));

		System.out.println("Despues de Actualización:");

		adm.printHistoriaUsuario();
	}

	@Test
	public void EliminarHistoriaUsuario() {
		System.out.println("//Eliminación de Historia de Usuario");

		adm.printHistoriaUsuario();

		assertTrue(adm.eliminarHistoriaUsuario(0003));

		System.out.println("Despues de la Eliminación:");

		adm.printHistoriaUsuario();
	}
	
	@Test
	public void ListaTareas()
	{
		
		//oTareaMant.faBuscar("PD");
		
		ArrayList<clsHistoria> historias;
		historias=adm.historias;
		ArrayList<clsTarea> tareas;
		tareas=oTareaMant.tareas;
		
		String sFormato;
		System.out.println("\n[LISTA DE TAREAS]");
		sFormato = "|%1$-20s|%2$-30s|%3$-30s|%4$-30s|%5$-30s|\n";
	    System.out.println("\n[HISTORIAS]");
	    System.out.println("====================================================================================================================================================");
	   
	    
		for (clsHistoria historia : historias) 
		{		
			System.out.println("\n HISTORIA:"+historia.getvDescripcion());
			 System.out.format(sFormato,"TAREA","FECHA INICIO","FECHA FIN","DURACION","ESTADO");
			for (clsTarea tarea : tareas)
			{				
				if (historia.getiIDhistoria()==tarea.get_iIDHistoria())
				{					
					System.out.format(sFormato,tarea.get_sDescripcion(),tarea.get_dFechaInicio(),tarea.get_dFechaFin(),tarea.get_iDuracionHoras(),tarea.get_sEstado());
				 
				}			
			}		    	
		}
		 System.out.println("====================================================================================================================================================");
	}
}
