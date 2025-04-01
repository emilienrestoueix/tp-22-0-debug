package TP4.exo11;

public class RectangleColore extends Rectangle {

    private String couleur;

    public RectangleColore(double largeur, double hauteur, String couleur) {
        super(largeur, hauteur);
        this.couleur = couleur;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncouleur = " + couleur ;
    }
}
