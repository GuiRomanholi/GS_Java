package models;

public class Cliente {
    private String cpf;
    private String email;
    private String nome;


    public void cadastrarCliente(){

    }

    public String exibirCDetalhes(){
        return "";
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
}
