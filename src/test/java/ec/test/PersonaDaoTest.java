package ec.test;

import java.util.Date;

import javax.ejb.EJB;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class PersonaDaoTest {

	@EJB
	ServicioPersona miservicio;
	
	private Persona persona;

	@Before
	public void setUp() throws Exception {
		persona = new Persona();
		persona.setCedula("0301232342");
		persona.setNombre("Juyana");
		persona.setApellido("Quishpi");
		persona.setFechaNacimiento(new Date());
		persona.setSexo(0);
		
		ServletTransaccion ss=new ServletTransaccion();
		ss.init();
		
		System.out.println("--> before: ");
		

	}

	@Test
	public void testCreate() throws Exception {

		System.out.println("dao --> " + miservicio);
		miservicio.insertar(persona);
		Assert.assertNotNull(persona.getId());
		System.out.println(persona);
	}

}
