package models;

import java.time.LocalDate;

public class Pagamento {
    private String id;
    private double valor;
    private LocalDate data;

    //serve para fazer a conversão de valor em cima do peso das garrafas
    public double fazerConversao(double peso){
        setValor(0.50 * peso);
        System.out.println("Convertendo o peso " + peso + "g ficou" +
        "\nR$" + getValor());
        return getValor();
    }

    public void realizarPagamento(){
        System.out.println("O pagamento será realizado pelo código do pix: 1111111-111");
        System.out.println("E o valor a ser pago é R$" + getValor());
    }
    public void detalhesPagamento(){
        System.out.println("------------------------------------------------");
        System.out.println("O pagamento " + this.id + " será feito na data " + this.data +
                "\nE de valor R$" + this.valor);
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
