package br.com.fiap.pacman;

public class GameObject {
    
    private int posicaox;
    private int posicaoy;
    private int screenSize;
    
    public GameObject(){
        
    }   
    
    public GameObject(int posicaox, int posicaoy){
        this.posicaox=posicaox;
        this.posicaoy=posicaoy;
    }

    public int getPosicaox() {
        return posicaox;
    }

    public void setPosicaox(int posicaox) {
        this.posicaox = posicaox;
    }

    public int getPosicaoy() {
        return posicaoy;
    }

    public void setPosicaoy(int posicaoy) {
        this.posicaoy = posicaoy;
    }

    public void getScreenSize(int screenSize){
        this.screenSize=screenSize;
    }

}
