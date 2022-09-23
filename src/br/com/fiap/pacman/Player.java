package br.com.fiap.pacman;

public class Player extends GameObject{

    private int life;
    private int direcao;
    private boolean invencivel;


    public Player(){

    }

    public Player(int posicaox, int posicaoy, int direcao) {
        super(posicaox, posicaoy);
        this.direcao = direcao;
        invencivel = false;
    }



    public void setLife(int i) {
        this.life = i;
    }   

public int getLife() {

    return life;
}

public void setScreenSize(int sCREENSIZE) {
   
}

public int getDirecao() {
    return direcao;
}

public void setDirecao(int direcao) {
   this.direcao = direcao;
}

public boolean isInvencivel() {
    return invencivel;
}

public void setInvencivel(boolean invencivel) {
    this.invencivel = invencivel;
}

public boolean movimentar(int posicaox, int posicaoy, int direcao) {
    boolean validacao = false;
    switch (direcao) {
        case 0:
            validacao = getPosicaoy() - posicaoy >= 0;
            break;
        case 180:
            validacao = getPosicaoy() + posicaoy <= getScreenSize();
            break;
        case 270:
            validacao = getPosicaox() - posicaox >= 0;
            break;
        case 90:
            validacao = getPosicaox() + posicaox <= getScreenSize();
            break;

    }

    return validacao;
}
private int getScreenSize() {
    return 0;
}

public void mover() {
    int x = getDirecao() == 90 || getDirecao() == 270 ? 10 : 0;
    int y = getDirecao() == 180 || getDirecao() == 0 ? 10 : 0;
    if (movimentar(x, y, getDirecao())) {
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
}