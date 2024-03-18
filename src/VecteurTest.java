import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class VecteurTest {
    Vecteur data;

    @BeforeEach
    void setUp() {
        data = new Vecteur();
        data.ajouter(0);
        data.ajouter(10);
        data.ajouter(20);
        data.ajouter(30);
        data.ajouter(40);
        data.ajouter(50);
    }

    @org.junit.jupiter.api.Test
    void getElementAt() {
        assertEquals(0, data.getElementAt(0));
        assertEquals(30, data.getElementAt(3));
        assertEquals(50, data.getElementAt(5));
    }

    @org.junit.jupiter.api.Test
    void getNbElements() {
        Vecteur vide = new Vecteur();
        assertEquals(0, vide.getNbElements());
        assertEquals(6, data.getNbElements());
    }

    @org.junit.jupiter.api.Test
    void estVide() {
        Vecteur vide = new Vecteur();
        assertEquals(true, vide.estVide());
        assertEquals(false, data.estVide());
    }

    @org.junit.jupiter.api.Test
    void ajouter() {
        data.ajouter(90);
        data.ajouter(91);
        data.ajouter(92);
        assertEquals(90, data.getElementAt(6));
        assertEquals(91, data.getElementAt(7));
        assertEquals(92, data.getElementAt(8));
        assertEquals(9, data.getNbElements());
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