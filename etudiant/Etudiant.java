package etudiant;

public class Etudiant {

    private String nom;

    public Etudiant(String nom) {
        this.nom = nom;
    }

    public void travailler(){
        if (this.nom != null) {
            System.out.println(this.nom + " se met au travail !");
        }
    }

    public void seReposer() {
        if (this.nom != null) {
            System.out.println(this.nom + " se repose");
        }
    }
}
