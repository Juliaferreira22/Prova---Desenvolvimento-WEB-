package views;



import controllers.FolhaPagamentoController;
import models.FolhaPagamento;
import utils.Console;
import controllers.FuncionarioController;
import models.Funcionario;

public class CadastrarFolhaPagamento {

    public void renderizar(){
        CadastrarFolhaPagamento cadastarFolhaPagamento = new CadastrarFolhaPagamento();
        
        FolhaPagamento folhaPagamento = new FolhaPagamento();
        FuncionarioController funcionarioController = new FuncionarioController();        
        FolhaPagamentoController folhaPagamentoController = new FolhaPagamentoController();
        
        System.out.println("\n -- CADASTRO DE FOLHA DE PAGAMENTO -- \n");

        String cpfFuncionario = Console.readString("Digite o CPF do funcionário: ");
        Funcionario funcionario = funcionarioController.buscarPorCpf(cpfFuncionario);
        if (funcionario != null) {
            cadastarFolhaPagamento.setFuncionario(funcionario);
        }

        else {

            System.out.println("Funcionário não encontrado!");

        }
        
        folhaPagamento.setMes(Console.readInt("Digite o mes da folha de pagamento: "));  
        folhaPagamento.setAno(Console.readInt("Digite o ano da folha de pagamento: "));
        folhaPagamento.setHorasTrabalhadas(Console.readInt("Digite o numero de horas trabalhadas: "));
        folhaPagamento.setValorHora(Console.readDouble("Digite o valor da hora "));

      
        folhaPagamentoController.cadastrar(folhaPagamento);
        System.out.println("\nFolha de pagamento cadastrada !!!");
    }

    private void setFuncionario(Funcionario funcionario) {
    }
    
}

