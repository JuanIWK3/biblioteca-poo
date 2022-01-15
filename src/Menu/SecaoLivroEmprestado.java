package Menu;

import java.util.Scanner;

import Model.DAO.LivroEmprestadoDAO;

import java.time.format.DateTimeFormatter;
import java.sql.SQLException;
import java.time.LocalDateTime;

public class SecaoLivroEmprestado {
  public static Scanner in = new Scanner(System.in);

  public static String[] getDate() {
    DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd");
    LocalDateTime now = LocalDateTime.now();
    LocalDateTime somaData = now.plusDays(18);

    String[] dataArray = { dtf.format(now), dtf.format(somaData) };

    return dataArray;
  }

  public static void emprestarLivro() {
    System.out.println("Informe o id do estudante");
    int estudanteId = in.nextInt();

    System.out.println("Informe o id do livro");
    int livroId = in.nextInt();

    String dataEmprestimo = getDate()[0];
    String dataDevolucao = getDate()[1];

    LivroEmprestadoDAO.emprestarLivro(estudanteId, livroId, dataEmprestimo, dataDevolucao);
  }
}