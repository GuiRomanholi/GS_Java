package models;

import java.util.Scanner;

public class EmpresaPatrocinadora extends Empresa{
    private String nome;
    private double investir;

    public void cadastroEmpresa(){
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNum = new Scanner(System.in);
        System.out.println("Me informe o nome da sua Empresa: ");
        this.nome = leitor.nextLine();
        System.out.println("Me informe seu cnpj: ");
        setCnpj(leitor.nextLine());
        System.out.println("Me informe sua razão social: ");
        setRazaoSocial(leitor.nextLine());
        System.out.println("Informe o quanto deseja investir: ");
        setInvestir(leitorNum.nextDouble());
    }

    @Override
    public void exibirDados() {
        super.exibirDados();
        System.out.println("A Empresa " + getNome() + " está cadastrada!");
        System.out.println("E investindo " + getInvestir());
    }

    //getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getInvestir() {
        return investir;
    }

    public void setInvestir(double investir) {
        this.investir = investir;
    }
}
