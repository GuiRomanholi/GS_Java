package test;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNum = new Scanner(System.in);

        boolean executando = true;
        int opcao;

        while (executando){
            System.out.println(
                    "-------------------------------------\n" +
                            "\tM E N U - P R I N C I P A L \n" +
                            "-------------------------------------\n" +
                            " 1- Cliente\n" +
                            " 2- Empresa Patrocinadora\n" +
                            " 3- Plástico Reciclado\n" +
                            " 4- Posto Reciclagem\n" +
                            " 5- Coletor\n" +
                            " 6- Pagamento\n" +
                            " 0- Sair\n" +
                            "-------------------------------------"
            );
            System.out.println("Informe a opção desejada: ");
            opcao = leitorNum.nextInt();

            if (opcao == 1){
                System.out.println("Deu 1");
            } else if (opcao == 2) {
                System.out.println("Deu 2");
            } else if (opcao == 3) {
                System.out.println("Deu 3");
            } else if (opcao == 4) {
                System.out.println("Deu 4");
            } else if (opcao == 5) {
                System.out.println("Deu 5");
            } else if (opcao == 6) {
                System.out.println("Deu 6");
            } else if (opcao == 0) {
                System.out.println("Até Breve!");
                executando = false;
            }else {
                System.out.println("Por Favor digite um número válido.");
            }
        }
    }
}