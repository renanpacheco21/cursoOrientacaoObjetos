package aula03;

public class Caneta {

    private String modelo;
    private double ponta;
    private String cor;
    private boolean tampada;

    public Caneta() {
        this.modelo = modelo;
        this.ponta = ponta;
        this.cor = cor;
        this.tampada = tampada;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getPonta() {
        return ponta;
    }

    public void setPonta(double ponta) {
        this.ponta = ponta;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public void status(){
        System.out.println("Informações da Caneta");
        System.out.println("Modelo " + this.modelo);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Cor: " + this.cor);
        //System.out.println("Tampada " + this.tampada);
        if(tampada == false){
            System.out.println("A caneta está aberta");
        } else {
            System.out.println("A caneta está fechada");
        }
    }
}
