public class TestDivision {

    public static void main(String[] args) {

        // Test de la méthode d'instance
        Division d = new Division();
        double resultat1 = d.diviserInstance(10, 2);
        System.out.println("Résultat (méthode d'instance) : " + resultat1);

        // Test de la méthode de classe
        double resultat2 = Division.diviserClasse(10, 2);
        System.out.println("Résultat (méthode de classe) : " + resultat2);
    }
}