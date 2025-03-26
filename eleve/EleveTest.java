package eleve;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

public class EleveTest {

    @Test
    public void testAjoutNoteEtMoyenne() {
        Eleve eleve = new Eleve("Alice");
        assertEquals(0.0, eleve.getMoyenne(), "La moyenne initiale doit être 0.0");

        eleve.ajouterNote(10);
        assertEquals(10.0, eleve.getMoyenne(), "La moyenne après une note de 10 doit être 10.0");

        eleve.ajouterNote(20);
        assertEquals(15.0, eleve.getMoyenne(), "La moyenne après ajout de 10 et 20 doit être 15.0");

        eleve.ajouterNote(25);
        assertEquals(15.0, eleve.getMoyenne(), "La note 25 doit être ramenée à 20, donc la moyenne doit rester correcte");

        eleve.ajouterNote(-5);
        assertEquals(12.5, eleve.getMoyenne(), "La note -5 doit être ramenée à 0, donc la moyenne doit être correcte");
    }

    @Test
    public void testGetNom() {
        Eleve eleve = new Eleve("Bob");
        assertEquals("Bob", eleve.getNom(), "Le nom doit être correctement initialisé");
    }

    @Test
    public void testListeNotes() {
        Eleve eleve = new Eleve("Charlie");
        eleve.ajouterNote(12);
        eleve.ajouterNote(15);
        List<Integer> notes = eleve.getListNotes();

        assertEquals(2, notes.size(), "Il doit y avoir deux notes");
        assertEquals(12, notes.get(0), "La première note doit être 12");
        assertEquals(15, notes.get(1), "La seconde note doit être 15");
    }
}