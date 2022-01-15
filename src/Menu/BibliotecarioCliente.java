package Menu;

import java.util.Scanner;

import Model.Estudante;
import Model.DAO.EstudanteDAO;

public class BibliotecarioCliente {
  public static Scanner in = new Scanner(System.in);

  public static void adicionarEstudante() {
    Estudante estudante = new Estudante();

    System.out.println("Nome: ");
    String nome = in.nextLine();
    estudante.setNome(nome);
    System.out.println("Classe: ");
    String classe = in.nextLine();
    estudante.setClasse(classe);

    EstudanteDAO.adicionarEstudante(estudante);
  }

  public static void listarEstudantes() {
    EstudanteDAO.listarEstudantes();
  }
}
