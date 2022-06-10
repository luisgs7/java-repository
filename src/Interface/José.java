package Interface;

public class José extends Cidadao implements Presidente{
    @Override
    public void ganharEleicao() {
        System.out.println("Ganhar uma eleição no Brasil");
    }
}
