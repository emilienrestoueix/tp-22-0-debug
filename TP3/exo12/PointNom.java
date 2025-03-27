package TP3.exo12;

public class PointNom extends Point{

    private String nom;

    public void setPointNom(int coord1, int coord2, String nom) {
        this.setPoint(coord1, coord2);
        setNom(nom);
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void affCoordNom(PointNom pointNom){
        super.afficheCoords();
        System.out.println("Nom : " + this.nom);
    }
}
