package Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import Tools.Dbconnection;
import oracle.net.aso.b;

public class LivroEmprestadoDAO {
  public static void emprestarLivro(int livroId, int estudanteId, String dataEmprestimo, String dataDevolucao) {
    try (Connection conn = Dbconnection.getConnection()) {
      String sql = "INSERT INTO livros_emprestados(?, ?, ?, ?";

      PreparedStatement stmt = conn.prepareStatement(sql);

      stmt.setInt(1, livroId);
      stmt.setInt(2, estudanteId);
      stmt.setString(3, dataEmprestimo);
      stmt.setString(4, dataDevolucao);

      stmt.execute();

    } catch (SQLException e) {
      e.printStackTrace();
    }

    Menu.Menu.listarOpcoes();
  }
}
