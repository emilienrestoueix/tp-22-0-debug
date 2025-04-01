package TP4.exo11;

import java.util.Objects;

public class Rectangle {

    private double largeur;
    private double hauteur;

    public Rectangle(double largeur, double hauteur) {
        this.largeur = largeur;
        this.hauteur = hauteur;
    }

    @Override
    public String toString() {
        return "Rectangle : " +
                "\nlargeur = " + largeur +
                "\nhauteur = " + hauteur ;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Rectangle rectangle = (Rectangle) obj;
        return Double.compare(rectangle.largeur, largeur) == 0 &&
                Double.compare(rectangle.hauteur, hauteur) == 0;
    }

    @Override
    public int hashCode() {
        return Objects.hash(largeur, hauteur);
    }
}
