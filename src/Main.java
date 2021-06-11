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
    }
}
