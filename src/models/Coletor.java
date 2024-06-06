package models;

import java.util.Scanner;

public class Coletor {
    private String id;
    private String veiculo;
    private int numColeta;
    private String endereco;


    //Serve para chamar o coletor, informando seu endereço
    public void chamarColeto(){
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNum = new Scanner(System.in);
        boolean executando = true;
        int opcao;
        while (executando){
            System.out.println("Gostaria de chamar o coletor? 1 para SIM / 2 para NÃO");
            opcao = leitorNum.nextInt();
            if (opcao == 1){
                System.out.println("O coletor faz ronda todas as segundas e sextas ás 20:00." +
                        "\nSó informe seu endereço: ");
                this.endereco = leitor.nextLine();
                break;
            } else if (opcao == 2) {
                System.out.println("Continuando...");
                break;
            }else {
                System.out.println("Por Favor digite 1 para SIM / 2 para NÃO");
            }
        }
    }
    public String detalhesColetor(){
        return "Informações:" +
                "\nO clt dele é " + this.id +
                "\nSeu veiculo é " + this.veiculo +
                "\nE seu numero de coletas mensais é " + this.numColeta;
    }

    //Esse metodo serve para o coletor ter um numero de coletas feitas em um mês
    public void numeroDeColetas(){
        Scanner leitorNum = new Scanner(System.in);
        int opcao;
        boolean executando = true;
        int numeroAdicionado;
        System.out.println("O total de coletas do mês é: " + this.numColeta);
        System.out.println("-------------------------------------------");
        while (executando){
            System.out.println("Deseja aumentar o número de coletas? 1 para SIM / 2 para NÃO");
            opcao = leitorNum.nextInt();
            if (opcao == 1){
                System.out.println("Informe a quantidade de coletas a serem adicionadas no mês: ");
                numeroAdicionado = leitorNum.nextInt();
                System.out.println("Muito bem!");
                setNumColeta(getNumColeta() + numeroAdicionado);
                break;
            } else if (opcao == 2) {
                System.out.println("Continuando...");
                break;
            }else {
                System.out.println("Por Favor digite 1 para SIM / 2 para NÃO");
            }
        }
    }

    //getters e setters

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
