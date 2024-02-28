public class Vecteur {
    private int[] tableau;
    private int nbElements;

    public static final int RATIO_AGRANDISSEMENT = 2;
    public static final int TAILLE_INITIALE = 5;

    public Vecteur() {
        tableau = new int[TAILLE_INITIALE];
        nbElements = 0;
    }

    public String toString() {
        String str = "[";
        for (int i = 0; i < nbElements; i++)
            str += tableau[i] + ", ";
        return str + "]";
    }

    public void ajouter(int element) {
        if (nbElements >= tableau.length)
            resize();
        tableau[nbElements++] = element;
    }

    private void resize() {
        //TODO Agrandir le tableau de données.
    }
}
