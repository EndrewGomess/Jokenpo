package ProjetoJokenpo;

public class Jogador {

    private Coisa jogada;

    public Jogador(){
        this.jogada = sorteio();
    }
    
    public Jogador(int escolha){
        if(escolha == 1){
            this.jogada = new Papel();
        }    
        if(escolha == 2){
            this.jogada = new Pedra();
        }
        if(escolha == 3){
            this.jogada = new Tesoura();
        }
    }

    private Coisa sorteio(){
        Random aleatorio = new Random();
        int numero = aleatorio.nextInt(3) + 1;

        if(numero == 1){
            return new Papel();
        }
        else if(numero == 2){ 
            return new Pedra();
        }
        else{ 
            return new Tesoura();
        }
    }

    public Coisa getJogada() {
        return jogada;
    }

    
}
