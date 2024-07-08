
package Model;


public class Parceiro {
   private int idparceiro;
   private String nome;
   private Endereco endereco;

    public int getIdparceiro() {
        return idparceiro;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setIdparceiro(int idparceiro) {
        this.idparceiro = idparceiro;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
   
}
