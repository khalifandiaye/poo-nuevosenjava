import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

import org.junit.Test;


public class ToDoAssingTest {
	
	public ToDoAssingTest() {
    }
	
	@Test
    public void ToDoToDashboard(){
		
        String codProj = "PC1";
        String desProj = "Scrum - Nuevos en Java - PC1";
        String codTask = "1.2";
        String desTask = "Registrar Historias de Usuario";
        String rolTask = "Product Owner";
        String namTask = "Evelyn Garcia";		
        String comTask = "Como Product Owner requiero registrar mis historias de usuario, para que el equipo pueda planificar los sprints (iteraciones)";
        String endTask = "24/03/2012";
        
        ToDoToAssing ToDashBoard = new ToDoToAssing(codProj, desProj, codTask, desTask, rolTask, namTask, comTask, endTask);  
        
        assertNotNull(codProj);
        assertNotNull(codTask);
        assertNotNull(namTask);
        assertTrue("PC1".equals(codProj));
        System.out.println("Código de Proyecto: " + codProj);
        System.out.println("Nombre de Proyecto: " + desProj);
        System.out.println("Código de Tarea: " + codTask);
        System.out.println("Descripción de Tarea: " + desTask);
        System.out.println("Rol en Proyecto: " + rolTask);
        System.out.println("Nombre del User: " + namTask);
        System.out.println("Comentario Tarea: " + comTask);
        System.out.println("Fecha Tarea: " + endTask);        
        assertTrue("Scrum - Nuevos en Java - PC1".equals(desProj));
        assertTrue("1.2".equals(codTask));
        assertTrue("Registrar Historias de Usuario".equals(desTask));
        assertTrue("Product Owner".equals(rolTask));
        assertTrue("Evelyn Garcia".equals(namTask));
        assertTrue("Como Product Owner requiero registrar mis historias de usuario, para que el equipo pueda planificar los sprints (iteraciones)".equals(comTask));
        assertTrue("24/03/2012".equals(endTask));
	}
}
