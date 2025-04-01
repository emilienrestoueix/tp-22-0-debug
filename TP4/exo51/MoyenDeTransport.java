package TP4.exo51;

public class MoyenDeTransport implements Deplacement{

    private int x;
    private int y;
    private int vitesse;
    private final int VITESSE_INITIAL = 10;

    @Override
    public void deplacementEnX() {

    }

    @Override
    public void deplacementEnY() {

    }

    @Override
    public void seDeplacer() {

    }

    public void limitation(int vitesse, int limiteFixee){
        this.vitesse = vitesse;
        if (vitesse > limiteFixee){
            this.vitesse = limiteFixee;
        }
    }
}
