package Menu;

import java.util.Scanner;

import Model.DAO.LivroEmprestadoDAO;

public class Menu {
  public static Scanner input = new Scanner(System.in); // teclado global

  public static void listMenu(int opcao) {
    switch (opcao) {
      case 1:
        System.out.println("\n-----------------------------------------------\n");
        System.out.println("Selecione uma opçao:");
        System.out.println("\n1-Buscar Livros \n0-SAIR");

        int opcao1Estudante = input.nextInt();

        if (opcao1Estudante == 1) {
          System.out.println("\n-----------------------------------------------\n");
          System.out.println("Selecione uma opçao:");
          System.out
              .println("\n1-Buscar por Nome \n2-Buscar por Autor \n3-Buscar por data \n4-Buscar por genero \n0-SAIR");

          int opcao2Estudante = input.nextInt();

          boolean valido = false;

          while (valido == false) {
            if (opcao2Estudante == 1 || opcao2Estudante == 2 || opcao2Estudante == 3 ||
                opcao2Estudante == 4
                || opcao2Estudante == 0) {
              valido = true;
            } else {
              valido = false;
              System.out.println("\n-----------------------------------------------\n");
              System.out.println("Entrada invalida!! Informe novamente:");
              System.out
                  .println(
                      "\n1-Buscar por Nome \n2-Buscar por Autor \n3-Buscar por data \n4-Buscar por genero \n0-SAIR");
              opcao2Estudante = input.nextInt();
            }
          }
          if (opcao2Estudante != 0) {
            switch (opcao2Estudante) {
              case 1:
                System.out.println("buscarPorNome()");
                break;
              case 2:
                System.out.println("buscarPorAutor()");
                break;
              case 3:
                System.out.println("buscarPorData()");
                break;
              case 4:
                System.out.println("buscarPorGenero()");
                break;
            }
          }
        }
        break;

      case 2:
        System.out.println("\n-----------------------------------------------\n");
        System.out.println("Selecione uma opçao:");
        System.out
            .println(
                "\n1-Adicionar Estudante \n2-Editar Estudante \n3-Listar Estudantes \n4-Adicionar Livro \n5-Editar Livro  \n6-Remover Livro \n7-Listar Livros \n8-Emprestar Livro \n9-Retornar Livro \n0-SAIR");

        int opcao2biblio = input.nextInt();

        boolean valido = false;

        while (valido == false) {
          if (opcao2biblio == 1 || opcao2biblio == 2 || opcao2biblio == 3 ||
              opcao2biblio == 4 || opcao2biblio == 5 || opcao2biblio == 6 || opcao2biblio == 7 || opcao2biblio == 8
              || opcao2biblio == 9 || opcao2biblio == 0) {
            valido = true;
          } else {
            valido = false;
            System.out.println("\n-----------------------------------------------\n");
            System.out.println("Entrada invalida!! Informe novamente:");
            System.out
                .println(
                    "\n1-Adicionar Estudante \n2-Editar Estudante \n3-Listar Estudantes \n4-Adicionar Livro \n5-Editar Livro  \n6-Remover Livro \n7-Listar Livros \n8-Emprestar Livro \n9-Retornar Livro \n0-SAIR");
            opcao2biblio = input.nextInt();
          }
        }

        if (opcao2biblio != 0) {
          switch (opcao2biblio) {
            case 1:
              SecaoBibliotecario.adicionarEstudante();
              break;
            case 2:
              SecaoBibliotecario.atualizarEstudante();
              break;
            case 3:
              SecaoBibliotecario.listarEstudantes();
              break;
            case 4:
              SecaoLivro.adicionarLivro();
              break;
            case 5:
              SecaoLivro.atualizarLivro();
              break;
            case 6:
              SecaoLivro.removerLivro();
              break;
            case 7:
              SecaoLivro.listarLivros();
              break;
            case 8:
              SecaoLivroEmprestado.emprestarLivro();
              break;
            case 9:
              System.out.println("retornarLivro()");
              break;
          }
        }
    }
  }

  public static void listarOpcoes() {
    System.out.println("\n-----------------------------------------------\n");
    System.out.println("Selecione uma opçao:");
    System.out.println("\n1-Estudante \n2-Bibliotecário \n0-SAIR");

    int opcao = input.nextInt();

    boolean valido = false;

    while (valido == false) {
      if (opcao == 1 || opcao == 2 || opcao == 0) {
        valido = true;
      } else {
        System.out.println("Entrada inválida");
        opcao = input.nextInt();
      }
    }

    if (opcao != 0) {
      listMenu(opcao);
    }
  }
}