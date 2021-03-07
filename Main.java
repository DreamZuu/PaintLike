import java.util.LinkedList;

public class Main {
	//Classe de test pour les points
	public static void testPoint() { 
		
		Point p1 = new Point("P1", "Black", 0, 0);
		Point p2 = new Point("P2", "Red", 1, 1);
		p1.afficher();
		p2.afficher();
		p1.getCentre().afficher();
		System.out.println("Test equals entre p1 et p2: "+p1.equals(p2));
		p1.translater(2, 2);
		p1.afficher();
		System.out.println("Test pour la distance entre p1 et p2: "+p1.getDistance(p2));
		Point p3 = p1.Clone();
		p3.afficher();
			
	}
	
	public static void testSegment() {
		Point p1 = new Point("P1", "Black", 0, 0);
		Point p2 = new Point("P2", "Red", 1, 1);
		Segment s1 = new Segment("S1", "Blue", p1, p2);
		s1.afficher();
		Segment s2 = s1.Clone();
		s2.afficher();
		s2.translater(5, -5);
		System.out.println("Test equals entre s1 et s2: "+s1.equals(s2));
		
		s2.afficher();
		Point ps1C = s1.getCentre();
		ps1C.afficher();
		System.out.println("Longeur d'un segment s1 :"+s1.getLongeur());
	}
	
	public static void testCercle() {
		Point p1 = new Point("P1", "Black", 0, 0);
		Point p2 = new Point("P2", "Red", 1, 1);
		
		Cercle c1 = new Cercle("C1", "Black", p1, 5);
		c1.afficher();
		
		Cercle c2 = new Cercle("C1", "Black", p2, 5);
		Cercle c3 = c2.Clone();
		c3.translater(1, 1);
		System.out.println("Test equals entre c1 et c2: "+c2.equals(c3));
		
	}
	public static void testPolygone() {
		Point p1 = new Point("P1", "Black", 0, 0);
		Point p2 = new Point("P2", "Red", 10, 10);
		Point p3 = new Point("P3", "Red", 20, 20);
		
		LinkedList <Point> points = new LinkedList<Point>();
		points.add(p1);
		points.add(p2);
		points.add(p3);
		Polygone poly1 = new Polygone("poly 1", "black", points);
		Polygone poly2 = new Polygone("poly 1", "black", points);
		
		poly1.afficher();
		poly1.translater(5, 5);
		poly1.afficher();

		System.out.println(poly1.equals(poly2));
	}	
	public static void main(String[] args) {
		
		System.out.println("Test de la classe point");
		testPoint();
		
		System.out.println("\nTest de la classe segment");
		testSegment();

		System.out.println("\nTest de la classe Cercle");
		testCercle();

		System.out.println("\nTest de la classe Polygone");
		testPolygone();
	}
}
