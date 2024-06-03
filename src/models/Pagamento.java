package models;

import java.time.LocalDate;

public class Pagamento {
    private String id;
    private double valor;
    private LocalDate data;

    public double fazerConversao(){
        return 0;
    }

    public void realizarPagamento(){

    }


    //getters e setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }
}
