package aula04;
public class Aula05 {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(12345);
        p1.setDono("Renan");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(67890);
        p2.setDono("Emanuel");
        p2.abrirConta("CP");


        p1.depositar(100);
        p2.depositar(500);

        p2.sacar(120.55);
        p2.pagarMensalidade();

        p1.sacar(p1.getSaldo());
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();

    }
}
