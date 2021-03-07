
public abstract class Figure implements Cloneable {
	//ATTRIBUTS
	private String nom;
	private String couleur;
	
	/**Constructeur
	 * @param nom
	 * @param couleur
	 */
	public Figure(String nom, String couleur) {
		this.nom = nom;
		this.couleur = couleur;
	}
	
	//METHODES
	/**Mise en forme ecrite de l'affichage
	 * @return l'ensemble des elements 
	 */
	public String toString() {
		return "nom: " + nom  + "\n" + "Couleur: " + couleur + "\n";
	}
	public void afficher() {
		System.out.println(toString());
	}

	/**Methode pour avoir le couleur de l'element
	 * @return la couleur de l'element courant
	 */
	public String getCouleur() {
		return couleur;
	}
	
	/**Changement de la couleur de la figure
	 * @param couleur
	 */
	public void setCouleur(String couleur) {
		this.couleur = couleur;
	}
	/**Recuperation du nom
	 * @return le nom de l'element courant 
	*/
	public String getNom() {
		return nom;
	}
	
	//METHODES ABSTRAITES
	
	/** Fonction de translation de la figure 
	  * @param dx valeur de la translation en X
	  * @param dy valeur de la translation en Y
	  */
	public abstract void translater(int dx, int dy);
	
	/** Fonction de verification de figure 
	 * @param p valeur du point a verifier
	 * @return 0 ou 1 si le p.x et p.y est le meme 
	 * que le point courant.
	 */
	public abstract boolean equals(Figure p);
	
	public abstract Point getCentre();
	
	public abstract Figure Clone() ;
}