package models;

public class PlasticoReciclado {
    private String id;
    private double peso;
    private int quantidade;

    public String exibirDetalhes(){
        return "A quantidade de plástico é aproximadamente: " + this.quantidade +
                "\nO seu peso ficou: " + this.peso + "g" +
                "\nE o id é: " + this.id;
    }

    //getters e setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
}
