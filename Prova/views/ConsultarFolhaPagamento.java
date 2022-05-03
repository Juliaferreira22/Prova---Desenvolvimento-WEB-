

package views;



 
 import controllers.FolhaPagamentoController;
 import controllers.FuncionarioController;
import models.FolhaPagamento;
 import models.Funcionario;

 import utils.Console;

 public class ConsultarFolhaPagamento {

    public void renderizar() {

    
      ConsultarFolhaPagamento consultarFolhaPagamento = new ConsultarFolhaPagamento();
       FuncionarioController funcionarioController = new FuncionarioController();
        FolhaPagamentoController folhaPagamentoController = new FolhaPagamentoController();
        

        System.out.println("\n -- CONSULTAR FOLHA DE PAGAMENTO-- \n");

// Funcionario
 String cpfFuncionario = Console.readString("Digite o CPF do funcionário: ");
Funcionario funcionario = funcionarioController.buscarPorCpf(cpfFuncionario);
 if (funcionario != null) {
         consultarFolhaPagamento.setFuncionario(funcionario);
}

else {

   System.out.println("Funcionário não encontrado!");

 }


// Folha Pagamento 

int mesFolhaPagamento = Console.readInt("Digite o mês da folha de pagamento: ");
FolhaPagamento folhaPagamento = folhaPagamentoController.buscarPorMes(mesFolhaPagamento);
 if (funcionario != null) {
         consultarFolhaPagamento.setFolhaPagamento(folhaPagamento);
}

else {

   System.out.println("Funcionário não encontrado!");

 }

//  int anoFolhaPagamento = Console.readInt("Digite o ano da folha de pagamento: ");
//  FolhaPagamento folhaPagamento = folhaPagamentoController.buscarPorAno(anoFolhaPagamento);
//  if (funcionario != null) {
//          consultarFolhaPagamento.setFolhaPagamento(folhaPagamento);
// }

// else {

//    System.out.println("Funcionário não encontrado!");

//  }




}

    private void setFolhaPagamento(FolhaPagamento folhaPagamento) {
    }

    private void setFuncionario(Funcionario funcionario) {
    }

 }



