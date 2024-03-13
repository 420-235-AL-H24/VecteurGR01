public class Main {
    public static void main(String[] args) {
        System.out.println("\nTest 1: Création d'un vecteur vide");
        Vecteur data = new Vecteur();
        System.out.println(data);

        System.out.println("\nTest 2: Ajout d'éléments à la fin du vecteur");
        data.ajouter(0);
        data.ajouter(10);
        data.ajouter(20);
        System.out.println(data);

        System.out.println("\nTest 3: Ajouts d'éléments jusqu'à ce que la capacité du vecteur augmente");
        data.ajouter(30);
        data.ajouter(40);
        data.ajouter(50);
        System.out.println(data);
    }
}
