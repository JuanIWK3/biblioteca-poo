package Menu;

import java.util.Scanner;
import java.util.logging.LogManager;

public class Menu {
  public static Scanner input = new Scanner(System.in); // teclado global

  public static void listMenu(int opcao) {
    switch (opcao) {
      case 1:
        System.out.println("\n-----------------------------------------------\n");
        System.out.println("Selecione uma opção:");
        System.out.println("\n1-Buscar Livros \n0-SAIR");

        int opcao1Estudante = input.nextInt();

        if (opcao1Estudante == 1) {
          System.out.println("\n-----------------------------------------------\n");
          System.out.println("Selecione uma opção:");
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
        System.out.println("Selecione uma opção:");
        System.out
            .println("\n1-Adicionar Estudante \n2-Remover Estudante \n3-Emprestar Livro \n4-Retornar Livro \n0-SAIR");

        int opcao2biblio = input.nextInt();

        boolean valido = false;

        while (valido == false) {
          if (opcao2biblio == 1 || opcao2biblio == 2 || opcao2biblio == 3 ||
              opcao2biblio == 4
              || opcao2biblio == 0) {
            valido = true;
          } else {
            valido = false;
            System.out.println("\n-----------------------------------------------\n");
            System.out.println("Entrada invalida!! Informe novamente:");
            System.out
                .println(
                    "\n1-Adicionar Estudante \n2-Remover Estudante \n3-Emprestar Livro \n4-Retornar Livro \n0-SAIR");
            opcao2biblio = input.nextInt();
          }
        }

        if (opcao2biblio != 0) {
          if (opcao2biblio != 0) {
            switch (opcao2biblio) {
              case 1:
                System.out.println("adicionarEstudante()");
                break;
              case 2:
                System.out.println("removerEstudante()");
                break;
              case 3:
                System.out.println("emprestarLivro()");
                break;
              case 4:
                System.out.println("retornarLivro()");
                break;
            }
          }
        }
        break;
    }
  }

  public static void listarOpcoes() {
    System.out.println("\n-----------------------------------------------\n");
    System.out.println("Selecione uma opção:");
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