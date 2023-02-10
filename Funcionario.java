//@carlossergio***
public class Funcionario {
    private int id;
    private String nome;
    private double salario;

    public Funcionario(int id, String nome, double salario) {
        this.id = id;
        this.nome = nome;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public double getSalario() {
        return salario;
    }

    public void aumentarSalario(double porcentagem){
        this.salario = this.salario + (this.salario * porcentagem / 100);
    }

    public String toString() {return "id: " + id + ", nome: " + nome + String.format(", salário: %.1f", salario); }

}