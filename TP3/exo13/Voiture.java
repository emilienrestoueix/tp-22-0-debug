package TP3.exo13;

class Voiture {
    protected int vitesseMax;
    protected double prixBase;
    protected String couleur;

    public Voiture(int vitesseMax, double prixBase, String couleur) {
        this.vitesseMax = vitesseMax;
        this.prixBase = prixBase;
        this.couleur = couleur;
    }

    public double calculerPrixDeVente() {
        return prixBase;
    }
}
