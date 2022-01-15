package Model;

public class Bibliotecario extends Usuario {
  private String ra;
  private String password;

  public Bibliotecario() {

  }

  public Bibliotecario(String ra, String password) {
    this.ra = ra;
    this.password = password;
  }

  public String getRa() {
    return ra;
  }

  public void setRa(String ra) {
    this.ra = ra;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

}
