package aula5;

public class principal {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        Aluno a2 = new Aluno();
        Aluno a3 = new Aluno();
        Professor p1 = new Professor();

        p1.setNome("Miguelito el Guapo");
        p1.setEndereco("Su corazon, 4");
        p1.setTelefone("(S2) 99999-9999");
        p1.setCpf("123.321.231-33");
        p1.setNomeCurso("Romance con Miguelito");
        p1.setSalario(200);

        a1.setNome("Daniel Fabre");
        a1.setEndereco("Casa dos Loucos, 0");
        a1.setTelefone("(32)9999-9999");
        a1.setCpf("123.333.441-23");
        a1.setCurso("Romance con Miguelito");
        double[] notas = { 7.5, 8.5, 5.5, 6.3, 9.7};
        a1.setNotas(notas);

        a2.setNome("Ricardo Antonio");
        a2.setEndereco("Beira-mar, 132");
        a2.setTelefone("(32)9934-4123");
        a2.setCpf("223.388.472-23");
        a2.setCurso("Romance con Miguelito");
        double[] notas2 = {2, 1};
        a2.setNotas(notas2);
        a2.setEstagio(false);

        a3.setNome("Pablito el Carinoso");
        a3.setEndereco("Em cima do poste, 333");
        a3.setTelefone("(32)00000-0000");
        a3.setCpf("942.933.222.12");
        a3.setCurso("Romance con Miguelito");
        double[] notas3 = { 10, 10, 10, 10, 9, 9, 8, 7, 10, 9, 7, 9};
        a3.setNotas(notas3);
        a3.setEstagio(true);

        System.out.println("--------PROFESSOR---------");
        System.out.println(p1.montaHolerite());
        System.out.println("--------ALUNO---------");
        System.out.println(a1.montaBoletim());
        System.out.println("--------ALUNO---------");
        System.out.println(a2.montaBoletim());
        System.out.println("--------ALUNO---------");
        System.out.println(a3.montaBoletim(a3.getEstagio()));
    }

}
