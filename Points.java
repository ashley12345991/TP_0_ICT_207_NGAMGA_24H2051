public class Points {
    public static void main(String[] arguments) {
        Points p1 = new Point(3, 1);
        points p2 = new point();
        points p3 = new point(p1);
        System.out.println("p2: " + p2.x + "," + p2.y);
        p3.afficher();
        System.out.println(p1.distance(p2));
        p3.deplacer(-3, -2);
        p3.afficher();
    }

}