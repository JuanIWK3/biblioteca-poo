package Model;

// Atributos

public class Livro {
  private String ISBN;
  private String titulo;
  private String descricao;
  private String autor;
  private String anoPublicacao;
  private String genero;

  // Constructor

  public Livro() {
  }

  public Livro(String ISBN, String titulo, String descricao, String autor, String anoPublicacao, String genero) {
    this.ISBN = ISBN;
    this.titulo = titulo;
    this.descricao = descricao;
    this.autor = autor;
    this.anoPublicacao = anoPublicacao;
    this.genero = genero;

  }

  // Encapsulamento

  public String getAutor() {
    return autor;
  }

  public String getAnoPublicacao() {
    return anoPublicacao;
  }

  public String getDescricao() {
    return descricao;
  }

  public String getGenero() {
    return genero;
  }

  public String getISBN() {
    return ISBN;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setAutor(String autor) {
    this.autor = autor;
  }

  public void setAnoPublicacao(String anoPublicacao) {
    this.anoPublicacao = anoPublicacao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public void setGenero(String genero) {
    this.genero = genero;
  }

  public void setISBN(String iSBN) {
    ISBN = iSBN;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }
}
