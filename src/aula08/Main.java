package aula08;

public class Main {
    public static void main(String[] args) {

       Pessoa p1 = new Pessoa();
       Aluno p2 = new Aluno();
       Professor p3 = new Professor();
       Funcionario p4 = new Funcionario();

       p1.setNome("Renan");
       p2.setNome("Emanuel");
       p3.setNome("Diovana");
       p4.setNome("Melissa");

       p1.setSexo("M");
       p2.setSexo("M");
       p3.setSexo("F");
       p4.setSexo("F");

       p1.setIdade(29);
       p2.setIdade(11);
       p3.setIdade(28);
       p4.setIdade(5);

       p2.setCurso("Fundamental");
       p3.setSalario(3000.00);
       p4.setSetor("TI");

       System.out.println(p1.toString());
       System.out.println(p2.toString());
       System.out.println(p3.toString());
       System.out.println(p4.toString());
    }
}
