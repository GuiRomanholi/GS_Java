package models;

public class PostoReciclagem extends Empresa{
    private String endereco;

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("O seu endereço é " + this.endereco);
    }


    //getters e setters
    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

}
