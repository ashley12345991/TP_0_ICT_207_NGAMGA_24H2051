public class Division {

    // Méthode d'instance
    public double diviserInstance(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : division par zéro !");
            return 0;
        }
        return a / b;
    }

    // Méthode de classe (statique)
    public static double diviserClasse(double a, double b) {
        if (b == 0) {
            System.out.println("Erreur : division par zéro !");
            return 0;
        }
        return a / b;
    }
}