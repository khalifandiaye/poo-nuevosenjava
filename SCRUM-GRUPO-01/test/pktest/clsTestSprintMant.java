package pktest;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.util.Calendar;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import pksource.clsSprint;
import pksource.clsSprintMant;


public class clsTestSprintMant {
	
	clsSprintMant oSprintMant = new clsSprintMant();
	
	@Before
    public void CargaSprints() {
		Calendar Cal = Calendar.getInstance();
        Cal.set(2012,4,9);Date vdFechaInicio=Cal.getTime();
        Cal.set(2012,5,8);Date vdFechaFin=Cal.getTime();
        Cal.set(2012,4,6);Date vdFechaCreacion=Cal.getTime();  
        oSprintMant.pAgregar(1,"Sprint 1",vdFechaInicio,vdFechaFin,22,"00",0,1,vdFechaCreacion,0,null);				
        oSprintMant.pAgregar(2,"Sprint 2",vdFechaInicio,vdFechaFin,23,"00",0,1,vdFechaCreacion,0,null);
        oSprintMant.pAgregar(3,"Sprint 3",vdFechaInicio,vdFechaFin,24,"00",0,1,vdFechaCreacion,0,null);
        oSprintMant.pAgregar(4,"Sprint 4",vdFechaInicio,vdFechaFin,25,"00",0,2,vdFechaCreacion,0,null);
        oSprintMant.pAgregar(5,"Sprint 5",vdFechaInicio,vdFechaFin,26,"00",0,3,vdFechaCreacion,0,null);
        oSprintMant.pAgregar(6,"Sprint 6",vdFechaInicio,vdFechaFin,27,"00",0,3,vdFechaCreacion,0,null);
        oSprintMant.pAgregar(7,"Sprint 7",vdFechaInicio,vdFechaFin,28,"00",0,3,vdFechaCreacion,0,null);
        
        String sFormato;
        sFormato = "|%1$-4s|%2$-30s|%3$-30s|%4$-30s|%5$-15s|%6$-10s|%7$-10s|%8$-15s|%9$-30s|%10$-15s|%11$-30s|\n";
    	System.out.println("\n[SPRINTS]");
    	System.out.println("================================================================================================================================================================================================================================================");
        System.out.format(sFormato,"ID","Descripci�n","Fecha Inicio","Fecha Fin","Duraci�n D�as","Estado","% Avance","Usuario Crea","Fecha de Creaci�n","Usuario Modif","Fecha de Modificaci�n");
    	System.out.println("================================================================================================================================================================================================================================================");
    	for (clsSprint oSprint  : oSprintMant.sprints)
            System.out.format(sFormato,oSprint.get_iIDSprint(),oSprint.get_sDescripcion(),oSprint.get_dFechaInicio(),oSprint.get_dFechaFin(),oSprint.get_iDuracionDias(),oSprint.get_sEstado(),oSprint.get_dPorcentajeAvance(),oSprint.get_iIDUsuarioCreacion(),oSprint.get_dFechaCreacion(),oSprint.get_iIDUsuarioModificacion(),oSprint.get_dFechaModificacion());    		
    	System.out.println("================================================================================================================================================================================================================================================");
}
	
	
	@Test
    public void AgregaSprint(){
        System.out.println("");
        System.out.println("Agregar Sprint");
        System.out.println("==============");
        // Arrange
        int viIDSprint = 8;   
    	String vsDescripcion = "Sprint 8";
       	Calendar Cal = Calendar.getInstance();
        Cal.set(2012,4,9);//09/04/2012
        Date vdFechaInicio=Cal.getTime();
        Cal.set(2012,5,8);//08/05/2012
        Date vdFechaFin=Cal.getTime();     
    	int viDuracionDias = 29;
    	String vsEstado = "00";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
    	double vdPorcentajeAvance=0;
    	int viIDUsuarioCreacion = 4;
    	Cal.set(2012,3,7);//09/04/2012
        Date vdFechaCreacion=Cal.getTime();
        int viIDUsuarioModificacion=0;
		Date vdFechaModificacion=null;
        oSprintMant.pAgregar(viIDSprint,vsDescripcion,vdFechaInicio,vdFechaFin,viDuracionDias,vsEstado,vdPorcentajeAvance,viIDUsuarioCreacion,vdFechaCreacion,viIDUsuarioModificacion,vdFechaModificacion);    
        //Assert       
        clsSprint oSprint = oSprintMant.faBuscarPk(viIDSprint);
        assertNotNull(oSprint);
        assertEquals(viIDSprint,oSprint.get_iIDSprint());
        assertEquals(vsDescripcion,oSprint.get_sDescripcion());
        assertEquals(vdFechaInicio,oSprint.get_dFechaInicio());
        assertEquals(vdFechaFin,oSprint.get_dFechaFin());

        String sFormato;

        sFormato = "|%1$-4s|%2$-30s|%3$-30s|%4$-30s|%5$-15s|%6$-10s|%7$-10s|%8$-15s|%9$-30s|%10$-15s|%11$-30s|\n";
    	System.out.println("\n[SPRINTS]");
    	System.out.println("=========================================================================================================================================================================================================================================================");
        System.out.format(sFormato,"ID","Descripci�n","Fecha Inicio","Fecha Fin","Duraci�n D�as","Estado","% Avance","Usuario Crea","Fecha de Creaci�n","Usuario Modif","Fecha de Modificaci�n");
    	System.out.println("=========================================================================================================================================================================================================================================================");
    	for (clsSprint oSprintx  : oSprintMant.sprints)
            System.out.format(sFormato,oSprintx.get_iIDSprint(),oSprintx.get_sDescripcion(),oSprintx.get_dFechaInicio(),oSprintx.get_dFechaFin(),oSprintx.get_iDuracionDias(),oSprintx.get_sEstado(),oSprintx.get_dPorcentajeAvance(),oSprintx.get_iIDUsuarioCreacion(),oSprintx.get_dFechaCreacion(),oSprintx.get_iIDUsuarioModificacion(),oSprintx.get_dFechaModificacion());    		
    	System.out.println("=========================================================================================================================================================================================================================================================");

   }

	
	@Test
    public void EliminaSprint(){
		System.out.println("");
	    System.out.println("Elimina Sprint");
	    System.out.println("==============");
	    int viIDSprint2 = 3;
	    double vdPorcentajeAvance2=0;
	    oSprintMant.pEliminar(viIDSprint2,vdPorcentajeAvance2);  
	    oSprintMant.faBuscarPk(viIDSprint2);
	    assertNull(oSprintMant.faBuscarPk(viIDSprint2));
	    
	    String sFormato;
        sFormato = "|%1$-4s|%2$-30s|%3$-30s|%4$-30s|%5$-15s|%6$-10s|%7$-10s|%8$-15s|%9$-30s|%10$-15s|%11$-30s|\n";
    	System.out.println("\n[SPRINTS]");
    	System.out.println("=========================================================================================================================================================================================================================================================");
        System.out.format(sFormato,"ID","Descripci�n","Fecha Inicio","Fecha Fin","Duraci�n D�as","Estado","% Avance","Usuario Crea","Fecha de Creaci�n","Usuario Modif","Fecha de Modificaci�n");
    	System.out.println("=========================================================================================================================================================================================================================================================");
    	for (clsSprint oSprintx  : oSprintMant.sprints)
            System.out.format(sFormato,oSprintx.get_iIDSprint(),oSprintx.get_sDescripcion(),oSprintx.get_dFechaInicio(),oSprintx.get_dFechaFin(),oSprintx.get_iDuracionDias(),oSprintx.get_sEstado(),oSprintx.get_dPorcentajeAvance(),oSprintx.get_iIDUsuarioCreacion(),oSprintx.get_dFechaCreacion(),oSprintx.get_iIDUsuarioModificacion(),oSprintx.get_dFechaModificacion());    		
    	System.out.println("=========================================================================================================================================================================================================================================================");
  
	 	}
	
	@Test
    public void EditaSprint(){
		System.out.println("");
	    System.out.println("Edita Sprint");
	    System.out.println("============");
	    int viIDSprint2 = 2;
	    String vsDescripcion2 = "Sprint 2";
	    Calendar Cal = Calendar.getInstance();
	    Cal.set(2012,4,2);//02/04/2012
        Date vdFechaInicio2=Cal.getTime();
        Cal.set(2012,6,12);//12/05/2012
        Date vdFechaFin2=Cal.getTime();
        int viDuracionDias2 = 99;
	    String vsEstado2 = "01";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
    	double vdPorcentajeAvance2=20;
	    int viIDUsuarioCreacion2 = 3;
	    Cal.set(2012,4,9);//09/04/2012
        Date vdFechaCreacion2=Cal.getTime();
        Cal.set(2012,5,12);//12/05/2012
	    Date vdFechaModificacion2=Cal.getTime();
	    int viIDUsuarioModificacion2 = 5; 
	    oSprintMant.pEditar(viIDSprint2,vsDescripcion2,vdFechaInicio2,vdFechaFin2,viDuracionDias2,vsEstado2,vdPorcentajeAvance2,viIDUsuarioCreacion2,vdFechaCreacion2,viIDUsuarioModificacion2,vdFechaModificacion2);    
	    String sFormato;

        sFormato = "|%1$-4s|%2$-30s|%3$-30s|%4$-30s|%5$-15s|%6$-10s|%7$-10s|%8$-15s|%9$-30s|%10$-15s|%11$-30s|\n";
    	System.out.println("\n[SPRINTS]");
    	System.out.println("=========================================================================================================================================================================================================================================================");
        System.out.format(sFormato,"ID","Descripci�n","Fecha Inicio","Fecha Fin","Duraci�n D�as","Estado","% Avance","Usuario Crea","Fecha de Creaci�n","Usuario Modif","Fecha de Modificaci�n");
    	System.out.println("=========================================================================================================================================================================================================================================================");
    	for (clsSprint oSprintx  : oSprintMant.sprints)
            System.out.format(sFormato,oSprintx.get_iIDSprint(),oSprintx.get_sDescripcion(),oSprintx.get_dFechaInicio(),oSprintx.get_dFechaFin(),oSprintx.get_iDuracionDias(),oSprintx.get_sEstado(),oSprintx.get_dPorcentajeAvance(),oSprintx.get_iIDUsuarioCreacion(),oSprintx.get_dFechaCreacion(),oSprintx.get_iIDUsuarioModificacion(),oSprintx.get_dFechaModificacion());    		
    	System.out.println("=========================================================================================================================================================================================================================================================");

	}

	@Test
	public void AgregaPorcentaje(){
		System.out.println("");
		System.out.println("Agregar Sprint, debe de hacerlo con porcentaje de avance en cero");
		System.out.println("================================================================");
		// Arrange
		int viIDSprint = 7;   
		String vsDescripcion = "Sprint 7";
		System.out.println(viIDSprint);
		
		Calendar Cal = Calendar.getInstance();
		Cal.set(2012,4,9);
		Date vdFechaInicio=Cal.getTime();
    
		Cal.set(2012,5,8);
		Date vdFechaFin=Cal.getTime();
    
		int viDuracionDias = 22;
		System.out.println(viDuracionDias);
		String vsEstado = "00";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
		double vdPorcentajeAvance=20;
		System.out.println(vdPorcentajeAvance);
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
	    System.out.println("Edita Sprint, s�lo grabar� s� no es mayor a 100%");
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
	    System.out.println("Edita Sprint, s�lo grabar� s� las fechas son correctas");
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

	@Test
    public void SprintDuplicado(){
        System.out.println("");
        System.out.println("Agregar Sprint Duplicado");
        System.out.println("========================");
        // Arrange
        int viIDSprint = 3;   
    	String vsDescripcion = "Sprint 3";
       	Calendar Cal = Calendar.getInstance();
        Cal.set(2012,4,9);//09/04/2012
        Date vdFechaInicio=Cal.getTime();
        Cal.set(2012,5,8);//08/05/2012
        Date vdFechaFin=Cal.getTime();     
    	int viDuracionDias = 29;
    	String vsEstado = "00";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
    	double vdPorcentajeAvance=0;
    	int viIDUsuarioCreacion = 4;
    	Cal.set(2012,3,7);//09/04/2012
        Date vdFechaCreacion=Cal.getTime();
        int viIDUsuarioModificacion=0;
		Date vdFechaModificacion=null;
        oSprintMant.pAgregar(viIDSprint,vsDescripcion,vdFechaInicio,vdFechaFin,viDuracionDias,vsEstado,vdPorcentajeAvance,viIDUsuarioCreacion,vdFechaCreacion,viIDUsuarioModificacion,vdFechaModificacion);    
        //Assert       
        clsSprint oSprint = oSprintMant.faBuscarPk(viIDSprint);
        assertNotNull(oSprint);
        assertEquals(viIDSprint,oSprint.get_iIDSprint());
        assertEquals(vsDescripcion,oSprint.get_sDescripcion());
        assertEquals(vdFechaInicio,oSprint.get_dFechaInicio());
        assertEquals(vdFechaFin,oSprint.get_dFechaFin());

        String sFormato;

        sFormato = "|%1$-4s|%2$-30s|%3$-30s|%4$-30s|%5$-15s|%6$-10s|%7$-10s|%8$-15s|%9$-30s|%10$-15s|%11$-30s|\n";
    	System.out.println("\n[SPRINTS]");
    	System.out.println("=========================================================================================================================================================================================================================================================");
        System.out.format(sFormato,"ID","Descripci�n","Fecha Inicio","Fecha Fin","Duraci�n D�as","Estado","% Avance","Usuario Crea","Fecha de Creaci�n","Usuario Modif","Fecha de Modificaci�n");
    	System.out.println("=========================================================================================================================================================================================================================================================");
    	for (clsSprint oSprintx  : oSprintMant.sprints)
            System.out.format(sFormato,oSprintx.get_iIDSprint(),oSprintx.get_sDescripcion(),oSprintx.get_dFechaInicio(),oSprintx.get_dFechaFin(),oSprintx.get_iDuracionDias(),oSprintx.get_sEstado(),oSprintx.get_dPorcentajeAvance(),oSprintx.get_iIDUsuarioCreacion(),oSprintx.get_dFechaCreacion(),oSprintx.get_iIDUsuarioModificacion(),oSprintx.get_dFechaModificacion());    		
    	System.out.println("=========================================================================================================================================================================================================================================================");

   }
	
	
}