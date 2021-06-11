package banco;

public class Conta {

    private int numeroConta;
    private double saldo = 100;

    public void depositar(double valorDeposito){
        this.saldo += valorDeposito;
    }

    public void saque(double valorSaque){
        this.saldo += valorSaque;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
