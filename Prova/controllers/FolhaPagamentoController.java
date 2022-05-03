package controllers;

import java.util.ArrayList;

import models.FolhaPagamento;


public class FolhaPagamentoController {

    private static ArrayList<FolhaPagamento> folhaPagamentos = new ArrayList<FolhaPagamento>();

    public void cadastrar(FolhaPagamento folhaPagamento) {
        folhaPagamentos.add(folhaPagamento);
    }

    public ArrayList<FolhaPagamento> listar() {
        return folhaPagamentos;
    }

    public FolhaPagamento buscarPorMes(int mes){
        for (FolhaPagamento folhapagamentoCadastrada : folhaPagamentos) {
            if(folhapagamentoCadastrada.equals(mes)){
                return folhapagamentoCadastrada;
            }
        }
        return null;

}

// public FolhaPagamento buscarPorAno(int ano){
//     for (FolhaPagamento folhapagamentoCadastrada : folhaPagamentos) {
//         if(folhapagamentoCadastrada.getAno().equals(ano)){
//             return folhapagamentoCadastrada;
//         }
//     }
//     return null;

// }














}
    
