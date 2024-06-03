package models;

public abstract class Empresa {
    private String cnpj;
    private String razaoSocial;

    public void exibirDados(){
        System.out.println("Seu cnpj é " + this.cnpj +
        "\nAqui está sua razão social: " + this.razaoSocial
        );
    }

    //getters e setters
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
}
