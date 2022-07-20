package aula5;

import java.lang.Math;

public class Professor extends Pessoa {
    private double salario;
    private String nomeCurso;

    // #region Encapsulamento [getters and setters]

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }
    // #endregion

    // #region Regras de Negócios

    private double calculaSalario() {
        return Math.round((this.salario * 44) * 4.5);
    }

    /*
     * Montar o método que cálcula o INSS
     * Montar o método que calcula o IRPF com faixas
     * Montar o método de adição de planejamento de aulas: 0,3 e DSR 0,2.
     */

    public String montaHolerite() {
        String holerite;
        holerite = ("Nome do Professor: " + super.getNome() + System.lineSeparator());
        holerite += (" | CPF: " + super.getCpf() + System.lineSeparator());
        holerite += (" | Curso Referente: " + this.getNomeCurso() + System.lineSeparator());
        holerite += (" | Salario Bruto:  R$ " + this.calculaSalario() + System.lineSeparator());
        holerite += (" | Valor Hora: " + this.getSalario() + System.lineSeparator());        
        holerite += (" | Valor INSS: R$ " + this.calculoINSS() + System.lineSeparator());
        holerite += (" | Valor IRPF: R$ " + this.calculoIRPF() + System.lineSeparator());
        holerite += (" | Valor DSR e Adicionais: R$ " + this.calculaAdicionais()) + System.lineSeparator();
        holerite += (" | Salario Liquido: R$ " +(this.calculaSalario() + this.calculaAdicionais() - this.calculoINSS() - this.calculoIRPF()));
        return holerite;
    }

    public double calculoINSS(){
    double inss = 0;
    if(salario <= 1212.00){
        inss = 0.075;
    }else if (salario > 1212.00 && salario <= 2427.35){
        inss = 0.09;
    }else if (salario > 2427.35 && salario <= 3641.00){
        inss = 0.12;
    }else if (salario > 3641.00 && salario <= 7087.22){
        inss = 0.14;
    }else if (salario > 7087.22){
        inss = 0.14;
    }
    return inss * calculaSalario();
    }

    public double calculoIRPF(){
        double irpf = 0;
        if (calculaSalario() <= 1903.98) {
            irpf = 0;
        } else if (calculaSalario() > 1903.99 && calculaSalario() <= 2826.65) {
            irpf = 0.075;
        } else if (calculaSalario() >= 2826.66 && calculaSalario() <= 3751.05) {
            irpf = 0.15;
        } else if (calculaSalario() > 3751.06 && calculaSalario() <= 4664.68) {
            irpf = 0.225;
        } else if (calculaSalario() > 4664.68) {
            irpf = 0.275;
        }
        return irpf * calculaSalario();
    }

    public double calculaAdicionais(){
        double planejamento = 0.3 * calculaSalario();
        double dsr = 0.2 * calculaSalario();
        double adicionais = dsr + planejamento;
        return adicionais;
    }

    /*
     * Até R$ 1.212,00 (salário-mínimo) – 7,5%
     * Entre R$ 1. 212,00 e R$ 2.427,35 – 9%
     * Entre R$ 2.427,36 e R$ 3.641,03 – 12%
     * Entre R$ 3.641,03 e R$ 7.087,22– 14%
     */

    // #endregion

}
