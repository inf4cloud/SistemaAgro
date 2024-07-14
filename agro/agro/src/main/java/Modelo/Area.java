
package Model;


public class Area {

    public int getIdarea() {
        return idarea;
    }

    public String getDescricaoarea() {
        return descricaoarea;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public int getQuantidadeprodutivo() {
        return quantidadeprodutivo;
    }

    public String getSiglas() {
        return siglas;
    }

    public Alimento getAlimento() {
        return alimento;
    }

    public void setIdarea(int idarea) {
        this.idarea = idarea;
    }

    public void setDescricaoarea(String descricaoarea) {
        this.descricaoarea = descricaoarea;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public void setQuantidadeprodutivo(int quantidadeprodutivo) {
        this.quantidadeprodutivo = quantidadeprodutivo;
    }

    public void setSiglas(String siglas) {
        this.siglas = siglas;
    }

    public void setAlimento(Alimento alimento) {
        this.alimento = alimento;
    }
    private int idarea;
    private String descricaoarea;
    private Endereco endereco;
    private int quantidadeprodutivo;
    private String siglas;
    private Alimento alimento;
}
