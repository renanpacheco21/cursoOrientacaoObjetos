package aula05;

public class Aula05 {

    public static void main(String[] args) {

        ControleRemoto c = new ControleRemoto();
        c.ligar();
        c.play();
        c.maisVolume();
        c.maisVolume();
        c.pause();
        //c.ligarMudo();
        c.desligar();
        c.abrirMenu();
        c.fecharMenu();


    }
}
