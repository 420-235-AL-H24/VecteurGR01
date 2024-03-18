import static org.junit.jupiter.api.Assertions.*;

class VecteurTest {

    @org.junit.jupiter.api.Test
    void getElementAt() {
        Vecteur data = new Vecteur();
        data.ajouter(0);
        data.ajouter(10);
        data.ajouter(20);
        data.ajouter(30);
        data.ajouter(40);
        data.ajouter(50);

        assertEquals(0, data.getElementAt(0));
        assertEquals(30, data.getElementAt(3));
        assertEquals(50, data.getElementAt(5));
    }

    @org.junit.jupiter.api.Test
    void getNbElements() {
        Vecteur vide = new Vecteur();
        assertEquals(0, vide.getNbElements());

        Vecteur data = new Vecteur();
        data.ajouter(0);
        data.ajouter(10);
        data.ajouter(20);
        data.ajouter(30);
        data.ajouter(40);
        data.ajouter(50);
        assertEquals(6, data.getNbElements());
    }

    @org.junit.jupiter.api.Test
    void estVide() {
        Vecteur vide = new Vecteur();
        assertEquals(true, vide.estVide());

        Vecteur data = new Vecteur();
        data.ajouter(0);
        data.ajouter(10);
        data.ajouter(20);
        data.ajouter(30);
        data.ajouter(40);
        data.ajouter(50);
        assertEquals(false, data.estVide());
    }

    @org.junit.jupiter.api.Test
    void ajouter() {
    }

    @org.junit.jupiter.api.Test
    void testAjouter() {
    }

    @org.junit.jupiter.api.Test
    void testAjouter1() {
    }

    @org.junit.jupiter.api.Test
    void trouver() {
    }

    @org.junit.jupiter.api.Test
    void trouverTout() {
    }

    @org.junit.jupiter.api.Test
    void effacerAt() {
    }

    @org.junit.jupiter.api.Test
    void effacerTout() {
    }

    @org.junit.jupiter.api.Test
    void testEffacerTout() {
    }
}