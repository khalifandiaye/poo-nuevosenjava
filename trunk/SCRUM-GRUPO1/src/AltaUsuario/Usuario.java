package usuario;

public class Usuario {
    private String email; // Correo/Identificador
    private String fname; // Nombre
    private String lname; // Apellido
    private String pass; // Contraseña

    public Usuario(String email, String fname,String lname, String pass) 
    	{
        this.email = email;
        this.fname = fname;
        this.lname = lname;
        this.pass = pass;
        }
    public String get_email() 
    	{
        	return email;
    	}
    public String get_fname() 
    	{
        	return fname;
    	}
    public String get_lname() 
    	{
        	return lname;
    	}
    public String get_pass() 
    	{
        	return pass;
    	}
    
}
