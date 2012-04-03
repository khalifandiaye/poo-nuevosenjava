package gestionscrum.AltaUsuario;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestUsuarioMant {
	@Test
    public void AgregaReg(){
        System.out.println("");
        System.out.println("AgregaReg");
        System.out.println("=========");
        // Arrange
        String email = "juan.perez@hotmail.com";
        String fname = "Juan";
        String lname = "Perez";
        String pass = "Passw0rd";
        String pass2 = "Passw0rd";
        UsuarioMant Mant = new UsuarioMant();
        // Act
        Mant.AgregarUsuario(email, fname, lname, pass, pass2);    
        //Assert
        Usuario usuario = Mant.buscarUsuario(email);        
        assertNotNull(usuario);
        assertEquals(email, usuario.get_email());
        assertEquals(fname, usuario.get_fname());
        assertEquals(lname, usuario.get_lname());
        assertEquals(pass, usuario.get_pass());
        System.out.println(usuario.get_email());
        System.out.println(usuario.get_fname());
        System.out.println(usuario.get_lname());
        System.out.println(usuario.get_pass());
    }
	
	@Test
    public void EliminaReg(){
        System.out.println("");
        System.out.println("EliminaReg");
        System.out.println("==========");
        // Arrange
        String email = "juan.perez@hotmail.com";
        String fname = "Juan";
        String lname = "Perez";
        String pass = "Passw0rd";
        String pass2 = "Passw0rd";
        String n_email = "n_juan.perez@hotmail.com";
        String n_fname = "n_Juan";
        String n_lname = "n_Perez";
        String n_pass = "n_Passw0rd";
        String n_pass2 = "n_Passw0rd";
        UsuarioMant Mant = new UsuarioMant();
        // Act
        Mant.AgregarUsuario(email, fname, lname, pass, pass2);    
        Mant.AgregarUsuario(n_email, n_fname, n_lname, n_pass, n_pass2);    
        Mant.EliminarUsuario(email);    
        //Assert
        Usuario usuario = Mant.buscarUsuario(email);        
        assertNull(usuario); // no encuentra elemento borrado
        usuario = Mant.buscarUsuario(n_email);        
        assertNotNull(usuario); // encuentra elemento restante
        assertEquals(n_email, usuario.get_email()); // verifica que el registro restante sea el correcto 
        assertEquals(n_fname, usuario.get_fname()); // verifica que el registro restante sea el correcto
        assertEquals(n_lname, usuario.get_lname()); // verifica que el registro restante sea el correcto
        assertEquals(n_pass, usuario.get_pass()); // verifica que el registro restante sea el correcto
        System.out.println(usuario.get_email());
        System.out.println(usuario.get_fname());
        System.out.println(usuario.get_lname());
        System.out.println(usuario.get_pass());
    }

    @Test
    public void EditaReg(){
        System.out.println("");
        System.out.println("EditaReg");
        System.out.println("========");
        // Arrange
        String email = "juan.perez@hotmail.com";
        String fname = "Juan";
        String lname = "Perez";
        String pass = "Passw0rd";
        String pass2 = "Passw0rd";
        String n_email = "juan.perez@hotmail.com";
        String n_fname = "n_Juan";
        String n_lname = "n_Perez";
        String n_pass = "n_Passw0rd";
        String n_pass2 = "n_Passw0rd";

        UsuarioMant Mant = new UsuarioMant();
        // Act
        Mant.AgregarUsuario(email, fname, lname, pass, pass2);    
        Mant.EditarUsuario(n_email, n_fname, n_lname, n_pass, n_pass2);    
        //Assert
        Usuario usuario = Mant.buscarUsuario(email);        
        assertNotNull(usuario); // existe el registro
        assertEquals(1, Mant.CantArreglo()); // existe un solo registro
        assertEquals(n_email, usuario.get_email()); // verifica que el valor nuevo se haya almacenado
        assertEquals(n_fname, usuario.get_fname()); // verifica que el valor nuevo se haya almacenado
        assertEquals(n_lname, usuario.get_lname()); // verifica que el valor nuevo se haya almacenado
        assertEquals(n_pass, usuario.get_pass()); // verifica que el valor nuevo se haya almacenado
        System.out.println(usuario.get_email()); // imprime los valores grabados
        System.out.println(usuario.get_fname()); // imprime los valores grabados
        System.out.println(usuario.get_lname()); // imprime los valores grabados
        System.out.println(usuario.get_pass()); // imprime los valores grabados
    }

	@Test
    public void AgregaRegErrorCorreo(){
        System.out.println("");
        System.out.println("AgregaRegErrorCorreo");
        System.out.println("====================");        
        // Arrange
        String email = "juan.perez.hotmail.com";
        String fname = "Juan";
        String lname = "Perez";
        String pass = "Passw0rd";
        String pass2 = "Passw0rd";
        UsuarioMant Mant = new UsuarioMant();
        // Act
        Mant.AgregarUsuario(email, fname, lname, pass, pass2);    
        //Assert
        Usuario usuario = Mant.buscarUsuario(email);        
        assertNull(usuario); //no grabo el usuario
    }

	@Test
    public void AgregaRegDuplicado(){
        System.out.println("");
        System.out.println("AgregaRegDuplicado");
        System.out.println("==================");
        // Arrange
        String email = "juan.perez@hotmail.com";
        String fname = "Juan";
        String lname = "Perez";
        String pass = "Passw0rd";
        String pass2 = "Passw0rd";
        UsuarioMant Mant = new UsuarioMant();
        // Act
        Mant.AgregarUsuario(email, fname, lname, pass, pass2);    
        Mant.AgregarUsuario(email, fname, lname, pass, pass2);    
        //Assert
        assertEquals(1, Mant.CantArreglo());
    }	

	@Test
    public void AgregaRegPassDif(){
        System.out.println("");
        System.out.println("AgregaRegPassDif");
        System.out.println("================");        
        // Arrange
        String email = "juan.perez@hotmail.com";
        String fname = "Juan";
        String lname = "Perez";
        String pass = "Passw0rd";
        String pass2 = "password";
        UsuarioMant Mant = new UsuarioMant();
        // Act
        Mant.AgregarUsuario(email, fname, lname, pass, pass2);    
        //Assert
        Usuario usuario = Mant.buscarUsuario(email);        
        assertNull(usuario); //no grabo el usuario
    }
    public void AgregaRegPassCorto(){
        System.out.println("");
        System.out.println("AgregaRegPassDif");
        System.out.println("================");        
        // Arrange
        String email = "juan.perez@hotmail.com";
        String fname = "Juan";
        String lname = "Perez";
        String pass = "Pass";
        String pass2 = "Pass";
        UsuarioMant Mant = new UsuarioMant();
        // Act
        Mant.AgregarUsuario(email, fname, lname, pass, pass2);    
        //Assert
        Usuario usuario = Mant.buscarUsuario(email);        
        assertNull(usuario); //no grabo el usuario
    }

}	
