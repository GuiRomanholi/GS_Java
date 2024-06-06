package test;

import models.*;
import models.enums.TipoClienteEnum;

import java.time.LocalDate;
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

                Cliente cliente = new Cliente();
                System.out.println("Informe seu nome: ");
                cliente.setNome(leitor.nextLine());
                cliente.cadastrarCliente("Júlio");
                int opcaoCliente;
                boolean executandoCliente = true;
                while (executandoCliente){
                    System.out.println("Você é qual tipo de cliente?");
                    System.out.println("1 para pessoa física / 2 para jurídica");
                    opcaoCliente = leitorNum.nextInt();
                    if (opcaoCliente == 1){
                        cliente.setTipoCliente(TipoClienteEnum.PFISICA);
                        break;
                    } else if (opcaoCliente == 2) {
                        cliente.setTipoCliente(TipoClienteEnum.PJURIDICA);
                        break;
                    }else {
                        System.out.println("Por Favor informe 1 para pessoa física / 2 para jurídica");
                    }
                }
                System.out.println(cliente.exibirDetalhes());

                System.out.println("-------------------------------------------");
                System.out.println("Pressione Enter para continuar...");
                leitor.nextLine();
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
                plasticoReciclado.setQuantidade(4);
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
                int opcaoColetor;
                coletor.setId("343236");
                coletor.setVeiculo("Onix");
                coletor.setNumColeta(10);
                coletor.chamarColeto();
                coletor.numeroDeColetas();
                System.out.println("Deseja ver os detalhes do coletor? 1 para SIM / 2 para NÃO");
                opcaoColetor = leitorNum.nextInt();
                if (opcaoColetor == 1){
                    System.out.println(coletor.detalhesColetor());
                }else {
                    System.out.println("Retornando...");
                }

                System.out.println("-------------------------------------------");
                System.out.println("Pressione Enter para continuar...");
                leitor.nextLine();
            } else if (opcao == 6) {

                Pagamento pagamento = new Pagamento();
                int pesoPagamento;
                pagamento.setData(LocalDate.ofEpochDay(12/06/2024));
                pagamento.setId("133644");
                System.out.println("Qual foi o peso dos plásticos? Em Gramas");
                pesoPagamento = leitorNum.nextInt();
                pagamento.fazerConversao(pesoPagamento);
                pagamento.realizarPagamento();
                pagamento.detalhesPagamento();

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