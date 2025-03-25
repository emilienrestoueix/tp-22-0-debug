package etudiant;

public class TestEtudiant {

    public static void main(String[] args) {

        Etudiant etudiant = new Etudiant(args[0]);
        etudiant.travailler();
        etudiant.seReposer();
    }
}
