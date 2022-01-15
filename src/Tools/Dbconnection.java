package Tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Dbconnection {

  public static Connection getConnection() throws ClassNotFoundException {
    Connection c = null;
    try {
      Class.forName("org.postgresql.Driver");
      c = DriverManager
          .getConnection("jdbc:postgresql://localhost:6000/bibliojava",
              "postgres", "admin");
      return c;
    } catch (SQLException ex) {
      System.err.println("Não foi possivel estabelecer a conexão com o banco");
      ex.printStackTrace();
      return null;
    }
  }

  public static void CreateTables() throws SQLException {
    try {
      Connection c = getConnection();
      Statement stmt = c.createStatement();
      String sql = "CREATE TABLE livro " +
          "(ID INT PRIMARY KEY         NOT NULL," +
          " titulo           CHAR(30)  NOT NULL," +
          " autor            CHAR(30)  NOT NULL," +
          " descricao        CHAR(50)  NOT NULL," +
          " genero           CHAR(20)  NOT NULL);" +

          "CREATE TABLE bibliotecario " +
          "(ID SERIAL PRIMARY KEY  NOT NULL," +
          " nome             CHAR(50)   NOT NULL," +
          " ra               CHAR(20)   NOT NULL," +
          " senha            CHAR(30)   NOT NULL," +
          " genero           CHAR(20)  NOT NULL);" +

          "CREATE TABLE estudante " +
          "(ID SERIAL PRIMARY KEY  NOT NULL," +
          " nome             CHAR(50)   NOT NULL," +
          " classe           CHAR(10)   NOT NULL);" +

          "CREATE TABLE livros_emprestados (" +
          " livro_id          INT REFERENCES livro (ID) ON UPDATE CASCADE ON DELETE CASCADE NOT NULL," +
          " estudante_id      INT REFERENCES estudante (ID) ON UPDATE CASCADE," +
          " data_emprestimo   DATE      NOT NULL," +
          " data_devolucao    DATE      NOT NULL," +
          " CONSTRAINT livros_emprestados_pkey PRIMARY KEY (livro_id, estudante_id))";

      stmt.executeUpdate(sql);
      stmt.close();
      System.out.println("Tables created");
    } catch (Exception e) {
      System.err.println(e.getClass().getName() + ": " + e.getMessage());
    }
  }

  public static void DropTables() throws SQLException {
    try {
      Connection c = getConnection();
      Statement stmt = c.createStatement();
      String sql = "DROP SCHEMA public CASCADE; CREATE SCHEMA public; GRANT ALL ON SCHEMA public TO postgres; GRANT ALL ON SCHEMA public TO public;";
      stmt.executeUpdate(sql);
      stmt.close();
      System.out.println("Tables dropped");
    } catch (Exception e) {
      System.err.println(e.getClass().getName() + ": " + e.getMessage());
    }
  }
}