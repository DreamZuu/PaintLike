
public class Segment extends Figure{
	//Attributs
	private Point P1;
	private Point P2;
	
	//Constructeur
	public Segment(String nom, String couleur ,Point P1, Point P2) {
		super(nom, couleur);
		this.P1 = P1;
		this.P2 = P2;
	}
	
	//Methodes
	public Point getP1() {
		return P1;
	}
	
	public Point getP2() {
		return P2;
	}
	
	public void setP1(Point P1) {
		this.P1 = P1;
	}
	public void setP2(Point P2) {
		this.P2 = P2;
	}
	
	
	/**Longeur d'un segement
	 * @return la distance entre 2 points donc la longeur du segement
	 */
	public int getLongeur() {
		return P1.getDistance(P2);
	}
	
	/**Clonage en profondeur d'un segment
	 * @return le clone d'un segment
	 */
	public Segment Clone() {
		return new Segment(getNom()+"Clone",getCouleur(),P1, P2);
	}
	
	/**Translation d'un segement par la translation de ces deux points
	 * @param dx valeur de translation des x de chaque point
	 * @param dy valeur de translation des y de chaque point
	 */
	public void translater(int dx,int dy) {
		P1.translater(dx, dy);
		P2.translater(dx, dy);
	}
	
	/**Fabrication d'un point qui represente le centre d'un segment
	 * @return le point central du segment
	 */
	public Point getCentre() {
		return new Point(getNom()+"Centre",getCouleur(),(P1.getX()+P2.getX())/2, (P1.getY()+P2.getY())/2);
	}
	
	/**Verification de l'egalité des valeurs des objets
	 * @param une Figure (segment)
	 * @return 1 ou 0 pour l'egalite des valeurs des objets
	 */
	public boolean equals(Figure s2) {
		Segment s = (Segment)s2;
		return (P1.equals(s.P1) && P2.equals(s.P2)) || (P1.equals(s.P2) && P2.equals(s.P1));
		}
	
	/**Mise en forme ecrite de l'affichage
	 * @return l'ensemble des elements 
	 */
	public String toString() {
		return "[" + P1.toString() + "," + P2.toString() + "]"+ getCouleur() ;
	}

}
