package ProjetoJokenpo;

public class Pedra extends Coisa{

    public Pedra(){
        super("Pedra");
    }

    @Override
    public int confronto(Coisa player2){
        if (player2 instanceof Tesoura) {
            return 1;
        } else if (player2 instanceof Papel) {
            return -1;
        } else {
            return 0;
        }
    }
}