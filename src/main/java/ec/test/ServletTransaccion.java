package ec.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ServletTransaccion")
public class ServletTransaccion extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@EJB
	ServicioPersona miservicio;

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		Persona persona = new Persona();
		persona = new Persona();
		persona.setCedula("030122222");
		persona.setNombre("Asiri");
		persona.setApellido("Quishpi");
		persona.setFechaNacimiento(new Date());
		persona.setSexo(1);

		miservicio.insertar(persona);
		PrintWriter pw = response.getWriter();
		pw.println("--> insertado");

	}
}
