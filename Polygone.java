import java.util.LinkedList;

public class Polygone extends Figure{
    private LinkedList<Point> points;

    /**Constructeur 1 (prennant une linked list en param)
     * @param nom de la figure
     * @param couleur de la figure
     * @param linked list de point 
     */
    public Polygone(String nom, String couleur, LinkedList<Point> points) {
        super(nom, couleur);
        this.points = points;
    }

    /**Constructeur 2 (prennant un tableau en param)
     * @param nom de la figure
     * @param couleur de la figure
     * @param tab de la figure (sera par la suite "converti" en linked list)
     */
    public Polygone(String nom, String couleur, Point[] tab){
        super(nom, couleur);
        points = new LinkedList<Point>();
        for (int i=0; i < tab.length; i++) {
            points.add(tab[i]);
        }
    }
    public Polygone Clone(){
        LinkedList<Point> clone  = new LinkedList<Point>();
        for (Point p : this.getListe()) {
            clone.add(p.Clone());
        }
        Polygone cloned = new Polygone(this.getNom()+"(clone)","Black",clone);

        return cloned;
    }

    public boolean equals(Figure p) {
        Polygone B = (Polygone)p;
		int lenList = getListe().size();
		int g=0, g1=0;

		if(lenList!=B.getListe().size())return false;
		int i1=0, i2=0;

		Point[] P1 = getListe().toArray(new Point[getListe().size()]);
		Point[] P2 = B.getListe().toArray(new Point[B.getListe().size()]);

		for(i1=0;i1<lenList;i1++) {
			while(i2<lenList && !P1[i1].equals(P2[i2])) i2++;

				if(P1[i1-1+(lenList * ((i1==0) ? 1 : 0))].equals(P2[i2-1+(lenList * ((i2==0) ? 1 : 0))]))g++;
				if(P1[(i1+1)%lenList].equals(P2[(i2+1)%lenList]))g++;
				if(P1[(i1+1)%lenList].equals(P2[i2-1+(lenList * ((i2==0) ? 1 : 0))]))g1++;
				if(P1[i1-1+(lenList * ((i1==0) ? 1 : 0))].equals(P2[(i2+1)%lenList]))g1++;
			i2=0;
		}
		if(g==2*lenList || g1==2*lenList)return true;
			return false;
	}
    /**getter de la liste
     * @return la liste de points courant
     */
    public LinkedList<Point> getListe(){
        return points;
    }

    /**setter 1 (avec une linked list en param)
     * @param linked list de points
     */
    public void setListe(LinkedList<Point> points){
        this.points = points;
    }

    /**setter 2 (avec un tab de point qui sera "converti" en linked liste)
     * aucune verification de la liste
     * elle est vie avant de la remplir
     * @param un tableau de point 
    */
    public void setListe(Point[] tab){
        (this.points).clear();
        for (int i=0; i < tab.length; i++) {
            (this.points).add(tab[i]);
        }
    }
    /**Ajout de point dans la liste
     * @param un point a ajouter dans la liste
     * @return vrai si le point a ete ajoute
     */
    public boolean add(Point p) {
		getListe().add(p);
		return true;
	}

    /**Point centrale du polygone 
     * @return le centre du polygone
     */
    public Point getCentre() {
		int a = 0, b = 0;
		for(Point c : getListe()) {
			a += c.getX();
			b += c.getY();
		}
		a /= getListe().size();
		b /= getListe().size();
		return (new Point(getNom()+"(Centre)","Black",a,b));
	}

    /**Mise en forme ecrite de l'affichage
	 * @return l'ensemble des elements 
	 */
    public String toString(){
        return getListe().size()+" Points: "  +  getListe().toString();
    }

    /**Translation du polygone
     * @param dx valeur de transaltion de x de tout les points de la liste
     * @param dy valeur de transaltion de y de tout les points de la liste
     */
    public void translater(int dx,int dy) {
		for(Point p: getListe()) {
			p.translater(dx, dy);
		}
    }

}
