package TP3.exo13;

class Camion extends Voiture {
    private int poids;

    public Camion(int vitesseMax, double prixBase, String couleur, int poids) {
        super(vitesseMax, prixBase, couleur);
        this.poids = poids;
    }

    @Override
    public double calculerPrixDeVente() {
        if (poids > 2000) {
            return prixBase * 0.90;
        } else {
            return prixBase * 0.80;
        }
    }
}
