package pktest;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import pksource.clsProyecto;
import pksource.clsProyectoMant;
import pksource.clsSprint;
import pksource.clsSprintMant;

public class clsTestSprintMant {
	
	@Test
    public void AgregaSprint(){
        System.out.println("");
        System.out.println("Agregar Sprint");
        System.out.println("================");
        // Arrange
        int viIDSprint = 1;
    	String vsDescripcion = "Sprint 1";
    	String vdFechaInicio = "09/04/2012";
    	String vdFechaFin = "04/05/2012";
    	int viDuracionDias = 20;
    	String vsEstado = "00";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
    	double vdPorcentajeAvance=0;
    	int viIDUsuarioCreacion = 3;
    	String vdFechaCreacion = "09/04/2012";
    	int viIDUsuarioModificacion = 3; 
    	String vdFechaModificacion = "";
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
	    String vdFechaInicio = "07/05/2012";
	    String vdFechaFin = "01/06/2012";
	    int viDuracionDias = 20;
	    String vsEstado = "00";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
    	double vdPorcentajeAvance=0;
	    int viIDUsuarioCreacion = 3;
	    String vdFechaCreacion = "09/04/2012";
	    int viIDUsuarioModificacion = 3; 
	    String vdFechaModificacion = "";
	    
	    int viIDSprint2 = 3;
	    String vsDescripcion2 = "Sprint 3";
	    String vdFechaInicio2 = "07/05/2012";
	    String vdFechaFin2 = "01/06/2012";
	    int viDuracionDias2 = 20;
	    String vsEstado2 = "00";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
    	double vdPorcentajeAvance2=0;
	    int viIDUsuarioCreacion2 = 3;
	    String vdFechaCreacion2 = "09/04/2012";
	    int viIDUsuarioModificacion2 = 3; 
	    String vdFechaModificacion2 = "";
	    	
	    clsSprintMant oSprintMant = new clsSprintMant();
	    // Act
	    oSprintMant.pAgregar(viIDSprint,vsDescripcion,vdFechaInicio,vdFechaFin,viDuracionDias,vsEstado,vdPorcentajeAvance,viIDUsuarioCreacion,vdFechaCreacion,viIDUsuarioModificacion,vdFechaModificacion); 
	    oSprintMant.pAgregar(viIDSprint2,vsDescripcion2,vdFechaInicio2,vdFechaFin2,viDuracionDias2,vsEstado2,vdPorcentajeAvance2,viIDUsuarioCreacion2,vdFechaCreacion2,viIDUsuarioModificacion2,vdFechaModificacion2);    
	    //Assert
	    oSprintMant.pEliminar(viIDSprint);  
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
	    String vdFechaInicio = "07/05/2012";
	    String vdFechaFin = "01/06/2012";
	    int viDuracionDias = 20;
	    String vsEstado = "00";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
    	double vdPorcentajeAvance=0;
	    int viIDUsuarioCreacion = 3;
	    String vdFechaCreacion = "09/04/2012";
	    int viIDUsuarioModificacion = 3; 
	    String vdFechaModificacion = "";
	    //
	    int viIDSprint2 = 3;
	    String vsDescripcion2 = "Sprint 3";
	    String vdFechaInicio2 = "07/05/2012";
	    String vdFechaFin2 = "01/06/2012";
	    int viDuracionDias2 = 20;
	    String vsEstado2 = "00";   //00:Creado//01:Asignado//02:En Progreso//03:Finalizado
    	double vdPorcentajeAvance2=0;
	    int viIDUsuarioCreacion2 = 3;
	    String vdFechaCreacion2 = "09/04/2012";
	    int viIDUsuarioModificacion2 = 3; 
	    String vdFechaModificacion2 = "";
	    	
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

