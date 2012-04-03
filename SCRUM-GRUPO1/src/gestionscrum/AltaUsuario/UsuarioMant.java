package gestionscrum.AltaUsuario;

import java.util.ArrayList;

public class UsuarioMant {
	
	    public ArrayList<Usuario> usuarios;

	    public int CantArreglo() {
	        return usuarios.size();
	    }

	    public UsuarioMant(){
	        usuarios = new ArrayList<Usuario>();
	    }

	    public boolean AgregarUsuario(String email, String fname, String lname, String pass, String pass2) {
	        if (buscarUsuario(email) == null && validaCorreo(email) != -1 && validaCampos(email,fname,lname,pass,pass2) && validaPassword(pass,pass2)) {
	            Usuario nuevoUsuario = new Usuario(email, fname, lname, pass);
				usuarios.add(nuevoUsuario);				
				System.out.println("Agregado");
	        	return true;
	        	}
	        else
	        	System.out.println("No agregado");
	           return false; 
	        	}

	    public boolean EliminarUsuario(String email) {
	        if (buscarUsuario(email) != null) {
				usuarios.remove(BuscaIndice(email));				
				System.out.println("Eliminado");
	        	return true;
	        	}
	        else
	        	System.out.println("No Eliminado");
	           return false; 
	        	}
	    
	    public boolean EditarUsuario(String email, String fname, String lname, String pass, String pass2) {
	        if (buscarUsuario(email) != null && validaCorreo(email) != -1 && validaCampos(email,fname,lname,pass,pass2) && validaPassword(pass,pass2)) {
	    	    Usuario edUsuario = new Usuario(email, fname, lname, pass);
				usuarios.set(BuscaIndice(email),edUsuario);				
				System.out.println("Editado");
	        	return true;
	        	}
	        else
	        	System.out.println("No Editado");
	           return false; 
	        	}

	    public int validaCorreo(String email)
	    {
	    	int pos = email.indexOf('@');
			return pos; 	
	    }
	    
	    public boolean validaCampos(String email, String fname, String lname, String pass, String pass2)
	    {
	    	if (email == "" || fname == "" || lname == "" || pass == "" || pass2 == "")
	    		return false;
	    	return true;
	    }
	    
	    public boolean validaPassword(String pass, String pass2)
	    {
	    	if (pass == pass2 && pass.length() >= 8)
	    		return true;
	    	return false;
	    }

	    public int BuscaIndice(String email) {
	    	int indice=0;
	    	for( Usuario usuario  : usuarios)
	    	{
	    		indice = indice++;
				if (usuario.get_email().equals(email))
	                return indice;	    		
	    	}
	    	return -1;
	    }
	    
	    public Usuario buscarUsuario(String email) {
	        for( Usuario usuario  : usuarios)
	            if (usuario.get_email().equals(email))
	                return usuario;
	        return null;
	    }


	}