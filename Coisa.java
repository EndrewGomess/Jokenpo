package ProjetoJokenpo;

public abstract class Coisa{

    private String escolha;

    public Coisa(String escolha){
        this.escolha = escolha;
    }

    public String getEscolha() {
        return escolha;
    }

    public abstract int confronto(Coisa player2);
} 