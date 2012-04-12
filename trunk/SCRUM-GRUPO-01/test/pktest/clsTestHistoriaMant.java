package pktest;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.Calendar;

import org.junit.Before;
import org.junit.Test;

import pksource.clsHistoria;
import pksource.clsHistoriaMant;
import pksource.clsProyectoMant;

public class clsTestHistoriaMant {

	clsHistoriaMant adm = new clsHistoriaMant();
	int iIDhistoria;
	int iIdProducto;
	String vDescripcion;
	int iOrdenPrioridadEstimada;
	int iOrdenPrioridadReal;
	String cEstado;
	int iDuracionDias;
	float fCosto;
	Date dFechaCreacion;
	int iIDUsuarioCreacion;
	Date dFechaModificacion;
	int iIDUsuarioModificacion;
	
	clsProyectoMant oProyectoMant = new clsProyectoMant();
	Calendar c1 = Calendar.getInstance();
	java.util.Date Fecha = c1.getTime();
	
	@Before
	public void Carga() {		
		
		// Registro 1
		adm.pRegistrarHistoria(1, 1, "Requerimiento 1", 1, 1, "A", 5, 0f,Fecha, 1, Fecha, 1);
		// Registro 2
		adm.pRegistrarHistoria(2, 1, "Requerimiento 2", 2, 2, "A", 10, 0f,Fecha, 1, Fecha, 1);
		// Registro 3
		adm.pRegistrarHistoria(3, 1, "Requerimiento 3", 3, 3, "P", 15, 0f,Fecha, 1, Fecha, 1);

		oProyectoMant.pAgregar(1, "GESTION DE PROVEEDORES", "WONG",
				"03/03/2012", "03/03/2012", 1, 1);
		oProyectoMant.pAgregar(2, "MODULO DE MANTENIMIENTO", "UPC",
				"03/03/2012", "03/03/2012", 1, 1);
		oProyectoMant.pAgregar(3, "CONTROL DE VISITAS", "SARITA COLONIA",
				"03/03/2012", "03/03/2012", 1, 1);
	}

	@Test
	public void RegistrarHistoriaConIDProductoInexistente() {
		System.out.println("Registro de Historia de Usuario");

		// Registro 4
		iIDhistoria = 4;
		iIdProducto = 4;
		vDescripcion="Requerimiento 4";
		iOrdenPrioridadEstimada = 1;
		iOrdenPrioridadReal = 3;
		cEstado = "A";
		iDuracionDias = 5;
		fCosto = 12.00f;
		dFechaCreacion=Fecha;
		iIDUsuarioCreacion=1;
		dFechaModificacion=Fecha;
		iIDUsuarioModificacion=1;

		// Registra, valida que no exista y que se hayan ingresado los datos
		// necesarios.
		if (!oProyectoMant.faBuscarPk(iIdProducto).equals(null)) {
			assertTrue(adm.pRegistrarHistoria(iIDhistoria, iIdProducto,vDescripcion,
					iOrdenPrioridadEstimada, iOrdenPrioridadReal, cEstado,
					iDuracionDias, fCosto,dFechaCreacion,iIDUsuarioCreacion,dFechaModificacion,iIDUsuarioModificacion));
		} else {
			System.out.println("Producto no existe.");
		}

		// adm.printHistoriaUsuario();
	}

	@Test
	public void BuscarHistoria() {
		System.out.println("Busqueda de Historia de Usuario");

		// Buscar un registro
		clsHistoria historia = adm.buscarHistoria(0001);
		assertNotNull(historia);
		System.out.println("Historia encontrada con los siguientes datos: ");
		System.out.println("Codigo: " + historia.getiIDhistoria());
		System.out.println("ID Producto: " + historia.getiIDProducto());
		System.out.println("IDOrdenPrioridadEstimada: "
				+ historia.getiOrdenPrioridadEstimada());
		System.out.println("IDOrdenPrioridadReal: "
				+ historia.getiOrdenPrioridadReal());
		System.out.println("Estado: " + historia.getcEstado());
		System.out.println("Costo : " + historia.getfCosto());
	}

	@Test
	public void ActualizarHistoria() {

		System.out.println("Actualizacion de Historia de Usuario");

		adm.printHistoriaUsuario();

		// historia a actualizar
		iIDhistoria = 0002;
		iIdProducto = 0001;
		vDescripcion="Requerimiento 4";
		iOrdenPrioridadEstimada = 1;
		iOrdenPrioridadReal = 3;
		cEstado = "E";
		iDuracionDias = 5;
		fCosto = 12;
		dFechaCreacion=Fecha;
		iIDUsuarioCreacion=1;
		dFechaModificacion=Fecha;
		iIDUsuarioModificacion=1;


		assertTrue(adm.actualizarHistoriaUsuario(iIDhistoria, iIdProducto,vDescripcion,
				iOrdenPrioridadEstimada, iOrdenPrioridadReal, cEstado,
				iDuracionDias, fCosto,dFechaCreacion,iIDUsuarioCreacion,dFechaModificacion,iIDUsuarioModificacion));

		System.out.println("Despues de Actualización:");

		adm.printHistoriaUsuario();
	}

	@Test
	public void EliminarHistoriaUsuario() {
		System.out.println("Eliminación de Historia de Usuario");

		adm.printHistoriaUsuario();

		assertTrue(adm.eliminarHistoriaUsuario(0003));

		System.out.println("Despues de la Eliminación:");

		adm.printHistoriaUsuario();
	}

}
