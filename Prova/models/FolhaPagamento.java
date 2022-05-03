package models;

public class FolhaPagamento {

    private String cpf; 
    private int mes;
    private int ano;
    private int horasTrabalhadas; 
    private double valorHora;
    
    
    public String getCpf() {
        return cpf;
    }
    public double getValorHora() {
        return valorHora;
    }
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
        
    }
    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }
    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }
    public int getMes() {
        return mes;
    }
    public void setMes(int mes) {
        this.mes = mes;
    }
    public void setFuncio(String cpf) {
        this.cpf = cpf;
    }
    public static void add(FolhaPagamento folhaPagamento) {
    } 

    

    @Override
    public String toString() {
        return 
            "CPF Funcionário: " + cpf + 
            " | Mês da folha de pagamento: " + mes + 
            " | Ano da folha de pagamento: " + ano + 
            " | Horas trabalhadas: " + horasTrabalhadas + 
            " | Valor hora: " + valorHora;
    }
    public Object get() {
        return null;
    }
    public void setFolhaPagamento(FolhaPagamento folhaPagamento) {
    }

    
    
}
