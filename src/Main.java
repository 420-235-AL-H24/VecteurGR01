public class Main {
    public static void main(String[] args) {
        System.out.println("\nTest 1: Création d'un vecteur vide");
        Vecteur data = new Vecteur();
        System.out.println(data);
        System.out.println("nbElements: " + data.getNbElements());
        System.out.println("estVide: " + data.estVide());

        System.out.println("\nTest 2: Ajout d'éléments à la fin du vecteur");
        data.ajouter(0);
        data.ajouter(10);
        data.ajouter(20);
        System.out.println(data);
        System.out.println("nbElements: " + data.getNbElements());
        System.out.println("estVide: " + data.estVide());

        System.out.println("\nTest 3: Ajouts d'éléments jusqu'à ce que la capacité du vecteur augmente");
        data.ajouter(30);
        data.ajouter(40);
        data.ajouter(50);
        System.out.println(data);
        System.out.println("nbElements: " + data.getNbElements());

        System.out.println("\nTest 4: vérifier l'état du vecteur");
        System.out.println("idx0 : " + data.getElementAt(0));
        System.out.println("idx3 : " + data.getElementAt(3));
        System.out.println("idx5 : " + data.getElementAt(5));
        System.out.println(data);

        System.out.println("\nTest 5: Ajouts d'éléments à des positions spécifiques");
        data.ajouter(-10, 0);
        data.ajouter(25, 4);
        data.ajouter(60, 8);
        data.ajouter(70, 9);
        data.ajouter(80, 10);
        System.out.println(data);
        System.out.println("nbElements: " + data.getNbElements());

        System.out.println("\nTest 6: Ajouts d'éléments à des positions invalides");
        System.out.println("index négatif: " + data.ajouter(99, -1));
        System.out.println("index trop grand: " + data.ajouter(99, 15));
        System.out.println("nbElements: " + data.getNbElements());
    }
}
