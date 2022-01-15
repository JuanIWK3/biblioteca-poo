package Menu;

import java.sql.Connection;
import java.util.Scanner;

import Model.Estudante;
import Model.DAO.EstudanteDAO;
import Tools.Dbconnection;

public class SecaoBibliotecario {
  public static Scanner in = new Scanner(System.in);

  public static void adicionarEstudante() {
    Estudante estudante = new Estudante();

    System.out.println("Nome: ");
    estudante.setNome(in.nextLine());

    System.out.println("Classe: ");
    estudante.setClasse(in.nextLine());

    EstudanteDAO.adicionarEstudante(estudante);
  }

  public static void listarEstudantes() {
    EstudanteDAO.listarEstudantes();
  }

  public static void atualizarEstudante() {
    Estudante estudante = new Estudante();
    System.out.println("Qual o id do estudante? ");
    int estudanteId = in.nextInt();

    System.out.println("Qual a nova classe do estudante?");
    estudante.setClasse(in.nextLine());

    EstudanteDAO.atualizarEstudante(estudanteId, estudante);
  }
}
