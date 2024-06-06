package models;

import java.util.Scanner;

public class Cliente {
    private String cpf;
    private String email;
    private String nome;
    private Enum tipoCliente;


    //O metodo serve para cadastrar o cliente
    public void cadastrarCliente( String nome){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe seu cpf: ");
        this.cpf = leitor.nextLine();
        System.out.println("Informe seu email: ");
        this.email = leitor.nextLine();
    }

    //Aqui para exibir seus dados
    public String exibirDetalhes(){
        return "Muito bem " + this.nome + ", você está cadastrado(a) no sistema" +
                " e você é " + tipoCliente;
    }

    //getters e setters
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Enum getTipoCliente() {
        return tipoCliente;
    }

    public void setTipoCliente(Enum tipoCliente) {
        this.tipoCliente = tipoCliente;
    }
}
