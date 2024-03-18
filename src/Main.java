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
        System.out.println("idx0 : " + data.getElementAt(0)); // 0
        System.out.println("idx3 : " + data.getElementAt(3)); // 30
        System.out.println("idx5 : " + data.getElementAt(5)); // 50
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

        System.out.println("\nTest 7: Ajouter des valeurs provenant d'un autre vecteur");
        Vecteur test7 = new Vecteur();
        test7.ajouter(95);
        test7.ajouter(96);
        test7.ajouter(97);
        data.ajouter(test7);
        System.out.println(data);
        System.out.println("nbElements: " + data.getNbElements());

        System.out.println("\nTest 8: Trouver des valeurs présentes dans le vecteur");
        System.out.println(data.trouver(-10)); // index=0
        System.out.println(data.trouver(40)); // index=6
        System.out.println(data.trouver(97)); // index=13

        System.out.println("\nTest 9: Trouver toutes les valeurs d'un autre vecteur");
        Vecteur test9 = new Vecteur();
        test9.ajouter(40);
        test9.ajouter(97);
        test9.ajouter(-10);
        System.out.println(data.trouverTout(test9)); // true

        test9.ajouter(99);
        System.out.println(data.trouverTout(test9)); // false

        System.out.println(data);
        System.out.println(data.getNbElements());

        System.out.println("\nTest 10: Effacer des valeurs à une position spécifique");
        System.out.println(data.effacerAt(0));
        System.out.println(data.effacerAt(6));
        System.out.println(data.effacerAt(11));
        System.out.println(data);
        System.out.println(data.getNbElements());

        System.out.println("\nTest 11: Effacer des valeurs provenant d'un autre vecteur");
        Vecteur test11 = new Vecteur();
        test11.ajouter(0);
        test11.ajouter(40);
        test11.ajouter(96);
        System.out.println(data.effacerTout(test11));
        System.out.println(data);
        System.out.println(data.getNbElements());
    }
}





















