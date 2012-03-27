package gestionscrum.AsignacionTareas;

import java.util.ArrayList;


public class ToDoToAssing {
	
	private String codProj;
	private String desProj;
	private String codTask;
	private String desTask;
	private String rolTask;
	private String namTask;		
	private String comTask;
	private String endTask;
	
//	private ArrayList<ToDoToAssing> ToDashBoard;
	
	public ToDoToAssing(String codProj, String desProj, String codTask, String desTask, String rolTask, String namTask, String comTask, String endTask){
		
		this.codProj = codProj;
		this.desProj = desProj;
		this.codTask = codTask;
		this.desTask = desTask;
		this.rolTask = rolTask;
		this.namTask = namTask;		
		this.comTask = comTask;
		this.endTask = endTask;
    }

	public String getCodProj() {
        return codProj;
    }
	
	public String getDesProj() {
        return desProj;
    }
	
	public String getCodTask() {
        return codTask;
    }
	
	public String getDesTask() {
        return desTask;
    }
	
	public String getRolTask() {
        return rolTask;
    }
	
	public String getNamTask() {
        return namTask;
    }
	
	public String getComTask() {
        return comTask;
    }
	
	public String getNamTaskd() {
        return endTask;
	
}
}