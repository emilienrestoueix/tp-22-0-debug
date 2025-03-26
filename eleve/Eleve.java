package eleve;

import java.util.ArrayList;
import java.util.List;

public class Eleve {

    private String nom;
    private List<Integer> listNotes = new ArrayList<Integer>();
    private double moyenne;

    public Eleve(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }

    public List<Integer> getListNotes() {
        return listNotes;
    }

    public double getMoyenne() {
        return moyenne;
    }

    public void ajouterNote(int note){
        if (note <= 0){
            listNotes.add(0);
        } else if (note >= 20) {
            listNotes.add(20);
        } else {
            listNotes.add(note);
        }
        calculerMoyenne();
    }

    private void calculerMoyenne() {
        if (listNotes.isEmpty()) {
            moyenne = 0.0;
        } else {
            double somme = 0;
            for (int note : listNotes) {
                somme += note;
            }
            moyenne = somme / listNotes.size();
        }
    }

    @Override
    public String toString() {
        return "Élève : " + nom + ", Notes : " + listNotes + ", Moyenne : " + moyenne;
    }
}
