public class Funcionario {
    String nome;
    double salario;

    public double recuperarSalario( double bonus, double desconto){
        this.salario = this.salario - desconto;
        return this.salario + bonus;
    }
}
