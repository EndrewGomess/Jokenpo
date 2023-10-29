package ProjetoJokenpo;

public class Papel extends Coisa{

    public Pedra(){
        super("Papel");
    }

    @Override
    public int confronto(Coisa player2){
        if (player2 instanceof Pedra) {
            return 1;
        } else if (player2 instanceof Tesoura) {
            return -1;
        } else {
            return 0;
        }
    }
}