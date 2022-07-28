package Aula06;

public class Luta {

    //Atributos
    private Lutador desafiado;
    private Lutador desafiando;
    private int round;
    private boolean aprovada;

    //Métodos Públicos
    public void marcarLuta(){

    }

    public void lutar(){

    }

    //Métodos Especiais
    public Luta(Lutador desafiado, Lutador desafiando, int round, boolean aprovada) {
        this.desafiado = desafiado;
        this.desafiando = desafiando;
        this.round = round;
        this.aprovada = aprovada;
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiando() {
        return desafiando;
    }

    public void setDesafiando(Lutador desafiando) {
        this.desafiando = desafiando;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public boolean isAprovada() {
        return aprovada;
    }

    public void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
}
