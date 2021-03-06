package aula04;
public class ContaBanco {

    //Atributos
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;


    //Métodos Especiais
    public ContaBanco() {
        this.setSaldo(0);
        this.setStatus(false);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


    //Métodos Personalizados
    public void estadoAtual(){
        System.out.println("________________________________");
        System.out.println("Conta: " + this.getNumConta());
        System.out.println("Tipo: " + this.getTipo());
        System.out.println("Responsável: " + this.getDono());
        System.out.println("Saldo: R$ " + (Math.round(getSaldo()*100.0)/100.0));

        if (isStatus()){
            System.out.println("Conta Aberta");
        } else {
            System.out.println("Conta Fechada");
        }
        System.out.println("________________________________");
    }

    public void abrirConta(String t){
        this.setTipo(t);
        this.setStatus(true);
        if (t == "CC"){
            this.setSaldo(50);
        } else if (t == "CP"){
            this.setSaldo(150);
        }
        System.out.println("Conta aberta com sucesso: " + this.getNumConta() + " - " + this.getDono() + "\n >>");
    }

    public void fecharConta(){
        if (this.getSaldo() > 0) {
            System.out.println("A conta não pode ser encerrada. O saldo " + (Math.round(getSaldo()*100.0)/100.0) + " deverá ser sacado \n >>");
        } else if (this.getSaldo() < 0) {
            System.out.println("A conta não pode ser encerrada, possuí débitos pendentes \n >>");
        } else {
            this.setStatus(false);
            System.out.println("A conta " + this.getNumConta() + " foi encerrada com sucesso \n >>");
        }
    }

    public void depositar(double v){
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() + v);
            System.out.println("Depósito realizado de " + v + " na conta de: " + this.getDono() + "\n >>");
        } else {
            System.out.println("Depósito não realizado, conta está encerrada \n >>");
        }
    }

    public void sacar(double v){
        if (this.isStatus()){
            if (this.getSaldo() >= v) {
                this.setSaldo(this.getSaldo() - v);
                System.out.println("Saque realizado de " + v + " na conta de: " + this.getDono() + "\n >>");
            } else {
                System.out.println("Saldo insuficiente para saque. Valor disponível: " + (Math.round(getSaldo()*100.0)/100.0) + "\n >>");
            }
        } else {
            System.out.println("Saque não realizado, conta está encerrada \n >>");
        }
    }

    public void pagarMensalidade(){
        int v = 0;
        if (this.getTipo() == "CC"){
            v = 12;
        } else if (this.getTipo() == "CP"){
            v = 20;
        }
        if (this.isStatus()){
            this.setSaldo(this.getSaldo() - v);
            System.out.println("Mensalidade paga com sucesso " + this.getDono() + "\n >>");
        } else {
            System.out.println("Pagamento não realizado. A conta " + this.getNumConta() + " está encerrada \n >>");
        }
    }
}
