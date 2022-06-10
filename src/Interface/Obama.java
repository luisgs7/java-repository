package Interface;

public class Obama extends Cidadao implements Presidente{
    @Override
    public void ganharEleicao() {
        System.out.println("Ganhar Eleição nos Estados Unidos");
    }
}
