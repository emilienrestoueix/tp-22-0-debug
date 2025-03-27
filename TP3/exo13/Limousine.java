package TP3.exo13;

class Limousine extends Renault {
    private int longueur;

    public Limousine(int vitesseMax, double prixBase, String couleur, int anneeFabrication, int reductionConstructeur, int longueur) {
        super(vitesseMax, prixBase, couleur, anneeFabrication, reductionConstructeur);
        this.longueur = longueur;
    }

    @Override
    public double calculerPrixDeVente() {
        double prix = super.calculerPrixDeVente();
        if (longueur > 6) {
            return prix * 0.95;
        } else {
            return prix * 0.90;
        }
    }
}
