package banque;

public class CompteBancaire {
    private String nom;
    private String prenom;
    private String adresse;
    private int montantInitial;
    private String extraitKBis;
    private String tel;

    public CompteBancaire(String nom, String prenom, String adresse, int montantInitial) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.montantInitial = montantInitial;
    }

    public CompteBancaire(String nom, String prenom, String adresse, int montantInitial, String extraitKBis, String tel) {
        this(nom, prenom, adresse, montantInitial);
        this.extraitKBis = extraitKBis;
        this.tel = tel;
    }
}

