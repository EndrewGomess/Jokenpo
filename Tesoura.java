package ProjetoJokenpo;

public class Tesoura extends Coisa{

    public Pedra(){
        super("Tesoura");
    }

    @Override
    public int confronto(Coisa player2){
        if (player2 instanceof Papel) {
            return 1;
        } else if (player2 instanceof Pedra) {
            return -1;
        } else {
            return 0;
        }
    }
}