package gestionscrum.AltaUsuario;


import java.util.ArrayList;

public class Usuario2 {
	
	    public ArrayList<Usuario> usuarios;

	    public Usuario2(){
	        // Creacion de la coleccion de usuarios
	        usuarios = new ArrayList<Usuario>();
	    }

	    public void registrarUsuario(String email, String fname, String lname, String pass) {
	        if (noExisteEmail(email)) {
	            Usuario nuevoUsuario = new Usuario(email, fname, lname, pass);
				usuarios.add(nuevoUsuario);
				}
	            
	        }
	    

	    public Usuario buscarUsuario(String email) {
	        for( Usuario usuario  : usuarios)
	            if (usuario.get_email().equals(email))
	                return usuario;
	        return null;
	    }

	    public int getTotalUsuarios() {
	        return usuarios.size();
	    }

	    private boolean noExisteEmail(String email) {
	        return buscarUsuario(email) == null;
	    }


	}


