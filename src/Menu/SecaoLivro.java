package Menu;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import Model.Livro;
import Model.DAO.LivroDAO;
import Tools.Dbconnection;

public class SecaoLivro {
  public static Scanner in = new Scanner(System.in);

  public static void adicionarLivro() {
    Livro livro = new Livro();

    System.out.println("Titulo: ");
    livro.setTitulo(in.nextLine());

    System.out.println("Autor: ");
    livro.setAutor(in.nextLine());

    System.out.println("Descricao: ");
    livro.setDescricao(in.nextLine());

    System.out.println("Genero: ");
    livro.setGenero(in.nextLine());

    System.out.println("Ano de publicacao: ");
    livro.setAnoPublicacao(in.next());

    LivroDAO.adicionarLivro(livro);
  }

  public static void listarLivros() {
    LivroDAO.listarLivros();
  }

  public static void removerLivro() {
    System.out.println("Qual o id do livro? ");
    int id = in.nextInt();

    LivroDAO.removerLivro(id);
  }

  public static void atualizarLivro() {
    Livro livro = new Livro();
    System.out.println("Informe o Id do livro: ");
    int livroId = in.nextInt();

    System.out
        .println(
            "O que você deseja alterar? \n1-Titulo \n2-Autor \n3-Descricao \n4-Genero \n5-Ano de publicacao \n0-SAIR");

    int opcao = in.nextInt();

    boolean valido = false;

    while (valido == false) {
      if (opcao == 1 || opcao == 2 || opcao == 3 ||
          opcao == 4 || opcao == 5 || opcao == 0) {
        valido = true;
      } else {
        valido = false;
        System.out.println("\n-----------------------------------------------\n");
        System.out.println("Entrada invalida!! Informe novamente:");
        System.out
            .println("O que você deseja alterar? \n1-Titulo \n2-Autor \n3-Descricao \n4-Genero \n5-Ano de publicacao");
        opcao = in.nextInt();
      }
    }

    if (opcao != 0) {
      switch (opcao) {
        case 1:
          System.out.println("Novo titulo: ");
          livro.setTitulo(in.nextLine());
          LivroDAO.atualizarLivro(opcao, livroId, livro);
          break;
        case 2:
          System.out.println("Novo autor: ");
          livro.setAutor(in.nextLine());
          LivroDAO.atualizarLivro(opcao, livroId, livro);
          break;
        case 3:
          System.out.println("Nova descricao: ");
          livro.setDescricao(in.nextLine());
          LivroDAO.atualizarLivro(opcao, livroId, livro);
          break;
        case 4:
          System.out.println("Novo genero: ");
          livro.setGenero(in.nextLine());
          LivroDAO.atualizarLivro(opcao, livroId, livro);
          break;
        case 5:
          System.out.println("Novo ano de publicacao: ");
          livro.setAnoPublicacao(in.nextLine());
          LivroDAO.atualizarLivro(opcao, livroId, livro);
          break;
      }
    }
  }
}
