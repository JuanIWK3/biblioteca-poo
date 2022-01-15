package Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import Model.Estudante;
import Tools.Dbconnection;

public class EstudanteDAO {
  public static void adicionarEstudante(Estudante estudante) {
    try (Connection conn = Dbconnection.getConnection()) {
      String sql = "INSERT INTO estudante(nome, classe)" +
          "VALUES (?, ?)";

      PreparedStatement stmt = conn.prepareStatement(sql);

      stmt.setString(1, estudante.getNome());
      stmt.setString(2, estudante.getClasse());

      stmt.execute();

      System.out.println("Estudante adicionado");

    } catch (Exception e) {
      e.printStackTrace();
    }

    Menu.Menu.listarOpcoes();
  }

  public static void listarEstudantes() {
    try (Connection conn = Dbconnection.getConnection()) {
      String sql = "SELECT * FROM estudante";
      PreparedStatement stmt = conn.prepareStatement(sql);
      ResultSet rs = stmt.executeQuery();

      while (rs.next()) {
        int id = rs.getInt(1);
        String nome = rs.getString(2);
        String classe = rs.getString(3);

        System.out.format("%s, %s, %s", id, nome, classe);
      }
      stmt.execute();

    } catch (Exception e) {
      e.printStackTrace();
    }

    Menu.Menu.listarOpcoes();
  }

  public static void atualizarEstudante(int estudanteId, Estudante estudante) {
    try (Connection conn = Dbconnection.getConnection()) {
      String sql = "UPDATE estudante SET classe = '" + estudante.getClasse() + "' WHERE ID = " + estudanteId + "'";
      PreparedStatement stmt = conn.prepareStatement(sql);

      stmt.execute();

    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
