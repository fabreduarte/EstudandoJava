package aula9;

import java.util.ArrayList;

public class Aluno {
    private String nome;
    private String email;
    private double salario;
    private String Cpf;
    
    
    //#region Construtores, Encapsuladores e toString

    public Aluno(String nome, String email, double salario, String cpf) {
        super();
        this.nome = nome;
        this.email = email;
        this.salario = salario;
        Cpf = cpf;
    }
    
    public Aluno() {
        super();
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public double getSalario() {
        return salario;
    }
    
    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getCpf() {
        return Cpf;
    }
    
    public void setCpf(String cpf) {
        Cpf = cpf;
    }

    @Override
    public String toString() {
        return "Aluno [Cpf=" + Cpf + ", email=" + email + ", nome=" + nome + ", salario=" + salario + "]";
    }   
    
    //#endregion

    //#region Regras de negócios
    public void guardaAluno(String valor){
        String[] valorSeparado = valor.split(";");
        setNome(valorSeparado[0]);
        setEmail(valorSeparado[1]);
        setSalario(Double.parseDouble(valorSeparado[2])); 
        setCpf(valorSeparado[3]);
    }
    public void separaCPF(String valor){
        String cpf = getCpf();
        String[] cpfSeparado = cpf.split("-");
        System.out.println(cpfSeparado[0]);
        System.out.println(cpfSeparado[1]);

        String campos = cpfSeparado[0];
        String troca = campos.replace(".", ";");
        System.out.println(troca);

        String[] camposSeparados = troca.split(";");
        int c1 = Integer.parseInt(camposSeparados[0]);
        int c2 = Integer.parseInt(camposSeparados[1]);
        int c3 = Integer.parseInt(camposSeparados[2]);
        int d1 = Integer.parseInt(cpfSeparado[1]);

        System.out.println("Inteiros c1: "+c1+" Inteiro c2: "+c2+" Inteiro c3: "+c3+" Inteiro d1: "+d1);
        System.out.println("Calculo CPF: "+(c1+c2+c3) % d1);
    }
    //#endregion
}


/*
         * Construir método de separação de inteiros do CPF
         * 1. Coletar a String do CPF
         * 2. Separe o CPF em grupos de numeros e digito.
         * 3. Imprima a separação destes numeros.
         * 4. Converta em variaveis inteiras com nomes de c1, c2, c3 e d1.
         */