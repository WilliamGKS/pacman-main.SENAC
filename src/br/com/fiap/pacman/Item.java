package br.com.fiap.pacman;

public class Item extends GameObject {
    
    private boolean visivel;

    
    public Item(){
        
    }
    
    public Item(int posicaox, int posicaoy){
        
        super(posicaox, posicaoy);
        visivel = true;
        
    }
    
    public boolean isVisivel() {
        return visivel;
    }
    
    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }
}
