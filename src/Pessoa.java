public class Pessoa {
    private String nome;
    private int idade;

    public void exibirDados(String nome){
        System.out.println("Nome: " + nome);
    }

    public void exibirDados(String nome, int idade){
        System.out.println("Nome: " + nome + "Idade: " + idade);
    }
}
