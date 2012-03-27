package test;

import static org.junit.Assert.*;

import org.junit.Test;

import usuario.Usuario;
import usuario.Usuario2;


public class TestUsuario2 {
	@Test
    public void NormalReg(){
        System.out.println("Administrador de usuarios debe registrar un usuario con email, nombre, apellido y clave");
        // Arrange
        String email = "juan.valdez@saviaperu.com";
        String fname = "Juan";
        String lname = "Valdez";
        String pass = "Passw0rd";
        Usuario2 adm = new Usuario2();
        // Act
        adm.registrarUsuario(email, fname, lname, pass);    
        //Assert
        Usuario usuario = adm.buscarUsuario(email);
        assertNotNull(usuario);
        assertEquals(email, usuario.get_email());
        assertEquals(fname, usuario.get_fname());
        assertEquals(lname, usuario.get_lname());
        assertEquals(pass, usuario.get_pass());
    }
	 @Test
	    public void DuplicatedReg(){
	        System.out.println("Administrador de usuarios debe validar duplicidad de email de usuario");
	        // Arrange
	        String email = "juan.valdez@saviaperu.com";
	        String fname = "Juan";
	        String lname = "Valdez";
	        String pass = "Passw0rd";
	        Usuario2 adm = new Usuario2();
	        // Act
	        adm.registrarUsuario(email, fname, lname, pass);    
	        adm.registrarUsuario(email, fname, lname, pass);    
	        //Assert
	        int totalUsuariosRetornado = adm.getTotalUsuarios();
	        int totalUsuarioEsperado = 1;
	        assertEquals(totalUsuarioEsperado, totalUsuariosRetornado);
	    }
}	
