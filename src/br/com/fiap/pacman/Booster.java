package br.com.fiap.pacman;

public class Booster extends Item {
    
    private int tempoDuracao;

    public Booster(){
        
    }
    public Booster(int posicaox, int posicaoy, int tempoDuracao){
        super(posicaox, posicaoy);
        this.tempoDuracao = tempoDuracao;
    }
    
    public int getTempoDuracao() {
        return tempoDuracao;
    }
    public void setTempoDuracao(int tempoDuracao) {
        this.tempoDuracao = tempoDuracao;
    }
}
