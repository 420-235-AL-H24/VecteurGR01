public class Vecteur {
    private int[] tableau;
    private int nbElements;

    public static final int RATIO_AGRANDISSEMENT = 2;
    public static final int TAILLE_INITIALE = 5;

    public Vecteur() {
        this(TAILLE_INITIALE);
    }

    public Vecteur(int tailleInitiale) {
        tableau = new int[tailleInitiale];
        nbElements = 0;
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < nbElements; i++)
            str += tableau[i] + ", ";
        return str + "]";
    }

    public int getElementAt(int index) {
        return tableau[index];
    }

    public int getNbElements() {
        return nbElements;
    }

    public boolean estVide() {
        return nbElements == 0;
    }

    public void ajouter(int element) {
        if (nbElements >= tableau.length)
            resize();
        tableau[nbElements++] = element;
    }

    private void resize() {
        int[] nouveau = new int[RATIO_AGRANDISSEMENT * tableau.length];
        for (int i = 0 ; i < tableau.length; i++)
            nouveau[i] = tableau[i];
        tableau = nouveau;
    }
}
