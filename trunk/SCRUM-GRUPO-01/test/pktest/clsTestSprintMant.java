package pktest;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Calendar;
import java.util.Date;

import org.junit.Test;


import pksource.clsSprint;
import pksource.clsSprintMant;

public class clsTestSprintMant {
	
	@Test
    public void AgregaSprint(){
        System.out.println("");
        System.out.println("Agregar Sprint");
        System.out.println("==============");
        // Arrange
        int viIDSprint = 1;   
    	String vsDescripcion = "Sprint 1";
    	
    	Calendar Cal = Calendar.getInstance();
        Cal.set(2012,4,9);//09/04/2012
        Date vdFechaInicio=Cal.getTime();
        
        Cal.set(2012,5,8);//08/05/2012
        Date vdFechaFin=Cal.getTime();
        
    	int viDuracionDias = 22;
    	String vsEstado = "00";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
    	double vdPorcentajeAvance=0;
    	int viIDUsuarioCreacion = 1;
    	
    	Cal.set(2012,3,7);//09/04/2012
        Date vdFechaCreacion=Cal.getTime();
        int viIDUsuarioModificacion=0;
		Date vdFechaModificacion=null;
		
		clsSprintMant oSprintMant = new clsSprintMant();
        // Act
        oSprintMant.pAgregar(viIDSprint,vsDescripcion,vdFechaInicio,vdFechaFin,viDuracionDias,vsEstado,vdPorcentajeAvance,viIDUsuarioCreacion,vdFechaCreacion,viIDUsuarioModificacion,vdFechaModificacion);    
        //Assert
        clsSprint oSprint = oSprintMant.faBuscarPk(viIDSprint);
        assertNotNull(oSprint);
        assertEquals(viIDSprint,oSprint.get_iIDSprint());
        assertEquals(vsDescripcion,oSprint.get_sDescripcion());
        assertEquals(vdFechaInicio,oSprint.get_dFechaInicio());
        assertEquals(vdFechaFin,oSprint.get_dFechaFin());
        System.out.println(oSprint.get_iIDSprint());
        System.out.println(oSprint.get_sDescripcion());
        System.out.println(oSprint.get_dFechaInicio());
        System.out.println(oSprint.get_dFechaFin());
     }

	
	@Test
    public void EliminaSprint(){
		System.out.println("");
	    System.out.println("Elimina Sprint");
	    System.out.println("==============");
	    // Arrange
	    int viIDSprint = 2;
	    String vsDescripcion = "Sprint 2";
	    
	    Calendar Cal = Calendar.getInstance();
        Cal.set(2012,4,9);//09/04/2012
        Date vdFechaInicio=Cal.getTime();
        Cal.set(2012,5,8);//08/05/2012
        Date vdFechaFin=Cal.getTime();
	    
        int viDuracionDias = 22;
	    String vsEstado = "00";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
    	double vdPorcentajeAvance=0;
    	int viIDUsuarioCreacion = 1;
	    
    	Cal.set(2012,4,7);//07/04/2012
        Date vdFechaCreacion=Cal.getTime();
        Date vdFechaModificacion=null;
        
        int viIDUsuarioModificacion=0;
		//
    	int viIDSprint2 = 3;
	    String vsDescripcion2 = "Sprint 3";
	    
	    Cal.set(2012,4,2);//01/04/2012
        Date vdFechaInicio2=Cal.getTime();
        Cal.set(2012,5,12);//11/05/2012
        Date vdFechaFin2=Cal.getTime();
	    
	    int viDuracionDias2 = 30;
	    String vsEstado2 = "00";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
    	double vdPorcentajeAvance2=0;
	    int viIDUsuarioCreacion2 = 1;
	    
	    Cal.set(2012,3,7);//07/04/2012
        Date vdFechaCreacion2=Cal.getTime();
	    
	    int viIDUsuarioModificacion2 = 3; 
	    Date vdFechaModificacion2=null;
	    	
	    clsSprintMant oSprintMant = new clsSprintMant();
	    // Act
	    oSprintMant.pAgregar(viIDSprint,vsDescripcion,vdFechaInicio,vdFechaFin,viDuracionDias,vsEstado,vdPorcentajeAvance,viIDUsuarioCreacion,vdFechaCreacion,viIDUsuarioModificacion,vdFechaModificacion); 
	    oSprintMant.pAgregar(viIDSprint2,vsDescripcion2,vdFechaInicio2,vdFechaFin2,viDuracionDias2,vsEstado2,vdPorcentajeAvance2,viIDUsuarioCreacion2,vdFechaCreacion2,viIDUsuarioModificacion2,vdFechaModificacion2);    
	    //Assert
	    oSprintMant.pEliminar(viIDSprint,vdPorcentajeAvance);  
	    // oSprintMant.faBuscarPk(viIDSprint);
	    assertNull(oSprintMant.faBuscarPk(viIDSprint));
	    
	    clsSprint oSprint = oSprintMant.faBuscarPk(viIDSprint2);
	    
	    // oSprintMant.faBuscarPk(viIDSprint2);        
	    assertNotNull(viIDSprint2); // encuentra elemento restante
	    
	    assertEquals(viIDSprint2,oSprint.get_iIDSprint());
	    assertEquals(vsDescripcion2,oSprint.get_sDescripcion());
	    assertEquals(vdFechaInicio2,oSprint.get_dFechaInicio());
	    assertEquals(vdFechaFin2,oSprint.get_dFechaFin());
	    
	    System.out.println(oSprint.get_iIDSprint());
        System.out.println(oSprint.get_sDescripcion());
        System.out.println(oSprint.get_dFechaInicio());
        System.out.println(oSprint.get_dFechaFin());
	 	}
	
	@Test
    public void EditaSprint(){
		System.out.println("");
	    System.out.println("Edita Sprint");
	    System.out.println("============");
	    // Arrange
	    int viIDSprint = 2;
	    String vsDescripcion = "Sprint 2";
	    
	    Calendar Cal = Calendar.getInstance();
        Cal.set(2012,4,9);//09/04/2012
        Date vdFechaInicio=Cal.getTime();
        Cal.set(2012,5,8);//08/05/2012
        Date vdFechaFin=Cal.getTime();
	    
	    int viDuracionDias = 22;
	    String vsEstado = "00";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
    	double vdPorcentajeAvance=0;
	    int viIDUsuarioCreacion = 1;
	    
	    Cal.set(2012,4,9);//09/04/2012
        Date vdFechaCreacion=Cal.getTime();
	    Date vdFechaModificacion=null;
	    
	    int viIDUsuarioModificacion = 0;
	    //
	    int viIDSprint2 = 3;
	    String vsDescripcion2 = "Sprint 3";
	    
	    Cal.set(2012,4,2);//02/04/2012
        Date vdFechaInicio2=Cal.getTime();
        Cal.set(2012,5,12);//12/05/2012
        Date vdFechaFin2=Cal.getTime();
        
	    int viDuracionDias2 = 30;
	    String vsEstado2 = "00";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
    	double vdPorcentajeAvance2=0;
	    int viIDUsuarioCreacion2 = 3;
	    
	    Cal.set(2012,4,9);//09/04/2012
        Date vdFechaCreacion2=Cal.getTime();
        Cal.set(2012,5,12);//12/05/2012
	    Date vdFechaModificacion2=Cal.getTime();
	    	    
	    int viIDUsuarioModificacion2 = 4; 
	    	
	    clsSprintMant oSprintMant = new clsSprintMant();
	    
	    oSprintMant.pAgregar(viIDSprint,vsDescripcion,vdFechaInicio,vdFechaFin,viDuracionDias,vsEstado,vdPorcentajeAvance,viIDUsuarioCreacion,vdFechaCreacion,viIDUsuarioModificacion,vdFechaModificacion); 
	    oSprintMant.pEditar(viIDSprint2,vsDescripcion2,vdFechaInicio2,vdFechaFin2,viDuracionDias2,vsEstado2,vdPorcentajeAvance2,viIDUsuarioCreacion2,vdFechaCreacion2,viIDUsuarioModificacion2,vdFechaModificacion2);    

	    clsSprint oSprint = oSprintMant.faBuscarPk(viIDSprint2);	    
	    assertNull(oSprintMant.faBuscarPk(viIDSprint));
	    assertEquals(viIDSprint2,oSprint.get_iIDSprint());
	    assertEquals(vsDescripcion2,oSprint.get_sDescripcion());
	    assertEquals(vdFechaInicio2,oSprint.get_dFechaInicio());
	    assertEquals(vdFechaFin2,oSprint.get_dFechaFin());
	    
	    System.out.println(oSprint.get_iIDSprint());
        System.out.println(oSprint.get_sDescripcion());
        System.out.println(oSprint.get_dFechaInicio());
        System.out.println(oSprint.get_dFechaFin());
	}


	@Test
	public void AgregaPorcentaje(){
		System.out.println("");
		System.out.println("Agregar Sprint, debe de hacerlo con porcentaje de avance en cero");
		System.out.println("================================================================");
		// Arrange
		int viIDSprint = 1;   
		String vsDescripcion = "Sprint 1";
		
		Calendar Cal = Calendar.getInstance();
		Cal.set(2012,4,9);//09/04/2012
		Date vdFechaInicio=Cal.getTime();
    
		Cal.set(2012,5,8);//08/05/2012
		Date vdFechaFin=Cal.getTime();
    
		int viDuracionDias = 22;
		String vsEstado = "00";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
		double vdPorcentajeAvance=20;
		int viIDUsuarioCreacion = 1;
	
		Cal.set(2012,3,7);//09/04/2012
		Date vdFechaCreacion=Cal.getTime();
		int viIDUsuarioModificacion=0;
		Date vdFechaModificacion=null;
	
		clsSprintMant oSprintMant = new clsSprintMant();
		// Act
		oSprintMant.pAgregar(viIDSprint,vsDescripcion,vdFechaInicio,vdFechaFin,viDuracionDias,vsEstado,vdPorcentajeAvance,viIDUsuarioCreacion,vdFechaCreacion,viIDUsuarioModificacion,vdFechaModificacion);    
		//	Assert
		clsSprint oSprint = oSprintMant.faBuscarPk(viIDSprint);
		assertNotNull(oSprint);
		assertEquals(viIDSprint,oSprint.get_iIDSprint());
		assertEquals(vsDescripcion,oSprint.get_sDescripcion());
		assertEquals(vdFechaInicio,oSprint.get_dFechaInicio());
		assertEquals(vdFechaFin,oSprint.get_dFechaFin());
		System.out.println(oSprint.get_iIDSprint());
		System.out.println(oSprint.get_sDescripcion());
		System.out.println(oSprint.get_dFechaInicio());
		System.out.println(oSprint.get_dFechaFin());
 }

	@Test
    public void EditaPorcentaje(){
		System.out.println("");
	    System.out.println("Edita Sprint, sólo grabará sí no es mayor a 100%");
	    System.out.println("================================================");
	    // Arrange
	    int viIDSprint = 2;
	    String vsDescripcion = "Sprint 2";
	    
	    Calendar Cal = Calendar.getInstance();
        Cal.set(2012,4,9);//09/04/2012
        Date vdFechaInicio=Cal.getTime();
        Cal.set(2012,5,8);//08/05/2012
        Date vdFechaFin=Cal.getTime();
	    
	    int viDuracionDias = 22;
	    String vsEstado = "00";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
    	double vdPorcentajeAvance=0;
	    int viIDUsuarioCreacion = 1;
	    
	    Cal.set(2012,4,9);//09/04/2012
        Date vdFechaCreacion=Cal.getTime();
	    Date vdFechaModificacion=null;
	    
	    int viIDUsuarioModificacion = 0;
	    //
	    int viIDSprint2 = 3;
	    String vsDescripcion2 = "Sprint 3";
	    
	    Cal.set(2012,4,2);//02/04/2012
        Date vdFechaInicio2=Cal.getTime();
        Cal.set(2012,5,12);//12/05/2012
        Date vdFechaFin2=Cal.getTime();
        
	    int viDuracionDias2 = 30;
	    String vsEstado2 = "00";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
    	double vdPorcentajeAvance2=200;
	    int viIDUsuarioCreacion2 = 3;
	    
	    Cal.set(2012,4,9);//09/04/2012
        Date vdFechaCreacion2=Cal.getTime();
        Cal.set(2012,5,12);//12/05/2012
	    Date vdFechaModificacion2=Cal.getTime();
	    	    
	    int viIDUsuarioModificacion2 = 4; 
	    	
	    clsSprintMant oSprintMant = new clsSprintMant();
	    
	    oSprintMant.pAgregar(viIDSprint,vsDescripcion,vdFechaInicio,vdFechaFin,viDuracionDias,vsEstado,vdPorcentajeAvance,viIDUsuarioCreacion,vdFechaCreacion,viIDUsuarioModificacion,vdFechaModificacion); 
	    oSprintMant.pEditar(viIDSprint2,vsDescripcion2,vdFechaInicio2,vdFechaFin2,viDuracionDias2,vsEstado2,vdPorcentajeAvance2,viIDUsuarioCreacion2,vdFechaCreacion2,viIDUsuarioModificacion2,vdFechaModificacion2);    

	    clsSprint oSprint = oSprintMant.faBuscarPk(viIDSprint2);	    
	    assertNull(oSprintMant.faBuscarPk(viIDSprint));
	    assertEquals(viIDSprint2,oSprint.get_iIDSprint());
	    assertEquals(vsDescripcion2,oSprint.get_sDescripcion());
	    assertEquals(vdFechaInicio2,oSprint.get_dFechaInicio());
	    assertEquals(vdFechaFin2,oSprint.get_dFechaFin());
	    
	    System.out.println(oSprint.get_iIDSprint());
        System.out.println(oSprint.get_sDescripcion());
        System.out.println(oSprint.get_dFechaInicio());
        System.out.println(oSprint.get_dFechaFin());
	}

	@Test
	public void AgregaValidaFecha(){
		System.out.println("");
		System.out.println("Agregar Sprint, debe de hacerlo con Fecha Inicial menor a la Final");
		System.out.println("==================================================================");
		// Arrange
		int viIDSprint = 1;   
		String vsDescripcion = "Sprint 1";
		
		Calendar Cal = Calendar.getInstance();
		Cal.set(2012,4,9);//09/04/2012
		Date vdFechaInicio=Cal.getTime();
    
		Cal.set(2012,4,8);//08/05/2012
		Date vdFechaFin=Cal.getTime();
    
		int viDuracionDias = 22;
		String vsEstado = "00";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
		double vdPorcentajeAvance=0;
		int viIDUsuarioCreacion = 1;
	
		Cal.set(2012,3,7);//09/04/2012
		Date vdFechaCreacion=Cal.getTime();
		int viIDUsuarioModificacion=0;
		Date vdFechaModificacion=null;
	
		clsSprintMant oSprintMant = new clsSprintMant();
		// Act
		oSprintMant.pAgregar(viIDSprint,vsDescripcion,vdFechaInicio,vdFechaFin,viDuracionDias,vsEstado,vdPorcentajeAvance,viIDUsuarioCreacion,vdFechaCreacion,viIDUsuarioModificacion,vdFechaModificacion);    
		//	Assert
		clsSprint oSprint = oSprintMant.faBuscarPk(viIDSprint);
		assertNotNull(oSprint);
		assertEquals(viIDSprint,oSprint.get_iIDSprint());
		assertEquals(vsDescripcion,oSprint.get_sDescripcion());
		assertEquals(vdFechaInicio,oSprint.get_dFechaInicio());
		assertEquals(vdFechaFin,oSprint.get_dFechaFin());
		System.out.println(oSprint.get_iIDSprint());
		System.out.println(oSprint.get_sDescripcion());
		System.out.println(oSprint.get_dFechaInicio());
		System.out.println(oSprint.get_dFechaFin());
 }

	
	@Test
    public void EditaFechas(){
		System.out.println("");
	    System.out.println("Edita Sprint, sólo grabará sí las fechas son correctas");
	    System.out.println("======================================================");
	    // Arrange
	    int viIDSprint = 2;
	    String vsDescripcion = "Sprint 2";
	    
	    Calendar Cal = Calendar.getInstance();
        Cal.set(2012,4,9);//09/04/2012
        Date vdFechaInicio=Cal.getTime();
        Cal.set(2012,5,8);//08/05/2012
        Date vdFechaFin=Cal.getTime();
	    
	    int viDuracionDias = 22;
	    String vsEstado = "00";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
    	double vdPorcentajeAvance=0;
	    int viIDUsuarioCreacion = 1;
	    
	    Cal.set(2012,4,9);//09/04/2012
        Date vdFechaCreacion=Cal.getTime();
	    Date vdFechaModificacion=null;
	    
	    int viIDUsuarioModificacion = 0;
	    //
	    int viIDSprint2 = 3;
	    String vsDescripcion2 = "Sprint 3";
	    
	    Cal.set(2012,4,2);//02/04/2012
        Date vdFechaInicio2=Cal.getTime();
        Cal.set(2012,5,12);//12/05/2012
        Date vdFechaFin2=Cal.getTime();
        
	    int viDuracionDias2 = 30;
	    String vsEstado2 = "00";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
    	double vdPorcentajeAvance2=200;
	    int viIDUsuarioCreacion2 = 3;
	    
	    Cal.set(2012,4,9);//09/04/2012
        Date vdFechaCreacion2=Cal.getTime();
        Cal.set(2012,5,12);//12/03/2012
	    Date vdFechaModificacion2=Cal.getTime();
	    	    
	    int viIDUsuarioModificacion2 = 4; 
	    	
	    clsSprintMant oSprintMant = new clsSprintMant();
	    
	    oSprintMant.pAgregar(viIDSprint,vsDescripcion,vdFechaInicio,vdFechaFin,viDuracionDias,vsEstado,vdPorcentajeAvance,viIDUsuarioCreacion,vdFechaCreacion,viIDUsuarioModificacion,vdFechaModificacion); 
	    oSprintMant.pEditar(viIDSprint2,vsDescripcion2,vdFechaInicio2,vdFechaFin2,viDuracionDias2,vsEstado2,vdPorcentajeAvance2,viIDUsuarioCreacion2,vdFechaCreacion2,viIDUsuarioModificacion2,vdFechaModificacion2);    

	    clsSprint oSprint = oSprintMant.faBuscarPk(viIDSprint2);	    
	    assertNull(oSprintMant.faBuscarPk(viIDSprint));
	    assertEquals(viIDSprint2,oSprint.get_iIDSprint());
	    assertEquals(vsDescripcion2,oSprint.get_sDescripcion());
	    assertEquals(vdFechaInicio2,oSprint.get_dFechaInicio());
	    assertEquals(vdFechaFin2,oSprint.get_dFechaFin());
	    
	    System.out.println(oSprint.get_iIDSprint());
        System.out.println(oSprint.get_sDescripcion());
        System.out.println(oSprint.get_dFechaInicio());
        System.out.println(oSprint.get_dFechaFin());
	}
	
	
}