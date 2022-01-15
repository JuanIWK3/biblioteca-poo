package Model;

public class Estudante extends Usuario {
  private String classe;

  public Estudante() {
  }

  public Estudante(String classe) {
    this.classe = classe;
  }

  public String getClasse() {
    return classe;
  }

  public void setClasse(String classe) {
    this.classe = classe;
  }
}
