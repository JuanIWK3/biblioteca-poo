package Model.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import Model.Livro;
import Tools.Dbconnection;

public class LivroDAO {

  public static void adicionarLivro(Livro livro) {
    try (Connection conn = Dbconnection.getConnection()) {

      String sql = "INSERT INTO livro(titulo, autor, descricao, genero, ano_publicacao)" +
          "VALUES (?, ?, ?, ?, ?);";

      PreparedStatement stmt = conn.prepareStatement(sql);

      stmt.setString(1, livro.getTitulo());
      stmt.setString(2, livro.getAutor());
      stmt.setString(3, livro.getDescricao());
      stmt.setString(4, livro.getGenero());
      stmt.setString(5, livro.getAnoPublicacao());

      stmt.execute();

    } catch (Exception e) {
      e.printStackTrace();
    }

    Menu.Menu.listarOpcoes();
  }

  public static void listarLivros() {
    try (Connection conn = Dbconnection.getConnection()) {
      String sql = "SELECT * FROM livro";

      PreparedStatement stmt = conn.prepareStatement(sql);

      ResultSet rs = stmt.executeQuery();

      while (rs.next()) {
        int id = rs.getInt("id");
        String titulo = rs.getString("titulo");
        String autor = rs.getString("autor");
        String descricao = rs.getString("descricao");
        String genero = rs.getString("genero");
        String anoPublicacao = rs.getString("ano_publicacao");

        System.out.println();
        System.out.println("Id: " + id);
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Descricao: " + descricao);
        System.out.println("Genero: " + genero);
        System.out.println("Ano de publicacao: " + anoPublicacao);
        System.out.println();
      }

      stmt.execute();
    } catch (SQLException e) {
      e.printStackTrace();
    }

    Menu.Menu.listarOpcoes();
  }

  public static void removerLivro(int id) {
    try (Connection conn = Dbconnection.getConnection()) {
      String sql = "DELETE FROM livro WHERE id = " + id;

      PreparedStatement stmt = conn.prepareStatement(sql);

      stmt.execute();

    } catch (SQLException e) {
      e.printStackTrace();
    }

  }

  public static void atualizarLivro(int opcao, int livroId, Livro livro) {
    if (opcao == 1) {
      try (Connection conn = Dbconnection.getConnection()) {
        String sql = "UPDATE livro SET titulo = '" + livro.getTitulo() + "' WHERE ID = " + livroId + "'";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.execute();

      } catch (Exception e) {
        e.printStackTrace();
      }
    } else if (opcao == 2) {
      try (Connection conn = Dbconnection.getConnection()) {
        String sql = "UPDATE livro SET autor = '" + livro.getAutor() + "' WHERE ID = " + livroId + "'";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.execute();

      } catch (Exception e) {
        e.printStackTrace();
      }
    } else if (opcao == 3) {
      try (Connection conn = Dbconnection.getConnection()) {
        String sql = "UPDATE livro SET descricao = '" + livro.getDescricao() + "' WHERE ID = " + livroId + "'";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.execute();

      } catch (Exception e) {
        e.printStackTrace();
      }
    } else if (opcao == 2) {
      try (Connection conn = Dbconnection.getConnection()) {
        String sql = "UPDATE livro SET genero = '" + livro.getGenero() + "' WHERE ID = " + livroId + "'";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.execute();

      } catch (Exception e) {
        e.printStackTrace();
      }
    } else if (opcao == 4) {
      try (Connection conn = Dbconnection.getConnection()) {
        String sql = "UPDATE livro SET ano_publicacao = '" + livro.getAnoPublicacao() + "' WHERE ID = " + livroId + "'";
        PreparedStatement stmt = conn.prepareStatement(sql);

        stmt.execute();

      } catch (Exception e) {
        e.printStackTrace();
      }
    }
    Menu.Menu.listarOpcoes();
  }
}
