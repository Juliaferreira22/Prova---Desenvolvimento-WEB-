package views;

import utils.Console;

public class Principal {
    public static void main(String[] args) {
        int opcao = 0;

        do {
            System.out.println("\n -- PROJETO DE FoLHA DE PAGAMENTO -- \n");
            System.out.println("1 - Cadastrar funcionário");
            System.out.println("2 - Cadastrar folha de pagamento");
            System.out.println("3 - Consultar folha de pagamento");
            System.out.println("4 - Consultar todas as folhas de pagamento");
            System.out.println("0 - Sair\n");
            opcao = Console.readInt("Digite uma opção: ");

            switch (opcao) {
                case 1:
                    CadastrarFuncionario cadastrarfuncionario = new CadastrarFuncionario();
                    cadastrarfuncionario.renderizar();
                    break;
                case 2:
                    CadastrarFolhaPagamento cadastrarFolhaPagamento = new CadastrarFolhaPagamento();
                    cadastrarFolhaPagamento.renderizar();
                    break;
                 case 3:
                    ConsultarFolhaPagamento consultarFolhaPagamento = new ConsultarFolhaPagamento();
                    consultarFolhaPagamento.renderizar();
                    break;
                //  case 4:
                //    ConsultarTodasFolhasPagamento  consultarTodasFolhasPagamento = new  consultarTodasFolhasPagamento();
                //     consultarTodasFolhasPagamento.renderizar();
                //     break;
                case 0:
                    System.out.println("\n -- SAIR -- \n");
                    break;
                default:
                    System.out.println("\n --OPÇÃO INVÁLIDA -- \n");
                    break;
            }

        } while (opcao != 0);
    }
}
