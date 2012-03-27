package test;

import static org.junit.Assert.*;

import org.junit.Test;

import usuario.Usuario;

public class TestUsuario {
	@Test
    public void usuarioDebeCrearseConDniNombreyClave(){
        System.out.println("Usuario debe crearse con DNI, Nombre y Clave");

        // Arrange
        // Preparar los datos de prueba
        String email = "juan.valdez@saviaperu.com";
        String fname = "Juan";
        String lname = "Valdez";
        String pass = "Passw0rd";

        // Act
        // Ejecutar el metodo a probar
        Usuario usuario = new Usuario(email,fname,lname,pass);

        // Assert
        // Comprobar que el el resultado esperado es igual al retornado
        assertNotNull(usuario);
        assertEquals(email, usuario.get_email());
        assertEquals(fname, usuario.get_fname());
        assertEquals(lname, usuario.get_lname());
        assertEquals(pass, usuario.get_pass());
    }
	
}
