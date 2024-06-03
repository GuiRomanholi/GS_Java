package models;

public class Coletor {
    private String clt;
    private String veiculo;
    private int numColeta;


    public void chamarColeto(){

    }

    //getters e setters
    public String getClt() {
        return clt;
    }

    public void setClt(String clt) {
        this.clt = clt;
    }

    public String getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(String veiculo) {
        this.veiculo = veiculo;
    }

    public int getNumColeta() {
        return numColeta;
    }

    public void setNumColeta(int numColeta) {
        this.numColeta = numColeta;
    }
}
