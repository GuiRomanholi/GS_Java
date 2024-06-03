package models;

public class PostoReciclagem extends Empresa{
    private String endereco;
    private String informarPosto;



    //getters e setters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getInformarPosto() {
        return informarPosto;
    }

    public void setInformarPosto(String informarPosto) {
        this.informarPosto = informarPosto;
    }
}
