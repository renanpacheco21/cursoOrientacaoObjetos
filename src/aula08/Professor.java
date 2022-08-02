package aula08;

public class Professor extends Pessoa{

    private String especilidades;
    private double salario;

    public void receberAumento(double add) {
        this.salario += add;
    }

    public String getEspecilidades() {
        return especilidades;
    }

    public void setEspecilidades(String especilidades) {
        this.especilidades = especilidades;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
