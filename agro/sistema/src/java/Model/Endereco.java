
package Model;


public class Endereco {
  
	private String Endereco; 
	private int Numero;
	private String Complemento;
	private  String Cep;
        private String Bairro;
	private String Cidade;
	private String Estado;
	private String Pais;
        private String localizacaogeografica;

    public String getEndereco() {
        return Endereco;
    }

    public int getNumero() {
        return Numero;
    }

    public String getComplemento() {
        return Complemento;
    }

    public String getCep() {
        return Cep;
    }

    public String getBairro() {
        return Bairro;
    }

    public String getCidade() {
        return Cidade;
    }

    public String getEstado() {
        return Estado;
    }

    public String getPais() {
        return Pais;
    }

    public String getLocalizacaogeografica() {
        return localizacaogeografica;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }

    public void setNumero(int Numero) {
        this.Numero = Numero;
    }

    public void setComplemento(String Complemento) {
        this.Complemento = Complemento;
    }

    public void setCep(String Cep) {
        this.Cep = Cep;
    }

    public void setBairro(String Bairro) {
        this.Bairro = Bairro;
    }

    public void setCidade(String Cidade) {
        this.Cidade = Cidade;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public void setLocalizacaogeografica(String localizacaogeografica) {
        this.localizacaogeografica = localizacaogeografica;
    }
}
