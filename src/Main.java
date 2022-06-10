import Interface.Cidadao;
import Interface.José;
import Interface.Obama;
import banco.Conta;

import java.util.ArrayList;
import java.util.List;

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

        NewUser novoUser = new NewUser();

        novoUser.setFirstName("Lucas");

        novoUser.setLastName(" José");

        System.out.println(novoUser.getFirstName() + novoUser.getLastName());

        NewUser[] users = new NewUser[10];

        for (int i = 0; i < users.length; i++) {
            NewUser atual = new NewUser();
            atual.setFirstName("Nome " + i);
            atual.setLastName("Sobrenome " + i);
            users[i] = atual;
        }

        System.out.println(users[2].getFirstName());
        System.out.println(users[2].getLastName());

        List<NewUser> users2 = new ArrayList<>();

        int i = 0;
        while (i < 10){
            NewUser atual = new NewUser();
            atual.setFirstName("Nome02 " + i);
            atual.setLastName("Sobrenome02 " + i);
            users2.add(atual);
            i++;
        }
        System.out.println(users2.get(2).getFirstName());
        System.out.println(users2.get(2).getLastName());

        // Constantes em Java
        final String nome = "José";
        // nome = "Lucas";
        System.out.println("Constante: " + nome);

        System.out.println("Sobrecarga de métodos");
        Pessoa pessoa = new Pessoa();
        pessoa.exibirDados("José");
        pessoa.exibirDados("Pedro", 45);

        System.out.println("Interface");
        Obama obama = new Obama();
        obama.direitosDeveres();
        obama.ganharEleicao();

        José josé = new José();
        josé.ganharEleicao();
    }
}
