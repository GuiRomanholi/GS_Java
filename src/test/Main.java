package test;

import models.Coletor;
import models.EmpresaPatrocinadora;
import models.PlasticoReciclado;
import models.PostoReciclagem;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNum = new Scanner(System.in);

        boolean executando = true;
        int opcao;

        while (executando){
            System.out.println(
                    "-------------------------------------------\n" +
                            "\t\tM E N U - P R I N C I P A L \n" +
                            "-------------------------------------------\n" +
                            " 1- Cliente\n" +
                            " 2- Empresa Patrocinadora\n" +
                            " 3- Plástico Reciclado\n" +
                            " 4- Posto Reciclagem\n" +
                            " 5- Coletor\n" +
                            " 6- Pagamento\n" +
                            " 0- Sair\n" +
                            "-------------------------------------------"
            );
            System.out.println("Informe a opção desejada: ");
            opcao = leitorNum.nextInt();

            if (opcao == 1){
                System.out.println("Deu 1");
            } else if (opcao == 2) {
                EmpresaPatrocinadora empresaPatrocinadora = new EmpresaPatrocinadora();
                empresaPatrocinadora.cadastroEmpresa();
                empresaPatrocinadora.exibirDados();

                System.out.println("-------------------------------------------");
                System.out.println("Pressione Enter para continuar...");
                leitor.nextLine();
            } else if (opcao == 3) {
                PlasticoReciclado plasticoReciclado = new PlasticoReciclado();
                plasticoReciclado.setId("123325");
                plasticoReciclado.setPeso(500);
                plasticoReciclado.setQuantidade(2);
                System.out.println(plasticoReciclado.exibirDetalhes());

                System.out.println("-------------------------------------------");
                System.out.println("Pressione Enter para continuar...");
                leitor.nextLine();
            } else if (opcao == 4) {
                PostoReciclagem postoReciclagem = new PostoReciclagem();
                postoReciclagem.setEndereco("Rua Codato Batista, 364");
                postoReciclagem.setCnpj("43.350.131/0001-01");
                postoReciclagem.setRazaoSocial("EcoReuso Sustentabilidade Ltda");
                postoReciclagem.exibirDados();

                System.out.println("-------------------------------------------");
                System.out.println("Pressione Enter para continuar...");
                leitor.nextLine();
            } else if (opcao == 5) {
                Coletor coletor = new Coletor();
                coletor.setId("343236");
                coletor.setVeiculo("Onix");
                coletor.chamarColeto();
                coletor.numeroDeColetas();
                coletor.detalhesColetor();

                System.out.println("-------------------------------------------");
                System.out.println("Pressione Enter para continuar...");
                leitor.nextLine();
            } else if (opcao == 6) {
                System.out.println("Deu 6");

                System.out.println("-------------------------------------------");
                System.out.println("Pressione Enter para continuar...");
                leitor.nextLine();
            } else if (opcao == 0) {
                System.out.println("Até Breve!");
                executando = false;
            }else {
                System.out.println("Por Favor digite um número válido.");
            }
        }
    }
}