package br.com.caelum.mvc.logica;

//import java.util.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import br.com.caelum.servlet.dao.*;
//mport br.com.caelum.servlet.dao.modelo.*;
import java.sql.Connection;

public class ListaContatosLogic implements Logica {
	public String executa(HttpServletRequest req, HttpServletResponse res) throws Exception {
		Connection connection = (Connection) req.getAttribute("conexao");
		new ContatoDao(connection).getLista();
		
		return "lista-contatos.jsp";
	}
}