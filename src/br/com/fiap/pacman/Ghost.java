package br.com.fiap.pacman;

import java.util.Random;

public class Ghost extends GameObject {

    private int direcao;
    private int screenSize;

    
    public Ghost(){
        
    }
    
    public Ghost(int posicaox, int posicaoy, int direcao){
        super(posicaox, posicaoy);
        this.direcao=direcao;
    }
    
    public int getDirecao() {
        return direcao;
    }
    public void setDirecao(int direcao) {
        this.direcao = direcao;
    }
    
    public boolean moverGhost(int posicaox, int posicaoy, int direcao){
        
        boolean verificarLimite = false;
        switch (direcao) {
            case 0:
            verificarLimite = getPosicaoy() - posicaoy >= 0;
            break;
            case 180:
            verificarLimite = getPosicaoy() + posicaoy <= getScreenSize();
            break;
            case 270:
            verificarLimite = getPosicaox() - posicaox >= 0;
            break;
            case 90:
            verificarLimite = getPosicaox() + posicaox <= getScreenSize();;
            break;
        }
        return verificarLimite;
    }
    
    public void mover() {
        
        int[] direcoes = { 0, 90, 180, 270 };
        Random aleatorio = new Random();
        setDirecao(direcoes[aleatorio.nextInt((3 - 0) + 1) + 0]);
        int x = getDirecao() == 90 || getDirecao() == 270 ? 10 : 0;
        int y = getDirecao() == 180 || getDirecao() == 0 ? 10 : 0;
        
        if (moverGhost(x, y, getDirecao())) {
            switch (getDirecao()) {
                case 0:
                setPosicaoy(getPosicaoy() - y);
                break;
                case 180:
                setPosicaoy(getPosicaoy() + y);
                break;
                case 270:
                setPosicaox(getPosicaox() - x);
                break;
                case 90:
                setPosicaox(getPosicaox() + x);
                break;
                
            }
            
        }
        
    }
    public int getScreenSize() {
        return screenSize;
    }
    
    public void setScreenSize(int screenSize) {
        this.screenSize = screenSize;
    }
}
