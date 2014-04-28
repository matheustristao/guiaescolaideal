package br.com.mdsgpp.guiaescolaideal.model.teste;

import static org.junit.Assert.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.dao.ConnectionFactory;
import br.com.mdsgpp.guiaescolaideal.dao.EquipamentoDAO;

public class TesteRapido {

	@Test
	public void test() throws SQLException {
		Connection con = new ConnectionFactory().getConnection();
		EquipamentoDAO dao = new EquipamentoDAO(con);
		
		System.out.println(dao.pesquisarPorID(2).getAparelho());
		
		con.close();
	}

}
