
public class Cercle extends Figure{

	//Attributs
	private Point centre;
	private int rayon;
	
	/**Constructeur 1
	 * @param nom
	 * @param couleur
	 * @param centre
	 * @param rayon
	 */
	public Cercle(String nom,String couleur ,Point centre, int rayon) {
		super(nom, couleur);
		this.centre = centre;
		this.rayon = rayon;
	}
	
	/**Constructeur 2
	 * @param couleur
	 * @param p1
	 * @param p2
	 */
	public Cercle(String couleur, Point p1, Point p2) {
		super("", couleur);
		this.centre = p1;
		this.rayon = p1.getDistance(p2);
		
	}
	
	/**Centre du cercle
	 * @return le centre du cercle (Point)
	 */
	public Point getCentre(){
		return this.centre;
	}
	
	/**Translation du centre du cercle
	 * @param dx valeur de translation de centre.x
	 * @param dy valeur de translation de centre.y
	 */
	public void translater(int dx,int dy) {
		this.centre.translater(dx, dy);
	}
	
	/**Test d'egalite de valeur entre deux objets
     * @param une figure c2
     * @return 1 ou 0 en fonction de si l'egalite est vrai ou pas
     */
	public boolean equals(Figure c2) {
		Cercle c = (Cercle)c2;
		return centre.equals(c.centre) && rayon == c.rayon;
		}
	
	/**Mise en forme ecrite de l'affichage
	 * @return l'ensemble des elements 
	 */
	public String toString() {
		return  "Cercle: ["+getNom()+", [("+centre.getX()+","+centre.getY()+") R:"+rayon+"]"+getCouleur();
	
	}
	
	/**Clonage en profondeur
	 * @return un cercle identique au cercle courant
	 */
	public Cercle Clone() {
		return new Cercle(getNom()+"(Clone)", getCouleur(), centre, rayon);
	}
}
