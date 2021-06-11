import banco.Conta;

public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.login();

        String name = user.nome = "Pedro";
        System.out.println(name);

        Funcionario funcionario = new Funcionario();

        funcionario.salario = 3000.0;
        funcionario.nome = "José";

        double salario = funcionario.recuperarSalario(300, 100);
        System.out.println(salario);

        Cao dog = new Cao();

        dog.correr();
        dog.latir();
        dog.setCor("Azul");
        System.out.println(dog.getCor());

        dog.correr();

        Passaro passaro = new Passaro();
        passaro.correr();

        Conta conta = new Conta();
        conta.depositar(100);
        conta.saque(50);

        System.out.println(conta.getSaldo());
    }
}
