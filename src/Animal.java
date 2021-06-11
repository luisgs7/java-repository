public class Animal {

    private int tamanho;
    private String cor;
    private double peso;

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }

    public void dormir(){
        System.out.println("Dormir");
    }

    public void correr(){
        System.out.println("Correr como um");
    }
}
