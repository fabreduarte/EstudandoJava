package aula9;

import java.util.Scanner;

public class programa {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        Aluno a1 = new Aluno();

        System.out.println("----ALUNO----");
        System.out.println("Digite as informações do Aluno: [nome; email; salario, cpf]");
        String valor = entrada.nextLine();
        a1.guardaAluno(valor);
        System.out.println(a1);
        a1.separaCPF(valor);
    }
}
