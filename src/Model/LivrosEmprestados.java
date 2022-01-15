package Model;

import java.util.Date;

public class LivrosEmprestados {
  private Livro livro;
  private Estudante estudante;
  private Date dataEmprestimo;
  private Date dataDevolucao;

  public LivrosEmprestados() {
  }

  public LivrosEmprestados(Livro livro, Estudante estudante, Date dataEmprestimo, Date dataDevolucao) {
    this.livro = livro;
    this.estudante = estudante;
    this.dataEmprestimo = dataEmprestimo;
    this.dataDevolucao = dataDevolucao;
  }

  public Livro getLivro() {
    return livro;
  }

  public void setLivro(Livro livro) {
    this.livro = livro;
  }

  public Estudante getEstudante() {
    return estudante;
  }

  public void setEstudante(Estudante estudante) {
    this.estudante = estudante;
  }

  public Date getDataEmprestimo() {
    return dataEmprestimo;
  }

  public void setDataEmprestimo(Date dataEmprestimo) {
    this.dataEmprestimo = dataEmprestimo;
  }

  public Date getDataDevolucao() {
    return dataDevolucao;
  }

  public void setDataDevolucao(Date dataDevolucao) {
    this.dataDevolucao = dataDevolucao;
  }

}
